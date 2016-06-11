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

package org.infogrid.probe.xrd.module;

import java.io.File;
import java.net.URL;
import org.infogrid.module.*;

/**
  * Instantiates Module org.infogrid.probe.xrd (no specific version given).
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
                        "org.infogrid.probe.xrd",
                        null,
                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                {
                                        null,
                                        "XRD Probe Module"
                                }
                        }),
                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                {
                                        null,
                                        "Contains a Probe that can read XRD files."
                                }
                        }),
                        new java.util.Date( 1456085420224L ),
                        null,
                        null,
                        new ModuleRequirement[] {
                                ModuleRequirement.create1(
                                        "org.infogrid.probe",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.lid.model.xrd",
                                        null,
                                        null )
                        },
                        new ModuleRequirement[] {
                                ModuleRequirement.create1(
                                        "org.infogrid.probe",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.lid.model.xrd",
                                        null,
                                        null )
                        },
                        new File[] {
                                new File( "dist/org.infogrid.probe.xrd.jar" )
                        },
                        null,
                        null,
                        new ModuleCapability[] {
ModuleCapability.create1(
                                        new String[] {
"org.infogrid.probe.xrd.XrdProbe",
"org.infogrid.probe.Probe" },
"org.infogrid.probe.xrd.XrdProbe",
                                        new ModuleCapability.ArgumentCombination[] {
 } )
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
