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
// DO NOT MODIFY -- re-generate!

package org.infogrid.lid.model.openid.auth;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.modelbase.ModelBaseSingleton;

/**
  * <p>Collects the MeshTypes in this Subject Area for simpler access.</p>
  */
public abstract class AuthSubjectArea
{
    /**
      * The SubjectArea itself.
      */
    public static final SubjectArea _SA = ModelBaseSingleton.findSubjectArea( "org.infogrid.lid.model.openid.auth" );

    /**
      * This represents an OpenID Authentication Service in any version.
      */
    public static final EntityType AUTHENTICATIONSERVICE = org.infogrid.lid.model.openid.auth.AuthenticationService._TYPE;

    /**
      * The delegate identifier.
      */
    public static final PropertyType AUTHENTICATIONSERVICE_DELEGATE = org.infogrid.lid.model.openid.auth.AuthenticationService.DELEGATE;
    public static final org.infogrid.model.primitives.StringDataType AUTHENTICATIONSERVICE_DELEGATE_type = (org.infogrid.model.primitives.StringDataType) AUTHENTICATIONSERVICE_DELEGATE.getDataType();

    /**
      * This represents an OpenID Authentication Service (version 1)
      */
    public static final EntityType AUTHENTICATION1SERVICE = org.infogrid.lid.model.openid.auth.Authentication1Service._TYPE;

    /**
      * This represents an OpenID Authentication Service (version 1.0)
      */
    public static final EntityType AUTHENTICATION1DOT0SERVICE = org.infogrid.lid.model.openid.auth.Authentication1dot0Service._TYPE;

    /**
      * This represents an OpenID Authentication Service (version 1.1)
      */
    public static final EntityType AUTHENTICATION1DOT1SERVICE = org.infogrid.lid.model.openid.auth.Authentication1dot1Service._TYPE;

    /**
      * This represents an OpenID Authentication Service (version 2.0)
      */
    public static final EntityType AUTHENTICATION2DOT0SERVICE = org.infogrid.lid.model.openid.auth.Authentication2dot0Service._TYPE;

    /**
      * This service is provided by OpenID RelyingParties in any version.
      */
    public static final EntityType RELYINGPARTYSERVICE = org.infogrid.lid.model.openid.auth.RelyingPartyService._TYPE;

    /**
      * This service is provided by OpenID RelyingParties (version 1.0)
      */
    public static final EntityType RELYINGPARTY1DOT0SERVICE = org.infogrid.lid.model.openid.auth.RelyingParty1dot0Service._TYPE;

    /**
      * This service is provided by OpenID RelyingParties (version 1.1)
      */
    public static final EntityType RELYINGPARTY1DOT1SERVICE = org.infogrid.lid.model.openid.auth.RelyingParty1dot1Service._TYPE;

    /**
      * This service is provided by OpenID RelyingParties (version 2.0)
      */
    public static final EntityType RELYINGPARTY2DOT0SERVICE = org.infogrid.lid.model.openid.auth.RelyingParty2dot0Service._TYPE;

}
