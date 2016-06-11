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

package org.infogrid.comm.smtp.test.module;

import java.io.File;
import java.net.URL;
import org.infogrid.module.*;

/**
  * Instantiates Module org.infogrid.comm.smtp.test (no specific version given).
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
                        "org.infogrid.comm.smtp.test",
                        null,
                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                {
                                        null,
                                        "SMTP Test Module"
                                }
                        }),
                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                {
                                        null,
                                        "Tests the SMTP Communications Module"
                                }
                        }),
                        new java.util.Date( 1456080502325L ),
                        null,
                        null,
                        new ModuleRequirement[] {
                                ModuleRequirement.create1(
                                        "org.infogrid.util.logging.log4j",
                                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                                {
                                                        "org.infogrid.util.logging.log4j.ConfigPropertiesFile",
                                                        "org/infogrid/comm/smtp/test/Log.properties"
                                                }
                                        }),
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.comm.smtp",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.testharness",
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
                                                        "org/infogrid/comm/smtp/test/Log.properties"
                                                }
                                        }),
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.comm.smtp",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.testharness",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.util",
                                        null,
                                        null )
                        },
                        new File[] {
                                new File( "dist/org.infogrid.comm.smtp.test.jar" )
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
                        "org.infogrid.comm.smtp.test.AllTests",
                        "main" );

            return ret;
        } catch( Throwable ex ) {
            throw new ModuleAdvertisementInstantiationException( this, ex );
        }
    }
}
