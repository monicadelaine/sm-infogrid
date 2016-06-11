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

package org.infogrid.myhealth.www.module;

import java.io.File;
import java.net.URL;
import org.infogrid.module.*;

/**
  * Instantiates Module org.infogrid.myhealth.www (no specific version given).
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
                        "org.infogrid.myhealth.www",
                        null,
                        null,
                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                {
                                        null,
                                        "The Unnamed App example application."
                                }
                        }),
                        new java.util.Date( 1456194223641L ),
                        null,
                        null,
                        new ModuleRequirement[] {
                                ModuleRequirement.create1(
                                        "org.infogrid.util.logging.log4j",
                                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                                {
                                                        "org.infogrid.util.logging.log4j.ConfigPropertiesFile",
                                                        "org/infogrid/myhealth/www/Log.properties"
                                                },
                                                {
                                                        "org.infogrid.util.ResourceHelper.ApplicationResourceBundle",
                                                        "org/infogrid/myhealth/www/App"
                                                }
                                        }),
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.jee.shell.http",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.jee.viewlet.store",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.kernel",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.meshbase.store",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Tagging",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Viewlet",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Wiki",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.store.sql.mysql",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.jee.viewlet.bulk",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.jee.viewlet.log4j",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.jee.viewlet.module",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.util",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.MyHealth",
                                        null,
                                        null )
                        },
                        new ModuleRequirement[] {
                                ModuleRequirement.create1(
                                        "org.infogrid.util.logging.log4j",
                                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                                {
                                                        "org.infogrid.util.logging.log4j.ConfigPropertiesFile",
                                                        "org/infogrid/myhealth/www/Log.properties"
                                                },
                                                {
                                                        "org.infogrid.util.ResourceHelper.ApplicationResourceBundle",
                                                        "org/infogrid/myhealth/www/App"
                                                }
                                        }),
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.jee.shell.http",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.jee.viewlet.store",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.kernel",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.meshbase.store",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Tagging",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Viewlet",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Wiki",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.store.sql.mysql",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.jee.viewlet.bulk",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.jee.viewlet.log4j",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.jee.viewlet.module",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.util",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.MyHealth",
                                        null,
                                        null )
                        },
                        new File[] {
                                new File( "dist/org.infogrid.myhealth.www.jar" )
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
                        null,
                        "main" );

            return ret;
        } catch( Throwable ex ) {
            throw new ModuleAdvertisementInstantiationException( this, ex );
        }
    }
}
