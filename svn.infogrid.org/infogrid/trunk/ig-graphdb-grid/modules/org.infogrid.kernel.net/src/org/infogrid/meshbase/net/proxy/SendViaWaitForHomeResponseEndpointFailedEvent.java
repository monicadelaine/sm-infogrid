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
// Copyright 1998-2008 by R-Objects Inc. dba NetMesh Inc., Johannes Ernst
// All rights reserved.
//

package org.infogrid.meshbase.net.proxy;

import org.infogrid.meshbase.net.xpriso.XprisoMessage;

/**
 * Indicates that an attempt to send a message via the WaitForHomeResponseEndpoint
 * failed.
 */
public class SendViaWaitForHomeResponseEndpointFailedEvent
        extends
            SendFailedEvent
{
    private static final long serialVersionUID = 1L; // helps with serialization

    /**
     * Constructor.
     * 
     * @param sender the sending Proxy
     * @param message the XprisoMessage that could not be sent
     * @param cause the underlying cause for the vent
     */
    protected SendViaWaitForHomeResponseEndpointFailedEvent(
            Proxy         sender,
            XprisoMessage message,
            Throwable     cause )
    {
        super( sender, message, cause );
    }
}
