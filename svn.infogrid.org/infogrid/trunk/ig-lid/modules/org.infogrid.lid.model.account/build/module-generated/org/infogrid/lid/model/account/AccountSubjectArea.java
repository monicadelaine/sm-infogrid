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

package org.infogrid.lid.model.account;

import org.infogrid.model.primitives.*;
import org.infogrid.mesh.*;
import org.infogrid.modelbase.ModelBaseSingleton;

/**
  * <p>Collects the MeshTypes in this Subject Area for simpler access.</p>
  */
public abstract class AccountSubjectArea
{
    /**
      * The SubjectArea itself.
      */
    public static final SubjectArea _SA = ModelBaseSingleton.findSubjectArea( "org.infogrid.lid.model.account" );

    /**
      * Set of Accounts.
      */
    public static final EntityType ACCOUNTCOLLECTION = org.infogrid.lid.model.account.AccountCollection._TYPE;

    /**
      * A user at a particular website, aka account.
      */
    public static final EntityType ACCOUNT = org.infogrid.lid.model.account.Account._TYPE;

    /**
      * The user\'s local nick name, if any.
      */
    public static final PropertyType ACCOUNT_NICKNAME = org.infogrid.lid.model.account.Account.NICKNAME;
    public static final org.infogrid.model.primitives.StringDataType ACCOUNT_NICKNAME_type = (org.infogrid.model.primitives.StringDataType) ACCOUNT_NICKNAME.getDataType();

    /**
      * The user\'s picture, if any.
      */
    public static final PropertyType ACCOUNT_PICTURE = org.infogrid.lid.model.account.Account.PICTURE;
    public static final org.infogrid.model.primitives.BlobDataType ACCOUNT_PICTURE_type = (org.infogrid.model.primitives.BlobDataType) ACCOUNT_PICTURE.getDataType();

    /**
      * Status of the account.
      */
    public static final PropertyType ACCOUNT_STATUS = org.infogrid.lid.model.account.Account.STATUS;
    public static final org.infogrid.model.primitives.EnumeratedDataType ACCOUNT_STATUS_type = (org.infogrid.model.primitives.EnumeratedDataType) ACCOUNT_STATUS.getDataType();
    /* Values of the EnumeratedDataType. */
    public static final EnumeratedValue ACCOUNT_STATUS_type_APPLIEDFOR = ACCOUNT_STATUS_type.select( "AppliedFor" );
    public static final EnumeratedValue ACCOUNT_STATUS_type_ACTIVE = ACCOUNT_STATUS_type.select( "Active" );
    public static final EnumeratedValue ACCOUNT_STATUS_type_CLOSED = ACCOUNT_STATUS_type.select( "Closed" );
    public static final EnumeratedValue ACCOUNT_STATUS_type_DISABLED = ACCOUNT_STATUS_type.select( "Disabled" );
    public static final EnumeratedValue ACCOUNT_STATUS_type_OBSOLETED = ACCOUNT_STATUS_type.select( "Obsoleted" );
    public static final EnumeratedValue ACCOUNT_STATUS_type_REFUSED = ACCOUNT_STATUS_type.select( "Refused" );

    /**
      * The time when the user last logged into this account. This is the time of log-in, not\n                 the last time the account was used.
      */
    public static final PropertyType ACCOUNT_LASTLOGGEDIN = org.infogrid.lid.model.account.Account.LASTLOGGEDIN;
    public static final org.infogrid.model.primitives.TimeStampDataType ACCOUNT_LASTLOGGEDIN_type = (org.infogrid.model.primitives.TimeStampDataType) ACCOUNT_LASTLOGGEDIN.getDataType();

    /**
      * Categorizes accounts into categories
      */
    public static final EntityType ACCOUNTCATEGORY = org.infogrid.lid.model.account.AccountCategory._TYPE;

    /**
      * Name of the category.
      */
    public static final PropertyType ACCOUNTCATEGORY_NAME = org.infogrid.lid.model.account.AccountCategory.NAME;
    public static final org.infogrid.model.primitives.StringDataType ACCOUNTCATEGORY_NAME_type = (org.infogrid.model.primitives.StringDataType) ACCOUNTCATEGORY_NAME.getDataType();

