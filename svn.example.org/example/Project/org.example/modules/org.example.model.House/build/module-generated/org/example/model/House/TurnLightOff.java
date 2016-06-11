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
  * <p>Java interface for EntityType com.example.model.House/TurnLightOff.</p>
  * <p>To instantiate, use the factory methods provided by the <code>MeshBase</code>'s
  * <code>MeshObjectLifecycleManager</code>.</p>
  * <p><b>Note:</b> As an application programmer, you must never rely on any characteristic of any
  * class that implements this interface, only on the characteristics provided by this interface
  * and its supertypes.</p>
  *
  * <table>
  *  <tr><td>Identifier:</td><td><tt>com.example.model.House/TurnLightOff</tt></td></tr>
  *  <tr><td>Name:</td><td><tt>TurnLightOff</tt></td></tr>
  *  <tr><td>IsAbstract:</td><td><code>false</code></td></tr>
  *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>TurnLightOff</td></tr></table></td></tr>
  *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>Turn light off</td></tr></table></td></tr>
  * </table>
  */

public interface TurnLightOff
        extends
            org.example.model.House.AbsoluteChannelAction
{
    /**
      * Subject area in which this MeshObject is declared.
      */
    public static final SubjectArea _SUBJECTAREA = ModelBaseSingleton.findSubjectArea( "org.example.model.House" );

    /**
      * This MeshType.
      */
    public static final EntityType _TYPE = ModelBaseSingleton.findEntityType( "com.example.model.House/TurnLightOff" );

    /**
      * This MeshType.
      */
    public static final RoleType _Light_changed_OFF_DESTINATION = ModelBaseSingleton.findRoleType( "com.example.model.House/Light_changedvia_TurnOff-D" );

    /**
      * This MeshType.
      */
    public static final RoleType _Light_changed_ON_DESTINATION = ModelBaseSingleton.findRoleType( "com.example.model.House/Light_changedvia_TurnOn-D" );

    /**
      * This MeshType.
      */
    public static final RoleType _Light_brightness_up_DESTINATION = ModelBaseSingleton.findRoleType( "com.example.model.House/Light_changedvia_TurnUp-D" );

    /**
      * This MeshType.
      */
    public static final RoleType _Light_brightness_down_DESTINATION = ModelBaseSingleton.findRoleType( "com.example.model.House/Light_changedvia_TurnDown-D" );

}
