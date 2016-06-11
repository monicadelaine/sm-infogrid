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

package org.infogrid.lid.model.lid.V;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.lid.model.lid.*;

/**
  * <p>Java implementation class for EntityType org.infogrid.lid.model.lid/LidGpgSso2.</p>
  * <p>To instantiate, use the factory methods provided by the <code>MeshBase</code>'s
  * <code>MeshObjectLifecycleManager</code>.</p>
  * <p><b>Note:</b> As an application programmer, you must never rely on any characteristic of any
  * class that implements this interface, only on the characteristics provided by this interface
  * and its supertypes.</p>
  *
  * <table>
  *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.lid/LidGpgSso2</tt></td></tr>
  *  <tr><td>Name:</td><td><tt>LidGpgSso2</tt></td></tr>
  *  <tr><td>IsAbstract:</td><td><code>false</code></td></tr>
  *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>LID\'s GPG-based Authentication Service (version 2)</td></tr></table></td></tr>
  *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>An Authentication Service based on the LID GPG SSO service, version 2.</td></tr></table></td></tr>
  * </table>
  */

public class ImplLidGpgSso2
        extends
            org.infogrid.mesh.TypedMeshObjectFacadeImpl
        implements
            org.infogrid.lid.model.lid.LidGpgSso2

{
    private static final org.infogrid.util.logging.Log log = org.infogrid.util.logging.Log.getLogInstance( ImplLidGpgSso2.class ); // our own, private logger

    /**
      * Constructor.
      *
      * @param delegate the underlying MeshObject
      */
    public ImplLidGpgSso2(
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
    }

    /**
      * Set value for property Priority.
      *
      * @param newValue the new value for the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      * @throws org.infogrid.meshbase.transaction.TransactionException thrown if invoked outside proper transaction boundaries
      */
    public void setPriority(
            org.infogrid.model.primitives.IntegerValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "setPriority", newValue );
        }

        try {
            the_Delegate.setPropertyValue( PRIORITY, newValue );

        } catch( IllegalPropertyValueException ex ) {
            log.error( ex );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
        }
    }

    /**
      * Obtain value for property Priority.
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller did not have permission to perform this operation
      */
    public org.infogrid.model.primitives.IntegerValue getPriority()
        throws
            org.infogrid.mesh.NotPermittedException
    {
        try {
            return (org.infogrid.model.primitives.IntegerValue) the_Delegate.getPropertyValue( PRIORITY );
        } catch( IllegalPropertyTypeException ex ) {
            log.error( ex );
            return null;
        }
    }

 // #### BEGIN IMPLEMENTED METHOD (INSERTED FROM model.xml FILE) ####

    public String determineRedirectUrl(
            String                            clientIdentifier,
            String                            returnToUrl,
            org.infogrid.util.context.Context context )
        throws
            org.infogrid.util.FactoryException
    {
        org.infogrid.mesh.set.OrderedMeshObjectSet endpoints
                = org.infogrid.lid.model.yadis.util.YadisUtil.determineOrderedEndpointWebResources( the_Delegate );
        if( endpoints.isEmpty() ) {
            return null;
        }
        MeshObject selectedEndpoint = endpoints.get(0);
        String     endpointUrl      = selectedEndpoint.getIdentifier().toExternalForm();

        String ret = endpointUrl;

        String target = org.infogrid.util.http.HTTP.appendArgumentPairToUrl( returnToUrl, "lid-credtype=gpg%20--clearsign" );

        ret = org.infogrid.util.http.HTTP.appendArgumentPairToUrl( ret, "lid-action=sso-approve" );
        ret = org.infogrid.util.http.HTTP.appendArgumentToUrl(     ret, "lid-target", target.toString() );

        return ret;
    }
          
 // #### END IMPLEMENTED METHOD (INSERTED FROM model.xml FILE) ####
}
