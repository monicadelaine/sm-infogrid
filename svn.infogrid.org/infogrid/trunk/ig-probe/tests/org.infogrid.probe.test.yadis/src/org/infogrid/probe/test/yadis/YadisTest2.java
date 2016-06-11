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
// Copyright 1998-2012 by R-Objects Inc. dba NetMesh Inc., Johannes Ernst
// All rights reserved.
//

package org.infogrid.probe.test.yadis;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import org.infogrid.httpd.HttpEntity;
import org.infogrid.httpd.HttpEntityResponse;
import org.infogrid.httpd.HttpErrorResponse;
import org.infogrid.httpd.HttpRequest;
import org.infogrid.httpd.HttpResponse;
import org.infogrid.httpd.HttpResponseFactory;
import org.infogrid.mesh.net.NetMeshObject;
import org.infogrid.meshbase.net.CoherenceSpecification;
import org.infogrid.meshbase.net.local.LocalNetMeshBase;
import org.infogrid.probe.shadow.ShadowMeshBase;
import org.infogrid.util.logging.Log;

/**
 * Tests XRDS disovery via HTTP Header.
 */
public class YadisTest2
        extends
            AbstractYadisDiscoveryTest
{
    /**
     * Run one test scenario.
     *
     * @param mb the NetMeshBase to use for this scenario
     * @param mode the mode
     * @throws Exception all sorts of things may happen during a test
     */
    public void run(
            LocalNetMeshBase mb,
            boolean          mode )
        throws
            Exception
    {
        log.info( "Accessing test data source (1) - " + mode );

        theWithYadis = mode;

        NetMeshObject  identityShadowHome = mb.accessLocally( theIdentityIdentifier, CoherenceSpecification.ONE_TIME_ONLY );
        ShadowMeshBase identityShadow     = mb.getShadowMeshBaseFor( theIdentityIdentifier );

        if( mode ) {
            checkYadisResultsIndirect( identityShadowHome, 3 );
        } else {
            checkNoYadisResults( identityShadowHome );
        }

        // only exists now if Yadis
        ShadowMeshBase xrdsShadow = mb.getShadowMeshBaseFor( mb.getMeshBaseIdentifierFactory().fromExternalForm( XRDS_IDENTIFIER ));
        if( xrdsShadow != null ) {
            checkEquals( xrdsShadow.size(), 11, "Wrong number of objects in XRDS Shadow" );
        }

        //

        log.info(  "Accessing test data source (2) - " + mode );

        theWithYadis = !mode;
        identityShadow.doUpdateNow();
        sleepFor( PINGPONG_ROUNDTRIP_DURATION );

        if( xrdsShadow != null ) {
            checkEquals( xrdsShadow.size(), 11, "Wrong number of objects in XRDS Shadow" );
        }

        if( !mode ) {
            checkYadisResultsIndirect( identityShadowHome, 3 );
        } else {
            checkNoYadisResults( identityShadowHome );
        }

        //

        log.info( "Accessing test data source (3) - " + mode );

        theWithYadis = mode;
        identityShadow.doUpdateNow();
        sleepFor( PINGPONG_ROUNDTRIP_DURATION );

        if( mode ) {
            checkYadisResultsIndirect( identityShadowHome, 3 );
        } else {
            checkNoYadisResults( identityShadowHome );
        }
    }

    /**
     * Main program.
     *
     * @param args command-line arguments
     */
    public static void main(
            String [] args )
    {
        YadisTest2 test = null;
        try {
            if( args.length != 1 ) {
                System.err.println( "Synopsis: <delay>" );
                System.err.println( "aborting ..." );
                System.exit( 1 );
            }

            test = new YadisTest2( args );
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
     * @throws Exception thrown if an Exception occurred during the test
     */
    public YadisTest2(
            String [] args )
        throws
            Exception
    {
        super( YadisTest2.class, new MyResponseFactory( Long.valueOf( args[0] ) ));
    }

    // Our Logger
    private static Log log = Log.getLogInstance( YadisTest2.class);

    /**
      * A HttpResponseFactory that acts as the RelyingParty.
      */
    static class MyResponseFactory
        implements
            HttpResponseFactory
    {
        /**
         * Constructor.
         *
         * @param delay the delay by the web server
         */
        public MyResponseFactory(
                long delay )
        {
            theDelay = delay;
        }

        /**
          * Factory method for a HttpResponse.
          *
          * @param request the HttpRequest for which we create a HttpResponse
          * @return the created HttpResponse
          */
        public HttpResponse createResponse(
                HttpRequest request )
        {
            HttpResponse ret;
            if( "GET".equals( request.getMethod() ) && ( "/" + IDENTITY_LOCAL_IDENTIFIER ).equals( request.getRelativeBaseUri() )) {
                HttpEntity entity = new HttpEntity() {
                        public boolean canRead() {
                            return true;
                        }
                        public InputStream getAsStream() {
                            try {
                                return new ByteArrayInputStream( HTML.getBytes( "UTF-8" ));
                            } catch( UnsupportedEncodingException ex ) {
                                log.error( ex );
                                return null;
                            }
                        }
                        public String getMime() {
                            return "text/html";
                        }
                };                
                ret = HttpEntityResponse.create( request, true, entity );
                if( theWithYadis ) {
                    ret.addHeader( "X-XRDS-Location", XRDS_IDENTIFIER );
                }

            } else if( "GET".equals( request.getMethod() ) && ( "/" + XRDS_LOCAL_IDENTIFIER ).equals( request.getRelativeBaseUri() )) {
                HttpEntity entity = new HttpEntity() {
                        public boolean canRead() {
                            return true;
                        }
                        public InputStream getAsStream() {
                            try {
                                return new ByteArrayInputStream( XRDS.getBytes( "UTF-8" ));
                            } catch( UnsupportedEncodingException ex ) {
                                log.error( ex );
                                return null;
                            }
                        }
                        public String getMime() {
                            return "application/xrds+xml";
                        }
                };                
                ret = HttpEntityResponse.create( request, true, entity );
                if( theWithYadis ) {
                    ret.addHeader( "X-XRDS-Location", XRDS_IDENTIFIER );
                }

            } else {
                ret = HttpErrorResponse.create( request, "500", null );
            }

            if( theDelay > 0L ) {
                try {
                    Thread.sleep( theDelay );
                } catch( Throwable t ) {
                    log.error( t );
                }
            }
            return ret;
        }

        /**
         * Captures the slowness of a web server.
         */
        protected long theDelay;
    }
}
