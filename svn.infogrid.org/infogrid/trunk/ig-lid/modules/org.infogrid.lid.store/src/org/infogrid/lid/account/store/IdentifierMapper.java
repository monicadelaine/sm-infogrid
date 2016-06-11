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
// Copyright 1998-2010 by R-Objects Inc. dba NetMesh Inc., Johannes Ernst
// All rights reserved.
//

package org.infogrid.lid.account.store;

import java.io.UnsupportedEncodingException;
import org.infogrid.store.StoreEntryMapper;
import org.infogrid.store.StoreValue;
import org.infogrid.store.StoreValueDecodingException;
import org.infogrid.store.StoreValueEncodingException;
import org.infogrid.util.Identifier;
import org.infogrid.util.SimpleStringIdentifier;
import org.infogrid.util.logging.Log;

/**
 * Maps a single identifier.
 */
class IdentifierMapper
        implements
            StoreEntryMapper<Identifier,Identifier>
{
    private static final Log log = Log.getLogInstance( SimpleLidAccountMapper.class  ); // our own, private logger

    /**
     * Constructor.
     */
    public IdentifierMapper()
    {
        // no op
    }

    /**
     * Map a key to a String value that can be used for the Store.
     *
     * @param key the key object
     * @return the corresponding String value that can be used for the Store
     */
    public String keyToString(
            Identifier key )
    {
        return key.toExternalForm();
    }

    /**
     * Map a String value that can be used for the Store to a key object.
     *
     * @param stringKey the key in String form
     * @return the corresponding key object
     */
    public Identifier stringToKey(
            String stringKey )
    {
        Identifier ret = SimpleStringIdentifier.create( stringKey );
        return ret;
    }

    /**
     * Map a StoreValue to a value.
     *
     * @param key the key to the StoreValue
     * @param value the StoreValue
     * @return the value
     * @throws StoreValueDecodingException thrown if the StoreValue could not been decoded
     */
    public Identifier decodeValue(
            Identifier key,
            StoreValue value )
        throws
            StoreValueDecodingException
    {
        try {
            Identifier ret = SimpleStringIdentifier.create( new String( value.getData(), CHARSET ));
            return ret;

        } catch( UnsupportedEncodingException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
     * Obtain the preferred encoding id of this StoreEntryMapper.
     *
     * @return the preferred encoding id
     */
    public String getPreferredEncodingId()
    {
        return ENCODING;
    }

    /**
     * Obtain the time a value was created.
     *
     * @param value the time a value was created.
     * @return the time created, in System.currentTimeMillis() format
     */
    public long getTimeCreated(
            Identifier value )
    {
        return -1L;
    }

    /**
     * Obtain the time a value was last updated.
     *
     * @param value the time a value was last updated.
     * @return the time updated, in System.currentTimeMillis() format
     */
    public long getTimeUpdated(
            Identifier value )
    {
        return -1L;
    }

    /**
     * Obtain the time a value was last read.
     *
     * @param value the time a value was last read.
     * @return the time read, in System.currentTimeMillis() format
     */
    public long getTimeRead(
            Identifier value )
    {
        return -1L;
    }

    /**
     * Obtain the time a value will expire.
     *
     * @param value the time a value will expire.
     * @return the time will expire, in System.currentTimeMillis() format
     */
    public long getTimeExpires(
            Identifier value )
    {
        return -1L;
    }

    /**
     * Obtain the Identifier as a byte array.
     *
     * @param value the value
     * @return the byte array
     * @throws StoreValueEncodingException thrown if the value could not been encoded
     */
    public byte [] asBytes(
            Identifier value )
        throws
            StoreValueEncodingException
    {
        try {
            return value.toExternalForm().getBytes( CHARSET );

        } catch( UnsupportedEncodingException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
     * The encoding to use.
     */
    public static final String ENCODING = SimpleLidAccountMapper.class.getName();

    /**
     * The character set to use.
     */
    public static final String CHARSET = "UTF-8";
}