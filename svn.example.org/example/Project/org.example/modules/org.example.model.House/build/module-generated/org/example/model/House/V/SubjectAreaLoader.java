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
// on Sun, 2016-03-20 22:09:03 -0500
//

package org.example.model.House.V;

import org.infogrid.modelbase.*;
import org.infogrid.model.primitives.*;
import org.infogrid.model.traversal.TraversalSpecification;
import org.infogrid.model.traversal.TraversalToPropertySpecification;
import org.infogrid.module.ModuleException;
import org.infogrid.module.ModuleRequirement;
import java.io.IOException;

/**
  * This class loads the model of the Smart House Subject Area.
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
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.example.model.House" ),   // IdentifierValue           theIdentifier,
                org.infogrid.model.primitives.StringValue.create( "org.example.model.House" ),   // StringValue               theName,
                null,   // StringValue               theVersion,
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Smart House" ) ),   // L10Map                    theUserNames,
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Defines smart home devices" , "text/html" ) ),   // L10Map                    theUserDescriptions,
                new SubjectArea[] { },   // SubjectArea []            theSubjectAreaDependencies,
                new ModuleRequirement[] {  },   // ModuleRequirement []      theModuleRequirements,
                theLoader,   // ClassLoader               theClassLoader,
                org.infogrid.model.primitives.BooleanValue.TRUE,   // BooleanValue              doGenerateInterfaceCode,
                org.infogrid.model.primitives.BooleanValue.TRUE ); // BooleanValue              doGenerateImplementationCode )

        // generateLoadOneEntity section

        EntityType obj0 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Device" ),
                org.infogrid.model.primitives.StringValue.create( "Device" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Device" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "A thing that has sensors and/or actuators" , "text/html" ) ),
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

        EntityType obj1 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Person" ),
                org.infogrid.model.primitives.StringValue.create( "Person" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Person" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "A person in the House" , "text/html" ) ),
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

        EntityType obj2 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Aspect" ),
                org.infogrid.model.primitives.StringValue.create( "Aspect" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Aspect" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "An aspect of the environment that can be changed or measured" , "text/html" ) ),
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

        EntityType obj3 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Location" ),
                org.infogrid.model.primitives.StringValue.create( "Location" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Location" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "An abstract place in environment; add location types as properties" , "text/html" ) ),
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

        EntityType obj4 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Alias" ),
                org.infogrid.model.primitives.StringValue.create( "Alias" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Alias" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "A person specific name for something" , "text/html" ) ),
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

        EntityType obj5 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/ChannelAction" ),
                org.infogrid.model.primitives.StringValue.create( "ChannelAction" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "ChannelAction" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Super class for actions on device channels that affect channel state and possibly aspects" , "text/html" ) ),
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

        EntityType obj6 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/ChannelState" ),
                org.infogrid.model.primitives.StringValue.create( "ChannelState" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "ChannelState" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "State of device channel changed via action or updated via sensor" , "text/html" ) ),
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

        EntityType obj7 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Channel" ),
                org.infogrid.model.primitives.StringValue.create( "Channel" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Channel" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Maps to openhab channels; may map one to one to aspect; devices can have one or more channels" , "text/html" ) ),
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

        EntityType obj8 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Lamp" ),
                org.infogrid.model.primitives.StringValue.create( "Lamp" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Lamp" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "A lamp with ON/OFF and dimmer" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Device" ) ) },
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

        EntityType obj9 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Illumination" ),
                org.infogrid.model.primitives.StringValue.create( "Illumination" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Illumination" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Visible light available" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Aspect" ) ) },
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

        EntityType obj10 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/LocationAlias" ),
                org.infogrid.model.primitives.StringValue.create( "LocationAlias" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "LocationAlias" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Person specific reference to a location" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Alias" ) ) },
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

        EntityType obj11 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/DeviceAlias" ),
                org.infogrid.model.primitives.StringValue.create( "DeviceAlias" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "DeviceAlias" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "A person specific name for a device" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Alias" ) ) },
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

        EntityType obj12 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/AbsoluteAction" ),
                org.infogrid.model.primitives.StringValue.create( "AbsoluteChannelAction" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "AbsoluteChannelAction" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Action has specific result regardless of current state" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/ChannelAction" ) ) },
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

        EntityType obj13 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/TurnLightOff" ),
                org.infogrid.model.primitives.StringValue.create( "TurnLightOff" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "TurnLightOff" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Turn light off" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/AbsoluteAction" ) ) },
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

        EntityType obj14 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/TurnLightOn" ),
                org.infogrid.model.primitives.StringValue.create( "TurnLightOn" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "TurnLightOn" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Turn light on" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/AbsoluteAction" ) ) },
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

        EntityType obj15 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/RelativeAction" ),
                org.infogrid.model.primitives.StringValue.create( "RelativeChannelAction" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "RelativeChannelAction" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Relative action; result based on current state" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/ChannelAction" ) ) },
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

        EntityType obj16 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/TurnBrightnessUp" ),
                org.infogrid.model.primitives.StringValue.create( "TurnBrightnessUp" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "TurnBrightnessUp" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Turn brightness up" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/AbsoluteAction" ) ) },
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

        EntityType obj17 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/TurnBrightnessDown" ),
                org.infogrid.model.primitives.StringValue.create( "TurnBrightnessDown" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "TurnBrightnessDown" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Turn brightness down" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/AbsoluteAction" ) ) },
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

        EntityType obj18 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/LightState" ),
                org.infogrid.model.primitives.StringValue.create( "LightState" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "LightState" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "State of light device" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/ChannelState" ) ) },
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

        EntityType obj19 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Light" ),
                org.infogrid.model.primitives.StringValue.create( "Light" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Light" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "device channel that changes illumination" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { theModelBase.findAttributableMeshTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Channel" ) ) },
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

        RelationshipType obj20 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Lamp_provides_Light" ),
                org.infogrid.model.primitives.StringValue.create( "Lamp_provides_Light" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "provides" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "A lamp provides light" , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 1, 1 ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Lamp" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Light" ) ),
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj23 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Light_affects_Illumination" ),
                org.infogrid.model.primitives.StringValue.create( "Light_affects_Illumination" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "affects" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "light affects illumination" , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 1, 1 ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Light" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Illumination" ) ),
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj26 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Light_changedvia_TurnOff" ),
                org.infogrid.model.primitives.StringValue.create( "Light_changed_OFF" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "affects" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "light affects illumination" , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 1, 1 ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Light" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/TurnLightOff" ) ),
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj29 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Light_changedvia_TurnOn" ),
                org.infogrid.model.primitives.StringValue.create( "Light_changed_ON" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "affects" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "light affects illumination" , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 1, 1 ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Light" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/TurnLightOff" ) ),
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj32 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Light_changedvia_TurnUp" ),
                org.infogrid.model.primitives.StringValue.create( "Light_brightness_up" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "affects" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "light affects illumination" , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 1, 1 ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Light" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/TurnLightOff" ) ),
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj35 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Light_changedvia_TurnDown" ),
                org.infogrid.model.primitives.StringValue.create( "Light_brightness_down" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "affects" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "light affects illumination" , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 1, 1 ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/Light" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "com.example.model.House/TurnLightOff" ) ),
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
