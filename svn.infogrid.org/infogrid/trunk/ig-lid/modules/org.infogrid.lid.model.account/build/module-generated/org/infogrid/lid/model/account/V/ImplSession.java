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
// on Sun, 2016-02-21 12:50:40 -0600
//
// DO NOT MODIFY -- re-generate!

package org.infogrid.lid.model.account.V;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.lid.model.account.*;

/**
  * <p>Java implementation class for EntityType org.infogrid.lid.model.account/Session.</p>
  * <p>To instantiate, use the factory methods provided by the <code>MeshBase</code>'s
  * <code>MeshObjectLifecycleManager</code>.</p>
  * <p><b>Note:</b> As an application programmer, you must never rely on any characteristic of any
  * class that implements this interface, only on the characteristics provided by this interface
  * and its supertypes.</p>
  *
  * <table>
  *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.account/Session</tt></td></tr>
  *  <tr><td>Name:</td><td><tt>Session</tt></td></tr>
  *  <tr><td>IsAbstract:</td><td><code>false</code></td></tr>
  *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Session</td></tr></table></td></tr>
  *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>A session of a user at a website.</td></tr></table></td></tr>
  * </table>
  */

public class ImplSession
        extends
            org.infogrid.mesh.TypedMeshObjectFacadeImpl
        implements
            org.infogrid.lid.model.account.Session

