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

package org.infogrid.lid.account;

import java.util.Map;
import org.infogrid.util.Identifier;

/**
 * Simple implementation of LidAccount.
 */
public class SimpleLidAccount
        extends
            AbstractLidAccount
{
    /**
     * Factory method.
     *
     * @param identifier the unique identifier of the persona, e.g. their identity URL
     * @param siteIdentifier the identifier of the site at which the LidAccount exists
     * @param status the status of the LidAccount
     * @param remoteIdentifiers set of remote Identifiers that are also associated with this LidAccount
     * @param attributes attributes of the persona, e.g. first name
     * @param groupIdentifiers identifiers of the groups that this LidAccount is a member of
     * @param timeCreated the time at which this LidAccount was created, in System.getTimeMillis() format.
     * @return the created SimpleLidAccount
     */
    public static SimpleLidAccount create(
            Identifier           identifier,
            Identifier           siteIdentifier,
            LidAccountStatus     status,
            Identifier []        remoteIdentifiers,
            Map<String,String>   attributes,
            Identifier []        groupIdentifiers,
            long                 timeCreated )
    {
        return new SimpleLidAccount(
                identifier,
                siteIdentifier,
                status,
                remoteIdentifiers,
                attributes,
                groupIdentifiers,
                timeCreated );
    }

    /**
     * Constructor, use factory.
     *
     * @param identifier the unique identifier of the persona, e.g. their identity URL
     * @param siteIdentifier the identifier of the site at which the LidAccount exists
     * @param status the status of the LidAccount
     * @param remoteIdentifiers set of remote Identifiers that are also associated with this LidAccount
     * @param attributes attributes of the persona, e.g. first name
     * @param groupIdentifiers identifiers of the groups that this LidAccount is a member of
     * @param timeCreated the time at which this LidAccount was created, in System.getTimeMillis() format.
     */
    protected SimpleLidAccount(
            Identifier           identifier,
            Identifier           siteIdentifier,
            LidAccountStatus     status,
            Identifier []        remoteIdentifiers,
            Map<String,String>   attributes,
            Identifier []        groupIdentifiers,
            long                 timeCreated )
    {
        super( identifier, siteIdentifier, timeCreated );

        theStatus            = status;
        theRemoteIdentifiers = remoteIdentifiers;
        theAttributes        = attributes;
        theGroupIdentifiers  = groupIdentifiers;
    }

    /**
     * Determine this LidAccount's status.
     *
     * @return the LidAccount's status
     */
    public LidAccountStatus getAccountStatus()
    {
        return theStatus;
    }

    /**
     * Determine the set of remote Identifiers that are also associated with this LidAccount.
     * The Identifier inherited from HasIdentifier is considered the local Identifier.
     *
     * @return the set of remote Identifiers, if any
     */
    public Identifier [] getRemoteIdentifiers()
    {
        return theRemoteIdentifiers;
    }

    /**
     * Set an attribute of the LidAccount.
     *
     * @param key the name of the attribute
     * @param value the value of the attribute
     */
    public void setAttribute(
            String key,
            String value )
    {
        theAttributes.put(  key, value );
    }

    /**
     * Obtain the map of attributes. This breaks encapsulation, but works much better
     * for JSP pages.
     *
     * @return the map of attributes
     */
    public Map<String,String> getAttributes()
    {
        return theAttributes;
    }

    /**
     * Obtain the Identifiers of the set of groups that this LidAccount is a member of.
     *
     * @return the Identifiers
     */
    public Identifier [] getGroupIdentifiers()
    {
        return theGroupIdentifiers;
    }

    /**
     * Obtain the names of the set of groups that this LidAccount is a member of.
     *
     * @return the names
     */
    public String [] getGroupNames()
    {
        if( theGroupIdentifiers == null ) {
            return null;
        }
        String [] ret = new String[ theGroupIdentifiers.length ];
        for( int i=0 ; i<theGroupIdentifiers.length ; ++i ) {
            ret[i] = theGroupIdentifiers[i].toExternalForm();
        }
        return ret;
    }

    /**
     * The status of the account.
     */
    protected LidAccountStatus theStatus;

    /**
     * Remote Identifiers also associated with this LidAccount.
     */
    protected Identifier [] theRemoteIdentifiers;

    /**
     * Attributes of the LidAccount.
     */
    protected Map<String,String> theAttributes;

    /**
     * Set of identifiers of the groups that this account is a member of.
     */
    protected Identifier [] theGroupIdentifiers;
}
