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

package org.infogrid.probe.test.shadow.module;

import java.io.File;
import java.net.URL;
import org.infogrid.module.*;

/**
  * Instantiates Module org.infogrid.probe.test.shadow (no specific version given).
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
                        "org.infogrid.probe.test.shadow",
                        null,
                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                {
                                        null,
                                        "ShadowMeshBase test Module"
                                }
                        }),
                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                {
                                        null,
                                        "Tests the InfoGrid Probe framework's ShadowMeshBases."
                                }
                        }),
                        new java.util.Date( 1456085435673L ),
                        null,
                        null,
                        new ModuleRequirement[] {
                                ModuleRequirement.create1(
                                        "org.infogrid.util.logging.log4j",
                                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                                {
                                                        "org.infogrid.util.logging.log4j.ConfigPropertiesFile",
                                                        "org/infogrid/probe/test/shadow/Log.properties"
                                                }
                                        }),
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.httpd",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.kernel",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.kernel.net",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.net.local",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Probe",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Test",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Web",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.probe",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.lid",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.lid.model.lid",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.lid.openid",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.lid.model.openid.auth",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.lid.model.yadis",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.util",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.util.instrument",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.testharness",
                                        null,
                                        null )
                        },
                        new ModuleRequirement[] {
                                ModuleRequirement.create1(
                                        "org.infogrid.util.logging.log4j",
                                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                                {
                                                        "org.infogrid.util.logging.log4j.ConfigPropertiesFile",
                                                        "org/infogrid/probe/test/shadow/Log.properties"
                                                }
                                        }),
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.httpd",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.kernel",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.kernel.net",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.net.local",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Probe",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Test",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Web",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.probe",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.lid",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.lid.model.lid",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.lid.openid",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.lid.model.openid.auth",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.lid.model.yadis",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.util",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.util.instrument",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.testharness",
                                        null,
                                        null )
                        },
                        new File[] {
                                new File( "dist/org.infogrid.probe.test.shadow.jar" )
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
                        "org.infogrid.probe.test.shadow.AllTests",
                        "main" );

            return ret;
        } catch( Throwable ex ) {
            throw new ModuleAdvertisementInstantiationException( this, ex );
        }
    }
}
