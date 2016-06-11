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

package org.infogrid.lid.model.xrd;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.modelbase.ModelBaseSingleton;

/**
  * <p>Java interface for EntityType org.infogrid.lid.model.xrd/AbstractLink.</p>
  * <p>To instantiate, use the factory methods provided by the <code>MeshBase</code>'s
  * <code>MeshObjectLifecycleManager</code>.</p>
  * <p><b>Note:</b> As an application programmer, you must never rely on any characteristic of any
  * class that implements this interface, only on the characteristics provided by this interface
  * and its supertypes.</p>
  *
  * <table>
  *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.xrd/AbstractLink</tt></td></tr>
  *  <tr><td>Name:</td><td><tt>AbstractLink</tt></td></tr>
  *  <tr><td>IsAbstract:</td><td><code>true</code></td></tr>
  *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Abstract Link</td></tr></table></td></tr>
  *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>Common traits of Links referring to resources and Link templates.</td></tr></table></td></tr>
  * </table>
  */

public interface AbstractLink
        extends
            org.infogrid.mesh.TypedMeshObjectFacade
{
    /**
      * Subject area in which this MeshObject is declared.
      */
    public static final SubjectArea _SUBJECTAREA = ModelBaseSingleton.findSubjectArea( "org.infogrid.lid.model.xrd" );

    /**
      * This MeshType.
      */
    public static final EntityType _TYPE = ModelBaseSingleton.findEntityType( "org.infogrid.lid.model.xrd/AbstractLink" );

    /**
      * This MeshType.
      */
    public static final RoleType _Xrd_Contains_AbstractLink_DESTINATION = ModelBaseSingleton.findRoleType( "org.infogrid.lid.model.xrd/Xrd_Contains_AbstractLink-D" );

    /**
      * <p>Set value for property Rel.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.xrd/AbstractLink_Rel</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Rel</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Rel</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>This URI value defines the semantics of the relation between the resource described\n                 by the XRD and the linked resource. This value MUST be an absolute URI or a registered relation type,\n                 as defined in [Web Linking]</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
      */
    public abstract void setRel(
            org.infogrid.model.primitives.StringValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException;

    /**
      * <p>Obtain value for property Rel.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.xrd/AbstractLink_Rel</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Rel</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Rel</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>This URI value defines the semantics of the relation between the resource described\n                 by the XRD and the linked resource. This value MUST be an absolute URI or a registered relation type,\n                 as defined in [Web Linking]</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.StringValue getRel()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the Rel property.
      */
    public static final String REL_name = "Rel";

    /**
      * The Rel PropertyType.
      */
    public static final PropertyType REL = ModelBaseSingleton.findPropertyType( "org.infogrid.lid.model.xrd/AbstractLink_Rel" );
    public static final org.infogrid.model.primitives.StringDataType REL_type = (org.infogrid.model.primitives.StringDataType) REL.getDataType();

    /**
      * <p>Set value for property Type.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.xrd/AbstractLink_Type</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Type</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Type</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>This string value identifies the media type of the linked resource, and MUST be\n                of the form of a media type as defined in [RFC 4288]. The IANA media types registry can be found at\n                http://www.iana.org/assignments/media-types/.</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
      */
    public abstract void setType(
            org.infogrid.model.primitives.StringValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException;

    /**
      * <p>Obtain value for property Type.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.xrd/AbstractLink_Type</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Type</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Type</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>This string value identifies the media type of the linked resource, and MUST be\n                of the form of a media type as defined in [RFC 4288]. The IANA media types registry can be found at\n                http://www.iana.org/assignments/media-types/.</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.StringValue getType()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the Type property.
      */
    public static final String TYPE_name = "Type";

    /**
      * The Type PropertyType.
      */
    public static final PropertyType TYPE = ModelBaseSingleton.findPropertyType( "org.infogrid.lid.model.xrd/AbstractLink_Type" );
    public static final org.infogrid.model.primitives.StringDataType TYPE_type = (org.infogrid.model.primitives.StringDataType) TYPE.getDataType();

    /**
      * <p>Set value for property Title.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.xrd/AbstractLink_Title</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Title</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: text/plain,text/html)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Title</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>Provides a human-readable description of the linked resource.</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setTitle(
            org.infogrid.model.primitives.BlobValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property Title.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.xrd/AbstractLink_Title</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Title</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: text/plain,text/html)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Title</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>Provides a human-readable description of the linked resource.</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.BlobValue getTitle()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the Title property.
      */
    public static final String TITLE_name = "Title";

    /**
      * The Title PropertyType.
      */
    public static final PropertyType TITLE = ModelBaseSingleton.findPropertyType( "org.infogrid.lid.model.xrd/AbstractLink_Title" );
    public static final org.infogrid.model.primitives.BlobDataType TITLE_type = (org.infogrid.model.primitives.BlobDataType) TITLE.getDataType();

}
