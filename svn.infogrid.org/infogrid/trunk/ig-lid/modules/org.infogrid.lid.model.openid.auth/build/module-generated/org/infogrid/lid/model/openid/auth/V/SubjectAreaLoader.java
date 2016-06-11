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
// on Sun, 2016-02-21 12:50:48 -0600
//

package org.infogrid.lid.model.openid.auth.V;

import org.infogrid.modelbase.*;
import org.infogrid.model.primitives.*;
import org.infogrid.model.traversal.TraversalSpecification;
import org.infogrid.model.traversal.TraversalToPropertySpecification;
import org.infogrid.module.ModuleException;
import org.infogrid.module.ModuleRequirement;
import java.io.IOException;

/**
  * This class loads the model of the OpenID Authentication Subject Area Subject Area.
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
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth" ),   // IdentifierValue           theIdentifier,
                org.infogrid.model.primitives.StringValue.create( "org.infogrid.lid.model.openid.auth" ),   // StringValue               theName,
                null,   // StringValue               theVersion,
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "OpenID Authentication Subject Area" ) ),   // L10Map                    theUserNames,
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "The concepts defined by OpenID Authentication." , "text/html" ) ),   // L10Map                    theUserDescriptions,
                new SubjectArea[] { theModelBase.findSubjectAreaByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis" ) ), theModelBase.findSubjectAreaByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.lid" ) ) },   // SubjectArea []            theSubjectAreaDependencies,
                new ModuleRequirement[] {  },   // ModuleRequirement []      theModuleRequirements,
                theLoader,   // ClassLoader               theClassLoader,
                org.infogrid.model.primitives.BooleanValue.TRUE,   // BooleanValue              doGenerateInterfaceCode,
                org.infogrid.model.primitives.BooleanValue.TRUE ); // BooleanValue              doGenerateImplementationCode )

        // generateLoadOneEntity section

        EntityType obj0 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth/AuthenticationService" ),
                org.infogrid.model.primitives.StringValue.create( "AuthenticationService" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "OpenID Authentication Service" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This represents an OpenID Authentication Service in any version." , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.lid/WebAuthenticationService" ) ) },
                new MeshTypeIdentifier [] {
theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "http://openid.net/signon/" )},
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

        org.infogrid.model.primitives.StringDataType obj0_pt0_type = org.infogrid.model.primitives.StringDataType.theDefault;
        PropertyType obj0_pt0 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth/AuthenticationService_Delegate" ),
                org.infogrid.model.primitives.StringValue.create( "Delegate" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Delegate" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "The delegate identifier." , "text/html" ) ),
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
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth/Authentication1Service" ),
                org.infogrid.model.primitives.StringValue.create( "Authentication1Service" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "OpenID Authentication Service (version 1)" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This represents an OpenID Authentication Service (version 1)" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth/AuthenticationService" ) ) },
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

        EntityType obj2 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth/Authentication1dot0Service" ),
                org.infogrid.model.primitives.StringValue.create( "Authentication1dot0Service" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "OpenID Authentication Service (version 1.0)" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This represents an OpenID Authentication Service (version 1.0)" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth/Authentication1Service" ) ) },
                new MeshTypeIdentifier [] {
theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "http://openid.net/signon/1.0" )},
                null,
                new String[] {},
                new StringValue[0],
                new StringValue[] { org.infogrid.model.primitives.StringValue.create( "\n    public String determineRedirectUrl(\n            String                            clientIdentifier,\n            String                            returnToUrl,\n            org.infogrid.util.context.Context context )\n        throws\n            org.infogrid.util.FactoryException\n    {\n        org.infogrid.lid.openid.OpenIdRpSideAssociationManager assocMgr\n                = context.findContextObjectOrThrow( org.infogrid.lid.openid.OpenIdRpSideAssociationManager.class );\n                        \n        org.infogrid.lid.nonce.LidNonceManager nonceMgr\n                = context.findContextObjectOrThrow( org.infogrid.lid.nonce.LidNonceManager.class );\n\n        org.infogrid.mesh.set.OrderedMeshObjectSet endpoints\n                = org.infogrid.lid.model.yadis.util.YadisUtil.determineOrderedEndpointWebResources( the_Delegate );\n        if( endpoints.isEmpty() ) {\n            return null;\n        }\n        MeshObject selectedEndpoint = endpoints.get(0);\n        String     endpointUrl      = selectedEndpoint.getIdentifier().toExternalForm();\n\n        String theDelegate = null;\n        try {\n            StringValue temp = getDelegate();\n            if( temp != null ) {\n                theDelegate = temp.value();\n            }\n\n        } catch( Throwable t ) {\n            log.error( t );\n            return null;\n        }\n\n        StringBuilder ret = new StringBuilder();\n        ret.append( endpointUrl );\n        org.infogrid.util.http.HTTP.appendArgumentPairToUrl( ret, \"openid.mode=checkid_setup\" );\n        if( theDelegate != null ) {\n            org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.identity\", theDelegate );\n        } else {\n            org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.identity\", clientIdentifier );\n        }\n\n        // add a nonce to the return-to URL\n        String nonce = nonceMgr.generateNewNonce();\n\n        returnToUrl = org.infogrid.util.http.HTTP.appendArgumentToUrl( returnToUrl, \"lid-nonce\", nonce );\n\n        org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.return_to\",  returnToUrl );\n        // org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.trust_root\", realm );\n\n        org.infogrid.lid.openid.OpenIdRpSideAssociation association = assocMgr.obtainFor( endpointUrl );\n                // may throw exception\n\n        if( association != null ) {\n            if( association.isCurrentlyValid() ) {\n                org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.assoc_handle\", association.getAssociationHandle() );\n            } else {\n                assocMgr.remove( association.getServerUrl() );\n            }\n        }\n        return ret.toString();\n    }        \n          " ) },
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE );

        EntityType obj3 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth/Authentication1dot1Service" ),
                org.infogrid.model.primitives.StringValue.create( "Authentication1dot1Service" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "OpenID Authentication Service (version 1.1)" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This represents an OpenID Authentication Service (version 1.1)" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth/Authentication1Service" ) ) },
                new MeshTypeIdentifier [] {
theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "http://openid.net/signon/1.1" )},
                null,
                new String[] {},
                new StringValue[0],
                new StringValue[] { org.infogrid.model.primitives.StringValue.create( "\n    public String determineRedirectUrl(\n            String                            clientIdentifier,\n            String                            returnToUrl,\n            org.infogrid.util.context.Context context )\n        throws\n            org.infogrid.util.FactoryException\n    {\n        org.infogrid.lid.openid.OpenIdRpSideAssociationManager assocMgr\n                = context.findContextObjectOrThrow( org.infogrid.lid.openid.OpenIdRpSideAssociationManager.class );\n                        \n        org.infogrid.lid.nonce.LidNonceManager nonceMgr\n                = context.findContextObjectOrThrow( org.infogrid.lid.nonce.LidNonceManager.class );\n\n        org.infogrid.mesh.set.OrderedMeshObjectSet endpoints\n                = org.infogrid.lid.model.yadis.util.YadisUtil.determineOrderedEndpointWebResources( the_Delegate );\n        if( endpoints.isEmpty() ) {\n            return null;\n        }\n        MeshObject selectedEndpoint = endpoints.get(0);\n        String     endpointUrl      = selectedEndpoint.getIdentifier().toExternalForm();\n\n        String theDelegate = null;\n        try {\n            StringValue temp = getDelegate();\n            if( temp != null ) {\n                theDelegate = temp.value();\n            }\n\n        } catch( Throwable t ) {\n            log.error( t );\n            return null;\n        }\n\n        StringBuilder ret = new StringBuilder();\n        ret.append( endpointUrl );\n        org.infogrid.util.http.HTTP.appendArgumentPairToUrl( ret, \"openid.mode=checkid_setup\" );\n        if( theDelegate != null ) {\n            org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.identity\", theDelegate );\n        } else {\n            org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.identity\", clientIdentifier );\n        }\n\n        // add a nonce to the return-to URL\n        String nonce = nonceMgr.generateNewNonce();\n            \n        returnToUrl = org.infogrid.util.http.HTTP.appendArgumentToUrl( returnToUrl, \"lid-nonce\", nonce );\n\n        org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.return_to\",  returnToUrl );\n        // org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.trust_root\", realm );\n\n        org.infogrid.lid.openid.OpenIdRpSideAssociation association = assocMgr.obtainFor( endpointUrl );\n                // may throw exception\n\n        if( association != null ) {\n            if( association.isCurrentlyValid() ) {\n                org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.assoc_handle\", association.getAssociationHandle() );\n            } else {\n                assocMgr.remove( association.getServerUrl() );\n            }\n        }\n        return ret.toString();\n    }        \n          " ) },
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE );

        EntityType obj4 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth/Authentication2dot0Service" ),
                org.infogrid.model.primitives.StringValue.create( "Authentication2dot0Service" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "OpenID Authentication Service (version 2.0)" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This represents an OpenID Authentication Service (version 2.0)" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth/AuthenticationService" ) ) },
                new MeshTypeIdentifier [] {
theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "http://specs.openid.net/auth/2.0/signon" )},
                null,
                new String[] {},
                new StringValue[0],
                new StringValue[] { org.infogrid.model.primitives.StringValue.create( "\n    public String determineRedirectUrl(\n            String                            clientIdentifier,\n            String                            returnToUrl,\n            org.infogrid.util.context.Context context )\n        throws\n            org.infogrid.util.FactoryException\n    {\n        org.infogrid.lid.openid.OpenIdRpSideAssociationManager assocMgr\n                = context.findContextObjectOrThrow( org.infogrid.lid.openid.OpenIdRpSideAssociationManager.class );\n\n        org.infogrid.lid.nonce.LidNonceManager nonceMgr\n                = context.findContextObjectOrThrow( org.infogrid.lid.nonce.LidNonceManager.class );\n\n        org.infogrid.mesh.set.OrderedMeshObjectSet endpoints\n                = org.infogrid.lid.model.yadis.util.YadisUtil.determineOrderedEndpointWebResources( the_Delegate );\n        if( endpoints.isEmpty() ) {\n            return null;\n        }\n\n        MeshObject selectedEndpoint = endpoints.get(0);\n        String     endpointUrl      = selectedEndpoint.getIdentifier().toExternalForm();\n\n        String theDelegate = null;\n        try {\n            StringValue temp = getDelegate();\n            if( temp != null ) {\n                theDelegate = temp.value();\n            }\n\n        } catch( Throwable t ) {\n            log.error( t );\n            return null;\n        }\n\n        StringBuilder ret = new StringBuilder();\n        ret.append( endpointUrl );\n        org.infogrid.util.http.HTTP.appendArgumentToUrl(     ret, \"openid.ns\", \"http://specs.openid.net/auth/2.0\" );\n        org.infogrid.util.http.HTTP.appendArgumentPairToUrl( ret, \"openid.mode=checkid_setup\" );\n        if( theDelegate != null ) {\n            org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.claimed_id\", theDelegate );\n            org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.identity\",   theDelegate );\n        } else {\n            org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.claimed_id\", clientIdentifier );\n            org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.identity\",   clientIdentifier );\n        }\n\n        // add a nonce to the return-to URL\n        String nonce = nonceMgr.generateNewNonce();\n\n        returnToUrl = org.infogrid.util.http.HTTP.appendArgumentToUrl( returnToUrl, \"lid-nonce\", nonce );\n\n        org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.return_to\",  returnToUrl );\n        // org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.trust_root\", realm );\n        // org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.realm\",      realm );\n\n        org.infogrid.lid.openid.OpenIdRpSideAssociation association = assocMgr.obtainFor( endpointUrl );\n                // may throw exception\n\n        if( association != null ) {\n            if( association.isCurrentlyValid() ) {\n                org.infogrid.util.http.HTTP.appendArgumentToUrl( ret, \"openid.assoc_handle\", association.getAssociationHandle() );\n            } else {\n                assocMgr.remove( association.getServerUrl() );\n            }\n        }\n        return ret.toString();\n        }\n          " ) },
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE );

        EntityType obj5 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth/RelyingPartyService" ),
                org.infogrid.model.primitives.StringValue.create( "RelyingPartyService" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "OpenID Relying Party Service" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This service is provided by OpenID RelyingParties in any version." , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.lid/RelyingPartyService" ) ) },
                new MeshTypeIdentifier [] {
theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "http://specs.openid.net/auth/return_to" )},
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
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth/RelyingParty1dot0Service" ),
                org.infogrid.model.primitives.StringValue.create( "RelyingParty1dot0Service" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "OpenID Relying Party Service (version 1.0)" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This service is provided by OpenID RelyingParties (version 1.0)" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth/RelyingPartyService" ) ) },
                new MeshTypeIdentifier [] {
theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "http://specs.openid.net/auth/1.0/return_to" )},
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

        EntityType obj7 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth/RelyingParty1dot1Service" ),
                org.infogrid.model.primitives.StringValue.create( "RelyingParty1dot1Service" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "OpenID Relying Party Service (version 1.1)" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This service is provided by OpenID RelyingParties (version 1.1)" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth/RelyingPartyService" ) ) },
                new MeshTypeIdentifier [] {
theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "http://specs.openid.net/auth/1.1/return_to" )},
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

        EntityType obj8 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth/RelyingParty2dot0Service" ),
                org.infogrid.model.primitives.StringValue.create( "RelyingParty2dot0Service" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "OpenID Relying Party Service (version 2.0)" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This service is provided by OpenID RelyingParties (version 2.0)" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.auth/RelyingPartyService" ) ) },
                new MeshTypeIdentifier [] {
theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "http://specs.openid.net/auth/2.0/return_to" )},
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
