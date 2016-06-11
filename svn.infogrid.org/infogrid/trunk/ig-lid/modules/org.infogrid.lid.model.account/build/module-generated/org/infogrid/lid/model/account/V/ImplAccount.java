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
// Copyright 1998-2013 by R-Objects Inc. dba NetMesh Inc., Johannes Ernst
// All rights reserved.
//

//
// This file has been generated AUTOMATICALLY. DO NOT MODIFY.
// on Sun, 2016-02-21 12:50:40 -0600
//
// DO NOT MODIFY -- re-generate!

package org.infogrid.lid.model.account.V;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.lid.model.account.*;

/**
  * <p>Java implementation class for EntityType org.infogrid.lid.model.account/Account.</p>
  * <p>To instantiate, use the factory methods provided by the <code>MeshBase</code>'s
  * <code>MeshObjectLifecycleManager</code>.</p>
  * <p><b>Note:</b> As an application programmer, you must never rely on any characteristic of any
  * class that implements this interface, only on the characteristics provided by this interface
  * and its supertypes.</p>
  *
  * <table>
  *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Account</tt></td></tr>
  *  <tr><td>Name:</td><td><tt>Account</tt></td></tr>
  *  <tr><td>IsAbstract:</td><td><code>false</code></td></tr>
  *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Account</td></tr></table></td></tr>
  *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>A user at a particular website, aka account.</td></tr></table></td></tr>
  * </table>
  */

public class ImplAccount
        extends
            org.infogrid.mesh.TypedMeshObjectFacadeImpl
        implements
            org.infogrid.lid.model.account.Account

