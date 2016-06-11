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
// on Sun, 2016-02-21 12:49:28 -0600
//
// DO NOT MODIFY -- re-generate!

package org.infogrid.model.Test;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.modelbase.ModelBaseSingleton;

/**
  * <p>Java interface for EntityType org.infogrid.model.Test/MandatoryProperties.</p>
  * <p>To instantiate, use the factory methods provided by the <code>MeshBase</code>'s
  * <code>MeshObjectLifecycleManager</code>.</p>
  * <p><b>Note:</b> As an application programmer, you must never rely on any characteristic of any
  * class that implements this interface, only on the characteristics provided by this interface
  * and its supertypes.</p>
  *
  * <table>
  *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties</tt></td></tr>
  *  <tr><td>Name:</td><td><tt>MandatoryProperties</tt></td></tr>
  *  <tr><td>IsAbstract:</td><td><code>false</code></td></tr>
  *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryProperties</td></tr></table></td></tr>
  *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>Holds properties of all mandatory InfoGrid PropertyTypes.</td></tr></table></td></tr>
  * </table>
  */

public interface MandatoryProperties
        extends
            org.infogrid.mesh.TypedMeshObjectFacade
{
    /**
      * Subject area in which this MeshObject is declared.
      */
    public static final SubjectArea _SUBJECTAREA = ModelBaseSingleton.findSubjectArea( "org.infogrid.model.Test" );

    /**
      * This MeshType.
      */
    public static final EntityType _TYPE = ModelBaseSingleton.findEntityType( "org.infogrid.model.Test/MandatoryProperties" );

    /**
      * <p>Set value for property MandatoryBlobDataTypeAny.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataTypeAny</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryBlobDataTypeAny</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: text/plain,text/html,image/gif,image/jpeg,image/png,image/x-icon,text/xml,application/xml,text/json,application/octet-stream)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryBlobDataTypeAny</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryBlobDataTypeAny(
            org.infogrid.model.primitives.BlobValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryBlobDataTypeAny.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataTypeAny</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryBlobDataTypeAny</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: text/plain,text/html,image/gif,image/jpeg,image/png,image/x-icon,text/xml,application/xml,text/json,application/octet-stream)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryBlobDataTypeAny</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.BlobValue getMandatoryBlobDataTypeAny()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryBlobDataTypeAny property.
      */
    public static final String MANDATORYBLOBDATATYPEANY_name = "MandatoryBlobDataTypeAny";

    /**
      * The MandatoryBlobDataTypeAny PropertyType.
      */
    public static final PropertyType MANDATORYBLOBDATATYPEANY = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataTypeAny" );
    public static final org.infogrid.model.primitives.BlobDataType MANDATORYBLOBDATATYPEANY_type = (org.infogrid.model.primitives.BlobDataType) MANDATORYBLOBDATATYPEANY.getDataType();

    /**
      * <p>Set value for property MandatoryBlobDataTypePlainOrHtml.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataTypePlainOrHtml</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryBlobDataTypePlainOrHtml</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: text/plain,text/html)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryBlobDataTypePlainOrHtml</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryBlobDataTypePlainOrHtml(
            org.infogrid.model.primitives.BlobValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryBlobDataTypePlainOrHtml.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataTypePlainOrHtml</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryBlobDataTypePlainOrHtml</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: text/plain,text/html)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryBlobDataTypePlainOrHtml</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.BlobValue getMandatoryBlobDataTypePlainOrHtml()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryBlobDataTypePlainOrHtml property.
      */
    public static final String MANDATORYBLOBDATATYPEPLAINORHTML_name = "MandatoryBlobDataTypePlainOrHtml";

    /**
      * The MandatoryBlobDataTypePlainOrHtml PropertyType.
      */
    public static final PropertyType MANDATORYBLOBDATATYPEPLAINORHTML = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataTypePlainOrHtml" );
    public static final org.infogrid.model.primitives.BlobDataType MANDATORYBLOBDATATYPEPLAINORHTML_type = (org.infogrid.model.primitives.BlobDataType) MANDATORYBLOBDATATYPEPLAINORHTML.getDataType();

    /**
      * <p>Set value for property MandatoryBlobDataTypePlain.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataTypePlain</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryBlobDataTypePlain</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: text/plain)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryBlobDataTypePlain</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryBlobDataTypePlain(
            org.infogrid.model.primitives.BlobValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryBlobDataTypePlain.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataTypePlain</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryBlobDataTypePlain</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: text/plain)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryBlobDataTypePlain</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.BlobValue getMandatoryBlobDataTypePlain()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryBlobDataTypePlain property.
      */
    public static final String MANDATORYBLOBDATATYPEPLAIN_name = "MandatoryBlobDataTypePlain";

    /**
      * The MandatoryBlobDataTypePlain PropertyType.
      */
    public static final PropertyType MANDATORYBLOBDATATYPEPLAIN = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataTypePlain" );
    public static final org.infogrid.model.primitives.BlobDataType MANDATORYBLOBDATATYPEPLAIN_type = (org.infogrid.model.primitives.BlobDataType) MANDATORYBLOBDATATYPEPLAIN.getDataType();

    /**
      * <p>Set value for property MandatoryBlobDataHtml.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataHtml</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryBlobDataHtml</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: text/html)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>DEFAULT VALUE</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryBlobDataHtml</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryBlobDataHtml(
            org.infogrid.model.primitives.BlobValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryBlobDataHtml.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataHtml</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryBlobDataHtml</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: text/html)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>DEFAULT VALUE</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryBlobDataHtml</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.BlobValue getMandatoryBlobDataHtml()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryBlobDataHtml property.
      */
    public static final String MANDATORYBLOBDATAHTML_name = "MandatoryBlobDataHtml";

    /**
      * The MandatoryBlobDataHtml PropertyType.
      */
    public static final PropertyType MANDATORYBLOBDATAHTML = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataHtml" );
    public static final org.infogrid.model.primitives.BlobDataType MANDATORYBLOBDATAHTML_type = (org.infogrid.model.primitives.BlobDataType) MANDATORYBLOBDATAHTML.getDataType();

    /**
      * <p>Set value for property MandatoryBlobDataTypeImage.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataTypeImage</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryBlobDataTypeImage</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: image/gif,image/jpeg,image/png)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>Data</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryBlobDataTypeImage</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryBlobDataTypeImage(
            org.infogrid.model.primitives.BlobValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryBlobDataTypeImage.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataTypeImage</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryBlobDataTypeImage</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: image/gif,image/jpeg,image/png)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>Data</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryBlobDataTypeImage</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.BlobValue getMandatoryBlobDataTypeImage()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryBlobDataTypeImage property.
      */
    public static final String MANDATORYBLOBDATATYPEIMAGE_name = "MandatoryBlobDataTypeImage";

    /**
      * The MandatoryBlobDataTypeImage PropertyType.
      */
    public static final PropertyType MANDATORYBLOBDATATYPEIMAGE = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataTypeImage" );
    public static final org.infogrid.model.primitives.BlobDataType MANDATORYBLOBDATATYPEIMAGE_type = (org.infogrid.model.primitives.BlobDataType) MANDATORYBLOBDATATYPEIMAGE.getDataType();

    /**
      * <p>Set value for property MandatoryBlobDataTypeJpg.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataTypeJpg</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryBlobDataTypeJpg</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: image/jpeg)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>Data</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryBlobDataTypeJpg</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryBlobDataTypeJpg(
            org.infogrid.model.primitives.BlobValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryBlobDataTypeJpg.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataTypeJpg</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryBlobDataTypeJpg</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Blob (allowed MIME types: image/jpeg)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>Data</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryBlobDataTypeJpg</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.BlobValue getMandatoryBlobDataTypeJpg()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryBlobDataTypeJpg property.
      */
    public static final String MANDATORYBLOBDATATYPEJPG_name = "MandatoryBlobDataTypeJpg";

    /**
      * The MandatoryBlobDataTypeJpg PropertyType.
      */
    public static final PropertyType MANDATORYBLOBDATATYPEJPG = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryBlobDataTypeJpg" );
    public static final org.infogrid.model.primitives.BlobDataType MANDATORYBLOBDATATYPEJPG_type = (org.infogrid.model.primitives.BlobDataType) MANDATORYBLOBDATATYPEJPG.getDataType();

    /**
      * <p>Set value for property MandatoryBooleanDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryBooleanDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryBooleanDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Boolean</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryBooleanDataType</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryBooleanDataType(
            org.infogrid.model.primitives.BooleanValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryBooleanDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryBooleanDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryBooleanDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Boolean</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryBooleanDataType</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.BooleanValue getMandatoryBooleanDataType()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryBooleanDataType property.
      */
    public static final String MANDATORYBOOLEANDATATYPE_name = "MandatoryBooleanDataType";

    /**
      * The MandatoryBooleanDataType PropertyType.
      */
    public static final PropertyType MANDATORYBOOLEANDATATYPE = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryBooleanDataType" );
    public static final org.infogrid.model.primitives.BooleanDataType MANDATORYBOOLEANDATATYPE_type = (org.infogrid.model.primitives.BooleanDataType) MANDATORYBOOLEANDATATYPE.getDataType();

    /**
      * <p>Set value for property MandatoryColorDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryColorDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryColorDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Color</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>Color #00007b</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryColorDataType</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryColorDataType(
            org.infogrid.model.primitives.ColorValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryColorDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryColorDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryColorDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Color</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>Color #00007b</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryColorDataType</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.ColorValue getMandatoryColorDataType()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryColorDataType property.
      */
    public static final String MANDATORYCOLORDATATYPE_name = "MandatoryColorDataType";

    /**
      * The MandatoryColorDataType PropertyType.
      */
    public static final PropertyType MANDATORYCOLORDATATYPE = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryColorDataType" );
    public static final org.infogrid.model.primitives.ColorDataType MANDATORYCOLORDATATYPE_type = (org.infogrid.model.primitives.ColorDataType) MANDATORYCOLORDATATYPE.getDataType();

    /**
      * <p>Set value for property MandatoryCurrencyDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryCurrencyDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryCurrencyDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Currency</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>$1.00</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryCurrencyDataType</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryCurrencyDataType(
            org.infogrid.model.primitives.CurrencyValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryCurrencyDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryCurrencyDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryCurrencyDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Currency</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>$1.00</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryCurrencyDataType</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.CurrencyValue getMandatoryCurrencyDataType()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryCurrencyDataType property.
      */
    public static final String MANDATORYCURRENCYDATATYPE_name = "MandatoryCurrencyDataType";

    /**
      * The MandatoryCurrencyDataType PropertyType.
      */
    public static final PropertyType MANDATORYCURRENCYDATATYPE = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryCurrencyDataType" );
    public static final org.infogrid.model.primitives.CurrencyDataType MANDATORYCURRENCYDATATYPE_type = (org.infogrid.model.primitives.CurrencyDataType) MANDATORYCURRENCYDATATYPE.getDataType();

    /**
      * <p>Set value for property MandatoryEnumeratedDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryEnumeratedDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryEnumeratedDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Enumeration</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>Second value of Z</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryEnumeratedDataType</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryEnumeratedDataType(
            org.infogrid.model.primitives.EnumeratedValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryEnumeratedDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryEnumeratedDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryEnumeratedDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Enumeration</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>Second value of Z</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryEnumeratedDataType</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.EnumeratedValue getMandatoryEnumeratedDataType()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryEnumeratedDataType property.
      */
    public static final String MANDATORYENUMERATEDDATATYPE_name = "MandatoryEnumeratedDataType";

    /**
      * The MandatoryEnumeratedDataType PropertyType.
      */
    public static final PropertyType MANDATORYENUMERATEDDATATYPE = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryEnumeratedDataType" );
    public static final org.infogrid.model.primitives.EnumeratedDataType MANDATORYENUMERATEDDATATYPE_type = (org.infogrid.model.primitives.EnumeratedDataType) MANDATORYENUMERATEDDATATYPE.getDataType();

    /* Values of the EnumeratedDataType. */
    public static final EnumeratedValue MANDATORYENUMERATEDDATATYPE_type_VALUE1 = MANDATORYENUMERATEDDATATYPE_type.select( "Value1" );
    public static final EnumeratedValue MANDATORYENUMERATEDDATATYPE_type_VALUE2 = MANDATORYENUMERATEDDATATYPE_type.select( "Value2" );
    public static final EnumeratedValue MANDATORYENUMERATEDDATATYPE_type_VALUE3 = MANDATORYENUMERATEDDATATYPE_type.select( "Value3" );
    /**
      * <p>Set value for property MandatoryExtentDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryExtentDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryExtentDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Extent</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>(1.0;2.0)</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryExtentDataType</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryExtentDataType(
            org.infogrid.model.primitives.ExtentValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryExtentDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryExtentDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryExtentDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Extent</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>(1.0;2.0)</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryExtentDataType</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.ExtentValue getMandatoryExtentDataType()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryExtentDataType property.
      */
    public static final String MANDATORYEXTENTDATATYPE_name = "MandatoryExtentDataType";

    /**
      * The MandatoryExtentDataType PropertyType.
      */
    public static final PropertyType MANDATORYEXTENTDATATYPE = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryExtentDataType" );
    public static final org.infogrid.model.primitives.ExtentDataType MANDATORYEXTENTDATATYPE_type = (org.infogrid.model.primitives.ExtentDataType) MANDATORYEXTENTDATATYPE.getDataType();

    /**
      * <p>Set value for property MandatoryFloatDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryFloatDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryFloatDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Float (default: 0.0, min: -Infinity, max: Infinity)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>1.2</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryFloatDataType</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryFloatDataType(
            org.infogrid.model.primitives.FloatValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryFloatDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryFloatDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryFloatDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Float (default: 0.0, min: -Infinity, max: Infinity)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>1.2</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryFloatDataType</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.FloatValue getMandatoryFloatDataType()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryFloatDataType property.
      */
    public static final String MANDATORYFLOATDATATYPE_name = "MandatoryFloatDataType";

    /**
      * The MandatoryFloatDataType PropertyType.
      */
    public static final PropertyType MANDATORYFLOATDATATYPE = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryFloatDataType" );
    public static final org.infogrid.model.primitives.FloatDataType MANDATORYFLOATDATATYPE_type = (org.infogrid.model.primitives.FloatDataType) MANDATORYFLOATDATATYPE.getDataType();

    /**
      * <p>Set value for property MandatoryIntegerDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryIntegerDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryIntegerDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Integer (default: 0, min: -9223372036854775808, max: 9223372036854775807)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>1</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryIntegerDataType</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryIntegerDataType(
            org.infogrid.model.primitives.IntegerValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryIntegerDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryIntegerDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryIntegerDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Integer (default: 0, min: -9223372036854775808, max: 9223372036854775807)</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>1</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryIntegerDataType</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.IntegerValue getMandatoryIntegerDataType()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryIntegerDataType property.
      */
    public static final String MANDATORYINTEGERDATATYPE_name = "MandatoryIntegerDataType";

    /**
      * The MandatoryIntegerDataType PropertyType.
      */
    public static final PropertyType MANDATORYINTEGERDATATYPE = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryIntegerDataType" );
    public static final org.infogrid.model.primitives.IntegerDataType MANDATORYINTEGERDATATYPE_type = (org.infogrid.model.primitives.IntegerDataType) MANDATORYINTEGERDATATYPE.getDataType();

    /**
      * <p>Set value for property MandatoryMultiplicityDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryMultiplicityDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryMultiplicityDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Multiplicity</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>1..*</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryMultiplicityDataType</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryMultiplicityDataType(
            org.infogrid.model.primitives.MultiplicityValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryMultiplicityDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryMultiplicityDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryMultiplicityDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Multiplicity</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>1..*</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryMultiplicityDataType</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.MultiplicityValue getMandatoryMultiplicityDataType()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryMultiplicityDataType property.
      */
    public static final String MANDATORYMULTIPLICITYDATATYPE_name = "MandatoryMultiplicityDataType";

    /**
      * The MandatoryMultiplicityDataType PropertyType.
      */
    public static final PropertyType MANDATORYMULTIPLICITYDATATYPE = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryMultiplicityDataType" );
    public static final org.infogrid.model.primitives.MultiplicityDataType MANDATORYMULTIPLICITYDATATYPE_type = (org.infogrid.model.primitives.MultiplicityDataType) MANDATORYMULTIPLICITYDATATYPE.getDataType();

    /**
      * <p>Set value for property MandatoryPointDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryPointDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryPointDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Point</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>(1.0;2.0)</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryPointDataType</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryPointDataType(
            org.infogrid.model.primitives.PointValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryPointDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryPointDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryPointDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Point</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>(1.0;2.0)</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryPointDataType</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.PointValue getMandatoryPointDataType()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryPointDataType property.
      */
    public static final String MANDATORYPOINTDATATYPE_name = "MandatoryPointDataType";

    /**
      * The MandatoryPointDataType PropertyType.
      */
    public static final PropertyType MANDATORYPOINTDATATYPE = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryPointDataType" );
    public static final org.infogrid.model.primitives.PointDataType MANDATORYPOINTDATATYPE_type = (org.infogrid.model.primitives.PointDataType) MANDATORYPOINTDATATYPE.getDataType();

    /**
      * <p>Set value for property MandatoryStringDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryStringDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryStringDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>DEFAULT</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryStringDataType</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryStringDataType(
            org.infogrid.model.primitives.StringValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryStringDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryStringDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryStringDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>DEFAULT</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryStringDataType</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.StringValue getMandatoryStringDataType()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryStringDataType property.
      */
    public static final String MANDATORYSTRINGDATATYPE_name = "MandatoryStringDataType";

    /**
      * The MandatoryStringDataType PropertyType.
      */
    public static final PropertyType MANDATORYSTRINGDATATYPE = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryStringDataType" );
    public static final org.infogrid.model.primitives.StringDataType MANDATORYSTRINGDATATYPE_type = (org.infogrid.model.primitives.StringDataType) MANDATORYSTRINGDATATYPE.getDataType();

    /**
      * <p>Set value for property MandatoryStringRegexDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryStringRegexDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryStringRegexDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String matching regular expression pattern ""</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>127.0.0.1</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryStringRegexDataType</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>IP address xxx.xxx.xxx.xxx</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryStringRegexDataType(
            org.infogrid.model.primitives.StringValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryStringRegexDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryStringRegexDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryStringRegexDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String matching regular expression pattern ""</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>127.0.0.1</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryStringRegexDataType</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>IP address xxx.xxx.xxx.xxx</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.StringValue getMandatoryStringRegexDataType()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryStringRegexDataType property.
      */
    public static final String MANDATORYSTRINGREGEXDATATYPE_name = "MandatoryStringRegexDataType";

    /**
      * The MandatoryStringRegexDataType PropertyType.
      */
    public static final PropertyType MANDATORYSTRINGREGEXDATATYPE = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryStringRegexDataType" );
    public static final org.infogrid.model.primitives.StringDataType MANDATORYSTRINGREGEXDATATYPE_type = (org.infogrid.model.primitives.StringDataType) MANDATORYSTRINGREGEXDATATYPE.getDataType();

    /**
      * <p>Set value for property MandatoryTimePeriodDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryTimePeriodDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryTimePeriodDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Time Period</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>1/2/3 4-5-6.0</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryTimePeriodDataType</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryTimePeriodDataType(
            org.infogrid.model.primitives.TimePeriodValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryTimePeriodDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryTimePeriodDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryTimePeriodDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Time Period</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>1/2/3 4-5-6.0</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryTimePeriodDataType</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.TimePeriodValue getMandatoryTimePeriodDataType()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryTimePeriodDataType property.
      */
    public static final String MANDATORYTIMEPERIODDATATYPE_name = "MandatoryTimePeriodDataType";

    /**
      * The MandatoryTimePeriodDataType PropertyType.
      */
    public static final PropertyType MANDATORYTIMEPERIODDATATYPE = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryTimePeriodDataType" );
    public static final org.infogrid.model.primitives.TimePeriodDataType MANDATORYTIMEPERIODDATATYPE_type = (org.infogrid.model.primitives.TimePeriodDataType) MANDATORYTIMEPERIODDATATYPE.getDataType();

    /**
      * <p>Set value for property MandatoryTimeStampDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryTimeStampDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryTimeStampDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Time Stamp</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>23:59:59.999 2000/12/31 UTC</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryTimeStampDataType</td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
       * @throws IllegalPropertyValueException thrown if it is attempted to assign the <code>null</code> value to this non-optional property
      */
    public abstract void setMandatoryTimeStampDataType(
            org.infogrid.model.primitives.TimeStampValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException,
            org.infogrid.mesh.IllegalPropertyValueException;

    /**
      * <p>Obtain value for property MandatoryTimeStampDataType.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.model.Test/MandatoryProperties_MandatoryTimeStampDataType</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>MandatoryTimeStampDataType</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>Time Stamp</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt>23:59:59.999 2000/12/31 UTC</tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>MandatoryTimeStampDataType</td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.TimeStampValue getMandatoryTimeStampDataType()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the MandatoryTimeStampDataType property.
      */
    public static final String MANDATORYTIMESTAMPDATATYPE_name = "MandatoryTimeStampDataType";

    /**
      * The MandatoryTimeStampDataType PropertyType.
      */
    public static final PropertyType MANDATORYTIMESTAMPDATATYPE = ModelBaseSingleton.findPropertyType( "org.infogrid.model.Test/MandatoryProperties_MandatoryTimeStampDataType" );
    public static final org.infogrid.model.primitives.TimeStampDataType MANDATORYTIMESTAMPDATATYPE_type = (org.infogrid.model.primitives.TimeStampDataType) MANDATORYTIMESTAMPDATATYPE.getDataType();

}
