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
// on Sun, 2016-02-21 12:49:22 -0600
//

package org.infogrid.model.AclBasedSecurity.V;

import org.infogrid.modelbase.*;
import org.infogrid.model.primitives.*;
import org.infogrid.model.traversal.TraversalSpecification;
import org.infogrid.model.traversal.TraversalToPropertySpecification;
import org.infogrid.module.ModuleException;
import org.infogrid.module.ModuleRequirement;
import java.io.IOException;

/**
  * This class loads the model of the Acl-based Security Subject Area Subject Area.
  */
public class SubjectAreaLoader
        extends
            ModelLoader
{
    /**
      * Constructor.
      *
      * @param modelBase the ModelBase into which the SubjectArea will be loaded
      * @param loader the ClassLoader to be used for resolving resources
      */
    public SubjectAreaLoader(
            ModelBase   modelBase,
            ClassLoader loader )
    {
        super( modelBase );
        theLoader = loader;
    }

    /**
     * Instruct this object to instantiate its model.
     *
     * @param theInstantiator the MeshTypeLifecycleManager which shall be used to instantiate
     * @return the instantiated SubjectArea(s)
     * @throws MeshTypeNotFoundException thrown if there was an undeclared dependency in the model that could not be resolved
     * @throws InheritanceConflictException thrown if there was a conflict in the inheritance hierarchy of the newly loaded model
     * @throws IOException thrown if reading the model failed
     */
    protected SubjectArea [] loadModel(
            MeshTypeLifecycleManager theInstantiator )
        throws
            MeshTypeNotFoundException,
            InheritanceConflictException,
            IOException,
            org.infogrid.model.primitives.UnknownEnumeratedValueException
    {
        org.infogrid.util.logging.Log log = org.infogrid.util.logging.Log.getLogInstance( getClass() );
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "loadModel" );
        }

        SubjectArea theSa = theInstantiator.createSubjectArea(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.AclBasedSecurity" ),   // IdentifierValue           theIdentifier,
                org.infogrid.model.primitives.StringValue.create( "org.infogrid.model.AclBasedSecurity" ),   // StringValue               theName,
                null,   // StringValue               theVersion,
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Acl-based Security Subject Area" ) ),   // L10Map                    theUserNames,
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This Subject Area defines the security concepts that define\nSecurity of MeshObjects via an Access Control List (ACL) mechanism." , "text/html" ) ),   // L10Map                    theUserDescriptions,
                new SubjectArea[] { },   // SubjectArea []            theSubjectAreaDependencies,
                new ModuleRequirement[] {  },   // ModuleRequirement []      theModuleRequirements,
                theLoader,   // ClassLoader               theClassLoader,
                org.infogrid.model.primitives.BooleanValue.TRUE,   // BooleanValue              doGenerateInterfaceCode,
                org.infogrid.model.primitives.BooleanValue.TRUE ); // BooleanValue              doGenerateImplementationCode )

        // generateLoadOneEntity section

        EntityType obj0 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.AclBasedSecurity/ProtectionDomain" ),
                org.infogrid.model.primitives.StringValue.create( "ProtectionDomain" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Protection Domain" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "A ProtectionDomain defines a set of MeshObjects, all of which are governed by the same\naccess control policies." , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { },
                new MeshTypeIdentifier [] {
},
                null,
                new String[] {},
                new StringValue[0],
                new StringValue[0],
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE );

        // generateLoadOneRelationshipType section

        RelationshipType obj1 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.AclBasedSecurity/MeshObject_HasOwner_MeshObject" ),
                org.infogrid.model.primitives.StringValue.create( "MeshObject_HasOwner_MeshObject" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "has owner" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Instances of this RelationshipType relate MeshObjects to their owning MeshObject or\nMeshObjects. Any MeshObject that does not participate in this relationship as source (ie doesn\'t\nhave an owner) is assumed to own itself. An owner MeshObject may assign another MeshObject as an\nadditional owner. An owner (and only an owner) may delete itself as an owner, but then cannot\nmake itself an owner again unless another owner re-assigns ownership to the old owner. Multiple\nMeshObject may all be owners of the same MeshObject; they all have the same rights." , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                null,
                null,
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] { "org.infogrid.model.AclBasedSecurity.guards.MeshObject_HasOwner_MeshObject_SourceGuard" }, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj4 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.AclBasedSecurity/ProtectionDomain_Governs_MeshObject" ),
                org.infogrid.model.primitives.StringValue.create( "ProtectionDomain_Governs_MeshObject" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Governs" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Instances of this RelationshipType relate a ProtectionDomain to the MeshObjects that it governs.\nAny MeshObject that is not governed by a ProtectionDomain is assumed to have the following\naccess control policy: anybody has read access; only its owner may update or delete." , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, 1 ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.AclBasedSecurity/ProtectionDomain" ) ),
                null,
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] { "org.infogrid.model.AclBasedSecurity.guards.ProtectionDomain_Governs_MeshObject_SourceGuard" }, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj7 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.AclBasedSecurity/MeshObject_HasAccessTo_ProtectionDomain" ),
                org.infogrid.model.primitives.StringValue.create( "MeshObject_HasAccessTo_ProtectionDomain" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "has access to" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Instances of this RelationshipType identify MeshObjects that, as originators of an action,\nhave some kind of access to the MeshObjects in a ProtectionDomain. Subtypes of this RelationshipType\ndefine the specific kind of access." , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                null,
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.AclBasedSecurity/ProtectionDomain" ) ),
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] { "org.infogrid.model.AclBasedSecurity.guards.MeshObject_HasAccessTo_ProtectionDomain_DestinationGuard" }, 
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj10 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.AclBasedSecurity/MeshObject_HasReadAccessTo_ProtectionDomain" ),
                org.infogrid.model.primitives.StringValue.create( "MeshObject_HasReadAccessTo_ProtectionDomain" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "may read" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This RelationshipType is used to indicate read access. If no read access\nhas been allowed to anybody (i.e. the ProtectionDomain does not participate in this relationship),\nthe \"anybody may read\" access control policy is assumed." , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                null,
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.AclBasedSecurity/ProtectionDomain" ) ),
                new RoleType[] { ((RelationshipType) theModelBase.findMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.AclBasedSecurity/MeshObject_HasAccessTo_ProtectionDomain" ) )).getSource() },  
                new RoleType[] { ((RelationshipType) theModelBase.findMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.AclBasedSecurity/MeshObject_HasAccessTo_ProtectionDomain" ) )).getDestination() },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj13 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.AclBasedSecurity/MeshObject_HasUpdateAccessTo_ProtectionDomain" ),
                org.infogrid.model.primitives.StringValue.create( "MeshObject_HasUpdateAccessTo_ProtectionDomain" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "may update" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This RelationshipType is used to indicate update access. If no update access has been\nallowed to anybody (i.e. the ProtectionDomain does not participate in this relationship), only the owner\nof the MeshObject has update access. Regardless what other rules may be defined, the owner of a MeshObject\nalways has update access." , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                null,
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.AclBasedSecurity/ProtectionDomain" ) ),
                new RoleType[] { ((RelationshipType) theModelBase.findMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.AclBasedSecurity/MeshObject_HasAccessTo_ProtectionDomain" ) )).getSource() },  
                new RoleType[] { ((RelationshipType) theModelBase.findMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.AclBasedSecurity/MeshObject_HasAccessTo_ProtectionDomain" ) )).getDestination() },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        // generateFixOneEntityType section

        return new SubjectArea[] { theSa };
    }

    /**
      * The ClassLoader to be used for resources.
      */
    protected ClassLoader theLoader;

}
