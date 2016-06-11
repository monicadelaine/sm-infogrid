//
// This file is part of InfoGrid(tm). You may not use this file except in
// compliance with the InfoGrid license. The InfoGrid license and important
// disclaimers are contained in the file LICENSE.InfoGrid.txt that you should
// have received with InfoGrid. If you have not received LICENSE.InfoGrid.txt
// or you do not consent to all aspects of the license and the disclaimers,
// no license is granted; do not use this file.
// 
// For more information about InfoGrid go to http://infogrid.org/
//
// Copyright 1998-2010 by R-Objects Inc. dba NetMesh Inc., Johannes Ernst
// All rights reserved.
//

package org.infogrid.probe.test;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.concurrent.ScheduledExecutorService;
import org.infogrid.mesh.net.NetMeshObject;
import org.infogrid.meshbase.net.NetMeshBaseIdentifier;
import org.infogrid.meshbase.net.local.m.LocalNetMMeshBase;
import org.infogrid.meshbase.net.sweeper.UnnecessaryReplicasSweepPolicy;
import org.infogrid.meshbase.sweeper.DefaultIterableSweeper;
import org.infogrid.probe.m.MProbeDirectory;
import org.infogrid.probe.shadow.ShadowMeshBase;
import org.infogrid.util.logging.Log;

/**
 * Tests expiration of MeshObjects in the context of ShadowMeshBases.
 */
