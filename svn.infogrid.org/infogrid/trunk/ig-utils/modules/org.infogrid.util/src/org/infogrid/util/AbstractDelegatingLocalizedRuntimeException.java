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

import org.infogrid.util.text.StringRepresentation;
import org.infogrid.util.text.StringRepresentationParameters;
import org.infogrid.util.text.StringifierException;

/**
 * An AbstractLocalizedException used only for those RuntimeExceptions that primarily delegate to
 * other causes.
 */
public abstract class AbstractDelegatingLocalizedRuntimeException
    extends
        AbstractLocalizedRuntimeException
{
    /**
     * Constructor with no message but a cause.
     *
     * @param cause the Throwable that caused this Exception
     */
    public AbstractDelegatingLocalizedRuntimeException(
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
    public AbstractDelegatingLocalizedRuntimeException(
            String    msg,
            Throwable cause )
    {
        super( msg, cause );
    }

    /**
     * Obtain localized message, per JDK 1.5.
     *
     * @return localized message
     */
    @Override
    public String getLocalizedMessage()
    {
        Throwable cause = getCause();
        if( cause instanceof LocalizedException ) {
            return ((LocalizedException)cause).getLocalizedMessage();
        } else {
            return super.getLocalizedMessage();
        }
    }

    /**
     * Obtain resource parameters for the internationalization.
     *
     * @return the resource parameters
     */
    public Object [] getLocalizationParameters()
    {
        String delegateMessage = getCause().getLocalizedMessage();
        if( delegateMessage == null ) {
            delegateMessage = getCause().getMessage();
        }
        if( delegateMessage == null ) {
            delegateMessage = getCause().getClass().getName();
        }
        return new Object[] { delegateMessage };
    }

    /**
     * Obtain a String representation of this instance that can be shown to the user.
     *
     * @param rep the StringRepresentation
     * @param pars collects parameters that may influence the String representation. Always provided.
     * @return String representation
     * @throws StringifierException thrown if there was a problem when attempting to stringify
     */
    @Override
    public String toStringRepresentation(
            StringRepresentation           rep,
            StringRepresentationParameters pars )
        throws
            StringifierException
    {
        Throwable cause = getCause();
        if( cause instanceof LocalizedException ) {
            return ((LocalizedException)cause).toStringRepresentation( rep, pars );
        } else {
            return super.toStringRepresentation( rep, pars );
        }
    }

    /**
     * Obtain the start part of a String representation of this object that acts
     * as a link/hyperlink and can be shown to the user.
     *
     * @param rep the StringRepresentation
     * @param pars collects parameters that may influence the String representation. Always provided.
     * @return String representation
     * @throws StringifierException thrown if there was a problem when attempting to stringify
     */
    @Override
    public String toStringRepresentationLinkStart(
            StringRepresentation           rep,
            StringRepresentationParameters pars )
        throws
            StringifierException
    {
        Throwable cause = getCause();
        if( cause instanceof LocalizedException ) {
            return ((LocalizedException)cause).toStringRepresentationLinkStart( rep, pars );
        } else {
            return super.toStringRepresentationLinkStart( rep, pars );
        }
    }

    /**
     * Obtain the end part of a String representation of this object that acts
     * as a link/hyperlink and can be shown to the user.
     *
     * @param rep the StringRepresentation
     * @param pars collects parameters that may influence the String representation. Always provided.
     * @return String representation
     * @throws StringifierException thrown if there was a problem when attempting to stringify
     */
    @Override
    public String toStringRepresentationLinkEnd(
            StringRepresentation           rep,
            StringRepresentationParameters pars )
        throws
            StringifierException
    {
        Throwable cause = getCause();
        if( cause instanceof LocalizedException ) {
            return ((LocalizedException)cause).toStringRepresentationLinkEnd( rep, pars );
        } else {
            return super.toStringRepresentationLinkEnd( rep, pars );
        }
    }
}
