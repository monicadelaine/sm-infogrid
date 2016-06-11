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

package org.infogrid.jee.net.test.module;

import java.io.File;
import java.net.URL;
import org.infogrid.module.*;

/**
  * Instantiates Module org.infogrid.jee.net.test (no specific version given).
  */
public class V
    implements
        ModuleAdvertisementInstantiator
{
    /**
      * No-op constructor.
      */
    public V()
    {}

    /**
      * Create the ModuleAdvertisement that is instantiated by this class.
      *
      * @return the created ModuleAdvertisement
      */
    public ModuleAdvertisement create()
        throws
            ModuleAdvertisementInstantiationException
    {
        try {
            ModuleAdvertisement ret = StandardModuleAdvertisement.create1(
                        "org.infogrid.jee.net.test",
                        null,
                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                {
                                        null,
                                        "org.infogrid.jee.net.testapp test program"
                                }
                        }),
                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                {
                                        null,
                                        "Testing the InfoGrid testapp"
                                }
                        }),
                        new java.util.Date( 1456085520539L ),
                        null,
                        null,
                        new ModuleRequirement[] {
                                ModuleRequirement.create1(
                                        "org.infogrid.util.logging.log4j",
                                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                                {
                                                        "org.infogrid.util.logging.log4j.ConfigPropertiesFile",
                                                        "org/infogrid/jee/net/test/Log.properties"
                                                }
                                        }),
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.testharness.tomcat",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.util",
                                        null,
                                        null )
                        },
                        new ModuleRequirement[] {
                                ModuleRequirement.create1(
                                        "org.infogrid.util.logging.log4j",
                                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                                {
                                                        "org.infogrid.util.logging.log4j.ConfigPropertiesFile",
                                                        "org/infogrid/jee/net/test/Log.properties"
                                                }
                                        }),
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.testharness.tomcat",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.util",
                                        null,
                                        null )
                        },
                        new File[] {
                                new File( "dist/org.infogrid.jee.net.test.jar" )
                        },
                        null,
                        null,
                        new ModuleCapability[] {
                        },
                        null,
                        "activate",
                        "deactivate",
                        null,
                        "configure",
                        "org.infogrid.jee.net.test.AllTests",
                        "main" );

            return ret;
        } catch( Throwable ex ) {
            throw new ModuleAdvertisementInstantiationException( this, ex );
        }
    }
}
