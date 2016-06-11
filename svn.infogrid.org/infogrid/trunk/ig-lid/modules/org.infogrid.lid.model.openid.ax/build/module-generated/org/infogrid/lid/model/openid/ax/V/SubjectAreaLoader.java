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
// on Sun, 2016-02-21 12:50:53 -0600
//

package org.infogrid.lid.model.openid.ax.V;

import org.infogrid.modelbase.*;
import org.infogrid.model.primitives.*;
import org.infogrid.model.traversal.TraversalSpecification;
import org.infogrid.model.traversal.TraversalToPropertySpecification;
import org.infogrid.module.ModuleException;
import org.infogrid.module.ModuleRequirement;
import java.io.IOException;

/**
  * This class loads the model of the OpenID Attribute Exchange Subject Area Subject Area.
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
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.ax" ),   // IdentifierValue           theIdentifier,
                org.infogrid.model.primitives.StringValue.create( "org.infogrid.lid.model.openid.ax" ),   // StringValue               theName,
                null,   // StringValue               theVersion,
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "OpenID Attribute Exchange Subject Area" ) ),   // L10Map                    theUserNames,
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "The concepts defined by OpenID Attribute Exchange." , "text/html" ) ),   // L10Map                    theUserDescriptions,
                new SubjectArea[] { theModelBase.findSubjectAreaByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis" ) ) },   // SubjectArea []            theSubjectAreaDependencies,
                new ModuleRequirement[] {  },   // ModuleRequirement []      theModuleRequirements,
                theLoader,   // ClassLoader               theClassLoader,
                org.infogrid.model.primitives.BooleanValue.TRUE,   // BooleanValue              doGenerateInterfaceCode,
                org.infogrid.model.primitives.BooleanValue.TRUE ); // BooleanValue              doGenerateImplementationCode )

        // generateLoadOneEntity section

        EntityType obj0 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.ax/AttributeExchangeService" ),
                org.infogrid.model.primitives.StringValue.create( "AttributeExchangeService" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "OpenID Attribute Exchange Service" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This service is provided by OpenID Providers offering Attribute Exchange" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.yadis/XrdsService" ) ) },
                new MeshTypeIdentifier [] {
theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "http://openid.net/srv/ax" )},
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

        EntityType obj1 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.ax/AttributeExchange1dot0Service" ),
                org.infogrid.model.primitives.StringValue.create( "AttributeExchange1dot0Service" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "OpenID Attribute Exchange Service (version 1.0)" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "This service is provided by OpenID Providers offering Attribute Exchange (version 1.0)" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.openid.ax/AttributeExchangeService" ) ) },
                new MeshTypeIdentifier [] {
theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "http://openid.net/srv/ax/1.0" )},
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
