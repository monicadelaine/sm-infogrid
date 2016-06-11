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

package org.infogrid.lid.model.account;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.modelbase.ModelBaseSingleton;

/**
  * <p>Java interface for EntityType org.infogrid.lid.model.account/Account.</p>
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

public interface Account
        extends
            org.infogrid.mesh.TypedMeshObjectFacade,
            org.infogrid.lid.account.LidAccount
{
    /**
      * Subject area in which this MeshObject is declared.
      */
    public static final SubjectArea _SUBJECTAREA = ModelBaseSingleton.findSubjectArea( "org.infogrid.lid.model.account" );

    /**
      * This MeshType.
      */
    public static final EntityType _TYPE = ModelBaseSingleton.findEntityType( "org.infogrid.lid.model.account/Account" );

    /**
      * This MeshType.
      */
    public static final RoleType _AccountCollection_Collects_Account_DESTINATION = ModelBaseSingleton.findRoleType( "org.infogrid.lid.model.account/AccountCollection_Collects_Account-D" );

    /**
      * This MeshType.
      */
    public static final RoleType _AccountCategory_Categorizes_Account_DESTINATION = ModelBaseSingleton.findRoleType( "org.infogrid.lid.model.account/AccountCategory_Categorizes_Account-D" );

    /**
      * This MeshType.
      */
    public static final RoleType _Session_For_Account_DESTINATION = ModelBaseSingleton.findRoleType( "org.infogrid.lid.model.account/Session_For_Account-D" );

    /**
      * This MeshType.
      */
    public static final RoleType _Account_MayUseIdentity_MeshObject_SOURCE = ModelBaseSingleton.findRoleType( "org.infogrid.lid.model.account/Account_MayUseIdentity_MeshObject-S" );

    /**
      * This MeshType.
      */
    public static final RoleType _Account_AtSite_MeshObject_SOURCE = ModelBaseSingleton.findRoleType( "org.infogrid.lid.model.account/Account_AtSite_MeshObject-S" );

    /**
      * <p>Set value for property Nickname.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Account_Nickname</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Nickname</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Local nickname</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The user\'s local nick name, if any.</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
      */
    public abstract void setNickname(
            org.infogrid.model.primitives.StringValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException;

    /**
      * <p>Obtain value for property Nickname.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Account_Nickname</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Nickname</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Local nickname</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The user\'s local nick name, if any.</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.StringValue getNickname()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the Nickname property.
      */
    public static final String NICKNAME_name = "Nickname";

    /**
      * The Nickname PropertyType.
      */
    public static final PropertyType NICKNAME = ModelBaseSingleton.findPropertyType( "org.infogrid.lid.model.account/Account_Nickname" );
    public static final org.infogrid.model.primitives.StringDataType NICKNAME_type = (org.infogrid.model.primitives.StringDataType) NICKNAME.getDataType();

    /**
      * <p>Set value for property Picture.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Account_Picture</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Picture</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: image/gif,image/jpeg,image/png)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Picture</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The user\'s picture, if any.</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setPicture(
            org.infogrid.model.primitives.BlobValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property Picture.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Account_Picture</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Picture</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: image/gif,image/jpeg,image/png)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Picture</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The user\'s picture, if any.</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.BlobValue getPicture()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the Picture property.
      */
    public static final String PICTURE_name = "Picture";

    /**
      * The Picture PropertyType.
      */
    public static final PropertyType PICTURE = ModelBaseSingleton.findPropertyType( "org.infogrid.lid.model.account/Account_Picture" );
    public static final org.infogrid.model.primitives.BlobDataType PICTURE_type = (org.infogrid.model.primitives.BlobDataType) PICTURE.getDataType();

    /**
      * <p>Set value for property Status.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Account_Status</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Status</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Enumeration</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>Applied for</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Status</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>Status of the account.</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setStatus(
            org.infogrid.model.primitives.EnumeratedValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property Status.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Account_Status</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Status</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Enumeration</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>Applied for</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Status</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>Status of the account.</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.EnumeratedValue getStatus()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the Status property.
      */
    public static final String STATUS_name = "Status";

    /**
      * The Status PropertyType.
      */
    public static final PropertyType STATUS = ModelBaseSingleton.findPropertyType( "org.infogrid.lid.model.account/Account_Status" );
    public static final org.infogrid.model.primitives.EnumeratedDataType STATUS_type = (org.infogrid.model.primitives.EnumeratedDataType) STATUS.getDataType();

    /* Values of the EnumeratedDataType. */
    public static final EnumeratedValue STATUS_type_APPLIEDFOR = STATUS_type.select( "AppliedFor" );
    public static final EnumeratedValue STATUS_type_ACTIVE = STATUS_type.select( "Active" );
    public static final EnumeratedValue STATUS_type_CLOSED = STATUS_type.select( "Closed" );
    public static final EnumeratedValue STATUS_type_DISABLED = STATUS_type.select( "Disabled" );
    public static final EnumeratedValue STATUS_type_OBSOLETED = STATUS_type.select( "Obsoleted" );
    public static final EnumeratedValue STATUS_type_REFUSED = STATUS_type.select( "Refused" );
    /**
      * <p>Set value for property LastLoggedIn.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Account_LastLoggedIn</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>LastLoggedIn</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Time Stamp</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Last logged in</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The time when the user last logged into this account. This is the time of log-in, not\n                 the last time the account was used.</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
      */
    public abstract void setLastLoggedIn(
            org.infogrid.model.primitives.TimeStampValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException;

    /**
      * <p>Obtain value for property LastLoggedIn.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Account_LastLoggedIn</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>LastLoggedIn</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Time Stamp</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Last logged in</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The time when the user last logged into this account. This is the time of log-in, not\n                 the last time the account was used.</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.TimeStampValue getLastLoggedIn()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the LastLoggedIn property.
      */
    public static final String LASTLOGGEDIN_name = "LastLoggedIn";

    /**
      * The LastLoggedIn PropertyType.
      */
    public static final PropertyType LASTLOGGEDIN = ModelBaseSingleton.findPropertyType( "org.infogrid.lid.model.account/Account_LastLoggedIn" );
    public static final org.infogrid.model.primitives.TimeStampDataType LASTLOGGEDIN_type = (org.infogrid.model.primitives.TimeStampDataType) LASTLOGGEDIN.getDataType();

}
