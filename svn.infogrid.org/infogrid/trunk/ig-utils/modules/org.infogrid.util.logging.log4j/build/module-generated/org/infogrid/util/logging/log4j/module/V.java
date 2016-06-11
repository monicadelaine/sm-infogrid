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

package org.infogrid.util.logging.log4j.module;

import java.io.File;
import java.net.URL;
import org.infogrid.module.*;

/**
  * Instantiates Module org.infogrid.util.logging.log4j (no specific version given).
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
                        "org.infogrid.util.logging.log4j",
                        null,
                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                {
                                        null,
                                        "Log4j logging module"
                                }
                        }),
                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                {
                                        null,
                                        "Enables the InfoGrid logging framework to log via log4j."
                                }
                        }),
                        new java.util.Date( 1456080471655L ),
                        null,
                        null,
                        new ModuleRequirement[] {
                                ModuleRequirement.create1(
                                        "org.infogrid.util",
                                        null,
                                        null )
                        },
                        new ModuleRequirement[] {
                                ModuleRequirement.create1(
                                        "org.infogrid.util",
                                        null,
                                        null )
                        },
                        new File[] {
                                new File( "dist/org.infogrid.util.logging.log4j.jar" ),
                                new File( "dist/log4j.jar" )
                        },
                        null,
                        null,
                        new ModuleCapability[] {
                        },
                        "org.infogrid.util.logging.log4j.Init",
                        "activate",
                        "deactivate",
                        "org.infogrid.util.logging.log4j.Init",
                        "configure",
                        null,
                        "main" );

            return ret;
        } catch( Throwable ex ) {
            throw new ModuleAdvertisementInstantiationException( this, ex );
        }
    }
}
