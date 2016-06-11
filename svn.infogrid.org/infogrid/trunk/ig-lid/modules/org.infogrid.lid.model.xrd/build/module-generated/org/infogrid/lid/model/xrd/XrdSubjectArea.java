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
  * <p>Collects the MeshTypes in this Subject Area for simpler access.</p>
  */
public abstract class XrdSubjectArea
{
    /**
      * The SubjectArea itself.
      */
    public static final SubjectArea _SA = ModelBaseSingleton.findSubjectArea( "org.infogrid.lid.model.xrd" );

    /**
      * Meta-data about a resource on the web.
      */
    public static final EntityType XRD = org.infogrid.lid.model.xrd.Xrd._TYPE;

    /**
      * This attribute, of type xs:ID, is defined by [xml:id]. It provides a unique\n                 identifier for this XRD, and is used as a signature reference.
      */
    public static final PropertyType XRD_ID = org.infogrid.lid.model.xrd.Xrd.ID;
    public static final org.infogrid.model.primitives.StringDataType XRD_ID_type = (org.infogrid.model.primitives.StringDataType) XRD_ID.getDataType();

    /**
      * Specifies when this document expires.
      */
    public static final PropertyType XRD_EXPIRES = org.infogrid.lid.model.xrd.Xrd.EXPIRES;
    public static final org.infogrid.model.primitives.TimeStampDataType XRD_EXPIRES_type = (org.infogrid.model.primitives.TimeStampDataType) XRD_EXPIRES.getDataType();

    /**
      * Common traits of Links referring to resources and Link templates.
      */
    public static final EntityType ABSTRACTLINK = org.infogrid.lid.model.xrd.AbstractLink._TYPE;

    /**
      * This URI value defines the semantics of the relation between the resource described\n                 by the XRD and the linked resource. This value MUST be an absolute URI or a registered relation type,\n                 as defined in [Web Linking]
      */
    public static final PropertyType ABSTRACTLINK_REL = org.infogrid.lid.model.xrd.AbstractLink.REL;
    public static final org.infogrid.model.primitives.StringDataType ABSTRACTLINK_REL_type = (org.infogrid.model.primitives.StringDataType) ABSTRACTLINK_REL.getDataType();

    /**
      * This string value identifies the media type of the linked resource, and MUST be\n                of the form of a media type as defined in [RFC 4288]. The IANA media types registry can be found at\n                http://www.iana.org/assignments/media-types/.
      */
    public static final PropertyType ABSTRACTLINK_TYPE = org.infogrid.lid.model.xrd.AbstractLink.TYPE;
    public static final org.infogrid.model.primitives.StringDataType ABSTRACTLINK_TYPE_type = (org.infogrid.model.primitives.StringDataType) ABSTRACTLINK_TYPE.getDataType();

    /**
      * Provides a human-readable description of the linked resource.
      */
    public static final PropertyType ABSTRACTLINK_TITLE = org.infogrid.lid.model.xrd.AbstractLink.TITLE;
    public static final org.infogrid.model.primitives.BlobDataType ABSTRACTLINK_TITLE_type = (org.infogrid.model.primitives.BlobDataType) ABSTRACTLINK_TITLE.getDataType();

    /**
      * A link to a resource
      */
    public static final EntityType LINK = org.infogrid.lid.model.xrd.Link._TYPE;

    /**
      * A template for how to find links
      */
    public static final EntityType LINKTEMPLATE = org.infogrid.lid.model.xrd.LinkTemplate._TYPE;

    /**
      * The template attribute provides a URI template which can be used to obtain the URI\n                of the linked resource. Templates provide a mechanism for URI construction, taking a list of variables\n                as input, and producing a URI string as an output. The template syntax and vocabulary are determined\n                by the application through which the XRD document is obtained and processed, and MAY be specific to\n                the link relation type indicated by the rel attribute of the corresponding Link element. Applications\n                utilizing the template mechanism MUST define the template syntax and processing rules (including error\n                handling) as well as the variable vocabulary. 
      */
    public static final PropertyType LINKTEMPLATE_TEMPLATE = org.infogrid.lid.model.xrd.LinkTemplate.TEMPLATE;
    public static final org.infogrid.model.primitives.StringDataType LINKTEMPLATE_TEMPLATE_type = (org.infogrid.model.primitives.StringDataType) LINKTEMPLATE_TEMPLATE.getDataType();

    /**
      * Relates the XRD to its Link elements.
      */
    public static final RelationshipType XRD_CONTAINS_ABSTRACTLINK = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.xrd/Xrd_Contains_AbstractLink" );

    /**
      * Relates the XRD to the WebResources that it describes.
      */
    public static final RelationshipType XRD_ABOUT_WEBRESOURCE = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.xrd/Xrd_About_WebResource" );

    /**
      * Relates the XRD to the primary WebResource that it describes, but not the aliases.
      */
    public static final RelationshipType XRD_ABOUTPRIMARY_WEBRESOURCE = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.xrd/Xrd_AboutPrimary_WebResource" );

    /**
      * Relates the XRD to the aliased WebResources that it describes, but not the primary one.
      */
    public static final RelationshipType XRD_ABOUTALIAS_WEBRESOURCE = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.xrd/Xrd_AboutAlias_WebResource" );

    /**
      * Relates the XRD Link element to its destination.
      */
    public static final RelationshipType LINK_TO_WEBRESOURCE = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.xrd/Link_To_WebResource" );

    /**
      * Relates a MeshObject to the XRD that describes it. Given that a MeshObject may turn out\n            to not be blessed with Xrd after the resource is accessed, this has MeshObject on both sides of the RelationshipType.
      */
    public static final RelationshipType MESHOBJECT_DESCRIBES_MESHOBJECT = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.xrd/MeshObject_Describes_MeshObject" );

}
