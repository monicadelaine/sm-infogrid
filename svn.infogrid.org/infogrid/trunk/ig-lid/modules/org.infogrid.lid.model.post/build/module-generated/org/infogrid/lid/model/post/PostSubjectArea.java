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
// on Sun, 2016-02-21 12:50:59 -0600
//
// DO NOT MODIFY -- re-generate!

package org.infogrid.lid.model.post;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.modelbase.ModelBaseSingleton;

/**
  * <p>Collects the MeshTypes in this Subject Area for simpler access.</p>
  */
public abstract class PostSubjectArea
{
    /**
      * The SubjectArea itself.
      */
    public static final SubjectArea _SA = ModelBaseSingleton.findSubjectArea( "org.infogrid.lid.model.post" );

    /**
      * A Yadis Service to send messages from one place to another.
      */
    public static final EntityType POSTSENDER = org.infogrid.lid.model.post.PostSender._TYPE;

    /**
      * A Yadis Service to receive messages from another place.
      */
    public static final EntityType POSTRECEIVER = org.infogrid.lid.model.post.PostReceiver._TYPE;

}
