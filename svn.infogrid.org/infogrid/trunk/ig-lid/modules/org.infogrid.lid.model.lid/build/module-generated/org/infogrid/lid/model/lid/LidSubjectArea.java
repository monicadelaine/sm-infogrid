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
// DO NOT MODIFY -- re-generate!

package org.infogrid.lid.model.lid;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.modelbase.ModelBaseSingleton;

/**
  * <p>Collects the MeshTypes in this Subject Area for simpler access.</p>
  */
public abstract class LidSubjectArea
{
    /**
      * The SubjectArea itself.
      */
    public static final SubjectArea _SA = ModelBaseSingleton.findSubjectArea( "org.infogrid.lid.model.lid" );

    /**
      * A Yadis Service that is able to authenticate a principal. More specific subclasses\nare provided for specific authentication protocols.
      */
    public static final EntityType AUTHENTICATIONSERVICE = org.infogrid.lid.model.lid.AuthenticationService._TYPE;

    /**
      * An AuthenticationService that uses a standard web browser as the client device,\nand thus implements the redirect dance. More specific subclasses\nare provided for specific authentication protocols.
      */
    public static final EntityType WEBAUTHENTICATIONSERVICE = org.infogrid.lid.model.lid.WebAuthenticationService._TYPE;

    /**
      * This represents a LID GPG-based Authentication Service in any version.
      */
    public static final EntityType LIDGPGSSO = org.infogrid.lid.model.lid.LidGpgSso._TYPE;

    /**
      * An Authentication Service based on the LID GPG SSO service, version 2.
      */
    public static final EntityType LIDGPGSSO2 = org.infogrid.lid.model.lid.LidGpgSso2._TYPE;

    public static final EntityType MINIMUMLID2 = org.infogrid.lid.model.lid.MinimumLid2._TYPE;

    /**
      * A Yadis Service that is able to accept authentication assertions. More specific subclasses\nare provided for specific protocols.
      */
    public static final EntityType RELYINGPARTYSERVICE = org.infogrid.lid.model.lid.RelyingPartyService._TYPE;

    /**
      * This represents a LID GPG-based Relying Party Service in any version.
      */
    public static final EntityType LIDGPGRELYINGPARTY = org.infogrid.lid.model.lid.LidGpgRelyingParty._TYPE;

    /**
      * A LID GPG-based Relying Party Service based on the LID GPG SSO service, version 2.
      */
    public static final EntityType LIDGPGRELYINGPARTY2 = org.infogrid.lid.model.lid.LidGpgRelyingParty2._TYPE;

}
