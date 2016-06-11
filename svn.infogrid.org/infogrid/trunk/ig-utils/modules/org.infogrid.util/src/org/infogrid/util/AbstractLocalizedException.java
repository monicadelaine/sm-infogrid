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

package org.infogrid.util;

import org.infogrid.util.logging.Log;
import org.infogrid.util.text.SimpleStringRepresentationParameters;
import org.infogrid.util.text.StringRepresentation;
import org.infogrid.util.text.StringRepresentationDirectory;
import org.infogrid.util.text.StringRepresentationDirectorySingleton;
import org.infogrid.util.text.StringRepresentationParameters;
import org.infogrid.util.text.StringifierException;

/**
 * This is a supertype for Exceptions that knows how to internationalize themselves.
 * Given that Exceptions carry all their data, it is a lot easier to to
 * ask the Exception how to internationalize itself, than to write outside
 * code to do so.
 */
public abstract class AbstractLocalizedException
        extends
            Exception
        implements
            LocalizedException
{
    private static final Log log = Log.getLogInstance( AbstractLocalizedException.class ); // our own, private logger

    /**
     * Constructor.
     */
    public AbstractLocalizedException()
    {
    }

    /**
     * Constructor with a message.
     *
     * @param msg the message
     */
    public AbstractLocalizedException(
            String msg )
    {
        super( msg );
    }

    /**
     * Constructor with no message but a cause.
     *
     * @param cause the Throwable that caused this Exception
     */
    public AbstractLocalizedException(
            Throwable cause )
    {
        super( cause );
    }

    /**
     * Constructor with a message and a cause.
     *
     * @param msg the message
     * @param cause the Exception that caused this Exception
     */
    public AbstractLocalizedException(
            String    msg,
            Throwable cause )
    {
        super( msg, cause );
    }

    /**
     * Return the explicitly set message, or the localized message if non was explicitly set.
     *
     * @return the message
     */
    @Override
    public String getMessage()
    {
        String ret = super.getMessage();
        if( ret == null ) {
            ret = getLocalizedMessage();
        }
        return ret;
    }

    /**
     * Obtain localized message, per JDK 1.5.
     *
     * @return localized message
     */
    @Override
    public String getLocalizedMessage()
    {
        try {
            return toStringRepresentation(
                    StringRepresentationDirectorySingleton.getSingleton().get( StringRepresentationDirectory.TEXT_PLAIN_NAME ),
                    StringRepresentationParameters.EMPTY );
        } catch( StringifierException ex ) {
            log.error( ex );
            return super.getLocalizedMessage();
        }
    }

    /**
     * Obtain resource parameters for the internationalization.
     *
     * @return the resource parameters
     */
    public abstract Object [] getLocalizationParameters();

    /**
     * Obtain a String representation of this instance that can be shown to the user.
     *
     * @param rep the StringRepresentation
     * @param pars collects parameters that may influence the String representation. Always provided.
     * @throws StringifierException thrown if there was a problem when attempting to stringify
     * @return String representation
     */
    public String toStringRepresentation(
            StringRepresentation           rep,
            StringRepresentationParameters pars )
        throws
            StringifierException
    {
        return constructStringRepresentation(
                this,
                rep,
                pars,
                findResourceHelperForLocalizedMessage(),
                getLocalizationParameters(),
                findStringRepresentationParameter() );
    }

    /**
     * Obtain the start part of a String representation of this object that acts
     * as a link/hyperlink and can be shown to the user.
     *
     * @param rep the StringRepresentation
     * @param pars collects parameters that may influence the String representation
     * @return String representation
     */
    public String toStringRepresentationLinkStart(
            StringRepresentation           rep,
            StringRepresentationParameters pars )
        throws
            StringifierException
    {
        return constructStringRepresentationLinkStart(
                this,
                rep,
                pars,
                findResourceHelperForLocalizedMessage(),
                getLocalizationParameters(),
                findStringRepresentationLinkStartParameter() );
    }

    /**
     * Obtain the end part of a String representation of this object that acts
     * as a link/hyperlink and can be shown to the user.
     *
     * @param rep the StringRepresentation
     * @param pars collects parameters that may influence the String representation. Always provided.
     * @return String representation
     */
    public String toStringRepresentationLinkEnd(
            StringRepresentation           rep,
            StringRepresentationParameters pars )
        throws
            StringifierException
    {
        return constructStringRepresentationLinkEnd(
                this,
                rep,
                pars,
                findResourceHelperForLocalizedMessage(),
                getLocalizationParameters(),
                findStringRepresentationLinkEndParameter() );
    }

    /**
     * Factored out creation of a string representation, so several classes can reference the same code.
     *
     * @param ex the LocalizedException to be converted
     * @param rep the StringRepresentation
     * @param helper the ResourceHelper to use
     * @param params the localization parameters to use
     * @param messageParameter the name of the message parameter to use with the ResourceHelper
     * @param pars collects parameters that may influence the String representation. Always provided.
     * @throws StringifierException thrown if there was a problem when attempting to stringify
     * @return the string
     */
    public static String constructStringRepresentation(
            LocalizedException             ex,
            StringRepresentation           rep,
            StringRepresentationParameters pars,
            ResourceHelper                 helper,
            Object []                      params,
            String                         messageParameter )
        throws
            StringifierException
    {
        return rep.formatEntry( ex.getClass(), messageParameter, pars, params );
    }

    /**
     * Factored out creation of the link start of a string representation, so several classes can reference the same code.
     *
     * @param ex the LocalizedException to be converted
     * @param rep the StringRepresentation
     * @param pars collects parameters that may influence the String representation. Always provided.
     * @param helper the ResourceHelper to use
     * @param params the localization parameters to use
     * @param messageParameter the name of the message parameter to use with the ResourceHelper
     * @throws StringifierException thrown if there was a problem when attempting to stringify
     * @return the string
     */
    public static String constructStringRepresentationLinkStart(
            LocalizedException             ex,
            StringRepresentation           rep,
            StringRepresentationParameters pars,
            ResourceHelper                 helper,
            Object []                      params,
            String                         messageParameter )
        throws
            StringifierException
    {
        return "";
    }

    /**
     * Factored out creation of the link end of a string representation, so several classes can reference the same code.
     *
     * @param ex the LocalizedException to be converted
     * @param rep the StringRepresentation
     * @param pars collects parameters that may influence the String representation. Always provided.
     * @param helper the ResourceHelper to use
     * @param params the localization parameters to use
     * @param messageParameter the name of the message parameter to use with the ResourceHelper
     * @throws StringifierException thrown if there was a problem when attempting to stringify
     * @return the string
     */
    public static String constructStringRepresentationLinkEnd(
            LocalizedException             ex,
            StringRepresentation           rep,
            StringRepresentationParameters pars,
            ResourceHelper                 helper,
            Object []                      params,
            String                         messageParameter )
        throws
            StringifierException
    {
        return "";
    }

    /**
     * Allow subclasses to override which ResourceHelper to use.
     *
     * @return the ResourceHelper to use
     */
    protected ResourceHelper findResourceHelperForLocalizedMessage()
    {
        return ResourceHelper.getInstance( getClass() );
    }
    
    /**
     * Allow subclasses to override which ResourceHelper to use.
     *
     * @return the ResourceHelper to use
     */
    protected ResourceHelper findResourceHelperForLocalizedMessageViaEnclosingClass()
    {
        String className = getClass().getName();
        int    dollar = className.indexOf( '$' );
        if( dollar >= 0 ) {
            className = className.substring( 0, dollar );
        }
        return ResourceHelper.getInstance( className, getClass().getClassLoader() );
    }

    /**
     * Allow subclasses to override which key to use in the Resource file for the string representation.
     *
     * @return the key
     */
    protected String findStringRepresentationParameter()
    {
        return STRING_REPRESENTATION_KEY;
    }

    /**
     * Allow subclasses to override which key to use in the Resource file for the link start string representation.
     *
     * @return the key
     */
    protected String findStringRepresentationLinkStartParameter()
    {
        return STRING_REPRESENTATION_LINK_START_KEY;
    }

    /**
     * Allow subclasses to override which key to use in the Resource file for the link end string representation.
     *
     * @return the key
     */
    protected String findStringRepresentationLinkEndParameter()
    {
        return STRING_REPRESENTATION_LINK_END_KEY;
    }

    /**
     * This method can be invoked by subclasses to obtain a suitable message key
     * for the same resource file for all inner classes.
     *
     * @param key the key
     * @return the modified key
     */
    protected String findParameterViaEnclosingClass(
            String key )
    {
        String className = getClass().getName();
        String ret;
        int    dollar = className.indexOf( '$' );
        if( dollar >= 0 ) {
            ret = key + "-" + className.substring( dollar+1 );
        } else {
            ret = key;
        }
        return ret;
    }
}
