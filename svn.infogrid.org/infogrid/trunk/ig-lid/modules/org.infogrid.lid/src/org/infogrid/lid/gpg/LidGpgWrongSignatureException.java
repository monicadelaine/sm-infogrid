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

package org.infogrid.lid.gpg;

import org.infogrid.lid.credential.LidInvalidCredentialException;
import org.infogrid.util.Identifier;

/**
 * Thrown if an incoming LID GPG signature was invalid.
 */
public class LidGpgWrongSignatureException
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
     */
    public LidGpgWrongSignatureException(
            Identifier                    identifier,
            Identifier                    siteIdentifier,
            LidGpgClearSignCredentialType type )
    {
        super( identifier, siteIdentifier, type );
    }

    /**
     * Constructor.
     *
     * @param identifier the identifier for which an invalid credential was provided
     * @param siteIdentifier the site at which the invalid credential was provided
     * @param type the type of credential that was invalid
     * @param cause the underlying cause for the Exception
     */
    public LidGpgWrongSignatureException(
            Identifier                    identifier,
            Identifier                    siteIdentifier,
            LidGpgClearSignCredentialType type,
            Throwable                     cause )
    {
        super( identifier, siteIdentifier, type, cause );
    }
}

