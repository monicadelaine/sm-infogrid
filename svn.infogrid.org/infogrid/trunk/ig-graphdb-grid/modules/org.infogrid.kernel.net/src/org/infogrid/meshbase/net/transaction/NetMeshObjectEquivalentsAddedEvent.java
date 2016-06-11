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
// Copyright 1998-2011 by R-Objects Inc. dba NetMesh Inc., Johannes Ernst
// All rights reserved.
//

package org.infogrid.meshbase.net.transaction;

import org.infogrid.mesh.EquivalentAlreadyException;
import org.infogrid.mesh.net.NetMeshObject;
import org.infogrid.mesh.net.NetMeshObjectIdentifier;
import org.infogrid.mesh.net.NetMeshObjectUtils;
import org.infogrid.meshbase.net.NetMeshBase;
import org.infogrid.meshbase.net.NetMeshBaseIdentifier;
import org.infogrid.meshbase.net.proxy.Proxy;
import org.infogrid.meshbase.transaction.CannotApplyChangeException;
import org.infogrid.meshbase.transaction.MeshObjectEquivalentsAddedEvent;
import org.infogrid.meshbase.transaction.MeshObjectEquivalentsRemovedEvent;
import org.infogrid.meshbase.transaction.Transaction;
import org.infogrid.meshbase.transaction.TransactionException;
import org.infogrid.util.CreateWhenNeeded;
import org.infogrid.util.logging.Log;

/**
  * <p>This event indicates that a NetMeshObject has gained one or more new equivalent NetMeshObject.</p>
  */
