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
// Copyright 1998-2008 by R-Objects Inc. dba NetMesh Inc., Johannes Ernst
// All rights reserved.
//

package org.infogrid.util;

/**
 * Simplifies {@link SwappingHashMapListener} development.
 * 
 * @param K the type of key
 * @param V the type of value
 */
public abstract class AbstractSwappingHashMapListener<K,V>
        implements
            SwappingHashMapListener<K,V>
{
    /**
     * A key-value pair has been loaded from storage.
     *
     * @param source the SwappingHashMap that emitted this event
     * @param key the key of the key-value pair that was loaded
     * @param value the value of the key-value pair that was saved
     */
    public void loadedFromStorage(
            SwappingHashMap<K,V> source,
            K                    key,
            V                    value )
    {
        // no op
    }

    /**
     * A key-value pair has been saved to storage.
     *
     * @param source the SwappingHashMap that emitted this event
     * @param key the key of the key-value pair that was saved
     * @param value the value of the key-value pair that was saved
     */
    public void savedToStorage(
            SwappingHashMap<K,V> source,
            K                    key,
            V                    value )
    {
        // no op
    }

    /**
     * A key-value pair has been removed from storage.
     *
     * @param source the SwappingHashMap that emitted this event
     * @param key the key of the key-value pair that was saved
     */
    public void removedFromStorage(
            SwappingHashMap<K,V> source,
            K                    key )
    {
        // no op
    }
}
