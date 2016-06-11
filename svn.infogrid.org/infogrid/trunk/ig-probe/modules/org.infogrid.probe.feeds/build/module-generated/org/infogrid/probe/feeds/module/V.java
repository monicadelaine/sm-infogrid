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

package org.infogrid.probe.feeds.module;

import java.io.File;
import java.net.URL;
import org.infogrid.module.*;

/**
  * Instantiates Module org.infogrid.probe.feeds (no specific version given).
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
                        "org.infogrid.probe.feeds",
                        null,
                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                {
                                        null,
                                        "Feeds Probes"
                                }
                        }),
                        ModuleAdvertisement.createMapFromStringArrays( new String[][] {
                                {
                                        null,
                                        "Contains Probes for Atom and RSS. Supports InfoGrid extensions."
                                }
                        }),
                        new java.util.Date( 1456085415465L ),
                        null,
                        null,
                        new ModuleRequirement[] {
                                ModuleRequirement.create1(
                                        "org.infogrid.kernel",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.kernel.net",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.probe",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Feeds",
                                        null,
                                        null )
                        },
                        new ModuleRequirement[] {
                                ModuleRequirement.create1(
                                        "org.infogrid.kernel",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.kernel.net",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.probe",
                                        null,
                                        null ),
                                ModuleRequirement.create1(
                                        "org.infogrid.model.Feeds",
                                        null,
                                        null )
                        },
                        new File[] {
                                new File( "dist/org.infogrid.probe.feeds.jar" )
                        },
                        null,
                        null,
                        new ModuleCapability[] {
ModuleCapability.create1(
                                        new String[] {
"org.infogrid.probe.feeds.rss.RssProbe",
"org.infogrid.probe.xml.XmlDOMProbe",
"org.infogrid.probe.Probe" },
"org.infogrid.probe.feeds.rss.RssProbe",
                                        new ModuleCapability.ArgumentCombination[] {
 } ),
ModuleCapability.create1(
                                        new String[] {
"org.infogrid.probe.feeds.atom.AtomProbe",
"org.infogrid.probe.xml.XmlDOMProbe",
"org.infogrid.probe.Probe" },
"org.infogrid.probe.feeds.atom.AtomProbe",
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
