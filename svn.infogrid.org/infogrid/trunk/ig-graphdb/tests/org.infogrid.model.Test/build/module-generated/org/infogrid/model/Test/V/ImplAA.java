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
// on Sun, 2016-02-21 12:49:29 -0600
//
// DO NOT MODIFY -- re-generate!

package org.infogrid.model.Test.V;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.model.Test.*;

/**
  * <p>Java implementation class for EntityType org.infogrid.model.Test/AA.</p>
  * <p>To instantiate, use the factory methods provided by the <code>MeshBase</code>'s
  * <code>MeshObjectLifecycleManager</code>.</p>
  * <p><b>Note:</b> As an application programmer, you must never rely on any characteristic of any
  * class that implements this interface, only on the characteristics provided by this interface
  * and its supertypes.</p>
  *
  * <table>
  *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/AA</tt></td></tr>
  *  <tr><td>Name:</td><td><tt>AA</tt></td></tr>
  *  <tr><td>IsAbstract:</td><td><code>false</code></td></tr>
  *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>The AA EntityType</td></tr></table></td></tr>
  *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>This EntityType is a test EntityType.</td></tr></table></td></tr>
  * </table>
  */

public class ImplAA
        extends
            org.infogrid.mesh.TypedMeshObjectFacadeImpl
        implements
            org.infogrid.model.Test.AA

{
    private static final org.infogrid.util.logging.Log log = org.infogrid.util.logging.Log.getLogInstance( ImplAA.class ); // our own, private logger

    /**
      * Constructor.
      *
      * @param delegate the underlying MeshObject
      */
    public ImplAA(
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
                    Y,
                    READONLY,
                },
                new PropertyValue[] {
                    org.infogrid.model.primitives.FloatValue.create( 12.34 ),
                    org.infogrid.model.primitives.BooleanValue.TRUE,
                },
                timeUpdated );
    }

    /**
      * Set value for property Y.
      *
      * @param newValue the new value for the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      * @throws org.infogrid.meshbase.transaction.TransactionException thrown if invoked outside proper transaction boundaries
      */
    public void setY(
            org.infogrid.model.primitives.FloatValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "setY", newValue );
        }

        try {
            the_Delegate.setPropertyValue( Y, newValue );

        } catch( IllegalPropertyValueException ex ) {
            log.error( ex );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
        }
    }

    /**
      * Obtain value for property Y.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.FloatValue getY()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.FloatValue) the_Delegate.getPropertyValue( Y );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
      * Set value for property X.
      *
      * @param newValue the new value for the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      * @throws org.infogrid.meshbase.transaction.TransactionException thrown if invoked outside proper transaction boundaries
      */
    public void setX(
            org.infogrid.model.primitives.StringValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "setX", newValue );
        }

        try {
            the_Delegate.setPropertyValue( X, newValue );

        } catch( IllegalPropertyValueException ex ) {
            log.error( ex );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
        }
    }

    /**
      * Obtain value for property X.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.StringValue getX()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.StringValue) the_Delegate.getPropertyValue( X );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
      * Set value for property XX.
      *
      * @param newValue the new value for the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      * @throws org.infogrid.meshbase.transaction.TransactionException thrown if invoked outside proper transaction boundaries
      * @throws IllegalPropertyValueException thrown if the PropertyValue was invalid for this Property
      */
    public void setXX(
            org.infogrid.model.primitives.BlobValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "setXX", newValue );
        }

        try {
            the_Delegate.setPropertyValue( XX, newValue );

        } catch( IllegalPropertyValueException ex ) {
            log.error( ex );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
        }
    }

    /**
      * Obtain value for property XX.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.BlobValue getXX()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.BlobValue) the_Delegate.getPropertyValue( XX );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
      * Obtain value for property ReadOnly.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.BooleanValue getReadOnly()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.BooleanValue) the_Delegate.getPropertyValue( READONLY );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

}