{
    private static final org.infogrid.util.logging.Log log = org.infogrid.util.logging.Log.getLogInstance( ImplAccount.class ); // our own, private logger

    /**
      * Constructor.
      *
      * @param delegate the underlying MeshObject
      */
    public ImplAccount(
            MeshObject delegate )
    {
        super( delegate );
    }

    /**
      * Initializes the MeshObject to its default values.
      *
      * @param init the TypeInitializer
      * @param timeUpdated the timeUpdated to use
      * @throws org.infogrid.mesh.IllegalPropertyTypeException should not be thrown -- codegenerator faulty
      * @throws org.infogrid.mesh.IllegalPropertyValueException should not be thrown -- codegenerator faulty
      * @throws org.infogrid.mesh.NotPermittedException should not be thrown -- codegenerator faulty
      * @throws org.infogrid.meshbase.transaction.TransactionException should not be thrown -- codegenerator faulty
      * @throws org.infogrid.model.primitives.UnknownEnumeratedValueException should not be thrown -- codegenerator faulty
      */
    public static void initializeDefaultValues(
            TypeInitializer init,
            long            timeUpdated )
        throws
            org.infogrid.mesh.IllegalPropertyTypeException,
            org.infogrid.mesh.IllegalPropertyValueException,
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.model.primitives.UnknownEnumeratedValueException
    {
        init.setPropertyValues(
                new PropertyType[] {
                    STATUS,
                },
                new PropertyValue[] {
                    STATUS_type.select( "AppliedFor" ),
                },
                timeUpdated );
    }

    /**
      * Set value for property Nickname.
      *
      * @param newValue the new value for the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      * @throws org.infogrid.meshbase.transaction.TransactionException thrown if invoked outside proper transaction boundaries
      */
    public void setNickname(
            org.infogrid.model.primitives.StringValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "setNickname", newValue );
        }

        try {
            the_Delegate.setPropertyValue( NICKNAME, newValue );

        } catch( IllegalPropertyValueException ex ) {
            log.error( ex );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
        }
    }

    /**
      * Obtain value for property Nickname.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.StringValue getNickname()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.StringValue) the_Delegate.getPropertyValue( NICKNAME );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
      * Set value for property Picture.
      *
      * @param newValue the new value for the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      * @throws org.infogrid.meshbase.transaction.TransactionException thrown if invoked outside proper transaction boundaries
      * @throws IllegalPropertyValueException thrown if the PropertyValue was invalid for this Property
      */
    public void setPicture(
            org.infogrid.model.primitives.BlobValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "setPicture", newValue );
        }

        try {
            the_Delegate.setPropertyValue( PICTURE, newValue );

        } catch( IllegalPropertyValueException ex ) {
            log.error( ex );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
        }
    }

    /**
      * Obtain value for property Picture.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.BlobValue getPicture()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.BlobValue) the_Delegate.getPropertyValue( PICTURE );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
      * Set value for property Status.
      *
      * @param newValue the new value for the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      * @throws org.infogrid.meshbase.transaction.TransactionException thrown if invoked outside proper transaction boundaries
      * @throws IllegalPropertyValueException thrown if the PropertyValue was invalid for this Property
      */
    public void setStatus(
            org.infogrid.model.primitives.EnumeratedValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "setStatus", newValue );
        }

        try {
            the_Delegate.setPropertyValue( STATUS, newValue );

        } catch( IllegalPropertyValueException ex ) {
            log.error( ex );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
        }
    }

    /**
      * Obtain value for property Status.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.EnumeratedValue getStatus()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.EnumeratedValue) the_Delegate.getPropertyValue( STATUS );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
      * Set value for property LastLoggedIn.
      *
      * @param newValue the new value for the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      * @throws org.infogrid.meshbase.transaction.TransactionException thrown if invoked outside proper transaction boundaries
      */
    public void setLastLoggedIn(
            org.infogrid.model.primitives.TimeStampValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "setLastLoggedIn", newValue );
        }

        try {
            the_Delegate.setPropertyValue( LASTLOGGEDIN, newValue );

        } catch( IllegalPropertyValueException ex ) {
            log.error( ex );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
        }
    }

    /**
      * Obtain value for property LastLoggedIn.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.TimeStampValue getLastLoggedIn()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.TimeStampValue) the_Delegate.getPropertyValue( LASTLOGGEDIN );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

 // #### BEGIN IMPLEMENTED METHOD (INSERTED FROM model.xml FILE) ####

    /**
     * User-visible String is the the nickname if there is one.
     *
     * @return the user-visible String representing this instance
     */
    public String get_UserVisibleString()
    {
        try {
            StringValue name = getNickname();
            if( name != null ) {
                return name.value();
            }
        } catch( NotPermittedException ex ) {
            // ignore;
        }
        return null;
    }
    /**
     * Determine the Identifier of the site at which this LidAccount exists.
     *
     * @return the Identifier of the site
     */
    public org.infogrid.util.Identifier getSiteIdentifier()
    {
        org.infogrid.mesh.MeshObject site = traverse( AccountSubjectArea.ACCOUNT_ATSITE_MESHOBJECT.getSource() ).getSingleMember();
        return site.getIdentifier();
    }

    /**
     * Determine this LidAccount's status.
     *
     * @return the LidAccount's status
     */
    public org.infogrid.lid.account.LidAccount.LidAccountStatus getAccountStatus()
    {
        try {
            EnumeratedValue status = getStatus();

            if( AccountSubjectArea.ACCOUNT_STATUS_type_APPLIEDFOR.equals( status )) {
                return org.infogrid.lid.account.LidAccount.LidAccountStatus.APPLIEDFOR;
            } else if( AccountSubjectArea.ACCOUNT_STATUS_type_ACTIVE.equals( status )) {
                return org.infogrid.lid.account.LidAccount.LidAccountStatus.ACTIVE;
            } else if( AccountSubjectArea.ACCOUNT_STATUS_type_CLOSED.equals( getStatus() )) {
                return org.infogrid.lid.account.LidAccount.LidAccountStatus.CLOSED;
            } else if( AccountSubjectArea.ACCOUNT_STATUS_type_DISABLED.equals( getStatus() )) {
                return org.infogrid.lid.account.LidAccount.LidAccountStatus.DISABLED;
            } else if( AccountSubjectArea.ACCOUNT_STATUS_type_OBSOLETED.equals( getStatus() )) {
                return org.infogrid.lid.account.LidAccount.LidAccountStatus.OBSOLETED;
            } else if( AccountSubjectArea.ACCOUNT_STATUS_type_REFUSED.equals( getStatus() )) {
                return org.infogrid.lid.account.LidAccount.LidAccountStatus.REFUSED;
            } else {
                log.error( "Unexpected value: " + getStatus() );
            }
        } catch( NotPermittedException ex ) {
            // ignore;
        }
        return null;
    }

    /**
     * Determine the set of remote Identifiers that are also associated with this LidAccount.
     * The Identifier inherited from HasIdentifier is considered the local Identifier.
     *
     * @return the set of remote Identifiers, if any
     */
    public org.infogrid.util.Identifier [] getRemoteIdentifiers()
    {
        org.infogrid.mesh.set.MeshObjectSet remotes = traverse( AccountSubjectArea.ACCOUNT_MAYUSEIDENTITY_MESHOBJECT.getSource() );
        return remotes.asIdentifiers();
    }

    /**
     * Convenience method to determine whether this LidAccount is identified by the
     * provided Identifier.
     *
     * @param identifier the Identifier to test
     * @return true if this LidAccount is identified by the provided Identifier
     */
    public boolean isIdentifiedBy(
            org.infogrid.util.Identifier identifier )
    {
        if( getIdentifier().equals( identifier )) {
            return true;
        }
        org.infogrid.mesh.set.MeshObjectSet remotes = traverse( AccountSubjectArea.ACCOUNT_MAYUSEIDENTITY_MESHOBJECT.getSource() );
        if( remotes.contains( identifier )) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Obtain an attribute of the account
     *
     * @param key the name of the attribute
     * @return the value of the attribute, or null
     */
    public String getAttribute(
            String key )
    {
        return getAttributes().get( key );
    }

    /**
     * Get the set of keys into the set of attributes.
     *
     * @return the keys into the set of attributes
     */
    public java.util.Set<String> getAttributeKeys()
    {
        return getAttributes().keySet(); // FIXME this can be done more efficiently
    }

    /**
     * Obtain the map of attributes. This breaks encapsulation, but works much better
     * for JSP pages.
     *
     * @return the map of attributes
     */
    public java.util.Map<String,String> getAttributes()
    {
        java.util.Map<String,String> ret = new java.util.HashMap<String,String>();
        ret.put( IDENTIFIER_ATTRIBUTE_NAME, getIdentifier().toExternalForm() );

        StringValue nick = null;
        try {
            nick = getNickname();
        } catch( NotPermittedException ex ) {
            // ignore
        }
        if( nick != null ) {
            ret.put( NICKNAME_ATTRIBUTE_NAME, nick.value() );
        }

        return ret;
    }

    /**
     * Obtain the subset of credential types applicable to this LidAccount
     *
     * @param set the set of credential types
     * @return the subset of credential types
     */
    public org.infogrid.lid.credential.LidCredentialType [] getApplicableCredentialTypes(
            org.infogrid.lid.credential.LidCredentialType [] set )
    {
        return set; // FIXME for now
    }

    /**
     * Obtain a specific credential.
     *
     * @param type the LidCredentialType for which the credential is to be obtained
     * @return the credential, or null
     */
    public String getCredentialFor(
            org.infogrid.lid.credential.LidCredentialType type )
    {
        return null; // FIXME for now
    }

    /**
     * Obtain the Identifiers of the set of groups that this LidAccount is a member of.
     *
     * @return the Identifiers
     */
    public org.infogrid.mesh.MeshObjectIdentifier [] getGroupIdentifiers()
    {
        org.infogrid.mesh.set.MeshObjectSet categories = traverse( AccountSubjectArea.ACCOUNTCATEGORY_CATEGORIZES_ACCOUNT.getDestination() );
        return categories.asIdentifiers();
    }

    /**
     * Obtain the names of the set of groups that this LidAccount is a member of.
     *
     * @return the names
     */
    public String [] getGroupNames()
    {
        org.infogrid.mesh.set.MeshObjectSet categories = traverse( AccountSubjectArea.ACCOUNTCATEGORY_CATEGORIZES_ACCOUNT.getDestination() );
        String [] ret = new String[ categories.size() ];
        for( int i=0 ; i<ret.length ; ++i ) {
            try {
                StringValue found = (StringValue) categories.get( i ).getPropertyValue( AccountSubjectArea.ACCOUNTCATEGORY_NAME );
                if( found != null ) {
                    ret[i] = found.value();
                } else {
                    ret[i] = categories.get( i ).getIdentifier().toExternalForm();
                }

            } catch( Throwable ex ) {
                log.error( ex );
            }
        }
        return ret;
    }
    
 // #### END IMPLEMENTED METHOD (INSERTED FROM model.xml FILE) ####
 // #### BEGIN IMPLEMENTED METHOD (INSERTED FROM model.xml FILE) ####

    /**
     * Cascading delete.
     */
    public void cascadingDelete()
        throws
            org.infogrid.meshbase.transaction.TransactionException,
            NotPermittedException
    {
        org.infogrid.mesh.set.MeshObjectSet sessions = traverse( AccountSubjectArea.SESSION_FOR_ACCOUNT.getDestination() );
        get_Delegate().getMeshBase().getMeshBaseLifecycleManager().deleteMeshObjects( sessions );
    }
            
 // #### END IMPLEMENTED METHOD (INSERTED FROM model.xml FILE) ####
}
