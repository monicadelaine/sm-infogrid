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
// DO NOT MODIFY -- re-generate!

package org.example.model.House;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.modelbase.ModelBaseSingleton;

/**
  * <p>Collects the MeshTypes in this Subject Area for simpler access.</p>
  */
public abstract class HouseSubjectArea
{
    /**
      * The SubjectArea itself.
      */
    public static final SubjectArea _SA = ModelBaseSingleton.findSubjectArea( "org.example.model.House" );

    /**
      * A thing that has sensors and/or actuators
      */
    public static final EntityType DEVICE = org.example.model.House.Device._TYPE;

    /**
      * A person in the House
      */
    public static final EntityType PERSON = org.example.model.House.Person._TYPE;

    /**
      * An aspect of the environment that can be changed or measured
      */
    public static final EntityType ASPECT = org.example.model.House.Aspect._TYPE;

    /**
      * An abstract place in environment; add location types as properties
      */
    public static final EntityType LOCATION = org.example.model.House.Location._TYPE;

    /**
      * A person specific name for something
      */
    public static final EntityType ALIAS = org.example.model.House.Alias._TYPE;

    /**
      * Super class for actions on device channels that affect channel state and possibly aspects
      */
    public static final EntityType CHANNELACTION = org.example.model.House.ChannelAction._TYPE;

    /**
      * State of device channel changed via action or updated via sensor
      */
    public static final EntityType CHANNELSTATE = org.example.model.House.ChannelState._TYPE;

    /**
      * Maps to openhab channels; may map one to one to aspect; devices can have one or more channels
      */
    public static final EntityType CHANNEL = org.example.model.House.Channel._TYPE;

    /**
      * A lamp with ON/OFF and dimmer
      */
    public static final EntityType LAMP = org.example.model.House.Lamp._TYPE;

    /**
      * Visible light available
      */
    public static final EntityType ILLUMINATION = org.example.model.House.Illumination._TYPE;

    /**
      * Person specific reference to a location
      */
    public static final EntityType LOCATIONALIAS = org.example.model.House.LocationAlias._TYPE;

    /**
      * A person specific name for a device
      */
    public static final EntityType DEVICEALIAS = org.example.model.House.DeviceAlias._TYPE;

    /**
      * Action has specific result regardless of current state
      */
    public static final EntityType ABSOLUTECHANNELACTION = org.example.model.House.AbsoluteChannelAction._TYPE;

    /**
      * Turn light off
      */
    public static final EntityType TURNLIGHTOFF = org.example.model.House.TurnLightOff._TYPE;

    /**
      * Turn light on
      */
    public static final EntityType TURNLIGHTON = org.example.model.House.TurnLightOn._TYPE;

    /**
      * Relative action; result based on current state
      */
    public static final EntityType RELATIVECHANNELACTION = org.example.model.House.RelativeChannelAction._TYPE;

    /**
      * Turn brightness up
      */
    public static final EntityType TURNBRIGHTNESSUP = org.example.model.House.TurnBrightnessUp._TYPE;

    /**
      * Turn brightness down
      */
    public static final EntityType TURNBRIGHTNESSDOWN = org.example.model.House.TurnBrightnessDown._TYPE;

    /**
      * State of light device
      */
    public static final EntityType LIGHTSTATE = org.example.model.House.LightState._TYPE;

    /**
      * device channel that changes illumination
      */
    public static final EntityType LIGHT = org.example.model.House.Light._TYPE;

    /**
      * A lamp provides light
      */
    public static final RelationshipType LAMP_PROVIDES_LIGHT = ModelBaseSingleton.findRelationshipType( "com.example.model.House/Lamp_provides_Light" );

    /**
      * light affects illumination
      */
    public static final RelationshipType LIGHT_AFFECTS_ILLUMINATION = ModelBaseSingleton.findRelationshipType( "com.example.model.House/Light_affects_Illumination" );

    /**
      * light affects illumination
      */
    public static final RelationshipType LIGHT_CHANGED_OFF = ModelBaseSingleton.findRelationshipType( "com.example.model.House/Light_changedvia_TurnOff" );

    /**
      * light affects illumination
      */
    public static final RelationshipType LIGHT_CHANGED_ON = ModelBaseSingleton.findRelationshipType( "com.example.model.House/Light_changedvia_TurnOn" );

    /**
      * light affects illumination
      */
    public static final RelationshipType LIGHT_BRIGHTNESS_UP = ModelBaseSingleton.findRelationshipType( "com.example.model.House/Light_changedvia_TurnUp" );

    /**
      * light affects illumination
      */
    public static final RelationshipType LIGHT_BRIGHTNESS_DOWN = ModelBaseSingleton.findRelationshipType( "com.example.model.House/Light_changedvia_TurnDown" );

}
