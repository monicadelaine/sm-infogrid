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
  * <p>Java interface for EntityType org.infogrid.lid.model.account/Session.</p>
  * <p>To instantiate, use the factory methods provided by the <code>MeshBase</code>'s
  * <code>MeshObjectLifecycleManager</code>.</p>
  * <p><b>Note:</b> As an application programmer, you must never rely on any characteristic of any
  * class that implements this interface, only on the characteristics provided by this interface
  * and its supertypes.</p>
  *
  * <table>
  *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Session</tt></td></tr>
  *  <tr><td>Name:</td><td><tt>Session</tt></td></tr>
  *  <tr><td>IsAbstract:</td><td><code>false</code></td></tr>
  *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Session</td></tr></table></td></tr>
  *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>A session of a user at a website.</td></tr></table></td></tr>
  * </table>
  */

public interface Session
        extends
            org.infogrid.mesh.TypedMeshObjectFacade,
            org.infogrid.lid.session.LidSession
{
    /**
      * Subject area in which this MeshObject is declared.
      */
    public static final SubjectArea _SUBJECTAREA = ModelBaseSingleton.findSubjectArea( "org.infogrid.lid.model.account" );

    /**
      * This MeshType.
      */
    public static final EntityType _TYPE = ModelBaseSingleton.findEntityType( "org.infogrid.lid.model.account/Session" );

    /**
      * This MeshType.
      */
    public static final RoleType _Session_For_Account_SOURCE = ModelBaseSingleton.findRoleType( "org.infogrid.lid.model.account/Session_For_Account-S" );

    /**
      * This MeshType.
      */
    public static final RoleType _Session_AtSite_MeshObject_SOURCE = ModelBaseSingleton.findRoleType( "org.infogrid.lid.model.account/Session_AtSite_MeshObject-S" );

    /**
      * This MeshType.
      */
    public static final RoleType _Session_UsesIdentity_MeshObject_SOURCE = ModelBaseSingleton.findRoleType( "org.infogrid.lid.model.account/Session_UsesIdentity_MeshObject-S" );

    /**
      * <p>Set value for property FirstAuthenticated.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Session_FirstAuthenticated</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>FirstAuthenticated</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Time Stamp</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>First authenticated at</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The TimeStamp when the user was first authenticated at this site.</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setFirstAuthenticated(
            org.infogrid.model.primitives.TimeStampValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property FirstAuthenticated.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Session_FirstAuthenticated</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>FirstAuthenticated</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Time Stamp</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>First authenticated at</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The TimeStamp when the user was first authenticated at this site.</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.TimeStampValue getFirstAuthenticated()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the FirstAuthenticated property.
      */
    public static final String FIRSTAUTHENTICATED_name = "FirstAuthenticated";

    /**
      * The FirstAuthenticated PropertyType.
      */
    public static final PropertyType FIRSTAUTHENTICATED = ModelBaseSingleton.findPropertyType( "org.infogrid.lid.model.account/Session_FirstAuthenticated" );
    public static final org.infogrid.model.primitives.TimeStampDataType FIRSTAUTHENTICATED_type = (org.infogrid.model.primitives.TimeStampDataType) FIRSTAUTHENTICATED.getDataType();

    /**
      * <p>Set value for property LastAuthenticated.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Session_LastAuthenticated</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>LastAuthenticated</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Time Stamp</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Most recently authenticated at</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The TimeStamp when the user was most recently authenticated at this site.</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setLastAuthenticated(
            org.infogrid.model.primitives.TimeStampValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property LastAuthenticated.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Session_LastAuthenticated</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>LastAuthenticated</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Time Stamp</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Most recently authenticated at</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The TimeStamp when the user was most recently authenticated at this site.</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.TimeStampValue getLastAuthenticated()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the LastAuthenticated property.
      */
    public static final String LASTAUTHENTICATED_name = "LastAuthenticated";

    /**
      * The LastAuthenticated PropertyType.
      */
    public static final PropertyType LASTAUTHENTICATED = ModelBaseSingleton.findPropertyType( "org.infogrid.lid.model.account/Session_LastAuthenticated" );
    public static final org.infogrid.model.primitives.TimeStampDataType LASTAUTHENTICATED_type = (org.infogrid.model.primitives.TimeStampDataType) LASTAUTHENTICATED.getDataType();

    /**
      * <p>Set value for property LastUsedSuccessfully.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Session_LastUsedSuccesfully</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>LastUsedSuccessfully</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Time Stamp</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Most recently used successfully at</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The TimeStamp when the user was most recently using this session successfully.</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
      */
    public abstract void setLastUsedSuccessfully(
            org.infogrid.model.primitives.TimeStampValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException;

    /**
      * <p>Obtain value for property LastUsedSuccessfully.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Session_LastUsedSuccesfully</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>LastUsedSuccessfully</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Time Stamp</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Most recently used successfully at</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The TimeStamp when the user was most recently using this session successfully.</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.TimeStampValue getLastUsedSuccessfully()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the LastUsedSuccessfully property.
      */
    public static final String LASTUSEDSUCCESSFULLY_name = "LastUsedSuccessfully";

    /**
      * The LastUsedSuccessfully PropertyType.
      */
    public static final PropertyType LASTUSEDSUCCESSFULLY = ModelBaseSingleton.findPropertyType( "org.infogrid.lid.model.account/Session_LastUsedSuccesfully" );
    public static final org.infogrid.model.primitives.TimeStampDataType LASTUSEDSUCCESSFULLY_type = (org.infogrid.model.primitives.TimeStampDataType) LASTUSEDSUCCESSFULLY.getDataType();

    /**
      * <p>Set value for property ValidUntil.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Session_ValidUntil</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>ValidUntil</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Time Stamp</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Valid until</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The TimeStamp when the session has, or will expire and a new authentication is required.</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setValidUntil(
            org.infogrid.model.primitives.TimeStampValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property ValidUntil.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Session_ValidUntil</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>ValidUntil</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Time Stamp</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Valid until</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The TimeStamp when the session has, or will expire and a new authentication is required.</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.TimeStampValue getValidUntil()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the ValidUntil property.
      */
    public static final String VALIDUNTIL_name = "ValidUntil";

    /**
      * The ValidUntil PropertyType.
      */
    public static final PropertyType VALIDUNTIL = ModelBaseSingleton.findPropertyType( "org.infogrid.lid.model.account/Session_ValidUntil" );
    public static final org.infogrid.model.primitives.TimeStampDataType VALIDUNTIL_type = (org.infogrid.model.primitives.TimeStampDataType) VALIDUNTIL.getDataType();

    /**
      * <p>Set value for property CreatedAtIp.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Session_CreatedAtIp</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>CreatedAtIp</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Created at IP address</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The IP address from where this session was created.</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
      */
    public abstract void setCreatedAtIp(
            org.infogrid.model.primitives.StringValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException;

    /**
      * <p>Obtain value for property CreatedAtIp.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Session_CreatedAtIp</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>CreatedAtIp</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Created at IP address</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The IP address from where this session was created.</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.StringValue getCreatedAtIp()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the CreatedAtIp property.
      */
    public static final String CREATEDATIP_name = "CreatedAtIp";

    /**
      * The CreatedAtIp PropertyType.
      */
    public static final PropertyType CREATEDATIP = ModelBaseSingleton.findPropertyType( "org.infogrid.lid.model.account/Session_CreatedAtIp" );
    public static final org.infogrid.model.primitives.StringDataType CREATEDATIP_type = (org.infogrid.model.primitives.StringDataType) CREATEDATIP.getDataType();

}
