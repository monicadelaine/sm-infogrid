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
// Copyright 1998-2009 by R-Objects Inc. dba NetMesh Inc., Johannes Ernst
// All rights reserved.
//

package org.infogrid.util;

import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import org.infogrid.module.Module;
import org.infogrid.module.ModuleAdvertisement;
import org.infogrid.module.ModuleRegistry;
import org.infogrid.module.ModuleRequirement;
import org.infogrid.util.logging.Log;
import org.infogrid.util.logging.LogFactory;

/**
 * The initializer class for this Module.
 */
public abstract class Init
{
    /**
     * Configure this Module.
     *
     * @param parameters the parameters for initialization
     * @param whereParametersSpecifiedMap maps which Modules specified each parameter
     * @param thisModule the Module to be configured
     * @throws Exception may throw a range of Exceptions
     */
    public static void configure(
            Map<String,Object> parameters,
            Map<String,Module> whereParametersSpecifiedMap,
            Module             thisModule )
        throws
            Exception
    {
        if( parameters == null ) {
            return;
        }

        try {
            configureLogFactory( parameters, whereParametersSpecifiedMap, thisModule );
        } finally {
            configureResourceHelper( parameters, whereParametersSpecifiedMap, thisModule );
        }
    }

    /**
     * Configure the LogFactory.
     *
     * @param parameters the parameters for initialization
     * @param whereParametersSpecifiedMap maps which Modules specified each parameter
     * @param thisModule the Module to be configured
     * @throws Exception may throw a range of Exceptions
     */
    public static void configureLogFactory(
            Map<String,Object> parameters,
            Map<String,Module> whereParametersSpecifiedMap,
            Module             thisModule )
        throws
            Exception
    {
        String className  = (String) parameters.get( LOG_FACTORY_CLASS_PARAMETER_NAME );
        String moduleName = (String) parameters.get( LOG_FACTORY_MODULE_PARAMETER_NAME );

        if( className == null ) {
            return;
        }

        Class logFactoryClass;
        if( moduleName != null ) {
            ModuleRegistry      reg   = thisModule.getModuleRegistry();
            ModuleAdvertisement found = reg.determineSingleResolutionCandidate( ModuleRequirement.create1( moduleName ));

            Module logFactoryModule = reg.resolve( found, true );

            logFactoryClass = Class.forName( className, true, logFactoryModule.getClassLoader());

        } else {
            logFactoryClass = Class.forName( className );
        }
        Object logFactory = logFactoryClass.newInstance();

        Log.setLogFactory( (LogFactory) logFactory );
    }

    /**
     * Configure the ResourceHelper.
     *
     * @param parameters the parameters for initialization
     * @param whereParametersSpecifiedMap maps which Modules specified each parameter
     * @param thisModule the Module to be configured
     * @throws Exception may throw a range of Exceptions
     */
    public static void configureResourceHelper(
            Map<String,Object> parameters,
            Map<String,Module> whereParametersSpecifiedMap,
            Module             thisModule )
        throws
            Exception
    {
        String bundleName = (String) parameters.get( RESOURCE_HELPER_APPLICATION_BUNDLE_PARAMETER_NAME );

        if( bundleName == null ) {
            return;
        }

        // Find out which Module specified and use their ClassLoader
        Module      specified = whereParametersSpecifiedMap.get( RESOURCE_HELPER_APPLICATION_BUNDLE_PARAMETER_NAME );
        ClassLoader loader    = specified.getClassLoader();

        ResourceHelper.setApplicationResourceBundle(
                ResourceBundle.getBundle( bundleName, Locale.getDefault(), loader ));
    }

    /**
     * Name of the Module configuration parameter that specifies the name of the LogFactory class.
     */
    public static final String LOG_FACTORY_CLASS_PARAMETER_NAME = "org.infogrid.util.logging.LogFactory.Class";

    /**
     * Name of the Module configuration parameter that specifies the name of the Module in which the
     * LogFactory class can be found.
     */
    public static final String LOG_FACTORY_MODULE_PARAMETER_NAME = "org.infogrid.util.logging.LogFactory.Module";

    /**
     * Name of the Module configuration parameter that specifies the application ResourceBundle.
     */
    public static final String RESOURCE_HELPER_APPLICATION_BUNDLE_PARAMETER_NAME = "org.infogrid.util.ResourceHelper.ApplicationResourceBundle";
}
