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
// on Sun, 2016-02-21 12:50:37 -0600
//
// DO NOT MODIFY -- re-generate!

package org.infogrid.lid.model.xrd.V;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.lid.model.xrd.*;

/**
  * <p>Java implementation class for EntityType org.infogrid.lid.model.xrd/Xrd.</p>
  * <p>To instantiate, use the factory methods provided by the <code>MeshBase</code>'s
  * <code>MeshObjectLifecycleManager</code>.</p>
  * <p><b>Note:</b> As an application programmer, you must never rely on any characteristic of any
  * class that implements this interface, only on the characteristics provided by this interface
  * and its supertypes.</p>
  *
  * <table>
  *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.xrd/Xrd</tt></td></tr>
  *  <tr><td>Name:</td><td><tt>Xrd</tt></td></tr>
  *  <tr><td>IsAbstract:</td><td><code>false</code></td></tr>
  *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>XRD</td></tr></table></td></tr>
  *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>Meta-data about a resource on the web.</td></tr></table></td></tr>
  * </table>
  */

public class ImplXrd
        extends
            org.infogrid.mesh.TypedMeshObjectFacadeImpl
        implements
            org.infogrid.lid.model.xrd.Xrd

{
    private static final org.infogrid.util.logging.Log log = org.infogrid.util.logging.Log.getLogInstance( ImplXrd.class ); // our own, private logger

    /**
      * Constructor.
      *
      * @param delegate the underlying MeshObject
      */
    public ImplXrd(
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
                    HTTPSTATUSCODE,
                },
                new PropertyValue[] {
                    org.infogrid.model.primitives.IntegerValue.create( 200L ),
                },
                timeUpdated );
    }

    /**
      * Set value for property Id.
      *
      * @param newValue the new value for the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      * @throws org.infogrid.meshbase.transaction.TransactionException thrown if invoked outside proper transaction boundaries
      */
    public void setId(
            org.infogrid.model.primitives.StringValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "setId", newValue );
        }

        try {
            the_Delegate.setPropertyValue( ID, newValue );

        } catch( IllegalPropertyValueException ex ) {
            log.error( ex );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
        }
    }

    /**
      * Obtain value for property Id.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.StringValue getId()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.StringValue) the_Delegate.getPropertyValue( ID );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
      * Set value for property Expires.
      *
      * @param newValue the new value for the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      * @throws org.infogrid.meshbase.transaction.TransactionException thrown if invoked outside proper transaction boundaries
      */
    public void setExpires(
            org.infogrid.model.primitives.TimeStampValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "setExpires", newValue );
        }

        try {
            the_Delegate.setPropertyValue( EXPIRES, newValue );

        } catch( IllegalPropertyValueException ex ) {
            log.error( ex );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
        }
    }

    /**
      * Obtain value for property Expires.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.TimeStampValue getExpires()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.TimeStampValue) the_Delegate.getPropertyValue( EXPIRES );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
      * Set value for property HttpStatusCode.
      *
      * @param newValue the new value for the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      * @throws org.infogrid.meshbase.transaction.TransactionException thrown if invoked outside proper transaction boundaries
      * @throws IllegalPropertyValueException thrown if the PropertyValue was invalid for this Property
      */
    public void setHttpStatusCode(
            org.infogrid.model.primitives.IntegerValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "setHttpStatusCode", newValue );
        }

        try {
            the_Delegate.setPropertyValue( HTTPSTATUSCODE, newValue );

        } catch( IllegalPropertyValueException ex ) {
            log.error( ex );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
        }
    }

    /**
      * Obtain value for property HttpStatusCode.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.IntegerValue getHttpStatusCode()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.IntegerValue) the_Delegate.getPropertyValue( HTTPSTATUSCODE );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
      * Set value for property HttpHeaderLocation.
      *
      * @param newValue the new value for the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      * @throws org.infogrid.meshbase.transaction.TransactionException thrown if invoked outside proper transaction boundaries
      */
    public void setHttpHeaderLocation(
            org.infogrid.model.primitives.StringValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "setHttpHeaderLocation", newValue );
        }

        try {
            the_Delegate.setPropertyValue( HTTPHEADERLOCATION, newValue );

        } catch( IllegalPropertyValueException ex ) {
            log.error( ex );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
        }
    }

    /**
      * Obtain value for property HttpHeaderLocation.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.StringValue getHttpHeaderLocation()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.StringValue) the_Delegate.getPropertyValue( HTTPHEADERLOCATION );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

}
