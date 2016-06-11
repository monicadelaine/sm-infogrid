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
// Copyright 1998-2013 by R-Objects Inc. dba NetMesh Inc., Johannes Ernst
// All rights reserved.
//

package org.infogrid.meshbase.store.net.test;

import java.text.ParseException;
import org.infogrid.mesh.MeshObject;
import org.infogrid.mesh.MeshObjectIdentifier;
import org.infogrid.meshbase.MeshBaseLifecycleManager;
import org.infogrid.meshbase.net.DefaultNetMeshObjectAccessSpecificationFactory;
import org.infogrid.meshbase.net.NetMeshBaseIdentifier;
import org.infogrid.meshbase.net.NetMeshObjectAccessSpecificationFactory;
import org.infogrid.meshbase.net.proxy.NiceAndTrustingProxyPolicyFactory;
import org.infogrid.meshbase.store.net.NetStoreMeshBase;
import org.infogrid.meshbase.transaction.Transaction;
import org.infogrid.model.Test.TestSubjectArea;
import org.infogrid.model.primitives.StringValue;
import org.infogrid.store.IterableStore;
import org.infogrid.store.Store;
import org.infogrid.store.prefixing.IterablePrefixingStore;
import org.infogrid.store.prefixing.PrefixingStore;
import org.infogrid.util.logging.Log;

/**
 * Makes sure we do the right number of writes and reads.
 */
public class StoreNetMeshBaseTest1
        extends
            AbstractStoreNetMeshBaseTest
{
    /**
     * Run the test.
     *
     * @throws Exception thrown if an Exception occurred during the test
     */
    @Override
    public void run()
        throws
            Exception
    {
        //

        Store         meshObjectStore = PrefixingStore.create(         "mesh", theSqlStore );
        IterableStore proxyStore      = IterablePrefixingStore.create( "proxy", theSqlStore );
        
        RecordingStoreListener listener = new RecordingStoreListener();
        theSqlStore.addDirectStoreListener( listener );

        //

        log.info( "Creating MeshBase" );

        NetMeshObjectAccessSpecificationFactory theAccessSpecificationFactory
                = DefaultNetMeshObjectAccessSpecificationFactory.create(
                        theNetworkIdentifier,
                        theMeshBaseIdentifierFactory );

        NiceAndTrustingProxyPolicyFactory proxyPolicyFactory = NiceAndTrustingProxyPolicyFactory.create();

        super.startClock();
        long t1 = System.currentTimeMillis();

        NetStoreMeshBase mb = NetStoreMeshBase.create(
                theNetworkIdentifier,
                theAccessSpecificationFactory,
                theModelBase,
                null,
                null,
                proxyPolicyFactory,
                meshObjectStore,
                proxyStore,
                rootContext );

        MeshBaseLifecycleManager life = mb.getMeshBaseLifecycleManager();

        checkEquals( listener.thePuts.size(),       1, "Wrong number of puts" );
        checkEquals( listener.theUpdates.size(),    0, "Wrong number of updates" );
        checkEquals( listener.theGets.size(),       0, "Wrong number of gets" ); //
        checkEquals( listener.theFailedGets.size(), 2, "Wrong number of failedGets" ); // twice for a non-existing home object
        checkEquals( listener.theDeletes.size(),    0, "Wrong number of deletes" );
        listener.reset();

        //

        log.info( "Creating MeshObjects" );
        
        Transaction tx = mb.createTransactionNow();

        MeshObject []           mesh  = new MeshObject[ theTestSize ];
        MeshObjectIdentifier [] names = new MeshObjectIdentifier[ theTestSize ];
        
        for( int i=0 ; i<mesh.length ; ++i ) {
            mesh[i] = life.createMeshObject();
            
            names[i] = mesh[i].getIdentifier();
            
            if( i % 3 == 1 ) {
                mesh[i].bless( TestSubjectArea.AA );
            } else if( i % 3 == 2 ) {
                mesh[i].bless( TestSubjectArea.AA );
                mesh[i].setPropertyValue( TestSubjectArea.A_X, StringValue.create( "Testing ... " + i ));
            }
        }

        tx.commitTransaction();

        checkEquals( listener.thePuts.size(),       theTestSize, "Wrong number of puts" );
        checkEquals( listener.theUpdates.size(),    0,           "Wrong number of updates" );
        checkEquals( listener.theGets.size(),       0,           "Wrong number of gets" );
        checkEquals( listener.theFailedGets.size(), theTestSize, "Wrong number of failedGets" );
        checkEquals( listener.theDeletes.size(),    0,           "Wrong number of deletes" );
        listener.reset();

        //
        
        log.info( "Clearing cache, and loading MeshObjects again" );
        
        mesh = new MeshObject[ names.length ]; // forget old references
        mb.clearMemoryCache();

        for( int i=0 ; i<names.length ; ++i ) {
            mesh[i] = mb.findMeshObjectByIdentifier( names[i] );
            
            checkObject( mesh[i], "Could not retrieve MeshObject with Identifier " + names[i] );
        }

        checkEquals( listener.thePuts.size(),       0,            "Wrong number of puts" );
        checkEquals( listener.theUpdates.size(),    0,            "Wrong number of updates" );
        checkEquals( listener.theGets.size(),       names.length, "Wrong number of gets" );
        checkEquals( listener.theFailedGets.size(), 0,            "Wrong number of failedGets" );
        checkEquals( listener.theDeletes.size(),    0,            "Wrong number of deletes" );
        listener.reset();

        mb.die();
        // no exec to kill off here
    }

    /**
     * Main program.
     *
     * @param args command-line arguments
     */
    public static void main(
            String [] args )
    {
        StoreNetMeshBaseTest1 test = null;
        try {
            if( args.length < 1 ) {
                System.err.println( "Synopsis: <test size>" );
                System.err.println( "aborting ..." );
                System.exit( 1 );
            }

            test = new StoreNetMeshBaseTest1( args );
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
     * @throws Exception anything can go wrong in a test
     */
    public StoreNetMeshBaseTest1(
            String [] args )
        throws
            Exception
    {
        super( StoreNetMeshBaseTest1.class );

        theTestSize = Integer.parseInt( args[0] );

        log.info( "Deleting old database and creating new database" );

        theSqlStore.initializeHard();
    }

    /**
     * The number of MeshObjects to create for the test.
     */
    protected int theTestSize;

    // Our Logger
    private static Log log = Log.getLogInstance( StoreNetMeshBaseTest1.class );
    
    /**
     * The NetMeshBaseIdentifier for the NetMeshBase.
     */
    protected static final NetMeshBaseIdentifier theNetworkIdentifier;
    static {
        NetMeshBaseIdentifier id;
        try {
            id = theMeshBaseIdentifierFactory.fromExternalForm( "test://i.am.here" );

        } catch( ParseException ex ) {
            log.error( ex );
            id = null;
        }
        
        theNetworkIdentifier = id;
    }
}