    /**
      * A session of a user at a website.
      */
    public static final EntityType SESSION = org.infogrid.lid.model.account.Session._TYPE;

    /**
      * The TimeStamp when the user was first authenticated at this site.
      */
    public static final PropertyType SESSION_FIRSTAUTHENTICATED = org.infogrid.lid.model.account.Session.FIRSTAUTHENTICATED;
    public static final org.infogrid.model.primitives.TimeStampDataType SESSION_FIRSTAUTHENTICATED_type = (org.infogrid.model.primitives.TimeStampDataType) SESSION_FIRSTAUTHENTICATED.getDataType();

    /**
      * The TimeStamp when the user was most recently authenticated at this site.
      */
    public static final PropertyType SESSION_LASTAUTHENTICATED = org.infogrid.lid.model.account.Session.LASTAUTHENTICATED;
    public static final org.infogrid.model.primitives.TimeStampDataType SESSION_LASTAUTHENTICATED_type = (org.infogrid.model.primitives.TimeStampDataType) SESSION_LASTAUTHENTICATED.getDataType();

    /**
      * The TimeStamp when the user was most recently using this session successfully.
      */
    public static final PropertyType SESSION_LASTUSEDSUCCESSFULLY = org.infogrid.lid.model.account.Session.LASTUSEDSUCCESSFULLY;
    public static final org.infogrid.model.primitives.TimeStampDataType SESSION_LASTUSEDSUCCESSFULLY_type = (org.infogrid.model.primitives.TimeStampDataType) SESSION_LASTUSEDSUCCESSFULLY.getDataType();

    /**
      * The TimeStamp when the session has, or will expire and a new authentication is required.
      */
    public static final PropertyType SESSION_VALIDUNTIL = org.infogrid.lid.model.account.Session.VALIDUNTIL;
    public static final org.infogrid.model.primitives.TimeStampDataType SESSION_VALIDUNTIL_type = (org.infogrid.model.primitives.TimeStampDataType) SESSION_VALIDUNTIL.getDataType();

    /**
      * The IP address from where this session was created.
      */
    public static final PropertyType SESSION_CREATEDATIP = org.infogrid.lid.model.account.Session.CREATEDATIP;
    public static final org.infogrid.model.primitives.StringDataType SESSION_CREATEDATIP_type = (org.infogrid.model.primitives.StringDataType) SESSION_CREATEDATIP.getDataType();

    /**
      * Collects the known Accounts
      */
    public static final RelationshipType ACCOUNTCOLLECTION_COLLECTS_ACCOUNT = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.account/AccountCollection_Collects_Account" );

    /**
      * Categorizes the accounts into categories
      */
    public static final RelationshipType ACCOUNTCATEGORY_CATEGORIZES_ACCOUNT = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.account/AccountCategory_Categorizes_Account" );

    /**
      * Identifies the Account that owns this Session
      */
    public static final RelationshipType SESSION_FOR_ACCOUNT = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.account/Session_For_Account" );

    /**
      * Enumerates the identities possibly used by this Account
      */
    public static final RelationshipType ACCOUNT_MAYUSEIDENTITY_MESHOBJECT = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.account/Account_MayUseIdentity_MeshObject" );

    /**
      * Identifies the site where the Account is hosted. The site is now represented as a MeshObject\n            in order to reduce dependencies.
      */
    public static final RelationshipType ACCOUNT_ATSITE_MESHOBJECT = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.account/Account_AtSite_MeshObject" );

    /**
      * Identifies the website where the session is taking place
      */
    public static final RelationshipType SESSION_ATSITE_MESHOBJECT = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.account/Session_AtSite_MeshObject" );

    /**
      * Identifies the identity used for this session
      */
    public static final RelationshipType SESSION_USESIDENTITY_MESHOBJECT = ModelBaseSingleton.findRelationshipType( "org.infogrid.lid.model.account/Session_UsesIdentity_MeshObject" );

}
