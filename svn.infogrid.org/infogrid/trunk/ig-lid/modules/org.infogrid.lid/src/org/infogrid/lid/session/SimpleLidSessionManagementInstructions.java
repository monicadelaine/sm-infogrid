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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import org.infogrid.lid.LidClientAuthenticationStatus;
import org.infogrid.lid.account.LidAccount;
import org.infogrid.lid.credential.LidCredentialType;
import org.infogrid.util.ArrayHelper;
import org.infogrid.util.FactoryException;
import org.infogrid.util.HasIdentifier;
import org.infogrid.util.Identifier;
import org.infogrid.util.http.HTTP;
import org.infogrid.util.http.OutgoingSaneCookie;
import org.infogrid.util.http.OutgoingSimpleSaneCookie;
import org.infogrid.util.http.SaneRequest;
import org.infogrid.util.logging.Log;

/**
 * Simple implementation of LidSessionManagementInstructions.
 */
public class SimpleLidSessionManagementInstructions
        implements
            LidSessionManagementInstructions
{
    private static final Log log = Log.getLogInstance( SimpleLidSessionManagementInstructions.class ); // our own, private logger

    /**
     * Factory method if a new session shall be created.
     *
     * @param clientAuthenticationStatus the current client's authentication status
     * @param sessionsToCancel all sessions to cancel
     * @param sessionToRenew all sessions to renew
     * @param clientForNewSession the client for which a new session shall be created
     * @param siteIdentifierForNewSession Identifier of the site for which a new session shall be created
     * @param account the account for which the new session shall be created
     * @param tokenForNewSession token for the new session
     * @param durationForNewSession duration for the new session, in milliseconds
     * @param sessionManager the LidSessionManager to use
     * @return the created SimpleLidSessionManagementInstructions
     */
    public static SimpleLidSessionManagementInstructions create(
            LidClientAuthenticationStatus clientAuthenticationStatus,
            LidSession []                 sessionsToCancel,
            LidSession []                 sessionToRenew,
            HasIdentifier                 clientForNewSession,
            Identifier                    siteIdentifierForNewSession,
            LidAccount                    account,
            String                        tokenForNewSession,
            long                          durationForNewSession,
            LidSessionManager             sessionManager )
    {
        return new SimpleLidSessionManagementInstructions(
                clientAuthenticationStatus,
                sessionsToCancel,
                sessionToRenew,
                clientForNewSession,
                siteIdentifierForNewSession,
                account,
                tokenForNewSession,
                durationForNewSession,
                sessionManager );
    }

    /**
     * Factory method if no new session shall be created.
     *
     * @param clientAuthenticationStatus the current client's authentication status
     * @param sessionsToCancel all sessions to cancel
     * @param sessionToRenew all sessions to renew
     * @param sessionManager the LidSessionManager to use
     * @return the created SimpleLidSessionManagementInstructions
     */
    public static SimpleLidSessionManagementInstructions create(
            LidClientAuthenticationStatus clientAuthenticationStatus,
            LidSession []                 sessionsToCancel,
            LidSession []                 sessionToRenew,
            LidSessionManager             sessionManager )
    {
        return new SimpleLidSessionManagementInstructions(
                clientAuthenticationStatus,
                sessionsToCancel,
                sessionToRenew,
                null,
                null,
                null,
                null,
                -1L,
                sessionManager );
    }

    /**
     * Constructor for subclasses only, use factory method.
     *
     * @param clientAuthenticationStatus the current client's authentication status
     * @param sessionsToCancel all sessions to cancel
     * @param sessionToRenew all sessions to renew
     * @param clientForNewSession the client for which a new session shall be created
     * @param siteIdentifierForNewSession Identifier of the site for which a new session shall be created
     * @param account the account for which the new session shall be created
     * @param tokenForNewSession token for the new session
     * @param durationForNewSession duration for the new session, in milliseconds
     * @param sessionManager the LidSessionManager to use
     */
    protected SimpleLidSessionManagementInstructions(
            LidClientAuthenticationStatus clientAuthenticationStatus,
            LidSession []                 sessionsToCancel,
            LidSession []                 sessionToRenew,
            HasIdentifier                 clientForNewSession,
            Identifier                    siteIdentifierForNewSession,
            LidAccount                    account,
            String                        tokenForNewSession,
            long                          durationForNewSession,
            LidSessionManager             sessionManager )
    {
        theClientAuthenticationStatus = clientAuthenticationStatus;

        theSessionsToCancel = sessionsToCancel;
        theSessionsToRenew  = sessionToRenew;

        theClientForNewSession         = clientForNewSession;
        theSiteIdentifierForNewSession = siteIdentifierForNewSession;
        theAccount                     = account;

        theTokenForNewSession    = tokenForNewSession;
        theDurationForNewSession = durationForNewSession;

        theSessionManager = sessionManager;
    }

    /**
     * Obtain the content to be returned.
     *
     * @return the content
     */
    public String getContent()
    {
        return null;
    }

    /**
     * Obtain the content type to be returned.
     *
     * @return the content type
     */
    public String getContentType()
    {
        return null;
    }

    /**
     * Obtain the current client's authentication status.
     *
     * @return the current client's authentication status
     */
    public LidClientAuthenticationStatus getClientAuthenticationStatus()
    {
        return theClientAuthenticationStatus;
    }

    /**
     * Obtain the LidSessions to cancel, if any.
     *
     * @return the LidSessions to cancel, if any
     */
    public LidSession [] getSessionsToCancel()
    {
        return theSessionsToCancel;
    }

    /**
     * Obtain the LidSessions to renew, if any.
     *
     * @return the LidSessions to renew, if any
     */
    public LidSession [] getSessionsToRenew()
    {
        return theSessionsToRenew;
    }

    /**
     * Obtain the client for which a new session shall be created, if any.
     *
     * @return the client
     */
    public HasIdentifier getClientForNewSession()
    {
        return theClientForNewSession;
    }

    /**
     * Obtain the Identifier of the site for which a new session shall be created, if any.
     *
     * @return the site Identifier
     */
    public Identifier getSiteIdentifierForNewSession()
    {
        return theSiteIdentifierForNewSession;
    }

    /**
     * Obtain the account for which a new session shall be created, if any.
     * 
     * @return the account
     */
    public LidAccount getAccountForNewSession()
    {
        return theAccount;
    }

    /**
     * Obtain the initial token for the to-be-created new session, if any.
     *
     * @return the initial token
     */
    public String getTokenForNewSession()
    {
        return theTokenForNewSession;
    }

    /**
     * Obtain the duration, in milliseconds, for the to-be-created new session, if any.
     *
     * @return the duration, or -1L
     */
    public long getDurationOfNewSession()
    {
        return theDurationForNewSession;
    }

    /**
     * Add a cookie to be removed.
     *
     * @param name name of the cookie
     * @param domain domain of the cookie, if any
     * @param path path of the cookie, if any
     */
    public void addCookieToRemove(
            String name,
            String domain,
            String path )
    {
        if( theCookiesToRemove == null ) {
            theCookiesToRemove = new ArrayList<OutgoingSimpleSaneCookie>();
        }
        if( domain != null && domain.isEmpty() ) {
            domain = null; // don't want to send an empty domain, it confuses IE
        }
        theCookiesToRemove.add(
                OutgoingSimpleSaneCookie.create( name, "", domain, path, LONG_TIME_AGO ));
    }

    /**
     * Obtain the cookies that shall be removed.
     *
     * @return the cookies, if any
     */
    public OutgoingSaneCookie [] getCookiesToRemove()
    {
        if( theCookiesToRemove == null ) {
            return new OutgoingSaneCookie[0];
        } else {
            return ArrayHelper.copyIntoNewArray( theCookiesToRemove, OutgoingSaneCookie.class );
        }
    }

    /**
     * Add a cookie to set.
     *
     * @param name name of the cookie
     * @param value value of the cookie
     * @param domain domain of the cookie, if any
     * @param path path of the cookie, if any
     * @param expiresInSeconds number of seconds until the cookie expires. If negative, it means session cookie.
     */
    public void addCookieToSet(
            String name,
            String value,
            String domain,
            String path,
            int    expiresInSeconds )
    {
        if( theCookiesToSet == null ) {
            theCookiesToSet = new ArrayList<OutgoingSimpleSaneCookie>();
        }
        if( domain != null && domain.isEmpty() ) {
            domain = null; // don't want to send an empty domain, it confuses IE
        }

        Date expires;
        if( expiresInSeconds < 0 ) {
            expires = null;
        } else {
            expires = new Date( System.currentTimeMillis() + 1000L * expiresInSeconds );
        }
        theCookiesToSet.add(
                OutgoingSimpleSaneCookie.create( name, value, domain, path, expires ));
    }

    /**
     * Obtain the cookies that shall be set.
     *
     * @return the cookies, if any
     */
    public OutgoingSaneCookie [] getCookiesToSet()
    {
        if( theCookiesToSet == null ) {
            return new OutgoingSaneCookie[0];
        } else {
            return ArrayHelper.copyIntoNewArray( theCookiesToSet, OutgoingSaneCookie.class );
        }
    }

    /**
     * Apply all instructions as recommended.
     *
     * @param request the incoming request
     * @param response the outgoing response
     * @return true if no further action needs to be taken by the pipeline
     */
    public boolean applyAsRecommended(
            SaneRequest         request,
            HttpServletResponse response )
    {
        if( log.isDebugEnabled() ) {
            log.debug( "SimpleLidSessionManagementInstructions.applyAsRecommended: ", this );
        }
        if( theSessionsToCancel != null ) {
            for( LidSession current : theSessionsToCancel ) {
                current.cancel();
            }
        }
        if( theSessionsToRenew != null ) {
            for( LidSession current : theSessionsToRenew ) {
                current.renew( theSessionManager.getDefaultSessionDuration() );
            }
        }

        LidSession newSession; // out here for debugging
        if( theClientForNewSession != null ) {
            try {
                newSession = theSessionManager.obtainFor(
                        theTokenForNewSession,
                        LidSessionManagerArguments.create(
                                theSessionManager.getDefaultSessionDuration(),
                                theClientForNewSession,
                                theSiteIdentifierForNewSession,
                                theAccount,
                                request.getClientIp() ));

            } catch( FactoryException ex ) {
                log.error( ex );
            }
        }

        if( theCookiesToRemove != null ) {
            for( OutgoingSimpleSaneCookie current : theCookiesToRemove ) {
                Cookie toAdd = new Cookie( HTTP.encodeCookieName( current.getName()), current.getValue() );
                if( current.getDomain() != null ) {
                    toAdd.setDomain( current.getDomain() );
                }
                if( current.getPath() != null ) {
                    toAdd.setPath( current.getPath() );
                }
                toAdd.setMaxAge( 0 ); // delete

                response.addCookie( toAdd );
            }
        }
        if( theCookiesToSet != null ) {
            for( OutgoingSimpleSaneCookie current : theCookiesToSet ) {
                // if we set a JEE cookie, funny string escape problems occur. For example, if the cookie
                // value is not quoted and contains a :, Java thinks it is a HTTP header separator and
                // ignores the rest of the value. If it is quoted, something in the output logic double-quotes
                // the trailing quote, but not the leading quote. So we do it ourselves.

                String headerLine = current.getAsHttpValue();
                int    colon      = headerLine.indexOf( ":" );

                if( colon > 0 ) {
                    String name  = headerLine.substring( 0, colon ).trim();
                    String value = headerLine.substring( colon+1 ).trim();

                    response.addHeader( name, value );
                } else {
                    log.error( "No colon found in ", headerLine );
                }
            }
        }
        return false;
    }

    /**
     * Convert to String format, for debugging.
     *
     * @return String format
     */
    @Override
    public String toString()
    {
        StringBuilder buf = new StringBuilder();
        buf.append( getClass().getName() );
        buf.append( "{" );
        if( theClientAuthenticationStatus != null ) {
            buf.append( "\n    clientAuthenticationStatus: " );
            buf.append( "\n        clientLoggedOn: "       ).append( theClientAuthenticationStatus.clientLoggedOn() );
            buf.append( "\n        clientWishesToCancel: " ).append( theClientAuthenticationStatus.clientWishesToCancelSession() );
            buf.append( "\n        clientWishesToLogout: " ).append( theClientAuthenticationStatus.clientWishesToLogout() );
            // buf.append( "\n        clientLoggedOn: " ).append( theClientAuthenticationStatus.getAuthenticationServices() );
            if( theClientAuthenticationStatus.getCarriedInvalidCredentialTypes() != null ) {
                for( LidCredentialType current : theClientAuthenticationStatus.getCarriedInvalidCredentialTypes() ) {
                    buf.append( "\n        invalid credential: " ).append( current );
                }
            }
            if( theClientAuthenticationStatus.getCarriedValidCredentialTypes() != null ) {
                for( LidCredentialType current : theClientAuthenticationStatus.getCarriedValidCredentialTypes() ) {
                    buf.append( "\n        valid credential: " ).append( current );
                }
            }
            buf.append( "\n        clientIdentifier: " ).append( theClientAuthenticationStatus.getClientIdentifier() );
            buf.append( "\n        clientAccounts: "   ).append( theClientAuthenticationStatus.getClientAccounts() );
            // theClientAuthenticationStatus.getInvalidCredentialExceptions();
            buf.append( "\n        preexistingClientSession: " ).append( theClientAuthenticationStatus.getPreexistingClientSession() );
            if( theClientAuthenticationStatus.getSiteIdentifier() != null ) {
                buf.append( "\n        siteIdentifier: " ).append( theClientAuthenticationStatus.getSiteIdentifier().toExternalForm() );
            }
        }
        if( theSessionsToCancel != null ) {
            for( int i=0 ; i<theSessionsToCancel.length ; ++i ) {
                buf.append( "\n    session to cancel: " );
                buf.append( theSessionsToCancel[i] );
            }
        }
        if( theSessionsToRenew != null ) {
            for( int i=0 ; i<theSessionsToRenew.length ; ++i ) {
                buf.append( "\n    session to renew: " );
                buf.append( theSessionsToRenew[i] );
            }
        }
        if( theClientForNewSession != null ) {
            buf.append( "\n    clientForNewSession: " );
            buf.append( theClientForNewSession );
        }
        if( theSiteIdentifierForNewSession != null ) {
            buf.append( "\n    siteIdentifierForNewSession: " );
            buf.append( theSiteIdentifierForNewSession.toExternalForm() );
        }
        if( theTokenForNewSession != null ) {
            buf.append( "\n    tokenForNewSession: " );
            buf.append( theTokenForNewSession );
        }
        if( theDurationForNewSession > 0 ) {
            buf.append( "\n    durationForNewSession: " );
            buf.append( theDurationForNewSession );
        }
        if( theCookiesToRemove != null ) {
            for( OutgoingSimpleSaneCookie current : theCookiesToRemove ) {
                buf.append( "\n    cookie to remove: " );
                buf.append( current.getAsHttpValue() );
            }
        }
        if( theCookiesToSet != null ) {
            for( OutgoingSimpleSaneCookie current : theCookiesToSet ) {
                buf.append( "\n    cookie to add: " );
                buf.append( current.getAsHttpValue() );
            }
        }
        buf.append( "\n}" );
        return buf.toString();
    }

    /**
     * The LidSessionManager to use.
     */
    protected LidSessionManager theSessionManager;

    /**
     * The current client's authentication status.
     */
    protected LidClientAuthenticationStatus theClientAuthenticationStatus;

    /**
     * All sessions to cancel.
     */
    protected LidSession [] theSessionsToCancel;

    /**
     * All sessions to renew.
     */
    protected LidSession [] theSessionsToRenew;

    /**
     * The client for which a new session shall be created.
     */
    protected HasIdentifier theClientForNewSession;

    /**
     * Identifier of the site for which a new session shall be created.
     */
    protected Identifier theSiteIdentifierForNewSession;

    /**
     * The account for which a new session shall be created.
     */
    protected LidAccount theAccount;
    
    /**
     * Token for the new session.
     */
    protected String theTokenForNewSession;

    /**
     * Duration of the new session.
     */
    protected long theDurationForNewSession;

    /**
     * Cookies to remove.
     */
    protected List<OutgoingSimpleSaneCookie> theCookiesToRemove;

    /**
     * Cookies to set.
     */
    protected List<OutgoingSimpleSaneCookie> theCookiesToSet;

    /**
     * Defines "long time ago".
     */
    protected static final Date LONG_TIME_AGO = new Date( 0L );
}
