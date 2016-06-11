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
// on Sun, 2016-02-21 12:50:33 -0600
//
// DO NOT MODIFY -- re-generate!

package org.infogrid.lid.model.yadis;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.modelbase.ModelBaseSingleton;

/**
  * <p>Java interface for EntityType org.infogrid.lid.model.yadis/XrdsServiceType.</p>
  * <p>To instantiate, use the factory methods provided by the <code>MeshBase</code>'s
  * <code>MeshObjectLifecycleManager</code>.</p>
  * <p><b>Note:</b> As an application programmer, you must never rely on any characteristic of any
  * class that implements this interface, only on the characteristics provided by this interface
  * and its supertypes.</p>
  *
  * <table>
  *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.yadis/XrdsServiceType</tt></td></tr>
  *  <tr><td>Name:</td><td><tt>XrdsServiceType</tt></td></tr>
  *  <tr><td>IsAbstract:</td><td><code>false</code></td></tr>
  *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Other XRDS Service</td></tr></table></td></tr>
  *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>Captures the Yadis type identifier for an XrdsServiceType.</td></tr></table></td></tr>
  * </table>
  */

public interface XrdsServiceType
        extends
            org.infogrid.mesh.TypedMeshObjectFacade
{
    /**
      * Subject area in which this MeshObject is declared.
      */
    public static final SubjectArea _SUBJECTAREA = ModelBaseSingleton.findSubjectArea( "org.infogrid.lid.model.yadis" );

    /**
      * This MeshType.
      */
    public static final EntityType _TYPE = ModelBaseSingleton.findEntityType( "org.infogrid.lid.model.yadis/XrdsServiceType" );

    /**
      * This MeshType.
      */
    public static final RoleType _XrdsService_HasType_XrdsServiceType_DESTINATION = ModelBaseSingleton.findRoleType( "org.infogrid.lid.model.yadis/XrdsService_HasType_XrdsServiceType-D" );

    /**
      * <p>Set value for property ServiceTypeIdentifier.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.yadis/XrdsServiceType_ServiceTypeIdentifier</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>ServiceTypeIdentifier</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>ServiceTypeIdentifier</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>Unique identifier for this ServiceType</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
      */
    public abstract void setServiceTypeIdentifier(
            org.infogrid.model.primitives.StringValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException;

    /**
      * <p>Obtain value for property ServiceTypeIdentifier.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.yadis/XrdsServiceType_ServiceTypeIdentifier</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>ServiceTypeIdentifier</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>ServiceTypeIdentifier</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>Unique identifier for this ServiceType</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.StringValue getServiceTypeIdentifier()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the ServiceTypeIdentifier property.
      */
    public static final String SERVICETYPEIDENTIFIER_name = "ServiceTypeIdentifier";

    /**
      * The ServiceTypeIdentifier PropertyType.
      */
    public static final PropertyType SERVICETYPEIDENTIFIER = ModelBaseSingleton.findPropertyType( "org.infogrid.lid.model.yadis/XrdsServiceType_ServiceTypeIdentifier" );
    public static final org.infogrid.model.primitives.StringDataType SERVICETYPEIDENTIFIER_type = (org.infogrid.model.primitives.StringDataType) SERVICETYPEIDENTIFIER.getDataType();

}