public class NetMeshObjectEquivalentsAddedEvent
        extends
            MeshObjectEquivalentsAddedEvent
        implements
            NetMeshObjectEquivalentsChangeEvent
{
    private static final long serialVersionUID = 1L; // helps with serialization
    private static final Log  log              = Log.getLogInstance( NetMeshObjectEquivalentsAddedEvent.class ); // our own, private logger

    /**
     * Constructor.
     * 
     * @param source the NetMeshObject that is the source of the event
     * @param oldValues the old values of the equivalents, prior to the event
     * @param deltaValues the equivalents that changed
     * @param newValues the new value of the equivalents, after the event
     * @param originIdentifier identifier of the NetMeshBase from where this NetChange arrived, if any
     * @param timeEventOccurred the time at which the event occurred, in <code>System.currentTimeMillis</code> format
     */
    public NetMeshObjectEquivalentsAddedEvent(
            NetMeshObject         source,
            NetMeshObject []      oldValues,
            NetMeshObject []      deltaValues,
            NetMeshObject []      newValues,
            NetMeshBaseIdentifier originIdentifier,
            long                  timeEventOccurred )
    {
        this(   source,
                source.getIdentifier(),
                oldValues,
                NetMeshObjectUtils.netMeshObjectIdentifiers( oldValues ),
                deltaValues,
                NetMeshObjectUtils.netMeshObjectIdentifiers( deltaValues ),
                newValues,
                NetMeshObjectUtils.netMeshObjectIdentifiers( newValues ),
                originIdentifier,
                timeEventOccurred,
                source.getMeshBase() );
    }

    /**
     * Constructor.
     * 
     * @param source the NetMeshObject that is the source of the event
     * @param oldValues the old values of the equivalents, prior to the event
     * @param deltaValues the equivalents that changed
     * @param newValues the new value of the equivalents, after the event
     * @param originIdentifier identifier of the NetMeshBase from where this NetChange arrived, if any
     * @param timeEventOccurred the time at which the event occurred, in <code>System.currentTimeMillis</code> format
     */
    public NetMeshObjectEquivalentsAddedEvent(
            NetMeshObject              source,
            NetMeshObjectIdentifier [] oldValues,
            NetMeshObjectIdentifier [] deltaValues,
            NetMeshObjectIdentifier [] newValues,
            NetMeshBaseIdentifier      originIdentifier,
            long                       timeEventOccurred )
    {
        this(   source,
                source.getIdentifier(),
                null,
                oldValues,
                null,
                deltaValues,
                null,
                newValues,
                originIdentifier,
                timeEventOccurred,
                source.getMeshBase() );
    }

    /**
     * Constructor, for subtypes only.
     * 
     * @param source the NetMeshObject that is the source of the event
     * @param sourceIdentifier the identifier representing the source NetMeshObject of the event
     * @param oldValues the old values of the equivalents, prior to the event
     * @param oldValueIdentifiers the identifiers representing the old values of the equivalents, prior to the event
     * @param deltaValues the equivalents that changed
     * @param deltaValueIdentifiers the identifiers of the equivalents that changed
     * @param newValues the new value of the equivalents, after the event
     * @param newValueIdentifiers the identifiers representing the new values of the equivalents, after the event
     * @param originIdentifier identifier of the NetMeshBase from where this NetChange arrived, if any
     * @param timeEventOccurred the time at which the event occurred, in <code>System.currentTimeMillis</code> format
     * @param resolver the MeshBase against which the MeshObjectIdentifiers are currently resolved, if any
     */
    protected NetMeshObjectEquivalentsAddedEvent(
            NetMeshObject              source,
            NetMeshObjectIdentifier    sourceIdentifier,
            NetMeshObject []           oldValues,
            NetMeshObjectIdentifier [] oldValueIdentifiers,
            NetMeshObject []           deltaValues,
            NetMeshObjectIdentifier [] deltaValueIdentifiers,
            NetMeshObject []           newValues,
            NetMeshObjectIdentifier [] newValueIdentifiers,
            NetMeshBaseIdentifier      originIdentifier,
            long                       timeEventOccurred,
            NetMeshBase                resolver )
    {
        super(  source,
                sourceIdentifier,
                oldValues,
                oldValueIdentifiers,
                deltaValues,
                deltaValueIdentifiers,
                newValues,
                newValueIdentifiers,
                timeEventOccurred,
                resolver );

        theOriginNetworkIdentifier = originIdentifier;
    }
    
    /**
     * Obtain the MeshObject affected by this Change.
     *
     * @return obtain the MeshObject affected by this Change
     */
    @Override
    public NetMeshObject getAffectedMeshObject()
    {
        return (NetMeshObject) super.getAffectedMeshObject();
    }

    /**
     * Obtain the MeshObjectIdentifier of the MeshObject affected by this Change.
     *
     * @return the MeshObjectIdentifier of the NetMeshObject affected by this Change
     */
    @Override
    public NetMeshObjectIdentifier getAffectedMeshObjectIdentifier()
    {
        return (NetMeshObjectIdentifier) super.getAffectedMeshObjectIdentifier();
    }

    /**
     * <p>Create a Change that undoes this Change.</p>
     *
     * @return the inverse Change, or null if no inverse Change could be constructed.
     */
    @Override
    public NetMeshObjectEquivalentsRemovedEvent inverse()
    {
        return new NetMeshObjectEquivalentsRemovedEvent(
                (NetMeshObject) getSource(),
                (NetMeshObject []) getNewValue(),
                (NetMeshObject []) getDeltaValue(),
                (NetMeshObject []) getOldValue(),
                getOriginNetworkIdentifier(),
                getTimeEventOccurred() );
    }

    /**
     * <p>Apply this NetChange to a NetMeshObject in this MeshBase. This method
     *    is intended to make it easy to replicate NetChanges that were made to a
     *    replica of one NetMeshObject in one NetMeshBase to another replica
     *    of the NetMeshObject in another NetMeshBase.</p>
     *
     * <p>This method will attempt to create a Transaction if none is present on the
     * current Thread.</p>
     *
     * @param base the NetMeshBase in which to apply the NetChange
     * @param perhapsTx the Transaction to use, if any
     * @param incomingProxy the Proxy through which this NetChange was received
     * @return the NetMeshObject to which the NetChange was applied
     * @throws CannotApplyChangeException thrown if the NetChange could not be applied, e.g because
     *         the affected NetMeshObject did not exist in MeshBase base
     * @throws TransactionException thrown if a Transaction didn't exist on this Thread and
     *         could not be created
     */
    public NetMeshObject potentiallyApplyToReplicaIn(
            NetMeshBase                   base,
            CreateWhenNeeded<Transaction> perhapsTx,
            Proxy                         incomingProxy )
        throws
            CannotApplyChangeException,
            TransactionException
    {
        setResolver( base );

        try {
            NetMeshObject otherObject = (NetMeshObject) getSource();
            if( otherObject != null && incomingProxy == otherObject.getProxyTowardsLockReplica() ) {
                perhapsTx.obtain(); // can ignore return value

                NetMeshObject [] equivalents = (NetMeshObject []) getDeltaValue();

                // because we don't know which of the other MeshObjects are already equivalent, we simply try
                // all. Some will fail, in which case we ignore exceptions.
                for( NetMeshObject current : equivalents ) {
                    try {
                        otherObject.rippleAddAsEquivalent( current.getIdentifier(), getTimeEventOccurred() );

                    } catch( EquivalentAlreadyException ex ) {

                        if( log.isDebugEnabled()) {
                            log.debug( ex );
                        }
                    }
                }
            }
            return otherObject;

        } catch( TransactionException ex ) {
            throw ex;

        } catch( Throwable ex ) {
            throw new CannotApplyChangeException.ExceptionOccurred( base, ex );
        }
    }

    /**
     * Determine whether this NetChange should be forwarded through the given, outgoing Proxy.
     * If specified, {@link #getOriginNetworkIdentifier} specifies where the NetChange came from.
     *
     * @param outgoingProxy the potential outgoing Proxy
     * @return true if the NetChange should be forwarded torwards the outgoingProxy
     */
    public boolean shouldBeSent(
            Proxy outgoingProxy )
    {
        return Utils.hasReplicaInDirection( this, outgoingProxy, theOriginNetworkIdentifier );
    }

    /**
     * Obtain the NetMeshBaseIdentifier of the NetMeshBase from where this NetChange arrived.
     * This may or may not be the NetMeshBase where the Change originated, as it might be
     * passed through several NetMeshBases until it arrived here. This may be null if
     * the Change originated locally.
     *
     * @return the NetMeshBaseIdentifier, if any
     */
    public final NetMeshBaseIdentifier getOriginNetworkIdentifier()
    {
        return theOriginNetworkIdentifier;
    }

    /**
     * The NetMeshBaseIdentifier of the NetMeshBase from where this NetChange arrived.
     * This may or may not be the NetMeshBase where the Change originated, as it might be
     * passed through several NetMeshBases until it arrived here. This may be null if
     * the Change originated locally.
     */
    protected NetMeshBaseIdentifier theOriginNetworkIdentifier;
}
