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

package org.infogrid.module.tomcat;

import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.infogrid.module.ModuleRegistry;
import org.infogrid.module.SharedSpace;

/**
 * A directory of ModuleRegistries.
 *
 * This can't implement SmartFactory because this project cannot depend on org.infogrid.util.
 */
public abstract class ModuleRegistryDirectory
{
    /**
     * Private constructor to keep this abstract.
     */
    private ModuleRegistryDirectory() {}

    /**
     * Obtain a newly created ModuleRegistry that is private.
     *
     * @param settingsPath the path containing the settings
     * @return a newly created ModuleRegistry
     */
    public static ModuleRegistry obtainFor(
            File settingsPath )
        throws
            ModuleRegistryMetaParseException,
            IOException
    {
        return TomcatModuleRegistry.create( settingsPath );
    }

    /**
     * Obtain a ModuleRegistry that is shared with other apps, using a particular share name.
     *
     * @param settingsPath
     * @param sharename name by which this ModuleRegistry is shared
     * @return a newly created or shared ModuleRegistry
     */
    public static synchronized ModuleRegistry obtainFor(
            File   settingsPath,
            String sharename )
        throws
            ModuleRegistryMetaParseException,
            IncompatibleSettingsPathException,
            IOException
    {
        WeakReference<TomcatModuleRegistry> ref = theModuleRegistries.get( sharename );
        TomcatModuleRegistry                ret = null;
        
        if( ref != null ) {
            ret = ref.get();
        }
        if( ret == null ) {
            ret = TomcatModuleRegistry.create( settingsPath );

            theModuleRegistries.put( sharename, new WeakReference<TomcatModuleRegistry>( ret ));
        } else {
            File retSettingsPath = ret.getSettingsPath();
            if(    ( retSettingsPath == null && settingsPath != null )
                || ( retSettingsPath != null && !retSettingsPath.equals( settingsPath )))
            {
                throw new IncompatibleSettingsPathException( settingsPath, sharename, ret );
            }
        }
        return ret;
    }

    /**
     * The known ModuleRegistries, keyed by their share name.
     */
    protected static HashMap<String,WeakReference<TomcatModuleRegistry>> theModuleRegistries
            = new HashMap<String,WeakReference<TomcatModuleRegistry>>();

    /**
     * Keep a reference to the SharedSpace.
     */
    public static final Class sharedSpace = SharedSpace.class;
}
