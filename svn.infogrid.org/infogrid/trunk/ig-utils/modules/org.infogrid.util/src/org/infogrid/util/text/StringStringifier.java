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
// Copyright 1998-2011 by R-Objects Inc. dba NetMesh Inc., Johannes Ernst
// All rights reserved.
//

package org.infogrid.util.text;

import java.util.Iterator;
import org.infogrid.util.OneElementIterator;

/**
 * Stringifies a single String.
 */
public class StringStringifier
        extends
            AbstractStringifier<String>
{
    /**
     * Factory method.
     *
     * @return the created StringStringifier
     */
    public static StringStringifier create()
    {
        return new StringStringifier();
    }

    /**
     * No-op constructor. Use factory method.
     */
    protected StringStringifier()
    {
        // no op
    }

    /**
     * Format an Object using this Stringifier.
     *
     * @param soFar the String so far, if any
     * @param arg the Object to format, or null
     * @param pars collects parameters that may influence the String representation. Always provided.
     * @return the formatted String
     */
    public String format(
            String                         soFar,
            String                         arg,
            StringRepresentationParameters pars )
    {
        String ret = potentiallyShorten( arg, pars );

        ret = escape( ret );

        return ret;
    }

    /**
     * Format an Object using this Stringifier. This may be null.
     *
     * @param soFar the String so far, if any
     * @param arg the Object to format, or null
     * @param pars collects parameters that may influence the String representation. Always provided.
     * @return the formatted String
     * @throws ClassCastException thrown if this Stringifier could not format the provided Object
     *         because the provided Object was not of a type supported by this Stringifier
     */
    public String attemptFormat(
            String                         soFar,
            Object                         arg,
            StringRepresentationParameters pars )
        throws
            ClassCastException
    {
        if( arg == null ) {
            return "";
        } else if( arg instanceof String ) {
            return format( soFar, (String) arg, pars );
        } else {
            return format( soFar, String.valueOf( arg ), pars ); // fallback
        }
    }
    
    /**
     * Parse out the Object in rawString that were inserted using this Stringifier.
     *
     * @param rawString the String to parse
     * @param factory the factory needed to create the parsed values, if any
     * @return the found Object
     * @throws StringifierParseException thrown if a parsing problem occurred
     */
    @Override
    public String unformat(
            String                     rawString,
            StringifierUnformatFactory factory )
        throws
            StringifierParseException
    {
        String ret = unescape( rawString );
        return ret;
    }
    
    /**
     * Overridable method to possibly escape a String first.
     *
     * @param s the String to be escaped
     * @return the escaped String
     */
    protected String escape(
            String s )
    {
        return s;
    }

    /**
     * Overridable method to possibly unescape a String first.
     *
     * @param s the String to be unescaped
     * @return the unescaped String
     */
    protected String unescape(
            String s )
    {
        return s;
    }

    /**
     * Obtain an iterator that iterates through all the choices that exist for this Stringifier to
     * parse the String. The iterator returns zero elements if the String could not be parsed
     * by this Stringifier.
     * FIXME: This doesn't work correctly for escaped Strings.
     *
     * @param rawString the String to parse
     * @param startIndex the position at which to parse rawString
     * @param endIndex the position at which to end parsing rawString
     * @param max the maximum number of choices to be returned by the Iterator.
     * @param matchAll if true, only return those matches that match the entire String from startIndex to endIndex.
     *                 If false, return other matches that only match the beginning of the String.
     * @param factory the factory needed to create the parsed values, if any
     * @return the Iterator
     */
    @Override
    public Iterator<StringifierParsingChoice<String>> parsingChoiceIterator(
            final String                     rawString,
            final int                        startIndex,
            final int                        endIndex,
            final int                        max,
            final boolean                    matchAll,
            final StringifierUnformatFactory factory )
    {
        if( matchAll ) {
            return OneElementIterator.<StringifierParsingChoice<String>>create(
                    new StringifierValueParsingChoice<String>(
                            startIndex,
                            endIndex,
                            rawString.substring( startIndex, endIndex )));

        } else {
            return new Iterator<StringifierParsingChoice<String>>() {
                /**
                 * Does the iterator have a next element?
                 *
                 * @return true if the iterator has a next element
                 */
                public boolean hasNext()
                {
                    if( currentEnd-startIndex >= max ) {
                        return false;
                    }
                    if( currentEnd >= rawString.length()) {
                        return false;
                    }
                    return true;
                }

                /**
                 * Obtain the next element in the iteration.
                 *
                 * @return the next element
                 */
                public StringifierParsingChoice<String> next()
                {
                    StringifierParsingChoice<String> ret = new StringifierValueParsingChoice<String>(
                            startIndex,
                            currentEnd,
                            rawString.substring( startIndex, currentEnd ));

                    ++currentEnd;
                    return ret;
                }

                /**
                 * Throws UnsupportedOperationException at all times.
                 *
                 * @throws UnsupportedOperationException at all times.
                 */
                public void remove()
                    throws
                        UnsupportedOperationException
                {
                    throw new UnsupportedOperationException();
                }

                /**
                 * How far have we parsed so far.
                 */
                protected int currentEnd = startIndex;
            };
        }
    }
}
