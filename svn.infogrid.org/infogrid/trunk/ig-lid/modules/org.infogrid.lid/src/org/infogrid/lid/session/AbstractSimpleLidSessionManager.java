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
// Copyright 1998-2012 by R-Objects Inc. dba NetMesh Inc., Johannes Ernst
// All rights reserved.
//

package org.infogrid.lid.session;

import org.infogrid.lid.account.LidAccount;
import org.infogrid.lid.account.LidAccountManager;
import org.infogrid.util.AbstractFactory;
import org.infogrid.util.CachingMap;
import org.infogrid.util.Factory;
import org.infogrid.util.MSmartFactory;
import org.infogrid.util.ResourceHelper;
import org.infogrid.util.UniqueStringGenerator;

/**
 * Factors out common behaviors of LidSessionManagers.
 */
public abstract class AbstractSimpleLidSessionManager
        extends
            MSmartFactory<String,LidSession,LidSessionManagerArguments>
        implements
            LidSessionManager
{
    /**
     * Constructor for subclasses only, use factory method.
     * 
     * @param delegateFactory the underlying factory for LidSessions
     * @param storage the storage to use
     * @param accountManager the LidAccountManager to find any LidAccount referenced in a LidSession
     * @param sessionDuration the duration of new or renewed sessions in milli-seconds
     */
    protected AbstractSimpleLidSessionManager(
            Factory<String,LidSession,LidSessionManagerArguments> delegateFactory,
            CachingMap<String,LidSession>                         storage,
            LidAccountManager                                     accountManager,
            long                                                  sessionDuration )
    {
        super( delegateFactory, storage );

        theAccountManager  = accountManager;
        theSessionDuration = sessionDuration;
    }
    
    /**
     * Generate a new session token.
     *
     * @return the new session token
     */
    public String createNewSessionToken()
    {
        String ret = theTokenGenerator.createUniqueToken();
        return ret;
    }

    /**
     * Obtain the default session duration for newly created or renewed sessions.
     * 
     * @return the default session duration, in milliseconds
     */
    public long getDefaultSessionDuration()
    {
        return theSessionDuration;
    }


    /**
     * The LidAccountManager to find any LidAccount referenced in a LidSession.
     */
    protected LidAccountManager theAccountManager;

    /**
     * The session duration, in milliseconds.
     */
    protected long theSessionDuration;

    /**
     * Our ResourceHelper.
     */
    private static final ResourceHelper theResourceHelper = ResourceHelper.getInstance( AbstractSimpleLidSessionManager.class );

    /**
     * The length of the session token.
     */
    protected static final int SESSION_TOKEN_LENGTH = theResourceHelper.getResourceIntegerOrDefault(
            "SessionTokenLength",
            64 );

    /**
     * Generates our session tokens.
     */
    protected static UniqueStringGenerator theTokenGenerator = UniqueStringGenerator.create( SESSION_TOKEN_LENGTH );

    /**
     * The delegate factory. This is factored out, so it can access the session duration.
     * It needs to be a static class as the LidSessionManager is only instantiated after this
     * class is.
     */
    protected static class SimpleLidSessionDelegateFactory
            extends
                AbstractFactory<String,LidSession,LidSessionManagerArguments>
    {
        /**
         * Constructor.
         */
        public SimpleLidSessionDelegateFactory()
        {
            // nothing
        }

        /**
         * Factory method.
         * 
         * @param key the key information required for object creation, if any
         * @param argument any argument-style information required for object creation, if any
         * @return the new LidSession
         */
        public SimpleLidSession obtainFor(
                String                     key,
                LidSessionManagerArguments argument )
        {
            long timeCreated       = System.currentTimeMillis();
            long timeUpdated       = timeCreated;
            long timeRead          = timeCreated;
            long timeExpires       = timeCreated + theSessionManager.getDefaultSessionDuration();
            long timeAuthenticated = timeCreated;
            long timeLastUsed      = timeCreated;
            long timeValidUntil    = timeExpires;

            LidAccount    account = null;
            LidAccount [] candidateAccounts
                    = theSessionManager.theAccountManager.determineLidAccountsFromRemotePersona(
                            argument.getClient(),
                            argument.getSiteIdentifier() );
            
            if( candidateAccounts != null ) {
                for( int i=0 ; i<candidateAccounts.length ; ++i ) {
                    if( argument.getAccount().isIdentifiedBy( candidateAccounts[i].getIdentifier() )) {
                        account = candidateAccounts[i];
                        break;
                    }
                }
            }

            SimpleLidSession ret = SimpleLidSession.create(
                    key,
                    argument.getClient(),
                    argument.getSiteIdentifier(),
                    account,
                    timeCreated,
                    timeUpdated,
                    timeRead,
                    timeExpires,
                    timeAuthenticated,
                    timeLastUsed,
                    timeValidUntil,
                    argument.getClientIp() );

            return ret;
        }

        /**
         * Let the LidSessionManager set itself.
         * 
         * @param mgr the LidSessionManager
         */
        public void setLidSessionManager(
                AbstractSimpleLidSessionManager mgr )
        {
            theSessionManager = mgr;
        }

        /**
         * The LidSessionManager that this instance belongs to.
         */
        protected AbstractSimpleLidSessionManager theSessionManager;
    }
}

