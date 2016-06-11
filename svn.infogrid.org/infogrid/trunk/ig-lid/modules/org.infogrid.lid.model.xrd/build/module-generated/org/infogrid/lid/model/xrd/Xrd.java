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
// on Sun, 2016-02-21 12:50:37 -0600
//
// DO NOT MODIFY -- re-generate!

package org.infogrid.lid.model.xrd;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.modelbase.ModelBaseSingleton;

/**
  * <p>Java interface for EntityType org.infogrid.lid.model.xrd/Xrd.</p>
  * <p>To instantiate, use the factory methods provided by the <code>MeshBase</code>'s
  * <code>MeshObjectLifecycleManager</code>.</p>
  * <p><b>Note:</b> As an application programmer, you must never rely on any characteristic of any
  * class that implements this interface, only on the characteristics provided by this interface
  * and its supertypes.</p>
  *
  * <table>
  *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.xrd/Xrd</tt></td></tr>
  *  <tr><td>Name:</td><td><tt>Xrd</tt></td></tr>
  *  <tr><td>IsAbstract:</td><td><code>false</code></td></tr>
  *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>XRD</td></tr></table></td></tr>
  *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>Meta-data about a resource on the web.</td></tr></table></td></tr>
  * </table>
  */

public interface Xrd
        extends
            org.infogrid.model.Web.WebResource
{
    /**
      * Subject area in which this MeshObject is declared.
      */
    public static final SubjectArea _SUBJECTAREA = ModelBaseSingleton.findSubjectArea( "org.infogrid.lid.model.xrd" );

    /**
      * This MeshType.
      */
    public static final EntityType _TYPE = ModelBaseSingleton.findEntityType( "org.infogrid.lid.model.xrd/Xrd" );

    /**
      * This MeshType.
      */
    public static final RoleType _Xrd_Contains_AbstractLink_SOURCE = ModelBaseSingleton.findRoleType( "org.infogrid.lid.model.xrd/Xrd_Contains_AbstractLink-S" );

    /**
      * This MeshType.
      */
    public static final RoleType _Xrd_About_WebResource_SOURCE = ModelBaseSingleton.findRoleType( "org.infogrid.lid.model.xrd/Xrd_About_WebResource-S" );

    /**
      * This MeshType.
      */
    public static final RoleType _Xrd_AboutPrimary_WebResource_SOURCE = ModelBaseSingleton.findRoleType( "org.infogrid.lid.model.xrd/Xrd_AboutPrimary_WebResource-S" );

    /**
      * This MeshType.
      */
    public static final RoleType _Xrd_AboutAlias_WebResource_SOURCE = ModelBaseSingleton.findRoleType( "org.infogrid.lid.model.xrd/Xrd_AboutAlias_WebResource-S" );

    /**
      * <p>Set value for property Id.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.xrd/Xrd_Id</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Id</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>ID</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>This attribute, of type xs:ID, is defined by [xml:id]. It provides a unique\n                 identifier for this XRD, and is used as a signature reference.</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
      */
    public abstract void setId(
            org.infogrid.model.primitives.StringValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException;

    /**
      * <p>Obtain value for property Id.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.xrd/Xrd_Id</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Id</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>ID</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>This attribute, of type xs:ID, is defined by [xml:id]. It provides a unique\n                 identifier for this XRD, and is used as a signature reference.</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.StringValue getId()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the Id property.
      */
    public static final String ID_name = "Id";

    /**
      * The Id PropertyType.
      */
    public static final PropertyType ID = ModelBaseSingleton.findPropertyType( "org.infogrid.lid.model.xrd/Xrd_Id" );
    public static final org.infogrid.model.primitives.StringDataType ID_type = (org.infogrid.model.primitives.StringDataType) ID.getDataType();

    /**
      * <p>Set value for property Expires.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.xrd/Xrd_Expires</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Expires</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Time Stamp</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Expires</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>Specifies when this document expires.</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
      */
    public abstract void setExpires(
            org.infogrid.model.primitives.TimeStampValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException;

    /**
      * <p>Obtain value for property Expires.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.xrd/Xrd_Expires</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Expires</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Time Stamp</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Expires</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>Specifies when this document expires.</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.TimeStampValue getExpires()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the Expires property.
      */
    public static final String EXPIRES_name = "Expires";

    /**
      * The Expires PropertyType.
      */
    public static final PropertyType EXPIRES = ModelBaseSingleton.findPropertyType( "org.infogrid.lid.model.xrd/Xrd_Expires" );
    public static final org.infogrid.model.primitives.TimeStampDataType EXPIRES_type = (org.infogrid.model.primitives.TimeStampDataType) EXPIRES.getDataType();

}
