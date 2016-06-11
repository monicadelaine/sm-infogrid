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
  * <p>Java interface for EntityType com.example.model.House/Light.</p>
  * <p>To instantiate, use the factory methods provided by the <code>MeshBase</code>'s
  * <code>MeshObjectLifecycleManager</code>.</p>
  * <p><b>Note:</b> As an application programmer, you must never rely on any characteristic of any
  * class that implements this interface, only on the characteristics provided by this interface
  * and its supertypes.</p>
  *
  * <table>
  *  <tr><td>Identifier:</td><td><tt>com.example.model.House/Light</tt></td></tr>
  *  <tr><td>Name:</td><td><tt>Light</tt></td></tr>
  *  <tr><td>IsAbstract:</td><td><code>false</code></td></tr>
  *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Light</td></tr></table></td></tr>
  *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>device channel that changes illumination</td></tr></table></td></tr>
  * </table>
  */

public interface Light
        extends
            org.example.model.House.Channel
{
    /**
      * Subject area in which this MeshObject is declared.
      */
    public static final SubjectArea _SUBJECTAREA = ModelBaseSingleton.findSubjectArea( "org.example.model.House" );

    /**
      * This MeshType.
      */
    public static final EntityType _TYPE = ModelBaseSingleton.findEntityType( "com.example.model.House/Light" );

    /**
      * This MeshType.
      */
    public static final RoleType _Lamp_provides_Light_DESTINATION = ModelBaseSingleton.findRoleType( "com.example.model.House/Lamp_provides_Light-D" );

    /**
      * This MeshType.
      */
    public static final RoleType _Light_affects_Illumination_SOURCE = ModelBaseSingleton.findRoleType( "com.example.model.House/Light_affects_Illumination-S" );

    /**
      * This MeshType.
      */
    public static final RoleType _Light_changed_OFF_SOURCE = ModelBaseSingleton.findRoleType( "com.example.model.House/Light_changedvia_TurnOff-S" );

    /**
      * This MeshType.
      */
    public static final RoleType _Light_changed_ON_SOURCE = ModelBaseSingleton.findRoleType( "com.example.model.House/Light_changedvia_TurnOn-S" );

    /**
      * This MeshType.
      */
    public static final RoleType _Light_brightness_up_SOURCE = ModelBaseSingleton.findRoleType( "com.example.model.House/Light_changedvia_TurnUp-S" );

    /**
      * This MeshType.
      */
    public static final RoleType _Light_brightness_down_SOURCE = ModelBaseSingleton.findRoleType( "com.example.model.House/Light_changedvia_TurnDown-S" );

}
