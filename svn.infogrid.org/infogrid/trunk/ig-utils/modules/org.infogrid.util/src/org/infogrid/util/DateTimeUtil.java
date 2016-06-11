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

package org.infogrid.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Help with date/time as defined in RFC 3339 section 5.6.
 */
public abstract class DateTimeUtil
{
    /**
     * Private constructor to keep this abstract.
     */
    private DateTimeUtil() {}
    
    /**
     * Convert a Date to an RFC 3339 String.
     *
     * @param d the Date
     * @return the String
     */
    public static String dateToRfc3339(
            Date d )
    {
        String ret = theRfc3339Format.format( d );

        return ret;
    }

    /**
     * Convert an RFC 3309 String to a Date.
     *
     * @param s the String
     * @return the Date
     * @throws ParseException thrown if a syntax error occurred
     */
    public static Date rfc3339ToDate(
            String s )
        throws
            ParseException
    {
        s = s.toUpperCase();

        Date ret = theRfc3339Format.parse( s );

        return ret;
    }

    /**
     * Convert a Date to a W3C String.
     *
     * @param d the Date
     * @return the String
     */
    public static String dateToW3c(
            Date d )
    {
        String ret = theW3cFormat.format( d );

        return ret;
    }

    /**
     * Convert a W3C String to a Date.
     *
     * @param s the String
     * @return the Date
     * @throws ParseException thrown if a syntax error occurred
     */
    public static Date w3cToDate(
            String s )
        throws
            ParseException
    {
        s = s.toUpperCase();

        Date ret = theW3cFormat.parse( s );

        return ret;
    }

    /**
     * The UTC TimeZone.
     */
    public static final TimeZone UTC = TimeZone.getTimeZone( "UTC" );

    /**
     * Date format to use for RFC 3339.
     */
    public static final SimpleDateFormat theRfc3339Format = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    static {
        theRfc3339Format.setTimeZone( UTC );
    }

    /**
     * Date format to use for W3C.
     */
    public static final SimpleDateFormat theW3cFormat = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss'Z'");
    static {
        theW3cFormat.setTimeZone( UTC );
    }
}