public class ProbeTest6
        extends
            AbstractProbeTest
{
    /**
     * Run the test.
     *
     * @throws Exception all sorts of things may happen during a test
     */
    public void run()
        throws
            Exception
    {
        log.info( "accessing " + theTestUrl );

        NetMeshObject firstObject = theMeshBase.accessLocally( theTestUrl );
        checkObject( firstObject, "no object from top" );

        // count MeshObjects, do not replicate

        int oldMeshObjectCount = countMeshObjects( theMeshBase, log );
        checkEquals( oldMeshObjectCount, 2, "Wrong number of MeshObjects after initial replication" ); // one plus home object

        checkEquals( countFromIterator( theMeshBase.proxies(), log ), 1, "Wrong number of proxies after initial replication" );
        checkEquals( theMeshBase.getShadowMeshBases().size(), 1, "Wrong number of shadows after initial replication" );
        
        //
        
        log.info( "Making sure proxies are set right" );

        ShadowMeshBase shadow       = theMeshBase.getShadowMeshBaseFor( theTestUrl );
        NetMeshObject  shadowObject = shadow.findMeshObjectByIdentifier( firstObject.getIdentifier() );

        checkEquals( theMeshBase.getIdentifier(),   shadow.proxies().next().getPartnerMeshBaseIdentifier(), "shadow proxy not pointing to base" );
        checkEquals( shadow.getIdentifier(),   theMeshBase.proxies().next().getPartnerMeshBaseIdentifier(),   "base proxy not pointing to shadow" );

        checkEquals( firstObject.getProxyTowardsHomeReplica().getPartnerMeshBaseIdentifier(), shadow.getIdentifier(), "firstObject proxyTowardsHome wrong" );
        checkEquals( firstObject.getProxyTowardsLockReplica().getPartnerMeshBaseIdentifier(), shadow.getIdentifier(), "firstObject proxyTowardsLock wrong" );
        checkCondition( shadowObject.getProxyTowardsHomeReplica() == null, "shadowObject proxyTowardsHome wrong" );
        checkCondition( shadowObject.getProxyTowardsLockReplica() == null, "shadowObject proxyTowardsLock wrong" );
        
        checkEquals( firstObject.getAllProxies().length,  1, "wrong number of proxies for firstObject" );
        checkEquals( shadowObject.getAllProxies().length, 1, "wrong number of proxies for shadowObject" );

        //
        
        log.info( "adding listener and sweeping" ); // to make sure we don't have a sub-optimal sequence

        PropertyChangeListener listener = new PropertyChangeListener() {
            public void propertyChange(
                    PropertyChangeEvent event )
            {}
        };
        
        firstObject.addWeakPropertyChangeListener( listener );
        
        theMeshBase.getSweeper().sweepAllNow();
        Thread.sleep( 2500L );

        //
        
        log.info( "counting again" );
        
        int newMeshObjectCount = countMeshObjects( theMeshBase, log );
        checkEquals( newMeshObjectCount, 2, "Wrong number of MeshObjects after first sweep" ); // one plus home object
        
        //

        log.info( "removing listener, and sweeping" );

        firstObject.removePropertyChangeListener( listener );
        
        theMeshBase.getSweeper().sweepAllNow();
        Thread.sleep( 2500L );

        //

        log.info( "Counting again" );
        
        newMeshObjectCount = countMeshObjects( theMeshBase, log );
        checkEquals( newMeshObjectCount, 1, "Wrong number of MeshObjects after second sweep" );
        
        //
        
        log.info( "Making sure proxies are right" );
        
        checkEquals( firstObject.getAllProxies(),  null, "wrong number of proxies for firstObject" );
        checkEquals( shadowObject.getAllProxies(), null, "wrong number of proxies for shadowObject" );

        //
        
        log.info( "Running the probe again should now remove the unnecessary shadow" );

        checkEquals( countFromIterator( theMeshBase.proxies(), log ), 1, "Wrong number of proxies before probe call" );
        checkEquals( theMeshBase.getShadowMeshBases().size(), 1, "Wrong number of shadows before probe call" );
        
        shadow.doUpdateNow();

        Thread.sleep( 4000L );
        
        checkEquals( countFromIterator( theMeshBase.proxies(), log ), 0, "Wrong number of proxies after second probe call" );
        checkEquals( theMeshBase.getShadowMeshBases().size(), 0, "Wrong number of shadows after second probe call" );
    }
    
    /**
     * Main program.
     *
     * @param args command-line arguments
     */
    public static void main(
            String [] args )
    {
        ProbeTest6 test = null;
        try {
            if( args.length != 1 ) {
                System.err.println( "Synopsis: <test file>" );
                System.err.println( "aborting ..." );
                System.exit( 1 );
            }

            test = new ProbeTest6( args );
            test.run();

        } catch( Throwable ex ) {
            log.error( ex );
            System.exit(1);
        }
        if( test != null ) {
            test.cleanup();
        }
        if( errorCount == 0 ) {
            log.info( "PASS" );
        } else {
            log.info( "FAIL (" + errorCount + " errors)" );
        }
        System.exit( errorCount );
    }
    
    /**
     * Constructor.
     *
     * @param args command-line arguments
     * @throws Exception all sorts of things may happen during a test
     */
    public ProbeTest6(
            String [] args )
        throws
            Exception
    {
        super( ProbeTest6.class );
        
        theTestUrl = theMeshBaseIdentifierFactory.obtain( new File( args[0] ) );

        NetMeshBaseIdentifier here = theMeshBaseIdentifierFactory.fromExternalForm( "http://here.local/" ); // this is not going to work for communications

        theMeshBase = LocalNetMMeshBase.create( here, theModelBase, null, theProbeDirectory, exec, rootContext );

        theMeshBase.setSweeper( DefaultIterableSweeper.create( theMeshBase, UnnecessaryReplicasSweepPolicy.create( 500L )));
    }

    /**
     * Cleanup.
     */
    @Override
    public void cleanup()
    {
        if( theMeshBase != null ) {
            theMeshBase.die();
        }
        exec.shutdown();
    }

    /**
     * The test URL that we access
     */
    protected NetMeshBaseIdentifier theTestUrl;

    /**
     * The ProbeDirectory to use.
     */
    protected MProbeDirectory theProbeDirectory = MProbeDirectory.create();

    /**
     * Our ThreadPool.
     */
    protected ScheduledExecutorService exec = createThreadPool( 1 );

    /**
     * The NetMeshBase to be tested.
     */
    protected LocalNetMMeshBase theMeshBase;

    // Our Logger
    private static Log log = Log.getLogInstance( ProbeTest6.class );
}
