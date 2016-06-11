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
// on Sun, 2016-02-21 12:50:44 -0600
//

package org.infogrid.lid.model.lid.V;

import org.infogrid.modelbase.*;
import org.infogrid.model.primitives.*;
import org.infogrid.model.traversal.TraversalSpecification;
import org.infogrid.model.traversal.TraversalToPropertySpecification;
import org.infogrid.module.ModuleException;
import org.infogrid.module.ModuleRequirement;
import java.io.IOException;

/**
  * This class loads the model of the LID Subject Area Subject Area.
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
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.lid" ),   // IdentifierValue           theIdentifier,
                org.infogrid.model.primitives.StringValue.create( "org.infogrid.lid.model.lid" ),   // StringValue               theName,
                null,   // StringValue               theVersion,
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "LID Subject Area" ) ),   // L10Map                    theUserNames,
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "The concepts defined by LID that aren\'t defined anywhere else." , "text/html" ) ),   // L10Map                    theUserDescriptions,
                new SubjectArea[] { theModelBase.findSubjectAreaByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis" ) ), theModelBase.findSubjectAreaByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.model.Web" ) ) },   // SubjectArea []            theSubjectAreaDependencies,
                new ModuleRequirement[] { ModuleRequirement.create1( "org.infogrid.lid" ) },   // ModuleRequirement []      theModuleRequirements,
                theLoader,   // ClassLoader               theClassLoader,
                org.infogrid.model.primitives.BooleanValue.TRUE,   // BooleanValue              doGenerateInterfaceCode,
                org.infogrid.model.primitives.BooleanValue.TRUE ); // BooleanValue              doGenerateImplementationCode )

        // generateLoadOneEntity section

        EntityType obj0 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.lid/AuthenticationService" ),
                org.infogrid.model.primitives.StringValue.create( "AuthenticationService" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "AuthenticationService" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "A Yadis Service that is able to authenticate a principal. More specific subclasses\nare provided for specific authentication protocols." , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsService" ) ) },
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

        EntityType obj1 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.lid/WebAuthenticationService" ),
                org.infogrid.model.primitives.StringValue.create( "WebAuthenticationService" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "WebAuthenticationService" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "An AuthenticationService that uses a standard web browser as the client device,\nand thus implements the redirect dance. More specific subclasses\nare provided for specific authentication protocols." , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.lid/AuthenticationService" ) ) },
                new MeshTypeIdentifier [] {
},
                null,
                new String[] {},
                new StringValue[0],
                new StringValue[0],
                new String[] { "org.infogrid.lid.LidAuthenticationService" },
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE );

        EntityType obj2 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.lid/LidGpgSso" ),
                org.infogrid.model.primitives.StringValue.create( "LidGpgSso" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "LID\'s GPG-based Authentication Service" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This represents a LID GPG-based Authentication Service in any version." , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.lid/WebAuthenticationService" ) ) },
                new MeshTypeIdentifier [] {
theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "http://lid.netmesh.org/sso" )},
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

        EntityType obj3 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.lid/LidGpgSso2" ),
                org.infogrid.model.primitives.StringValue.create( "LidGpgSso2" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "LID\'s GPG-based Authentication Service (version 2)" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "An Authentication Service based on the LID GPG SSO service, version 2." , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.lid/LidGpgSso" ) ) },
                new MeshTypeIdentifier [] {
theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "http://lid.netmesh.org/sso/2.0" )},
                null,
                new String[] {},
                new StringValue[0],
                new StringValue[] { org.infogrid.model.primitives.StringValue.create( "\n    public String determineRedirectUrl(\n            String                            clientIdentifier,\n            String                            returnToUrl,\n            org.infogrid.util.context.Context context )\n        throws\n            org.infogrid.util.FactoryException\n    {\n        org.infogrid.mesh.set.OrderedMeshObjectSet endpoints\n                = org.infogrid.lid.model.yadis.util.YadisUtil.determineOrderedEndpointWebResources( the_Delegate );\n        if( endpoints.isEmpty() ) {\n            return null;\n        }\n        MeshObject selectedEndpoint = endpoints.get(0);\n        String     endpointUrl      = selectedEndpoint.getIdentifier().toExternalForm();\n\n        String ret = endpointUrl;\n\n        String target = org.infogrid.util.http.HTTP.appendArgumentPairToUrl( returnToUrl, \"lid-credtype=gpg%20--clearsign\" );\n\n        ret = org.infogrid.util.http.HTTP.appendArgumentPairToUrl( ret, \"lid-action=sso-approve\" );\n        ret = org.infogrid.util.http.HTTP.appendArgumentToUrl(     ret, \"lid-target\", target.toString() );\n\n        return ret;\n    }\n          " ) },
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE );

        EntityType obj4 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.lid/MinimumLid2" ),
                org.infogrid.model.primitives.StringValue.create( "MinimumLid2" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Minimum LID (version 2)" ) ),
                null,
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsService" ) ) },
                new MeshTypeIdentifier [] {
theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "http://lid.netmesh.org/minimum-lid/2.0" )},
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

        EntityType obj5 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.lid/RelyingPartyService" ),
                org.infogrid.model.primitives.StringValue.create( "RelyingPartyService" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "RelyingPartyService" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "A Yadis Service that is able to accept authentication assertions. More specific subclasses\nare provided for specific protocols." , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsService" ) ) },
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

        EntityType obj6 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.lid/LidGpgRelyingParty" ),
                org.infogrid.model.primitives.StringValue.create( "LidGpgRelyingParty" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "LID\'s GPG-based Relying Party Service" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This represents a LID GPG-based Relying Party Service in any version." , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.lid/RelyingPartyService" ) ) },
                new MeshTypeIdentifier [] {
theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "http://lid.netmesh.org/relying-party" )},
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

        EntityType obj7 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.lid/LidGpgRelyingParty2" ),
                org.infogrid.model.primitives.StringValue.create( "LidGpgRelyingParty2" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "LID\'s GPG-based Relying Party Service (version 2)" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "A LID GPG-based Relying Party Service based on the LID GPG SSO service, version 2." , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.lid/LidGpgRelyingParty" ) ) },
                new MeshTypeIdentifier [] {
theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "http://lid.netmesh.org/relying-party/2.0" )},
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

        // generateFixOneEntityType section

        return new SubjectArea[] { theSa };
    }

    /**
      * The ClassLoader to be used for resources.
      */
    protected ClassLoader theLoader;

}