{
    private static final org.infogrid.util.logging.Log log = org.infogrid.util.logging.Log.getLogInstance( ImplSession.class ); // our own, private logger

    /**
      * Constructor.
      *
      * @param delegate the underlying MeshObject
      */
    public ImplSession(
            MeshObject delegate )
    {
        super( delegate );
    }

    /**
      * Initializes the MeshObject to its default values.
      *
      * @param init the TypeInitializer
      * @param timeUpdated the timeUpdated to use
      * @throws org.infogrid.mesh.IllegalPropertyTypeException should not be thrown -- codegenerator faulty
      * @throws org.infogrid.mesh.IllegalPropertyValueException should not be thrown -- codegenerator faulty
      * @throws org.infogrid.mesh.NotPermittedException should not be thrown -- codegenerator faulty
      * @throws org.infogrid.meshbase.transaction.TransactionException should not be thrown -- codegenerator faulty
      * @throws org.infogrid.model.primitives.UnknownEnumeratedValueException should not be thrown -- codegenerator faulty
      */
    public static void initializeDefaultValues(
            TypeInitializer init,
            long            timeUpdated )
        throws
            org.infogrid.mesh.IllegalPropertyTypeException,
            org.infogrid.mesh.IllegalPropertyValueException,
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.model.primitives.UnknownEnumeratedValueException
    {
        init.setPropertyValues(
                new PropertyType[] {
                    FIRSTAUTHENTICATED,
                    LASTAUTHENTICATED,
                    VALIDUNTIL,
                },
                new PropertyValue[] {
                    TimeStampValue.now(),
                    TimeStampValue.now(),
                    TimeStampValue.now(),
                },
                timeUpdated );
    }

    /**
      * Set value for property FirstAuthenticated.
      *
      * @param newValue the new value for the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      * @throws org.infogrid.meshbase.transaction.TransactionException thrown if invoked outside proper transaction boundaries
      * @throws IllegalPropertyValueException thrown if the PropertyValue was invalid for this Property
      */
    public void setFirstAuthenticated(
            org.infogrid.model.primitives.TimeStampValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "setFirstAuthenticated", newValue );
        }

        try {
            the_Delegate.setPropertyValue( FIRSTAUTHENTICATED, newValue );

        } catch( IllegalPropertyValueException ex ) {
            log.error( ex );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
        }
    }

    /**
      * Obtain value for property FirstAuthenticated.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.TimeStampValue getFirstAuthenticated()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.TimeStampValue) the_Delegate.getPropertyValue( FIRSTAUTHENTICATED );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
      * Set value for property LastAuthenticated.
      *
      * @param newValue the new value for the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      * @throws org.infogrid.meshbase.transaction.TransactionException thrown if invoked outside proper transaction boundaries
      * @throws IllegalPropertyValueException thrown if the PropertyValue was invalid for this Property
      */
    public void setLastAuthenticated(
            org.infogrid.model.primitives.TimeStampValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "setLastAuthenticated", newValue );
        }

        try {
            the_Delegate.setPropertyValue( LASTAUTHENTICATED, newValue );

        } catch( IllegalPropertyValueException ex ) {
            log.error( ex );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
        }
    }

    /**
      * Obtain value for property LastAuthenticated.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.TimeStampValue getLastAuthenticated()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.TimeStampValue) the_Delegate.getPropertyValue( LASTAUTHENTICATED );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
      * Set value for property LastUsedSuccessfully.
      *
      * @param newValue the new value for the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      * @throws org.infogrid.meshbase.transaction.TransactionException thrown if invoked outside proper transaction boundaries
      */
    public void setLastUsedSuccessfully(
            org.infogrid.model.primitives.TimeStampValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "setLastUsedSuccessfully", newValue );
        }

        try {
            the_Delegate.setPropertyValue( LASTUSEDSUCCESSFULLY, newValue );

        } catch( IllegalPropertyValueException ex ) {
            log.error( ex );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
        }
    }

    /**
      * Obtain value for property LastUsedSuccessfully.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.TimeStampValue getLastUsedSuccessfully()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.TimeStampValue) the_Delegate.getPropertyValue( LASTUSEDSUCCESSFULLY );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
      * Set value for property ValidUntil.
      *
      * @param newValue the new value for the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      * @throws org.infogrid.meshbase.transaction.TransactionException thrown if invoked outside proper transaction boundaries
      * @throws IllegalPropertyValueException thrown if the PropertyValue was invalid for this Property
      */
    public void setValidUntil(
            org.infogrid.model.primitives.TimeStampValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "setValidUntil", newValue );
        }

        try {
            the_Delegate.setPropertyValue( VALIDUNTIL, newValue );

        } catch( IllegalPropertyValueException ex ) {
            log.error( ex );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
        }
    }

    /**
      * Obtain value for property ValidUntil.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.TimeStampValue getValidUntil()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.TimeStampValue) the_Delegate.getPropertyValue( VALIDUNTIL );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
      * Set value for property CreatedAtIp.
      *
      * @param newValue the new value for the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      * @throws org.infogrid.meshbase.transaction.TransactionException thrown if invoked outside proper transaction boundaries
      */
    public void setCreatedAtIp(
            org.infogrid.model.primitives.StringValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "setCreatedAtIp", newValue );
        }

        try {
            the_Delegate.setPropertyValue( CREATEDATIP, newValue );

        } catch( IllegalPropertyValueException ex ) {
            log.error( ex );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
        }
    }

    /**
      * Obtain value for property CreatedAtIp.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.StringValue getCreatedAtIp()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.StringValue) the_Delegate.getPropertyValue( CREATEDATIP );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

 // #### BEGIN IMPLEMENTED METHOD (INSERTED FROM model.xml FILE) ####

    /**
     * Obtain the client whose session it is.
     *
     * @return the client
     */
    public org.infogrid.util.HasIdentifier getSessionClient()
    {
        MeshObject found = traverse( AccountSubjectArea.SESSION_USESIDENTITY_MESHOBJECT.getSource() ).getSingleMember();
        return found;
    }

    /**
     * Obtain the Identifier of the site where the session takes place.
     *
     * @return the site Identifier
     */
    public org.infogrid.util.Identifier getSiteIdentifier()
    {
        MeshObject found = traverse(
                AccountSubjectArea.SESSION_ATSITE_MESHOBJECT.getSource() ).getSingleMember();
        if( found == null ) {
            return null;
        } else {
            return found.getIdentifier();
        }
    }

    /**
     * Obtain the LidAccount on whose behalf the session takes place.
     *
     * @return the LidAccount, if any
     */
    public Account getAccount()
    {
        try {
            MeshObject found = traverse( AccountSubjectArea.SESSION_FOR_ACCOUNT.getSource() ).getSingleMember();
            if( found != null ) {
                return (org.infogrid.lid.model.account.Account) found.getTypedFacadeFor( AccountSubjectArea.ACCOUNT );
            }
        } catch( NotBlessedException ex ) {
            log.error( ex );
        }
        return null;
    }

    /**
     * Obtain the time the LidSession was last authenticated with something stronger than a session cookie.
     *
     * @return the time the LidSession was last authenticated, in System.currentTimeMillis() format
     */
    public long getTimeLastAuthenticated()
    {
        try {
            TimeStampValue lastUsed = getLastAuthenticated();
            if( lastUsed == null ) {
                return -1L;
            }
            return lastUsed.getAsMillis();
        } catch( Throwable t ) {
            log.error( t );
            return -1L;
        }
    }

    /**
     * Obtain the time the LidSession was last used successfully.
     *
     * @return the time the LidSession was last used successfully, in System.currentTimeMillis() format
     */
    public long getTimeLastUsedSuccessfully()
    {
        try {
            TimeStampValue lastUsed = getLastUsedSuccessfully();
            if( lastUsed == null ) {
                return -1L;
            }
            return lastUsed.getAsMillis();
        } catch( Throwable t ) {
            log.error( t );
            return -1L;
        }
    }

    /**
     * Obtain the time when the LidSession will or has become invalid.
     *
     * @return the time the LidSession will or has become invalid, in System.currentTimeMillis() format
     */
    public long getTimeValidUntil()
    {
        try {
            TimeStampValue validUntil = getValidUntil();
            if( validUntil == null ) {
                return -1L;
            }
            return validUntil.getAsMillis();
        } catch( Throwable t ) {
            log.error( t );
            return -1L;
        }
    }

    /**
     * Obtain the session token.
     *
     * @return the session token
     */
    public String getSessionToken()
    {
        String ret = org.infogrid.lid.model.account.utils.MeshObjectIdentifierSessionTokenConverter.meshObjectIdentifierToToken(
                getIdentifier(),
                get_MeshBase().getIdentifier().toExternalForm() + "#" );

        return ret;
    }

    /**
     * Obtain the IP address of the client that created this session.
     *
     * @return the IP address
     */
    public String getCreationClientIp()
    {
        try {
            StringValue ip = getCreatedAtIp();
            if( ip != null ) {
                return ip.value();
            } else {
                return null;
            }
        } catch( Throwable t ) {
            log.error( t );
            return null;
        }
    }

    /**
     * Determine whether this token is still valid.
     *
     * @return true if it is still valid.
     */
    public boolean isStillValid()
    {
        try {
            TimeStampValue until = getValidUntil();
            if( until == null ) {
                return false;
            }
            return until.isInFuture();
        } catch( Throwable t ) {
            log.error( t );
            return false;
        }
    }

    /**
     * Notify the session that it was used successfully.
     */
    public void useSuccessfully()
    {
        try {
            setLastUsedSuccessfully( TimeStampValue.now() );
        } catch( Throwable t ) {
            log.error( t );
        }
    }

    /**
     * Renew the session.
     *
     * @param duration the duration, in milliseconds, from now
     */
    public void renew(
            final long duration )
    {
        get_MeshBase().executeNow( new org.infogrid.meshbase.transaction.TransactionAction<Void>() {
                public Void execute()
                    throws
                        Throwable
                {
                    setValidUntil( TimeStampValue.nowWithOffset( duration ));
                    return null;
                }
        } );
    }

    /**
     * Invalidate this session.
     */
    public void cancel()
    {
        get_MeshBase().executeNow( new org.infogrid.meshbase.transaction.TransactionAction<Void>() {
                public Void execute()
                    throws
                        Throwable
                {
                    setValidUntil( TimeStampValue.nowWithOffset( -1L ));
                    setTimeExpires( getValidUntil().getAsMillis() );
                    return null;
                }
        } );
    }

    /**
     * Obtain the key for that was used to create this object by the Factory.
     *
     * @return the key
     */
    public String getFactoryKey()
    {
        return getSessionToken();
    }

    /**
     * Enable a Factory to indicate to the FactoryCreatedObject that it was
     * it that created it.
     *
     * @param factory the Factory that created the FactoryCreatedObject
     */
    public void setFactory(
            org.infogrid.util.Factory<String,org.infogrid.lid.session.LidSession,org.infogrid.lid.session.LidSessionManagerArguments> factory )
    {
        throw new UnsupportedOperationException();
    }

    /**
     * Obtain the Factory that created this FactoryCreatedObject. In case of
     * chained factories that delegate to each other, this method is
     * supposed to return the outermost factory invoked by the application programmer.
     *
     * @return the Factory that created the FactoryCreatedObject
     */
    public org.infogrid.util.Factory<String,org.infogrid.lid.session.LidSession,org.infogrid.lid.session.LidSessionManagerArguments> getFactory()
    {
        throw new UnsupportedOperationException();
    }

    
 // #### END IMPLEMENTED METHOD (INSERTED FROM model.xml FILE) ####
}
