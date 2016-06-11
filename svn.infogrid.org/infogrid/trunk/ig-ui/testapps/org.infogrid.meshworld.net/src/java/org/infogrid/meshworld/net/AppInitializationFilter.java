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
// Copyright 1998-2011 by R-Objects Inc. dba NetMesh Inc., Johannes Ernst
// All rights reserved.
//

package org.infogrid.meshworld.net;

import java.io.IOException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.infogrid.jee.rest.net.local.defaultapp.store.AbstractStoreNetLocalRestfulAppInitializationFilter;
import org.infogrid.jee.templates.defaultapp.AppInitializationException;
import org.infogrid.jee.viewlet.JeeMeshObjectsToViewFactory;
import org.infogrid.jee.viewlet.net.DefaultJeeNetMeshObjectsToViewFactory;
import org.infogrid.meshbase.net.IterableNetMeshBase;
import org.infogrid.meshbase.net.NetMeshBaseIdentifierFactory;
import org.infogrid.meshbase.net.NetMeshBaseNameServer;
import org.infogrid.meshbase.net.sweeper.DefaultNetIterableSweeper;
import org.infogrid.meshbase.net.sweeper.UnnecessaryReplicasSweepPolicy;
import org.infogrid.model.traversal.TraversalTranslator;
import org.infogrid.model.traversal.xpath.XpathTraversalTranslator;
import org.infogrid.store.m.MStore;
import org.infogrid.store.sql.mysql.MysqlStore;
import org.infogrid.util.CompoundException;
import org.infogrid.util.ResourceHelper;
import org.infogrid.util.context.Context;
import org.infogrid.util.http.SaneRequest;
import org.infogrid.util.naming.NamingReportingException;
import org.infogrid.viewlet.ViewletFactory;

/**
 * Initializes application-level functionality.
 */
public class AppInitializationFilter
        extends
            AbstractStoreNetLocalRestfulAppInitializationFilter
{
    /**
     * Constructor for subclasses only, use factory method.
     */
    public AppInitializationFilter()
    {
        // nothing right now
    }

    /**
     * Initialize the data sources.
     *
     * @throws NamingException thrown if a data source could not be found or accessed
     * @throws IOException thrown if an I/O problem occurred
     * @throws AppInitializationException thrown if the application could not be initialized
     */
    protected void initializeDataSources()
            throws
                NamingException,
                IOException,
                AppInitializationException
    {
        String         name    = "java:comp/env/jdbc/org.infogrid.meshworld.net";
        InitialContext ctx     = null;
        Throwable      toThrow = null;

        try {
            // Database access via JNDI
            ResourceHelper rh = ResourceHelper.getInstance( AppInitializationFilter.class );

            ctx                      = new InitialContext();
            DataSource theDataSource = (DataSource) ctx.lookup( name );

            theMeshStore        = MysqlStore.create( theDataSource, rh.getResourceStringOrDefault( "MeshObjectTable",  "MeshObjects" ));
            theProxyStore       = MysqlStore.create( theDataSource, rh.getResourceStringOrDefault( "ProxyStoreTable",  "Proxies"       ));
            theShadowStore      = MysqlStore.create( theDataSource, rh.getResourceStringOrDefault( "ShadowTable",      "Shadows"       ));
            theShadowProxyStore = MysqlStore.create( theDataSource, rh.getResourceStringOrDefault( "ShadowProxyTable", "ShadowProxies" ));

            theMeshStore.initializeIfNecessary();
            theProxyStore.initializeIfNecessary();
            theShadowStore.initializeIfNecessary();
            theShadowProxyStore.initializeIfNecessary();

        } catch( NamingException ex ) {
            toThrow = new NamingReportingException( name, ctx, ex );

        } catch( IOException ex ) {
            toThrow = ex;

        } catch( Throwable ex ) {
            toThrow = ex;
        }

        if( toThrow != null ) {
            theMeshStore = MStore.create();
            theMeshStore.initializeIfNecessary();

            theProxyStore = MStore.create();
            theProxyStore.initializeIfNecessary();

            theShadowStore = MStore.create();
            theShadowStore.initializeIfNecessary();

            theShadowProxyStore = MStore.create();
            theShadowProxyStore.initializeIfNecessary();

            throw new AppInitializationException(
                    new CompoundException(
                            new InMemoryOnlyException(),
                            toThrow ));
        }
    }

    /**
     * Initialize the context objects. This may be overridden by subclasses.
     *
     * @param incomingRequest the incoming request
     * @param rootContext the root Context
     * @throws Exception initialization may fail
     */
    @Override
    protected void initializeContextObjects(
            SaneRequest incomingRequest,
            Context     rootContext )
        throws
            Exception
    {
        super.initializeContextObjects( incomingRequest, rootContext );

        IterableNetMeshBase mb = rootContext.findContextObjectOrThrow( IterableNetMeshBase.class );
        mb.setSweeper( DefaultNetIterableSweeper.create( mb, UnnecessaryReplicasSweepPolicy.create( 1000L )));

        NetMeshBaseIdentifierFactory mbIdentifierFact = rootContext.findContextObject( NetMeshBaseIdentifierFactory.class );
        NetMeshBaseNameServer        mbNameServer     = rootContext.findContextObject( NetMeshBaseNameServer.class );

        TraversalTranslator translator = XpathTraversalTranslator.create( mb );
        rootContext.addContextObject( translator );

        ViewletFactory mainVlFact = new MainViewletFactory();
        rootContext.addContextObject( mainVlFact );

        @SuppressWarnings("unchecked")
        JeeMeshObjectsToViewFactory toViewFact = DefaultJeeNetMeshObjectsToViewFactory.create(
                mb.getIdentifier(),
                mbIdentifierFact,
                mbNameServer,
                translator,
                incomingRequest.getContextPath(),
                incomingRequest.getAbsoluteContextUri(),
                rootContext );
        rootContext.addContextObject( toViewFact );
    }
}
