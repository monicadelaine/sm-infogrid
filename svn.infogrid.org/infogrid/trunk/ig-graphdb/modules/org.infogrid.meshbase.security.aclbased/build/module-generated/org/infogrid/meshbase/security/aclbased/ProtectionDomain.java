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
// on Sun, 2016-02-21 12:49:19 -0600
//
// DO NOT MODIFY -- re-generate!

package org.infogrid.meshbase.security.aclbased;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.modelbase.ModelBaseSingleton;

/**
  * <p>Java interface for EntityType org.infogrid.meshbase.security.aclbased/ProtectionDomain.</p>
  * <p>To instantiate, use the factory methods provided by the <code>MeshBase</code>'s
  * <code>MeshObjectLifecycleManager</code>.</p>
  * <p><b>Note:</b> As an application programmer, you must never rely on any characteristic of any
  * class that implements this interface, only on the characteristics provided by this interface
  * and its supertypes.</p>
  *
  * <table>
  *  <tr><td>Identifier:</td><td><tt>org.infogrid.meshbase.security.aclbased/ProtectionDomain</tt></td></tr>
  *  <tr><td>Name:</td><td><tt>ProtectionDomain</tt></td></tr>
  *  <tr><td>IsAbstract:</td><td><code>false</code></td></tr>
  *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Protection Domain</td></tr></table></td></tr>
  *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>A ProtectionDomain defines a set of MeshObjects, all of which are governed by the same\naccess control policies.</td></tr></table></td></tr>
  * </table>
  */

public interface ProtectionDomain
        extends
            org.infogrid.mesh.TypedMeshObjectFacade
{
    /**
      * Subject area in which this MeshObject is declared.
      */
    public static final SubjectArea _SUBJECTAREA = ModelBaseSingleton.findSubjectArea( "org.infogrid.meshbase.security.aclbased" );

    /**
      * This MeshType.
      */
    public static final EntityType _TYPE = ModelBaseSingleton.findEntityType( "org.infogrid.meshbase.security.aclbased/ProtectionDomain" );

    /**
      * This MeshType.
      */
    public static final RoleType _ProtectionDomain_Governs_MeshObject_SOURCE = ModelBaseSingleton.findRoleType( "org.infogrid.meshbase.security.aclbased/ProtectionDomain_Governs_MeshObject-S" );

    /**
      * This MeshType.
      */
    public static final RoleType _MeshObject_HasAccessTo_ProtectionDomain_DESTINATION = ModelBaseSingleton.findRoleType( "org.infogrid.meshbase.security.aclbased/MeshObject_HasAccessTo_ProtectionDomain-D" );

    /**
      * This MeshType.
      */
    public static final RoleType _MeshObject_HasReadAccessTo_ProtectionDomain_DESTINATION = ModelBaseSingleton.findRoleType( "org.infogrid.meshbase.security.aclbased/MeshObject_HasReadAccessTo_ProtectionDomain-D" );

    /**
      * This MeshType.
      */
    public static final RoleType _MeshObject_HasUpdateAccessTo_ProtectionDomain_DESTINATION = ModelBaseSingleton.findRoleType( "org.infogrid.meshbase.security.aclbased/MeshObject_HasUpdateAccessTo_ProtectionDomain-D" );

    /**
      * This MeshType.
      */
    public static final RoleType _MeshObject_HasDeleteAccessTo_ProtectionDomain_DESTINATION = ModelBaseSingleton.findRoleType( "org.infogrid.meshbase.security.aclbased/MeshObject_HasDeleteAccessTo_ProtectionDomain-D" );

}
