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

package org.infogrid.probe.module;

import java.io.File;
import java.net.URL;
import org.infogrid.module.*;

/**
  * Instantiates Module org.infogrid.probe (no specific version given).
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
                        "org.infogrid.probe",
                        null,
                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                {
                                        null,
                                        "InfoGrid Probe framework module"
                                }
                        }),
                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                {
                                        null,
                                        "Enables InfoGrid to access and keep consistent with external data feeds\\n   of any format."
                                }
                        }),
                        new java.util.Date( 1456085409482L ),
                        null,
                        null,
                        new ModuleRequirement[] {
                                ModuleRequirement.create1(
                                        "org.infogrid.lid",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.lid.model.lid",
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
                                        "org.infogrid.kernel",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.kernel.net",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Blob",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Probe",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.util",
                                        null,
                                        null )
                        },
                        new ModuleRequirement[] {
                                ModuleRequirement.create1(
                                        "org.infogrid.lid",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.lid.model.lid",
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
                                        "org.infogrid.kernel",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.kernel.net",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Blob",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Probe",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.util",
                                        null,
                                        null )
                        },
                        new File[] {
                                new File( "dist/org.infogrid.probe.jar" )
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
