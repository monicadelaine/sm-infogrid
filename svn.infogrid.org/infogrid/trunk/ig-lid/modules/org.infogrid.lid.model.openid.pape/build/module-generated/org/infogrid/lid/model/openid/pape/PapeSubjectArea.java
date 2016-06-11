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
// on Sun, 2016-02-21 12:50:56 -0600
//
// DO NOT MODIFY -- re-generate!

package org.infogrid.lid.model.openid.pape;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.modelbase.ModelBaseSingleton;

/**
  * <p>Collects the MeshTypes in this Subject Area for simpler access.</p>
  */
public abstract class PapeSubjectArea
{
    /**
      * The SubjectArea itself.
      */
    public static final SubjectArea _SA = ModelBaseSingleton.findSubjectArea( "org.infogrid.lid.model.openid.pape" );

    /**
      * This service is provided by OpenID Providers that offer one or more\nphishing-resistant forms of authentication.
      */
    public static final EntityType PHISHINGRESISTANTAUTHENTICATION200706 = org.infogrid.lid.model.openid.pape.PhishingResistantAuthentication200706._TYPE;

    /**
      * This service is provided by OpenID Providers that offer one or more\nforms of authentication that require more than one factor.
      */
    public static final EntityType MULTIFACTORAUTHENTICATION200706 = org.infogrid.lid.model.openid.pape.MultiFactorAuthentication200706._TYPE;

    /**
      * This service is provided by OpenID Providers that offer one or more\nforms of authentication that require more than one factor, at least one of which is a physical\nfactor such as a hardware device.
      */
    public static final EntityType MULTIFACTORPHYSICALAUTHENTICATION200706 = org.infogrid.lid.model.openid.pape.MultiFactorPhysicalAuthentication200706._TYPE;

}
