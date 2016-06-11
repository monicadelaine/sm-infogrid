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
// on Sun, 2016-02-21 12:50:33 -0600
//
// DO NOT MODIFY -- re-generate!

package org.infogrid.lid.model.yadis;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.modelbase.ModelBaseSingleton;

/**
  * <p>Java interface for EntityType org.infogrid.lid.model.yadis/XrdsServiceCollection.</p>
  * <p>To instantiate, use the factory methods provided by the <code>MeshBase</code>'s
  * <code>MeshObjectLifecycleManager</code>.</p>
  * <p><b>Note:</b> As an application programmer, you must never rely on any characteristic of any
  * class that implements this interface, only on the characteristics provided by this interface
  * and its supertypes.</p>
  *
  * <table>
  *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.yadis/XrdsServiceCollection</tt></td></tr>
  *  <tr><td>Name:</td><td><tt>XrdsServiceCollection</tt></td></tr>
  *  <tr><td>IsAbstract:</td><td><code>false</code></td></tr>
  *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>XRDS Service Collection</td></tr></table></td></tr>
  *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>A collection of XRDS services.</td></tr></table></td></tr>
  * </table>
  */

public interface XrdsServiceCollection
        extends
            org.infogrid.mesh.TypedMeshObjectFacade
{
    /**
      * Subject area in which this MeshObject is declared.
      */
    public static final SubjectArea _SUBJECTAREA = ModelBaseSingleton.findSubjectArea( "org.infogrid.lid.model.yadis" );

    /**
      * This MeshType.
      */
    public static final EntityType _TYPE = ModelBaseSingleton.findEntityType( "org.infogrid.lid.model.yadis/XrdsServiceCollection" );

    /**
      * This MeshType.
      */
    public static final RoleType _XrdsServiceCollection_Collects_XrdsService_SOURCE = ModelBaseSingleton.findRoleType( "org.infogrid.lid.model.yadis/XrdsServiceCollection_Collects_XrdsService-S" );

    /**
      * <p>Set value for property XrdsResourceContent.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.yadis/XrdsServiceCollection_XrdsResourceContent</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>XrdsResourceContent</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: text/xml,application/xml)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>XrdsResourceContent</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>Content of the parsed XRDS resource.</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setXrdsResourceContent(
            org.infogrid.model.primitives.BlobValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property XrdsResourceContent.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.yadis/XrdsServiceCollection_XrdsResourceContent</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>XrdsResourceContent</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: text/xml,application/xml)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>XrdsResourceContent</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>Content of the parsed XRDS resource.</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.BlobValue getXrdsResourceContent()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the XrdsResourceContent property.
      */
    public static final String XRDSRESOURCECONTENT_name = "XrdsResourceContent";

    /**
      * The XrdsResourceContent PropertyType.
      */
    public static final PropertyType XRDSRESOURCECONTENT = ModelBaseSingleton.findPropertyType( "org.infogrid.lid.model.yadis/XrdsServiceCollection_XrdsResourceContent" );
    public static final org.infogrid.model.primitives.BlobDataType XRDSRESOURCECONTENT_type = (org.infogrid.model.primitives.BlobDataType) XRDSRESOURCECONTENT.getDataType();

}
