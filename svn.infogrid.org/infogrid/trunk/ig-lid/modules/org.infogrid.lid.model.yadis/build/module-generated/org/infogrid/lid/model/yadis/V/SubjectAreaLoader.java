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

package org.infogrid.lid.model.yadis.V;

import org.infogrid.modelbase.*;
import org.infogrid.model.primitives.*;
import org.infogrid.model.traversal.TraversalSpecification;
import org.infogrid.model.traversal.TraversalToPropertySpecification;
import org.infogrid.module.ModuleException;
import org.infogrid.module.ModuleRequirement;
import java.io.IOException;

/**
  * This class loads the model of the Yadis Subject Area Subject Area.
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
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis" ),   // IdentifierValue           theIdentifier,
                org.infogrid.model.primitives.StringValue.create( "org.infogrid.lid.model.yadis" ),   // StringValue               theName,
                null,   // StringValue               theVersion,
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Yadis Subject Area" ) ),   // L10Map                    theUserNames,
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This Subject Area covers the concepts defined by the Yadis protocol." , "text/html" ) ),   // L10Map                    theUserDescriptions,
                new SubjectArea[] { theModelBase.findSubjectAreaByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.Web" ) ) },   // SubjectArea []            theSubjectAreaDependencies,
                new ModuleRequirement[] {  },   // ModuleRequirement []      theModuleRequirements,
                theLoader,   // ClassLoader               theClassLoader,
                org.infogrid.model.primitives.BooleanValue.TRUE,   // BooleanValue              doGenerateInterfaceCode,
                org.infogrid.model.primitives.BooleanValue.TRUE ); // BooleanValue              doGenerateImplementationCode )

        // generateLoadOneEntity section

        EntityType obj0 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsServiceCollection" ),
                org.infogrid.model.primitives.StringValue.create( "XrdsServiceCollection" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "XRDS Service Collection" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "A collection of XRDS services." , "text/html" ) ),
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

        org.infogrid.model.primitives.BlobDataType obj0_pt0_type = org.infogrid.model.primitives.BlobDataType.theTextXmlType;
        PropertyType obj0_pt0 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsServiceCollection_XrdsResourceContent" ),
                org.infogrid.model.primitives.StringValue.create( "XrdsResourceContent" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "XrdsResourceContent" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Content of the parsed XRDS resource." , "text/html" ) ),
                obj0,
                theSa,
                obj0_pt0_type,
                null,
                null,
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.FloatValue.create( 0.0 ) );

        EntityType obj1 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsService" ),
                org.infogrid.model.primitives.StringValue.create( "XrdsService" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Other XRDS Service" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This represents a Yadis/XRDS Service. Known ServiceTypes are\nexpressed by subclasses of this EntityType. Also, an XrdsServiceType EntityType is instantiated\nfor both known and unknown ServiceTypes." , "text/html" ) ),
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

        org.infogrid.model.primitives.IntegerDataType obj1_pt0_type = org.infogrid.model.primitives.IntegerDataType.theDefault;
        PropertyType obj1_pt0 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsService_Priority" ),
                org.infogrid.model.primitives.StringValue.create( "Priority" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Priority" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Priority of this XRDS Service." , "text/html" ) ),
                obj1,
                theSa,
                obj1_pt0_type,
                null,
                null,
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.FloatValue.create( 0.0 ) );

        EntityType obj2 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsServiceType" ),
                org.infogrid.model.primitives.StringValue.create( "XrdsServiceType" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Other XRDS Service" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Captures the Yadis type identifier for an XrdsServiceType." , "text/html" ) ),
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

        org.infogrid.model.primitives.StringDataType obj2_pt0_type = org.infogrid.model.primitives.StringDataType.theDefault;
        PropertyType obj2_pt0 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsServiceType_ServiceTypeIdentifier" ),
                org.infogrid.model.primitives.StringValue.create( "ServiceTypeIdentifier" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "ServiceTypeIdentifier" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Unique identifier for this ServiceType" , "text/html" ) ),
                obj2,
                theSa,
                obj2_pt0_type,
                null,
                null,
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.FloatValue.create( 0.0 ) );

        EntityType obj3 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/Endpoint" ),
                org.infogrid.model.primitives.StringValue.create( "Endpoint" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Endpoint" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This represents an endpoint of a Yadis/XRDS Service." , "text/html" ) ),
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

        org.infogrid.model.primitives.IntegerDataType obj3_pt0_type = org.infogrid.model.primitives.IntegerDataType.theDefault;
        PropertyType obj3_pt0 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/Endpoint_Priority" ),
                org.infogrid.model.primitives.StringValue.create( "Priority" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Priority" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Priority of this endpoint." , "text/html" ) ),
                obj3,
                theSa,
                obj3_pt0_type,
                null,
                null,
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.FloatValue.create( 0.0 ) );

        // generateLoadOneRelationshipType section

        RelationshipType obj4 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsServiceCollection_Collects_XrdsService" ),
                org.infogrid.model.primitives.StringValue.create( "XrdsServiceCollection_Collects_XrdsService" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Collects" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Relates the XRDS Services inside of an XRDS Service Collection\nto the XRDS Service Collection itself." , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 1, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsServiceCollection" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsService" ) ),
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj7 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsService_HasType_XrdsServiceType" ),
                org.infogrid.model.primitives.StringValue.create( "XrdsService_HasType_XrdsServiceType" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Has Type" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Relates an XRDS Service to an object capturing the Yadis ServiceType identifier." , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 1, 1 ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsService" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsServiceType" ) ),
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj10 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsService_IsProvidedAt_Endpoint" ),
                org.infogrid.model.primitives.StringValue.create( "XrdsService_IsProvidedAt_Endpoint" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "is provided at" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Expresses at which endpoints an XRDS Service is available." , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsService" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/Endpoint" ) ),
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj13 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/Endpoint_IsOperatedBy_WebResource" ),
                org.infogrid.model.primitives.StringValue.create( "Endpoint_IsOperatedBy_WebResource" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "is operated by" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Expresses which WebResource acts as the Endpoint." , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 0, 1 ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/Endpoint" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.Web/WebResource" ) ),
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj16 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/WebResource_HasXrdsLinkTo_WebResource" ),
                org.infogrid.model.primitives.StringValue.create( "WebResource_HasXrdsLinkTo_WebResource" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "has XRDS link to" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Relates a Web Resource to another Web Resource which contains\nthe XRDS/Yadis data about the first Web Resource." , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.Web/WebResource" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.Web/WebResource" ) ),
                new RoleType[] { ((RelationshipType) theModelBase.findMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.Web/WebResource_HasLinkTo_WebResource" ) )).getSource() },  
                new RoleType[] { ((RelationshipType) theModelBase.findMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.Web/WebResource_HasLinkTo_WebResource" ) )).getDestination() },  
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
