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
  * <p>Collects the MeshTypes in this Subject Area for simpler access.</p>
  */
public abstract class AclbasedSubjectArea
{
    /**
      * The SubjectArea itself.
      */
    public static final SubjectArea _SA = ModelBaseSingleton.findSubjectArea( "org.infogrid.meshbase.security.aclbased" );

    /**
      * A ProtectionDomain defines a set of MeshObjects, all of which are governed by the same\naccess control policies.
      */
    public static final EntityType PROTECTIONDOMAIN = org.infogrid.meshbase.security.aclbased.ProtectionDomain._TYPE;

    /**
      * Instances of this RelationshipType relate MeshObjects to their owning MeshObject or\nMeshObjects. Any MeshObject that does not participate in this relationship as source (ie doesn\'t\nhave an owner) is assumed to own itself. An owner MeshObject may assign another MeshObject as an\nadditional owner. An owner (and only an owner) may delete itself as an owner, but then cannot\nmake itself an owner again unless another owner re-assigns ownership to the old owner. Multiple\nMeshObject may all be owners of the same MeshObject; they all have the same rights.
      */
    public static final RelationshipType MESHOBJECT_HASOWNER_MESHOBJECT = ModelBaseSingleton.findRelationshipType( "org.infogrid.meshbase.security.aclbased/MeshObject_HasOwner_MeshObject" );

    /**
      * Instances of this RelationshipType relate a ProtectionDomain to the MeshObjects that it governs.\nAny MeshObject that is not governed by a ProtectionDomain is assumed to have the following\naccess control policy: anybody has read access; only its owner may update or delete.
      */
    public static final RelationshipType PROTECTIONDOMAIN_GOVERNS_MESHOBJECT = ModelBaseSingleton.findRelationshipType( "org.infogrid.meshbase.security.aclbased/ProtectionDomain_Governs_MeshObject" );

    /**
      * Instances of this RelationshipType identify MeshObjects that, as originators of an action,\nhave some kind of access to the MeshObjects in a ProtectionDomain. Subtypes of this RelationshipType\ndefine the specific kind of access.
      */
    public static final RelationshipType MESHOBJECT_HASACCESSTO_PROTECTIONDOMAIN = ModelBaseSingleton.findRelationshipType( "org.infogrid.meshbase.security.aclbased/MeshObject_HasAccessTo_ProtectionDomain" );

    /**
      * This RelationshipType is used to indicate read access. If no read access\nhas been allowed to anybody (i.e. the ProtectionDomain does not participate in this relationship),\nthe \"anybody may read\" access control policy is assumed.
      */
    public static final RelationshipType MESHOBJECT_HASREADACCESSTO_PROTECTIONDOMAIN = ModelBaseSingleton.findRelationshipType( "org.infogrid.meshbase.security.aclbased/MeshObject_HasReadAccessTo_ProtectionDomain" );

    /**
      * This RelationshipType is used to indicate update access. If no update access has been\nallowed to anybody (i.e. the ProtectionDomain does not participate in this relationship), only the owner\nof the MeshObject has update access. Regardless what other rules may be defined, the owner of a MeshObject\nalways has update access.
      */
    public static final RelationshipType MESHOBJECT_HASUPDATEACCESSTO_PROTECTIONDOMAIN = ModelBaseSingleton.findRelationshipType( "org.infogrid.meshbase.security.aclbased/MeshObject_HasUpdateAccessTo_ProtectionDomain" );

    /**
      * This RelationshipType is used to indicate delete access. If no delete access has been\n              allowed to anybody (i.e. the ProtectionDomain does not participate in this relationship), only the owner\n              of the MeshObject has delete access. Regardless what other rules may be defined, the owner of a MeshObject\n              always has delete access.
      */
    public static final RelationshipType MESHOBJECT_HASDELETEACCESSTO_PROTECTIONDOMAIN = ModelBaseSingleton.findRelationshipType( "org.infogrid.meshbase.security.aclbased/MeshObject_HasDeleteAccessTo_ProtectionDomain" );

}
