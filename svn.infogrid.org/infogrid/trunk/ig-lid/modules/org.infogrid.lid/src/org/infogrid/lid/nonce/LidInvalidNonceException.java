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
// Copyright 1998-2011 by R-Objects Inc. dba NetMesh Inc., Johannes Ernst
// All rights reserved.
//

package org.infogrid.lid.nonce;

import org.infogrid.lid.credential.LidCredentialType;
import org.infogrid.lid.credential.LidInvalidCredentialException;
import org.infogrid.util.Identifier;
import org.infogrid.util.ResourceHelper;

/**
 * Thrown if a LID nonce is invalid. Inner classes are concrete and capture the specifics.
 */
public abstract class LidInvalidNonceException
        extends
            LidInvalidCredentialException
{
    private static final long serialVersionUID = 1L; // helps with serialization

    /**
     * Constructor.
     *
     * @param identifier the identifier for which an invalid credential was provided
     * @param siteIdentifier the site at which the invalid credential was provided
     * @param type the type of credential that was invalid
     * @param invalidNonce the invalid nonce
     */
    protected LidInvalidNonceException(
            Identifier        identifier,
            Identifier        siteIdentifier,
            LidCredentialType type,
            String            invalidNonce )
    {
        super( identifier, siteIdentifier, type );

        theInvalidNonce = invalidNonce;
    }

    /**
     * All subclasses have a common ResourceHelper for all inner classes.
     *
     * @return the ResourceHelper to use
     */
    @Override
    protected ResourceHelper findResourceHelperForLocalizedMessage()
    {
        return findResourceHelperForLocalizedMessageViaEnclosingClass();
    }

    /**
     * All subclasses have a common ResourceHelper for all inner classes.
     *
     * @return the key
     */
    @Override
    protected String findStringRepresentationParameter()
    {
        return findParameterViaEnclosingClass( STRING_REPRESENTATION_KEY );
    }

    /**
     * All subclasses have a common ResourceHelper for all inner classes.
     *
     * @return the key
     */
    @Override
    protected String findStringRepresentationLinkStartParameter()
    {
        return findParameterViaEnclosingClass( STRING_REPRESENTATION_LINK_START_KEY );
    }

    /**
     * All subclasses have a common ResourceHelper for all inner classes.
     *
     * @return the key
     */
    @Override
    protected String findStringRepresentationLinkEndParameter()
    {
        return findParameterViaEnclosingClass( STRING_REPRESENTATION_LINK_END_KEY );
    }
    
    /**
     * Obtain resource parameters for the internationalization.
     *
     * @return the resource parameters
     */
    @Override
    public Object [] getLocalizationParameters()
    {
        return new Object[] { theIdentifier, theType, theInvalidNonce };
    }

    /**
     * The invalid nonce.
     */
    protected String theInvalidNonce;
    
    /**
     * The nonce was not given or empty.
     */
    public static class Empty
            extends
                LidInvalidNonceException
    {
        private static final long serialVersionUID = 1L; // helps with serialization

        /**
         * Constructor.
         *
         * @param identifier the identifier for which an invalid credential was provided
         * @param siteIdentifier the site at which the invalid credential was provided
         * @param type the type of credential that was invalid
         */
        public Empty(
                Identifier        identifier,
                Identifier        siteIdentifier,
                LidCredentialType type )
        {
            super( identifier, siteIdentifier, type, null );
        }
    }

    /**
     * The time stamp on the nonce was out of range.
     */
    public static class InvalidTimeRange
            extends
                LidInvalidNonceException
    {
        private static final long serialVersionUID = 1L; // helps with serialization

        /**
         * Constructor.
         *
         * @param identifier the identifier for which an invalid credential was provided
         * @param siteIdentifier the site at which the invalid credential was provided
         * @param type the type of credential that was invalid
         * @param invalidNonce the invalid nonce
         */
        public InvalidTimeRange(
                Identifier        identifier,
                Identifier        siteIdentifier,
                LidCredentialType type,
                String            invalidNonce )
        {
            super( identifier, siteIdentifier, type, invalidNonce );
        }
    }

    /**
     * The nonce was not known.
     */
    public static class NotKnown
            extends
                LidInvalidNonceException
    {
        private static final long serialVersionUID = 1L; // helps with serialization

        /**
         * Constructor.
         *
         * @param identifier the identifier for which an invalid credential was provided
         * @param siteIdentifier the site at which the invalid credential was provided
         * @param type the type of credential that was invalid
         * @param invalidNonce the invalid nonce
         */
        public NotKnown(
                Identifier        identifier,
                Identifier        siteIdentifier,
                LidCredentialType type,
                String            invalidNonce )
        {
            super( identifier, siteIdentifier, type, invalidNonce );
        }
    }

    /**
     * The nonce was used already.
     */
    public static class UsedAlready
            extends
                LidInvalidNonceException
    {
        private static final long serialVersionUID = 1L; // helps with serialization

        /**
         * Constructor.
         *
         * @param identifier the identifier for which an invalid credential was provided
         * @param type the type of credential that was invalid
         * @param invalidNonce the invalid nonce
         */
        public UsedAlready(
                Identifier        identifier,
                Identifier        siteIdentifier,
                LidCredentialType type,
                String            invalidNonce )
        {
            super( identifier, siteIdentifier, type, invalidNonce );
        }
    }
}
