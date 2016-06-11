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

package org.infogrid.lid.model.xrd.V;

import org.infogrid.modelbase.*;
import org.infogrid.model.primitives.*;
import org.infogrid.model.traversal.TraversalSpecification;
import org.infogrid.model.traversal.TraversalToPropertySpecification;
import org.infogrid.module.ModuleException;
import org.infogrid.module.ModuleRequirement;
import java.io.IOException;

/**
  * This class loads the model of the XRD Subject Area Subject Area.
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
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd" ),   // IdentifierValue           theIdentifier,
                org.infogrid.model.primitives.StringValue.create( "org.infogrid.lid.model.xrd" ),   // StringValue               theName,
                null,   // StringValue               theVersion,
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "XRD Subject Area" ) ),   // L10Map                    theUserNames,
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This Subject Area covers the concepts defined by the XRD file format." , "text/html" ) ),   // L10Map                    theUserDescriptions,
                new SubjectArea[] { theModelBase.findSubjectAreaByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.Web" ) ) },   // SubjectArea []            theSubjectAreaDependencies,
                new ModuleRequirement[] {  },   // ModuleRequirement []      theModuleRequirements,
                theLoader,   // ClassLoader               theClassLoader,
                org.infogrid.model.primitives.BooleanValue.TRUE,   // BooleanValue              doGenerateInterfaceCode,
                org.infogrid.model.primitives.BooleanValue.TRUE ); // BooleanValue              doGenerateImplementationCode )

        // generateLoadOneEntity section

        EntityType obj0 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Xrd" ),
                org.infogrid.model.primitives.StringValue.create( "Xrd" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "XRD" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Meta-data about a resource on the web." , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.Web/WebResource" ) ) },
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

        org.infogrid.model.primitives.StringDataType obj0_pt0_type = org.infogrid.model.primitives.StringDataType.theDefault;
        PropertyType obj0_pt0 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Xrd_Id" ),
                org.infogrid.model.primitives.StringValue.create( "Id" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "ID" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This attribute, of type xs:ID, is defined by [xml:id]. It provides a unique\n                 identifier for this XRD, and is used as a signature reference." , "text/html" ) ),
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

        org.infogrid.model.primitives.TimeStampDataType obj0_pt1_type = org.infogrid.model.primitives.TimeStampDataType.theDefault;
        PropertyType obj0_pt1 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Xrd_Expires" ),
                org.infogrid.model.primitives.StringValue.create( "Expires" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Expires" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Specifies when this document expires." , "text/html" ) ),
                obj0,
                theSa,
                obj0_pt1_type,
                null,
                null,
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.FloatValue.create( 0.0 ) );

        EntityType obj1 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/AbstractLink" ),
                org.infogrid.model.primitives.StringValue.create( "AbstractLink" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Abstract Link" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Common traits of Links referring to resources and Link templates." , "text/html" ) ),
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
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE );

        org.infogrid.model.primitives.StringDataType obj1_pt0_type = org.infogrid.model.primitives.StringDataType.theDefault;
        PropertyType obj1_pt0 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/AbstractLink_Rel" ),
                org.infogrid.model.primitives.StringValue.create( "Rel" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Rel" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This URI value defines the semantics of the relation between the resource described\n                 by the XRD and the linked resource. This value MUST be an absolute URI or a registered relation type,\n                 as defined in [Web Linking]" , "text/html" ) ),
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

        org.infogrid.model.primitives.StringDataType obj1_pt1_type = org.infogrid.model.primitives.StringDataType.theDefault;
        PropertyType obj1_pt1 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/AbstractLink_Type" ),
                org.infogrid.model.primitives.StringValue.create( "Type" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Type" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This string value identifies the media type of the linked resource, and MUST be\n                of the form of a media type as defined in [RFC 4288]. The IANA media types registry can be found at\n                http://www.iana.org/assignments/media-types/." , "text/html" ) ),
                obj1,
                theSa,
                obj1_pt1_type,
                null,
                null,
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.FloatValue.create( 0.0 ) );

        org.infogrid.model.primitives.BlobDataType obj1_pt2_type = org.infogrid.model.primitives.BlobDataType.theTextAnyType;
        PropertyType obj1_pt2 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/AbstractLink_Title" ),
                org.infogrid.model.primitives.StringValue.create( "Title" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Title" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Provides a human-readable description of the linked resource." , "text/html" ) ),
                obj1,
                theSa,
                obj1_pt2_type,
                null,
                null,
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.FloatValue.create( 0.0 ) );

        EntityType obj2 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Link" ),
                org.infogrid.model.primitives.StringValue.create( "Link" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Link" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "A link to a resource" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/AbstractLink" ) ) },
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

        EntityType obj3 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/LinkTemplate" ),
                org.infogrid.model.primitives.StringValue.create( "LinkTemplate" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Link Template" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "A template for how to find links" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/AbstractLink" ) ) },
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

        org.infogrid.model.primitives.StringDataType obj3_pt0_type = org.infogrid.model.primitives.StringDataType.theDefault;
        PropertyType obj3_pt0 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/LinkTemplate_Template" ),
                org.infogrid.model.primitives.StringValue.create( "Template" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Template" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "The template attribute provides a URI template which can be used to obtain the URI\n                of the linked resource. Templates provide a mechanism for URI construction, taking a list of variables\n                as input, and producing a URI string as an output. The template syntax and vocabulary are determined\n                by the application through which the XRD document is obtained and processed, and MAY be specific to\n                the link relation type indicated by the rel attribute of the corresponding Link element. Applications\n                utilizing the template mechanism MUST define the template syntax and processing rules (including error\n                handling) as well as the variable vocabulary. " , "text/html" ) ),
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
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Xrd_Contains_AbstractLink" ),
                org.infogrid.model.primitives.StringValue.create( "Xrd_Contains_AbstractLink" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Contains" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Relates the XRD to its Link elements." , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 1, 1 ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Xrd" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/AbstractLink" ) ),
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj7 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Xrd_About_WebResource" ),
                org.infogrid.model.primitives.StringValue.create( "Xrd_About_WebResource" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "About" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Relates the XRD to the WebResources that it describes." , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Xrd" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.Web/WebResource" ) ),
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj10 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Xrd_AboutPrimary_WebResource" ),
                org.infogrid.model.primitives.StringValue.create( "Xrd_AboutPrimary_WebResource" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "About Primary" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Relates the XRD to the primary WebResource that it describes, but not the aliases." , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 0, 1 ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Xrd" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.Web/WebResource" ) ),
                new RoleType[] { ((RelationshipType) theModelBase.findMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Xrd_About_WebResource" ) )).getSource() },  
                new RoleType[] { ((RelationshipType) theModelBase.findMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Xrd_About_WebResource" ) )).getDestination() },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj13 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Xrd_AboutAlias_WebResource" ),
                org.infogrid.model.primitives.StringValue.create( "Xrd_AboutAlias_WebResource" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "About Alias" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Relates the XRD to the aliased WebResources that it describes, but not the primary one." , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Xrd" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.Web/WebResource" ) ),
                new RoleType[] { ((RelationshipType) theModelBase.findMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Xrd_About_WebResource" ) )).getSource() },  
                new RoleType[] { ((RelationshipType) theModelBase.findMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Xrd_About_WebResource" ) )).getDestination() },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj16 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Link_To_WebResource" ),
                org.infogrid.model.primitives.StringValue.create( "Link_To_WebResource" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "To" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Relates the XRD Link element to its destination." , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 1, 1 ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/Link" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.Web/WebResource" ) ),
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj19 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.xrd/MeshObject_Describes_MeshObject" ),
                org.infogrid.model.primitives.StringValue.create( "MeshObject_Describes_MeshObject" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Describes" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Relates a MeshObject to the XRD that describes it. Given that a MeshObject may turn out\n            to not be blessed with Xrd after the resource is accessed, this has MeshObject on both sides of the RelationshipType." , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, 1 ),  
                null,
                null,
                new RoleType[] { },  
                new RoleType[] { },  
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
