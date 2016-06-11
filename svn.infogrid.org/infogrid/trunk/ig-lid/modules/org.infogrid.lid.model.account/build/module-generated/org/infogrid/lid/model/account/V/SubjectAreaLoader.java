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

package org.infogrid.lid.model.account.V;

import org.infogrid.modelbase.*;
import org.infogrid.model.primitives.*;
import org.infogrid.model.traversal.TraversalSpecification;
import org.infogrid.model.traversal.TraversalToPropertySpecification;
import org.infogrid.module.ModuleException;
import org.infogrid.module.ModuleRequirement;
import java.io.IOException;

/**
  * This class loads the model of the LID Account and Session Subject Area Subject Area.
  */
public class SubjectAreaLoader
        extends
            ModelLoader
{
    /**
      * Constructor.
      *
      * @param modelBase the ModelBase into which the SubjectArea will be loaded
      * @param loader the ClassLoader to be used for resolving resources
      */
    public SubjectAreaLoader(
            ModelBase   modelBase,
            ClassLoader loader )
    {
        super( modelBase );
        theLoader = loader;
    }

    /**
     * Instruct this object to instantiate its model.
     *
     * @param theInstantiator the MeshTypeLifecycleManager which shall be used to instantiate
     * @return the instantiated SubjectArea(s)
     * @throws MeshTypeNotFoundException thrown if there was an undeclared dependency in the model that could not be resolved
     * @throws InheritanceConflictException thrown if there was a conflict in the inheritance hierarchy of the newly loaded model
     * @throws IOException thrown if reading the model failed
     */
    protected SubjectArea [] loadModel(
            MeshTypeLifecycleManager theInstantiator )
        throws
            MeshTypeNotFoundException,
            InheritanceConflictException,
            IOException,
            org.infogrid.model.primitives.UnknownEnumeratedValueException
    {
        org.infogrid.util.logging.Log log = org.infogrid.util.logging.Log.getLogInstance( getClass() );
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( this, "loadModel" );
        }

        SubjectArea theSa = theInstantiator.createSubjectArea(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account" ),   // IdentifierValue           theIdentifier,
                org.infogrid.model.primitives.StringValue.create( "org.infogrid.lid.model.account" ),   // StringValue               theName,
                null,   // StringValue               theVersion,
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "LID Account and Session Subject Area" ) ),   // L10Map                    theUserNames,
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Captures the notion of an account at a site, and sessions performed with this account.\n        Local and/or remote personas may be associated with the account." , "text/html" ) ),   // L10Map                    theUserDescriptions,
                new SubjectArea[] { },   // SubjectArea []            theSubjectAreaDependencies,
                new ModuleRequirement[] { ModuleRequirement.create1( "org.infogrid.lid" ) },   // ModuleRequirement []      theModuleRequirements,
                theLoader,   // ClassLoader               theClassLoader,
                org.infogrid.model.primitives.BooleanValue.TRUE,   // BooleanValue              doGenerateInterfaceCode,
                org.infogrid.model.primitives.BooleanValue.TRUE ); // BooleanValue              doGenerateImplementationCode )

        // generateLoadOneEntity section

        EntityType obj0 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/AccountCollection" ),
                org.infogrid.model.primitives.StringValue.create( "AccountCollection" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Accounts" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Set of Accounts." , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { },
                new MeshTypeIdentifier [] {
},
                null,
                new String[] {},
                new StringValue[0],
                new StringValue[0],
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE );

        EntityType obj1 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Account" ),
                org.infogrid.model.primitives.StringValue.create( "Account" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Account" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "A user at a particular website, aka account." , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { },
                new MeshTypeIdentifier [] {
},
                null,
                new String[] {},
                new StringValue[0],
                new StringValue[] { org.infogrid.model.primitives.StringValue.create( "\n    /**\n     * User-visible String is the the nickname if there is one.\n     *\n     * @return the user-visible String representing this instance\n     */\n    public String get_UserVisibleString()\n    {\n        try {\n            StringValue name = getNickname();\n            if( name != null ) {\n                return name.value();\n            }\n        } catch( NotPermittedException ex ) {\n            // ignore;\n        }\n        return null;\n    }\n    /**\n     * Determine the Identifier of the site at which this LidAccount exists.\n     *\n     * @return the Identifier of the site\n     */\n    public org.infogrid.util.Identifier getSiteIdentifier()\n    {\n        org.infogrid.mesh.MeshObject site = traverse( AccountSubjectArea.ACCOUNT_ATSITE_MESHOBJECT.getSource() ).getSingleMember();\n        return site.getIdentifier();\n    }\n\n    /**\n     * Determine this LidAccount\'s status.\n     *\n     * @return the LidAccount\'s status\n     */\n    public org.infogrid.lid.account.LidAccount.LidAccountStatus getAccountStatus()\n    {\n        try {\n            EnumeratedValue status = getStatus();\n\n            if( AccountSubjectArea.ACCOUNT_STATUS_type_APPLIEDFOR.equals( status )) {\n                return org.infogrid.lid.account.LidAccount.LidAccountStatus.APPLIEDFOR;\n            } else if( AccountSubjectArea.ACCOUNT_STATUS_type_ACTIVE.equals( status )) {\n                return org.infogrid.lid.account.LidAccount.LidAccountStatus.ACTIVE;\n            } else if( AccountSubjectArea.ACCOUNT_STATUS_type_CLOSED.equals( getStatus() )) {\n                return org.infogrid.lid.account.LidAccount.LidAccountStatus.CLOSED;\n            } else if( AccountSubjectArea.ACCOUNT_STATUS_type_DISABLED.equals( getStatus() )) {\n                return org.infogrid.lid.account.LidAccount.LidAccountStatus.DISABLED;\n            } else if( AccountSubjectArea.ACCOUNT_STATUS_type_OBSOLETED.equals( getStatus() )) {\n                return org.infogrid.lid.account.LidAccount.LidAccountStatus.OBSOLETED;\n            } else if( AccountSubjectArea.ACCOUNT_STATUS_type_REFUSED.equals( getStatus() )) {\n                return org.infogrid.lid.account.LidAccount.LidAccountStatus.REFUSED;\n            } else {\n                log.error( \"Unexpected value: \" + getStatus() );\n            }\n        } catch( NotPermittedException ex ) {\n            // ignore;\n        }\n        return null;\n    }\n\n    /**\n     * Determine the set of remote Identifiers that are also associated with this LidAccount.\n     * The Identifier inherited from HasIdentifier is considered the local Identifier.\n     *\n     * @return the set of remote Identifiers, if any\n     */\n    public org.infogrid.util.Identifier [] getRemoteIdentifiers()\n    {\n        org.infogrid.mesh.set.MeshObjectSet remotes = traverse( AccountSubjectArea.ACCOUNT_MAYUSEIDENTITY_MESHOBJECT.getSource() );\n        return remotes.asIdentifiers();\n    }\n\n    /**\n     * Convenience method to determine whether this LidAccount is identified by the\n     * provided Identifier.\n     *\n     * @param identifier the Identifier to test\n     * @return true if this LidAccount is identified by the provided Identifier\n     */\n    public boolean isIdentifiedBy(\n            org.infogrid.util.Identifier identifier )\n    {\n        if( getIdentifier().equals( identifier )) {\n            return true;\n        }\n        org.infogrid.mesh.set.MeshObjectSet remotes = traverse( AccountSubjectArea.ACCOUNT_MAYUSEIDENTITY_MESHOBJECT.getSource() );\n        if( remotes.contains( identifier )) {\n            return true;\n        } else {\n            return false;\n        }\n    }\n\n    /**\n     * Obtain an attribute of the account\n     *\n     * @param key the name of the attribute\n     * @return the value of the attribute, or null\n     */\n    public String getAttribute(\n            String key )\n    {\n        return getAttributes().get( key );\n    }\n\n    /**\n     * Get the set of keys into the set of attributes.\n     *\n     * @return the keys into the set of attributes\n     */\n    public java.util.Set<String> getAttributeKeys()\n    {\n        return getAttributes().keySet(); // FIXME this can be done more efficiently\n    }\n\n    /**\n     * Obtain the map of attributes. This breaks encapsulation, but works much better\n     * for JSP pages.\n     *\n     * @return the map of attributes\n     */\n    public java.util.Map<String,String> getAttributes()\n    {\n        java.util.Map<String,String> ret = new java.util.HashMap<String,String>();\n        ret.put( IDENTIFIER_ATTRIBUTE_NAME, getIdentifier().toExternalForm() );\n\n        StringValue nick = null;\n        try {\n            nick = getNickname();\n        } catch( NotPermittedException ex ) {\n            // ignore\n        }\n        if( nick != null ) {\n            ret.put( NICKNAME_ATTRIBUTE_NAME, nick.value() );\n        }\n\n        return ret;\n    }\n\n    /**\n     * Obtain the subset of credential types applicable to this LidAccount\n     *\n     * @param set the set of credential types\n     * @return the subset of credential types\n     */\n    public org.infogrid.lid.credential.LidCredentialType [] getApplicableCredentialTypes(\n            org.infogrid.lid.credential.LidCredentialType [] set )\n    {\n        return set; // FIXME for now\n    }\n\n    /**\n     * Obtain a specific credential.\n     *\n     * @param type the LidCredentialType for which the credential is to be obtained\n     * @return the credential, or null\n     */\n    public String getCredentialFor(\n            org.infogrid.lid.credential.LidCredentialType type )\n    {\n        return null; // FIXME for now\n    }\n\n    /**\n     * Obtain the Identifiers of the set of groups that this LidAccount is a member of.\n     *\n     * @return the Identifiers\n     */\n    public org.infogrid.mesh.MeshObjectIdentifier [] getGroupIdentifiers()\n    {\n        org.infogrid.mesh.set.MeshObjectSet categories = traverse( AccountSubjectArea.ACCOUNTCATEGORY_CATEGORIZES_ACCOUNT.getDestination() );\n        return categories.asIdentifiers();\n    }\n\n    /**\n     * Obtain the names of the set of groups that this LidAccount is a member of.\n     *\n     * @return the names\n     */\n    public String [] getGroupNames()\n    {\n        org.infogrid.mesh.set.MeshObjectSet categories = traverse( AccountSubjectArea.ACCOUNTCATEGORY_CATEGORIZES_ACCOUNT.getDestination() );\n        String [] ret = new String[ categories.size() ];\n        for( int i=0 ; i<ret.length ; ++i ) {\n            try {\n                StringValue found = (StringValue) categories.get( i ).getPropertyValue( AccountSubjectArea.ACCOUNTCATEGORY_NAME );\n                if( found != null ) {\n                    ret[i] = found.value();\n                } else {\n                    ret[i] = categories.get( i ).getIdentifier().toExternalForm();\n                }\n\n            } catch( Throwable ex ) {\n                log.error( ex );\n            }\n        }\n        return ret;\n    }\n    " ), org.infogrid.model.primitives.StringValue.create( "\n    /**\n     * Cascading delete.\n     */\n    public void cascadingDelete()\n        throws\n            org.infogrid.meshbase.transaction.TransactionException,\n            NotPermittedException\n    {\n        org.infogrid.mesh.set.MeshObjectSet sessions = traverse( AccountSubjectArea.SESSION_FOR_ACCOUNT.getDestination() );\n        get_Delegate().getMeshBase().getMeshBaseLifecycleManager().deleteMeshObjects( sessions );\n    }\n            " ) },
                new String[] { "org.infogrid.lid.account.LidAccount" },
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE );

        org.infogrid.model.primitives.StringDataType obj1_pt0_type = org.infogrid.model.primitives.StringDataType.theDefault;
        PropertyType obj1_pt0 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Account_Nickname" ),
                org.infogrid.model.primitives.StringValue.create( "Nickname" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Local nickname" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "The user\'s local nick name, if any." , "text/html" ) ),
                obj1,
                theSa,
                obj1_pt0_type,
                null,
                null,
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.FloatValue.create( 0.0 ) );

        org.infogrid.model.primitives.BlobDataType obj1_pt1_type = org.infogrid.model.primitives.BlobDataType.theJdkSupportedBitmapType;
        PropertyType obj1_pt1 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Account_Picture" ),
                org.infogrid.model.primitives.StringValue.create( "Picture" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Picture" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "The user\'s picture, if any." , "text/html" ) ),
                obj1,
                theSa,
                obj1_pt1_type,
                null,
                null,
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.FloatValue.create( 0.0 ) );

        org.infogrid.model.primitives.EnumeratedDataType obj1_pt2_type = org.infogrid.model.primitives.EnumeratedDataType.create( new String[] { "AppliedFor", "Active", "Closed", "Disabled", "Obsoleted", "Refused" }, new org.infogrid.model.primitives.L10PropertyValueMap[] { org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Applied for" ) ), org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Active" ) ), org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Closed" ) ), org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Disabled" ) ), org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Obsoleted" ) ), org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Refused" ) ) }, new org.infogrid.model.primitives.L10PropertyValueMap[] { org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Account has been applied for, but not approved or rejected yet." , "text/html" ) ), org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "The Account has been in use and can be used again." , "text/html" ) ), org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "The Account has closed based on the customer\'s request. It may or may not\n                            become active again." , "text/html" ) ), org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "The Account has been disabled and cannot currently be used. It may or may not\n                            become active again." , "text/html" ) ), org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "The Account has been disabled and will never be used again." , "text/html" ) ), org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Account was applied for, and the site operator decided not to approve the application.\n                            It is unlikely but not impossible that it will be approved in the future." , "text/html" ) ) }, org.infogrid.model.primitives.EnumeratedDataType.theDefault );
        PropertyType obj1_pt2 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Account_Status" ),
                org.infogrid.model.primitives.StringValue.create( "Status" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Status" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Status of the account." , "text/html" ) ),
                obj1,
                theSa,
                obj1_pt2_type,
                obj1_pt2_type.select( "AppliedFor" ),
                null,
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.FloatValue.create( 0.0 ) );

        org.infogrid.model.primitives.TimeStampDataType obj1_pt3_type = org.infogrid.model.primitives.TimeStampDataType.theDefault;
        PropertyType obj1_pt3 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Account_LastLoggedIn" ),
                org.infogrid.model.primitives.StringValue.create( "LastLoggedIn" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Last logged in" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "The time when the user last logged into this account. This is the time of log-in, not\n                 the last time the account was used." , "text/html" ) ),
                obj1,
                theSa,
                obj1_pt3_type,
                null,
                null,
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.FloatValue.create( 0.0 ) );

        EntityType obj2 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/AccountCategory" ),
                org.infogrid.model.primitives.StringValue.create( "AccountCategory" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Account Category" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Categorizes accounts into categories" , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { },
                new MeshTypeIdentifier [] {
},
                null,
                new String[] {},
                new StringValue[0],
                new StringValue[0],
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE );

        org.infogrid.model.primitives.StringDataType obj2_pt0_type = org.infogrid.model.primitives.StringDataType.theDefault;
        PropertyType obj2_pt0 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/AccountCategory_Name" ),
                org.infogrid.model.primitives.StringValue.create( "Name" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Name" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Name of the category." , "text/html" ) ),
                obj2,
                theSa,
                obj2_pt0_type,
                null,
                null,
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.FloatValue.create( 0.0 ) );

        EntityType obj3 = theInstantiator.createEntityType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Session" ),
                org.infogrid.model.primitives.StringValue.create( "Session" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Session" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "A session of a user at a website." , "text/html" ) ),
                null,
                theSa,
                new AttributableMeshType[] { },
                new MeshTypeIdentifier [] {
},
                null,
                new String[] {},
                new StringValue[0],
                new StringValue[] { org.infogrid.model.primitives.StringValue.create( "\n    /**\n     * Obtain the client whose session it is.\n     *\n     * @return the client\n     */\n    public org.infogrid.util.HasIdentifier getSessionClient()\n    {\n        MeshObject found = traverse( AccountSubjectArea.SESSION_USESIDENTITY_MESHOBJECT.getSource() ).getSingleMember();\n        return found;\n    }\n\n    /**\n     * Obtain the Identifier of the site where the session takes place.\n     *\n     * @return the site Identifier\n     */\n    public org.infogrid.util.Identifier getSiteIdentifier()\n    {\n        MeshObject found = traverse(\n                AccountSubjectArea.SESSION_ATSITE_MESHOBJECT.getSource() ).getSingleMember();\n        if( found == null ) {\n            return null;\n        } else {\n            return found.getIdentifier();\n        }\n    }\n\n    /**\n     * Obtain the LidAccount on whose behalf the session takes place.\n     *\n     * @return the LidAccount, if any\n     */\n    public Account getAccount()\n    {\n        try {\n            MeshObject found = traverse( AccountSubjectArea.SESSION_FOR_ACCOUNT.getSource() ).getSingleMember();\n            if( found != null ) {\n                return (org.infogrid.lid.model.account.Account) found.getTypedFacadeFor( AccountSubjectArea.ACCOUNT );\n            }\n        } catch( NotBlessedException ex ) {\n            log.error( ex );\n        }\n        return null;\n    }\n\n    /**\n     * Obtain the time the LidSession was last authenticated with something stronger than a session cookie.\n     *\n     * @return the time the LidSession was last authenticated, in System.currentTimeMillis() format\n     */\n    public long getTimeLastAuthenticated()\n    {\n        try {\n            TimeStampValue lastUsed = getLastAuthenticated();\n            if( lastUsed == null ) {\n                return -1L;\n            }\n            return lastUsed.getAsMillis();\n        } catch( Throwable t ) {\n            log.error( t );\n            return -1L;\n        }\n    }\n\n    /**\n     * Obtain the time the LidSession was last used successfully.\n     *\n     * @return the time the LidSession was last used successfully, in System.currentTimeMillis() format\n     */\n    public long getTimeLastUsedSuccessfully()\n    {\n        try {\n            TimeStampValue lastUsed = getLastUsedSuccessfully();\n            if( lastUsed == null ) {\n                return -1L;\n            }\n            return lastUsed.getAsMillis();\n        } catch( Throwable t ) {\n            log.error( t );\n            return -1L;\n        }\n    }\n\n    /**\n     * Obtain the time when the LidSession will or has become invalid.\n     *\n     * @return the time the LidSession will or has become invalid, in System.currentTimeMillis() format\n     */\n    public long getTimeValidUntil()\n    {\n        try {\n            TimeStampValue validUntil = getValidUntil();\n            if( validUntil == null ) {\n                return -1L;\n            }\n            return validUntil.getAsMillis();\n        } catch( Throwable t ) {\n            log.error( t );\n            return -1L;\n        }\n    }\n\n    /**\n     * Obtain the session token.\n     *\n     * @return the session token\n     */\n    public String getSessionToken()\n    {\n        String ret = org.infogrid.lid.model.account.utils.MeshObjectIdentifierSessionTokenConverter.meshObjectIdentifierToToken(\n                getIdentifier(),\n                get_MeshBase().getIdentifier().toExternalForm() + \"#\" );\n\n        return ret;\n    }\n\n    /**\n     * Obtain the IP address of the client that created this session.\n     *\n     * @return the IP address\n     */\n    public String getCreationClientIp()\n    {\n        try {\n            StringValue ip = getCreatedAtIp();\n            if( ip != null ) {\n                return ip.value();\n            } else {\n                return null;\n            }\n        } catch( Throwable t ) {\n            log.error( t );\n            return null;\n        }\n    }\n\n    /**\n     * Determine whether this token is still valid.\n     *\n     * @return true if it is still valid.\n     */\n    public boolean isStillValid()\n    {\n        try {\n            TimeStampValue until = getValidUntil();\n            if( until == null ) {\n                return false;\n            }\n            return until.isInFuture();\n        } catch( Throwable t ) {\n            log.error( t );\n            return false;\n        }\n    }\n\n    /**\n     * Notify the session that it was used successfully.\n     */\n    public void useSuccessfully()\n    {\n        try {\n            setLastUsedSuccessfully( TimeStampValue.now() );\n        } catch( Throwable t ) {\n            log.error( t );\n        }\n    }\n\n    /**\n     * Renew the session.\n     *\n     * @param duration the duration, in milliseconds, from now\n     */\n    public void renew(\n            final long duration )\n    {\n        get_MeshBase().executeNow( new org.infogrid.meshbase.transaction.TransactionAction<Void>() {\n                public Void execute()\n                    throws\n                        Throwable\n                {\n                    setValidUntil( TimeStampValue.nowWithOffset( duration ));\n                    return null;\n                }\n        } );\n    }\n\n    /**\n     * Invalidate this session.\n     */\n    public void cancel()\n    {\n        get_MeshBase().executeNow( new org.infogrid.meshbase.transaction.TransactionAction<Void>() {\n                public Void execute()\n                    throws\n                        Throwable\n                {\n                    setValidUntil( TimeStampValue.nowWithOffset( -1L ));\n                    setTimeExpires( getValidUntil().getAsMillis() );\n                    return null;\n                }\n        } );\n    }\n\n    /**\n     * Obtain the key for that was used to create this object by the Factory.\n     *\n     * @return the key\n     */\n    public String getFactoryKey()\n    {\n        return getSessionToken();\n    }\n\n    /**\n     * Enable a Factory to indicate to the FactoryCreatedObject that it was\n     * it that created it.\n     *\n     * @param factory the Factory that created the FactoryCreatedObject\n     */\n    public void setFactory(\n            org.infogrid.util.Factory<String,org.infogrid.lid.session.LidSession,org.infogrid.lid.session.LidSessionManagerArguments> factory )\n    {\n        throw new UnsupportedOperationException();\n    }\n\n    /**\n     * Obtain the Factory that created this FactoryCreatedObject. In case of\n     * chained factories that delegate to each other, this method is\n     * supposed to return the outermost factory invoked by the application programmer.\n     *\n     * @return the Factory that created the FactoryCreatedObject\n     */\n    public org.infogrid.util.Factory<String,org.infogrid.lid.session.LidSession,org.infogrid.lid.session.LidSessionManagerArguments> getFactory()\n    {\n        throw new UnsupportedOperationException();\n    }\n\n    " ) },
                new String[] { "org.infogrid.lid.session.LidSession" },
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE );

        org.infogrid.model.primitives.TimeStampDataType obj3_pt0_type = org.infogrid.model.primitives.TimeStampDataType.theDefault;
        PropertyType obj3_pt0 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Session_FirstAuthenticated" ),
                org.infogrid.model.primitives.StringValue.create( "FirstAuthenticated" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "First authenticated at" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "The TimeStamp when the user was first authenticated at this site." , "text/html" ) ),
                obj3,
                theSa,
                obj3_pt0_type,
                null,
                org.infogrid.model.primitives.StringValue.create( "TimeStampValue.now()" ),
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.FloatValue.create( 0.0 ) );

        org.infogrid.model.primitives.TimeStampDataType obj3_pt1_type = org.infogrid.model.primitives.TimeStampDataType.theDefault;
        PropertyType obj3_pt1 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Session_LastAuthenticated" ),
                org.infogrid.model.primitives.StringValue.create( "LastAuthenticated" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Most recently authenticated at" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "The TimeStamp when the user was most recently authenticated at this site." , "text/html" ) ),
                obj3,
                theSa,
                obj3_pt1_type,
                null,
                org.infogrid.model.primitives.StringValue.create( "TimeStampValue.now()" ),
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.FloatValue.create( 0.0 ) );

        org.infogrid.model.primitives.TimeStampDataType obj3_pt2_type = org.infogrid.model.primitives.TimeStampDataType.theDefault;
        PropertyType obj3_pt2 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Session_LastUsedSuccesfully" ),
                org.infogrid.model.primitives.StringValue.create( "LastUsedSuccessfully" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Most recently used successfully at" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "The TimeStamp when the user was most recently using this session successfully." , "text/html" ) ),
                obj3,
                theSa,
                obj3_pt2_type,
                null,
                null,
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.FloatValue.create( 0.0 ) );

        org.infogrid.model.primitives.TimeStampDataType obj3_pt3_type = org.infogrid.model.primitives.TimeStampDataType.theDefault;
        PropertyType obj3_pt3 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Session_ValidUntil" ),
                org.infogrid.model.primitives.StringValue.create( "ValidUntil" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Valid until" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "The TimeStamp when the session has, or will expire and a new authentication is required." , "text/html" ) ),
                obj3,
                theSa,
                obj3_pt3_type,
                null,
                org.infogrid.model.primitives.StringValue.create( "TimeStampValue.now()" ),
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.FloatValue.create( 0.0 ) );

        org.infogrid.model.primitives.StringDataType obj3_pt4_type = org.infogrid.model.primitives.StringDataType.theDefault;
        PropertyType obj3_pt4 = theInstantiator.createPropertyType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Session_CreatedAtIp" ),
                org.infogrid.model.primitives.StringValue.create( "CreatedAtIp" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Created at IP address" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "The IP address from where this session was created." , "text/html" ) ),
                obj3,
                theSa,
                obj3_pt4_type,
                null,
                null,
                new String[] {},
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.FALSE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.BooleanValue.TRUE,
                org.infogrid.model.primitives.FloatValue.create( 0.0 ) );

        // generateLoadOneRelationshipType section

        RelationshipType obj4 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/AccountCollection_Collects_Account" ),
                org.infogrid.model.primitives.StringValue.create( "AccountCollection_Collects_Account" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "collects" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Collects the known Accounts" , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 1, 1 ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/AccountCollection" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Account" ) ),
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj7 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/AccountCategory_Categorizes_Account" ),
                org.infogrid.model.primitives.StringValue.create( "AccountCategory_Categorizes_Account" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "categorizes" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Categorizes the accounts into categories" , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/AccountCategory" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Account" ) ),
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj10 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Session_For_Account" ),
                org.infogrid.model.primitives.StringValue.create( "Session_For_Account" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "for" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Identifies the Account that owns this Session" , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 1, 1 ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Session" ) ),
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Account" ) ),
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj13 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Account_MayUseIdentity_MeshObject" ),
                org.infogrid.model.primitives.StringValue.create( "Account_MayUseIdentity_MeshObject" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "May use identity" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Enumerates the identities possibly used by this Account" , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 1, org.infogrid.model.primitives.MultiplicityValue.N ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Account" ) ),
                null,
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj16 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Account_AtSite_MeshObject" ),
                org.infogrid.model.primitives.StringValue.create( "Account_AtSite_MeshObject" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "At site" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Identifies the site where the Account is hosted. The site is now represented as a MeshObject\n            in order to reduce dependencies." , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 1, 1 ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Account" ) ),
                null,
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj19 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Session_AtSite_MeshObject" ),
                org.infogrid.model.primitives.StringValue.create( "Session_AtSite_MeshObject" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "At site" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Identifies the website where the session is taking place" , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 1, 1 ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Session" ) ),
                null,
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        RelationshipType obj22 = theInstantiator.createRelationshipType(
                theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Session_UsesIdentity_MeshObject" ),
                org.infogrid.model.primitives.StringValue.create( "Session_UsesIdentity_MeshObject" ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.StringValue.create( "Uses identity" ) ),
                org.infogrid.model.primitives.L10PropertyValueMapImpl.create( org.infogrid.model.primitives.BlobDataType.theTextAnyType.createBlobValue( "Identifies the identity used for this session" , "text/html" ) ),
                theSa,
                org.infogrid.model.primitives.MultiplicityValue.create( 1, 1 ),  
                org.infogrid.model.primitives.MultiplicityValue.create( 0, org.infogrid.model.primitives.MultiplicityValue.N ),  
                theModelBase.findEntityTypeByIdentifier( theModelBase.getMeshTypeIdentifierFactory().fromExternalForm( "org.infogrid.lid.model.account/Session" ) ),
                null,
                new RoleType[] { },  
                new RoleType[] { },  
                new String[] {}, 
                new String[] {}, 
                org.infogrid.model.primitives.BooleanValue.FALSE,  
                org.infogrid.model.primitives.BooleanValue.TRUE,  
                org.infogrid.model.primitives.BooleanValue.TRUE );

        // generateFixOneEntityType section

        return new SubjectArea[] { theSa };
    }

    /**
      * The ClassLoader to be used for resources.
      */
    protected ClassLoader theLoader;

}
