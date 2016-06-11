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
// on Sun, 2016-02-21 12:49:53 -0600
//
// DO NOT MODIFY -- re-generate!

package org.infogrid.model.Common;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.modelbase.ModelBaseSingleton;

/**
  * <p>Java interface for EntityType org.infogrid.model.Common/ComponentObject.</p>
  * <p>To instantiate, use the factory methods provided by the <code>MeshBase</code>'s
  * <code>MeshObjectLifecycleManager</code>.</p>
  * <p><b>Note:</b> As an application programmer, you must never rely on any characteristic of any
  * class that implements this interface, only on the characteristics provided by this interface
  * and its supertypes.</p>
  *
  * <table>
  *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Common/ComponentObject</tt></td></tr>
  *  <tr><td>Name:</td><td><tt>ComponentObject</tt></td></tr>
  *  <tr><td>IsAbstract:</td><td><code>true</code></td></tr>
  *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Use of Object</td></tr></table></td></tr>
  *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>This entitytype is an abstract supertype for components inside a structured, potentially\nhierarchical definition (represented by DefinitionObject). In programming, for example, a member variable\nof a class could be represented as a (subtype of) ComponentObject.</td></tr></table></td></tr>
  * </table>
  */

public interface ComponentObject
        extends
            org.infogrid.mesh.TypedMeshObjectFacade
{
    /**
      * Subject area in which this MeshObject is declared.
      */
    public static final SubjectArea _SUBJECTAREA = ModelBaseSingleton.findSubjectArea( "org.infogrid.model.Common" );

    /**
      * This MeshType.
      */
    public static final EntityType _TYPE = ModelBaseSingleton.findEntityType( "org.infogrid.model.Common/ComponentObject" );

    /**
      * This MeshType.
      */
    public static final RoleType _DefinitionObject_Contains_ComponentObject_DESTINATION = ModelBaseSingleton.findRoleType( "org.infogrid.model.Common/DefinitionObject_Contains_ComponentObject-D" );

    /**
      * This MeshType.
      */
    public static final RoleType _ComponentObject_References_DefinitionObject_SOURCE = ModelBaseSingleton.findRoleType( "org.infogrid.model.Common/ComponentObject_References_DefinitionObject-S" );

    /**
      * <p>Set value for property SequenceNumber.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Common/ComponentObject_SequenceNumber</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>SequenceNumber</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Float (default: 0.0, min: -Infinity, max: Infinity)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>6.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Sequence Number</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
      */
    public abstract void setSequenceNumber(
            org.infogrid.model.primitives.FloatValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException;

    /**
      * <p>Obtain value for property SequenceNumber.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Common/ComponentObject_SequenceNumber</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>SequenceNumber</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Float (default: 0.0, min: -Infinity, max: Infinity)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>6.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Sequence Number</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.FloatValue getSequenceNumber()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the SequenceNumber property.
      */
    public static final String SEQUENCENUMBER_name = "SequenceNumber";

    /**
      * The SequenceNumber PropertyType.
      */
    public static final PropertyType SEQUENCENUMBER = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Common/ComponentObject_SequenceNumber" );
    public static final org.infogrid.model.primitives.FloatDataType SEQUENCENUMBER_type = (org.infogrid.model.primitives.FloatDataType) SEQUENCENUMBER.getDataType();

}