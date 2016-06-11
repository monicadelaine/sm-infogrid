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
  * <p>Collects the MeshTypes in this Subject Area for simpler access.</p>
  */
public abstract class YadisSubjectArea
{
    /**
      * The SubjectArea itself.
      */
    public static final SubjectArea _SA = ModelBaseSingleton.findSubjectArea( "org.infogrid.lid.model.yadis" );

    /**
      * A collection of XRDS services.
      */
    public static final EntityType XRDSSERVICECOLLECTION = org.infogrid.lid.model.yadis.XrdsServiceCollection._TYPE;

    /**
      * Content of the parsed XRDS resource.
      */
    public static final PropertyType XRDSSERVICECOLLECTION_XRDSRESOURCECONTENT = org.infogrid.lid.model.yadis.XrdsServiceCollection.XRDSRESOURCECONTENT;
    public static final org.infogrid.model.primitives.BlobDataType XRDSSERVICECOLLECTION_XRDSRESOURCECONTENT_type = (org.infogrid.model.primitives.BlobDataType) XRDSSERVICECOLLECTION_XRDSRESOURCECONTENT.getDataType();

    /**
      * This represents a Yadis/XRDS Service. Known ServiceTypes are\nexpressed by subclasses of this EntityType. Also, an XrdsServiceType EntityType is instantiated\nfor both known and unknown ServiceTypes.
      */
    public static final EntityType XRDSSERVICE = org.infogrid.lid.model.yadis.XrdsService._TYPE;

    /**
      * Priority of this XRDS Service.
      */
    public static final PropertyType XRDSSERVICE_PRIORITY = org.infogrid.lid.model.yadis.XrdsService.PRIORITY;
    public static final org.infogrid.model.primitives.IntegerDataType XRDSSERVICE_PRIORITY_type = (org.infogrid.model.primitives.IntegerDataType) XRDSSERVICE_PRIORITY.getDataType();

    /**
      * Captures the Yadis type identifier for an XrdsServiceType.
      */
    public static final EntityType XRDSSERVICETYPE = org.infogrid.lid.model.yadis.XrdsServiceType._TYPE;

    /**
      * Unique identifier for this ServiceType
      */
    public static final PropertyType XRDSSERVICETYPE_SERVICETYPEIDENTIFIER = org.infogrid.lid.model.yadis.XrdsServiceType.SERVICETYPEIDENTIFIER;
    public static final org.infogrid.model.primitives.StringDataType XRDSSERVICETYPE_SERVICETYPEIDENTIFIER_type = (org.infogrid.model.primitives.StringDataType) XRDSSERVICETYPE_SERVICETYPEIDENTIFIER.getDataType();

    /**
      * This represents an endpoint of a Yadis/XRDS Service.
      */
    public static final EntityType ENDPOINT = org.infogrid.lid.model.yadis.Endpoint._TYPE;

    /**
      * Priority of this endpoint.
      */
    public static final PropertyType ENDPOINT_PRIORITY = org.infogrid.lid.model.yadis.Endpoint.PRIORITY;
    public static final org.infogrid.model.primitives.IntegerDataType ENDPOINT_PRIORITY_type = (org.infogrid.model.primitives.IntegerDataType) ENDPOINT_PRIORITY.getDataType();

    /**
      * Relates the XRDS Services inside of an XRDS Service Collection\nto the XRDS Service Collection itself.
      */
    public static final RelationshipType XRDSSERVICECOLLECTION_COLLECTS_XRDSSERVICE = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.yadis/XrdsServiceCollection_Collects_XrdsService" );

    /**
      * Relates an XRDS Service to an object capturing the Yadis ServiceType identifier.
      */
    public static final RelationshipType XRDSSERVICE_HASTYPE_XRDSSERVICETYPE = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.yadis/XrdsService_HasType_XrdsServiceType" );

    /**
      * Expresses at which endpoints an XRDS Service is available.
      */
    public static final RelationshipType XRDSSERVICE_ISPROVIDEDAT_ENDPOINT = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.yadis/XrdsService_IsProvidedAt_Endpoint" );

    /**
      * Expresses which WebResource acts as the Endpoint.
      */
    public static final RelationshipType ENDPOINT_ISOPERATEDBY_WEBRESOURCE = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.yadis/Endpoint_IsOperatedBy_WebResource" );

    /**
      * Relates a Web Resource to another Web Resource which contains\nthe XRDS/Yadis data about the first Web Resource.
      */
    public static final RelationshipType WEBRESOURCE_HASXRDSLINKTO_WEBRESOURCE = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.yadis/WebResource_HasXrdsLinkTo_WebResource" );

}
