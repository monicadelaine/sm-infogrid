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
  * <p>Java interface for EntityType org.infogrid.lid.model.xrd/LinkTemplate.</p>
  * <p>To instantiate, use the factory methods provided by the <code>MeshBase</code>'s
  * <code>MeshObjectLifecycleManager</code>.</p>
  * <p><b>Note:</b> As an application programmer, you must never rely on any characteristic of any
  * class that implements this interface, only on the characteristics provided by this interface
  * and its supertypes.</p>
  *
  * <table>
  *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.xrd/LinkTemplate</tt></td></tr>
  *  <tr><td>Name:</td><td><tt>LinkTemplate</tt></td></tr>
  *  <tr><td>IsAbstract:</td><td><code>false</code></td></tr>
  *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Link Template</td></tr></table></td></tr>
  *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>A template for how to find links</td></tr></table></td></tr>
  * </table>
  */

public interface LinkTemplate
        extends
            org.infogrid.lid.model.xrd.AbstractLink
{
    /**
      * Subject area in which this MeshObject is declared.
      */
    public static final SubjectArea _SUBJECTAREA = ModelBaseSingleton.findSubjectArea( "org.infogrid.lid.model.xrd" );

    /**
      * This MeshType.
      */
    public static final EntityType _TYPE = ModelBaseSingleton.findEntityType( "org.infogrid.lid.model.xrd/LinkTemplate" );

    /**
      * <p>Set value for property Template.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.xrd/LinkTemplate_Template</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Template</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Template</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The template attribute provides a URI template which can be used to obtain the URI\n                of the linked resource. Templates provide a mechanism for URI construction, taking a list of variables\n                as input, and producing a URI string as an output. The template syntax and vocabulary are determined\n                by the application through which the XRD document is obtained and processed, and MAY be specific to\n                the link relation type indicated by the rel attribute of the corresponding Link element. Applications\n                utilizing the template mechanism MUST define the template syntax and processing rules (including error\n                handling) as well as the variable vocabulary. </td></tr></table></td></tr>
      * </table>
      *
       * @param newValue the new value for this property
       * @throws NotPermittedException thrown if this caller was not allowed to perform this operation
       * @throws TransactionException thrown if this operation is invoked from outside of a Transaction
      */
    public abstract void setTemplate(
            org.infogrid.model.primitives.StringValue newValue )
        throws
            org.infogrid.mesh.NotPermittedException,
            org.infogrid.meshbase.transaction.TransactionException;

    /**
      * <p>Obtain value for property Template.</p>
      *
      * <table>
      *  <tr><td>Identifier:</td><td><tt>org.infogrid.lid.model.xrd/LinkTemplate_Template</tt></td></tr>
      *  <tr><td>Name:</td><td><tt>Template</tt></td></tr>
      *  <tr><td>DataType:</td><td><tt>String</tt></td></tr>
      *  <tr><td>DefaultValue:</td><td><tt><code>null</code></tt></td></tr>
      *  <tr><td>IsOptional:</td><td><tt><code>true</code></tt></td></tr>
      *  <tr><td>IsReadOnly:</td><td><tt><code>false</code></tt></td></tr>
      *  <tr><td>SequenceNumber:</td><td><tt>0.0</tt></td></tr>
      *  <tr><td>UserVisibleName:</td><td><table><tr><td>default locale:</td><td>Template</td></tr></table></td></tr>
      *  <tr><td>UserVisibleDescription:</td><td><table><tr><td>default locale:</td><td>The template attribute provides a URI template which can be used to obtain the URI\n                of the linked resource. Templates provide a mechanism for URI construction, taking a list of variables\n                as input, and producing a URI string as an output. The template syntax and vocabulary are determined\n                by the application through which the XRD document is obtained and processed, and MAY be specific to\n                the link relation type indicated by the rel attribute of the corresponding Link element. Applications\n                utilizing the template mechanism MUST define the template syntax and processing rules (including error\n                handling) as well as the variable vocabulary. </td></tr></table></td></tr>
      * </table>
      *
      * @return the current value of the property
      * @throws NotPermittedException thrown if this caller was not permitted to perform this operation
      */
    public abstract org.infogrid.model.primitives.StringValue getTemplate()
        throws
            org.infogrid.mesh.NotPermittedException;

    /**
      * Name of the Template property.
      */
    public static final String TEMPLATE_name = "Template";

    /**
      * The Template PropertyType.
      */
    public static final PropertyType TEMPLATE = ModelBaseSingleton.findPropertyType( "org.infogrid.lid.model.xrd/LinkTemplate_Template" );
    public static final org.infogrid.model.primitives.StringDataType TEMPLATE_type = (org.infogrid.model.primitives.StringDataType) TEMPLATE.getDataType();

}
