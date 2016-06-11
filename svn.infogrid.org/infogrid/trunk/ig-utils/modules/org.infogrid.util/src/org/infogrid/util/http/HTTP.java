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

package org.infogrid.util.http;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import org.infogrid.util.ArrayHelper;
import org.infogrid.util.ResourceHelper;
import org.infogrid.util.logging.CanBeDumped;
import org.infogrid.util.logging.Dumper;
import org.infogrid.util.logging.Log;

/**
 * A helper class containing HTTP client-side functions.
 */
public abstract class HTTP
{
    private static final Log log = Log.getLogInstance( HTTP.class ); // our own, private logger

    /**
     * Private constructor to keep this abstract.
     */
    private HTTP() {}

    /**
     * Perform an HTTP GET and follow redirects.
     *
     * @param url the URL on which to perform the HTTP GET
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static GetResponse http_get(
            URL url )
        throws
            IOException
    {
        return http_get( url, null, true, null, HTTP_CONNECT_TIMEOUT, HTTP_READ_TIMEOUT, null );
    }

    /**
     * Perform an HTTP GET and follow redirects.
     *
     * @param url the URL on which to perform the HTTP GET
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static GetResponse http_get(
            String url )
        throws
            IOException
    {
        return http_get( new URL( url ), null, true, null, HTTP_CONNECT_TIMEOUT, HTTP_READ_TIMEOUT, null );
    }

    /**
     * Perform an HTTP GET and follow redirects. Specify which content types
     * are acceptable.
     *
     * @param url the URL on which to perform the HTTP GET
     * @param acceptHeader value of the accept header, if any 
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static GetResponse http_get(
            URL    url,
            String acceptHeader )
        throws
            IOException
    {
        return http_get( url, acceptHeader, true, null, HTTP_CONNECT_TIMEOUT, HTTP_READ_TIMEOUT, null );
    }

    /**
     * Perform an HTTP GET and follow redirects. Specify which content types
     * are acceptable.
     *
     * @param url the URL on which to perform the HTTP GET
     * @param acceptHeader value of the accept header, if any 
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static GetResponse http_get(
            String url,
            String acceptHeader )
        throws
            IOException
    {
        return http_get( new URL( url ), acceptHeader, true, null, HTTP_CONNECT_TIMEOUT, HTTP_READ_TIMEOUT, null );
    }

    /**
     * Perform an HTTP GET.
     *
     * @param url the URL on which to perform the HTTP GET
     * @param followRedirects if true, automatically follow redirects.
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static GetResponse http_get(
            URL     url,
            boolean followRedirects )
        throws
            IOException
    {
        return http_get( url, null, followRedirects, null, HTTP_CONNECT_TIMEOUT, HTTP_READ_TIMEOUT, null );
    }

    /**
     * Perform an HTTP GET.
     *
     * @param url the URL on which to perform the HTTP GET
     * @param followRedirects if true, automatically follow redirects.
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static GetResponse http_get(
            String  url,
            boolean followRedirects )
        throws
            IOException
    {
        return http_get( new URL( url ), null, followRedirects, null, HTTP_CONNECT_TIMEOUT, HTTP_READ_TIMEOUT, null );
    }

    /**
     * Perform an HTTP GET.
     *
     * @param url the URL on which to perform the HTTP GET
     * @param followRedirects if true, automatically follow redirects.
     * @param cookies map of cookies to send
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static GetResponse http_get(
            URL                                url,
            boolean                            followRedirects,
            Map<String,? extends CharSequence> cookies )
        throws
            IOException
    {
        return http_get( url, null, followRedirects, cookies, HTTP_CONNECT_TIMEOUT, HTTP_READ_TIMEOUT, null );
    }

    /**
     * Perform an HTTP GET.
     *
     * @param url the URL on which to perform the HTTP GET
     * @param followRedirects if true, automatically follow redirects.
     * @param cookies map of cookies to send
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static GetResponse http_get(
            String                             url,
            boolean                            followRedirects,
            Map<String,? extends CharSequence> cookies )
        throws
            IOException
    {
        return http_get( new URL( url ), null, followRedirects, cookies, HTTP_CONNECT_TIMEOUT, HTTP_READ_TIMEOUT, null );
    }

    /**
     * Perform an HTTP GET. Specify which content types
     * are acceptable, whether to follow redirects, and which Cookies to convey.
     * For simplicity, this can also open non-HTTP URLs although redirects,
     * acceptable content types, and cookies are then ignored.
     *
     * @param url the URL on which to perform the HTTP GET
     * @param acceptHeader value of the accept header, if any
     * @param followRedirects if true, automatically follow redirects.
     * @param cookies map of cookies to send
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static GetResponse http_get(
            String                             url,
            String                             acceptHeader,
            boolean                            followRedirects,
            Map<String,? extends CharSequence> cookies )
        throws
            IOException
    {
        return http_get( new URL( url ), acceptHeader, followRedirects, cookies, HTTP_CONNECT_TIMEOUT, HTTP_READ_TIMEOUT, null );
    }

    /**
     * Perform an HTTP GET. Specify which content types
     * are acceptable, whether to follow redirects, and which Cookies to convey.
     * For simplicity, this can also open non-HTTP URLs although redirects,
     * acceptable content types, and cookies are then ignored.
     *
     * @param url the URL on which to perform the HTTP GET
     * @param acceptHeader value of the accept header, if any
     * @param followRedirects if true, automatically follow redirects.
     * @param cookies map of cookies to send
     * @param connectTimeout the timeout, in milliseconds, for HTTP connect attempts
     * @param readTimeout the timeout, in milliseconds, for attempts to read from an HTTP connection
     * @param hostnameVerifier a custom hostname verifier, if any, to deal with non-standard SSL certs
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static GetResponse http_get(
            String                             url,
            String                             acceptHeader,
            boolean                            followRedirects,
            Map<String,? extends CharSequence> cookies,
            int                                connectTimeout,
            int                                readTimeout,
            HostnameVerifier                   hostnameVerifier )
        throws
            IOException
    {
        return http_get( new URL( url ), acceptHeader, followRedirects, cookies, connectTimeout, readTimeout, null );
    }

    /**
     * Perform an HTTP GET. Specify which content types
     * are acceptable, whether to follow redirects, and which Cookies to convey.
     * For simplicity, this can also open non-HTTP URLs although redirects,
     * acceptable content types, and cookies are then ignored.
     *
     * @param url the URL on which to perform the HTTP GET
     * @param acceptHeader value of the accept header, if any 
     * @param followRedirects if true, automatically follow redirects.
     * @param cookies map of cookies to send
     * @param connectTimeout the timeout, in milliseconds, for HTTP connect attempts
     * @param readTimeout the timeout, in milliseconds, for attempts to read from an HTTP connection
     * @param hostnameVerifier a custom hostname verifier, if any, to deal with non-standard SSL certs
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static GetResponse http_get(
            URL                                url,
            String                             acceptHeader,
            boolean                            followRedirects,
            Map<String,? extends CharSequence> cookies,
            int                                connectTimeout,
            int                                readTimeout,
            HostnameVerifier                   hostnameVerifier )
        throws
            IOException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( HTTP.class.getName(), "http_get", url, acceptHeader, followRedirects, cookies, connectTimeout, readTimeout );
        }

        URLConnection conn = url.openConnection();
        if( conn instanceof HttpURLConnection ) {
            HttpURLConnection realConn = (HttpURLConnection) conn;

            realConn.setInstanceFollowRedirects( followRedirects );
            if( connectTimeout >= 0 ) {
                realConn.setConnectTimeout( connectTimeout );
            }
            if( readTimeout >= 0 ) {
                realConn.setReadTimeout( readTimeout );
            }
        }
        if( hostnameVerifier != null && conn instanceof HttpsURLConnection ) {
            HttpsURLConnection realConn = (HttpsURLConnection) conn;
            realConn.setHostnameVerifier( hostnameVerifier );
        }

        if( cookies != null && !cookies.isEmpty() ) {
            StringBuilder cookieString = new StringBuilder();
            String       sep = "";

            Iterator<String> iter = cookies.keySet().iterator();
            while( iter.hasNext() ) {
                String       key   = iter.next();
                CharSequence value = cookies.get( key );
                cookieString.append( sep ).append( encodeCookieName( key ));
                if( value != null ) {
                    cookieString.append( "=" ).append( encodeToQuotedString( value.toString() ));
                }
                sep = "; ";
            }
            conn.setRequestProperty( "Cookie", cookieString.toString() );
        }
        if( acceptHeader != null && acceptHeader.length() > 0 ) {
            conn.setRequestProperty( "Accept", acceptHeader );
        }

        InputStream input;
        try {
            input = conn.getInputStream();
        } catch( IOException ex ) {
            // Sun, in its wisdom, doesn't let us get at the actual response in case of 404 or 410 or 500.
            input = null;
        }
        int                      status       = (conn instanceof HttpURLConnection) ? ((HttpURLConnection)conn).getResponseCode() : 200;
        long                     lastModified = conn.getLastModified();
        Map<String,List<String>> headers      = conn.getHeaderFields();
        
        GetResponse ret = new GetResponse(
                url, // from here: arguments provided to this method
                acceptHeader,
                cookies,
                connectTimeout,
                readTimeout,
                hostnameVerifier,
                String.valueOf( status ), // from here: response parameters obtained
                input,
                lastModified,
                headers );

        if( input != null ) {
            input.close();
        }

        if( log.isTraceEnabled() ) {
            log.traceMethodCallExit( HTTP.class.getName(), "http_get", ret );
        }

        return ret;
    }

    /**
     * Obtain an InputStream from a certain URL.
     *
     * @param url the URL on which to perform the HTTP GET
     * @return the InputStream from the URL
     * @throws IOException thrown if the InputStream could not be obtained
     */
    public static InputStream http_get_inputStream(
            URL url )
       throws
           IOException
    {
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setInstanceFollowRedirects( true );

        InputStream  input = conn.getInputStream();
        return input;
    }

    /**
     * Obtain an InputStream from a certain URL.
     *
     * @param url the URL on which to perform the HTTP GET
     * @return the InputStream from the URL
     * @throws IOException thrown if the InputStream could not be obtained
     */
    public static InputStream http_get_inputStream(
            String url )
       throws
           IOException
    {
        return http_get_inputStream( new URL( url ));
    }

    /**
     * Perform an HTTP POST. Specify the POST parameters, and whether to follow redirects.
     *
     * @param url the URL on which to perform the HTTP POST
     * @param pars the name-value pairs such as from an HTML form
     * @param followRedirects if true, we follow redirects and post the content there instead
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static PostResponse http_post(
            URL                url,
            Map<String,String> pars,
            boolean            followRedirects )
       throws
           IOException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( HTTP.class.getName(), "http_post", url, pars, followRedirects );
        }

        return http_post( url, FORMENCODED_MIME, parsToString( pars ).getBytes( "UTF-8" ), followRedirects );
    }

    /**
     * Perform an HTTP POST. Specify the POST parameters, and whether to follow redirects.
     *
     * @param url the URL on which to perform the HTTP POST
     * @param pars the name-value pairs such as from an HTML form
     * @param followRedirects if true, we follow redirects and post the content there instead
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static PostResponse http_post(
            String             url,
            Map<String,String> pars,
            boolean            followRedirects )
       throws
           IOException
    {
        return http_post( new URL( url ), pars, followRedirects );
    }

    /**
     * Perform an HTTP POST. Specify the POST payload, and whether to follow redirects.
     *
     * @param url the URL on which to perform the HTTP POST
     * @param contentType the MIME type of the content to be posted to the URL
     * @param payload the content to be posted to the URL
     * @param followRedirects if true, we follow redirects and post the content there instead
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static PostResponse http_post(
            URL     url,
            String  contentType,
            byte [] payload,
            boolean followRedirects )
       throws
           IOException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( HTTP.class.getName(), "http_post", url, contentType, payload, followRedirects );
        }

        return http_post( url, contentType, payload, null, followRedirects, null, HTTP_CONNECT_TIMEOUT, HTTP_READ_TIMEOUT, null );
    }

    /**
     * Perform an HTTP POST. Specify the POST payload, and whether to follow redirects.
     *
     * @param url the URL on which to perform the HTTP POST
     * @param contentType the MIME type of the content to be posted to the URL
     * @param payload the content to be posted to the URL
     * @param followRedirects if true, we follow redirects and post the content there instead
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static PostResponse http_post(
            String  url,
            String  contentType,
            byte [] payload,
            boolean followRedirects )
       throws
           IOException
    {
        return http_post( new URL( url ), contentType, payload, followRedirects );
    }

    /**
     * Perform an HTTP POST. Specify the POST payload, cookies, and whether to follow redirects.
     *
     * @param url the URL on which to perform the HTTP POST
     * @param pars the name-value pairs such as from an HTML form
     * @param followRedirects if true, we follow redirects and post the content there instead
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static PostResponse http_post(
            URL                                url,
            Map<String,String>                 pars,
            boolean                            followRedirects,
            Map<String,? extends CharSequence> cookies )
       throws
           IOException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( HTTP.class.getName(), "http_post", url, pars, followRedirects, cookies );
        }

        return http_post( url, FORMENCODED_MIME, parsToString( pars ).getBytes( "UTF-8" ), null, followRedirects, cookies, HTTP_CONNECT_TIMEOUT, HTTP_READ_TIMEOUT, null );
    }

    /**
     * Perform an HTTP POST. Specify the POST payload, cookies, and whether to follow redirects.
     *
     * @param url the URL on which to perform the HTTP POST
     * @param pars the name-value pairs such as from an HTML form
     * @param followRedirects if true, we follow redirects and post the content there instead
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static PostResponse http_post(
            String                             url,
            Map<String,String>                 pars,
            boolean                            followRedirects,
            Map<String,? extends CharSequence> cookies )
       throws
           IOException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( HTTP.class.getName(), "http_post", url, pars, followRedirects, cookies );
        }

        return http_post( new URL( url ), FORMENCODED_MIME, parsToString( pars ).getBytes( "UTF-8" ), null, followRedirects, cookies, HTTP_CONNECT_TIMEOUT, HTTP_READ_TIMEOUT, null );
    }

    /**
     * Perform an HTTP POST. Specify the POST payload, cookies, and whether to follow redirects.
     *
     * @param url the URL on which to perform the HTTP POST
     * @param contentType the MIME type of the content to be posted to the URL
     * @param payload the content to be posted to the URL
     * @param followRedirects if true, we follow redirects and post the content there instead
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static PostResponse http_post(
            URL                                url,
            String                             contentType,
            byte []                            payload,
            boolean                            followRedirects,
            Map<String,? extends CharSequence> cookies )
       throws
           IOException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( HTTP.class.getName(), "http_post", url, contentType, payload, followRedirects, cookies );
        }

        return http_post( url, contentType, payload, null, followRedirects, cookies, HTTP_CONNECT_TIMEOUT, HTTP_READ_TIMEOUT, null );
    }

    /**
     * Perform an HTTP POST. Specify the POST payload, cookies, and whether to follow redirects.
     *
     * @param url the URL on which to perform the HTTP POST
     * @param contentType the MIME type of the content to be posted to the URL
     * @param payload the content to be posted to the URL
     * @param followRedirects if true, we follow redirects and post the content there instead
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static PostResponse http_post(
            String                             url,
            String                             contentType,
            byte []                            payload,
            boolean                            followRedirects,
            Map<String,? extends CharSequence> cookies )
       throws
           IOException
    {
        if( log.isTraceEnabled() ) {
            log.traceMethodCallEntry( HTTP.class.getName(), "http_post", url, contentType, payload, followRedirects, cookies );
        }

        return http_post( new URL( url ), contentType, payload, null, followRedirects, cookies, HTTP_CONNECT_TIMEOUT, HTTP_READ_TIMEOUT, null );
    }

    /**
     * Perform an HTTP POST. Specify the POST payload, and whether to follow redirects.
     *
     * @param url the URL on which to perform the HTTP POST
     * @param contentType the MIME type of the content to be posted to the URL
     * @param payload the content to be posted to the URL
     * @param followRedirects if true, we follow redirects and post the content there instead
     * @return the Response obtained from that URL
     * @throws IOException thrown if the content could not be obtained
     */
    public static PostResponse http_post(
            URL                                url,
            String                             contentType,
            byte []                            payload,
            String                             acceptHeader,
            boolean                            followRedirects,
            Map<String,? extends CharSequence> cookies,
            int                                connectTimeout,
            int                                readTimeout,
            HostnameVerifier                   hostnameVerifier )
       throws
           IOException
    {
        String urlString = url.toExternalForm();

        // This implementation is similar to the implementation of LWP::Simple::_trivial_http_get
        Pattern p = Pattern.compile( "^(https?)://([^/:\\@]+)(?::(\\d+))?(/\\S*)?$" );
        Matcher m = p.matcher( urlString );
        if( !m.matches()) {
            throw new IllegalArgumentException( "Not a valid URL to HTTP POST to: " + url.toExternalForm() );
        }

        String proto = m.group( 1 );
        String host  = m.group( 2 );
        String port  = m.group( 3 );

        String standardPort;
        if( "http".equals( proto )) {
            standardPort = "80";
        } else {
            standardPort = "443";
        }
        if( port == null || port.length() == 0 ) {
            port = standardPort;
        }
        // String path = m.group( 3 );

        String netloc = host;
        if( !standardPort.equals( port )) {
            netloc += ":" + port;
        }

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setInstanceFollowRedirects( followRedirects );
        if( connectTimeout >= 0 ) {
            conn.setConnectTimeout( connectTimeout );
        }
        if( readTimeout >= 0 ) {
            conn.setReadTimeout( readTimeout );
        }
        if( hostnameVerifier != null && conn instanceof HttpsURLConnection ) {
            HttpsURLConnection realConn = (HttpsURLConnection) conn;
            realConn.setHostnameVerifier( hostnameVerifier );
        }

        if( cookies != null && !cookies.isEmpty() ) {
            StringBuilder cookieString = new StringBuilder();
            String       sep = "";

            Iterator<String> iter = cookies.keySet().iterator();
            while( iter.hasNext() ) {
                String       key   = iter.next();
                CharSequence value = cookies.get( key );
                cookieString.append( sep ).append( encodeCookieName( key ));
                if( value != null ) {
                    cookieString.append( "=" ).append( encodeToQuotedString( value.toString() ));
                }
                sep = "; ";
            }
            conn.setRequestProperty( "Cookie", cookieString.toString() );
        }
        if( acceptHeader != null && acceptHeader.length() > 0 ) {
            conn.setRequestProperty( "Accept", acceptHeader );
        }

        conn.setRequestMethod( "POST" );
        conn.setDoInput( true );
        conn.setDoOutput( true );


        conn.setRequestProperty( "Host",           netloc );
        conn.setRequestProperty( "Content-Length", String.valueOf( payload.length ));
        conn.setRequestProperty( "Content-Type",   contentType );

        OutputStream outStream = new BufferedOutputStream( conn.getOutputStream()); // throws SSL exceptions if there are any

        outStream.write( payload );
        outStream.flush();

        InputStream input;
        try {
            input = conn.getInputStream();
        } catch( IOException ex ) {
            // Sun, in its wisdom, doesn't let us get at the actual response in case of 404 or 410 or 500.
            input = null;
        }

        int                      status       = conn.getResponseCode();
        long                     lastModified = conn.getLastModified();
        Map<String,List<String>> headers      = conn.getHeaderFields();
        
        PostResponse ret = new PostResponse(
                url, // from here: arguments provided to this method
                acceptHeader,
                cookies,
                connectTimeout,
                readTimeout,
                hostnameVerifier,
                String.valueOf( status ), // from here: response parameters obtained
                input,
                lastModified,
                headers );

        outStream.close();
        if( input != null ) {
            input.close();
        }

        if( log.isTraceEnabled() ) {
            log.traceMethodCallExit( HTTP.class.getName(), "http_post", ret );
        }
        
        return ret;
    }

    /**
     * Helper method to escape a String in a URL. This allows us to avoid writing
     * all this exception code all over the place.
     *
     * @param s the String
     * @return the escaped String
     * @see #decodeUrl
     */
    public static String encodeToValidUrl(
            String s )
    {
        try {
            StringBuilder ret = new StringBuilder( s.length() * 5 / 4 ); // fudge factor

            for( int i=0 ; i<s.length() ; ++i ) {
                char c = s.charAt( i );

                if( Character.isLetterOrDigit( c )) {
                    ret.append( c );
                } else if(    c == '/'
                           || c == '.'
                           || c == '-'
                           || c == '_' ) {
                    ret.append( c );
                            // Due to Tomcat 6 and http://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2007-0450
                            // we have to send slashes in clear text
                            // ret = ret.replaceAll( "%2[Ff]", "/" );
                } else {
                    // FIXME there must be something more efficient than this
                    byte [] utf8 = new String( new char[] { c } ).getBytes( UTF8 );
                    for( int j=0 ; j<utf8.length ; ++j ) {
                        ret.append( "%" );
                        int positive = utf8[j] > 0 ? utf8[0] : ( 256 + utf8[j] );

                        String hex = Integer.toHexString( positive ).toUpperCase();
                        switch( hex.length() ) {
                            case 0:
                                ret.append( "00" );
                                break;
                            case 1:
                                ret.append( "0" ).append( hex );
                                break;
                            case 2:
                                ret.append( hex );
                                break;
                            case 3:
                                log.error( "How did we get here? " + s );
                                break;
                        }
                    }
                }
            }
            return ret.toString();
        } catch( UnsupportedEncodingException ex ) {
            log.error( ex );
            return s; // at least something
        }
    }

    /**
     * Helper method to unescape a String in a URL. This allows us to avoid writing
     * all this exception code all over the place.
     *
     * @param s the escaped String
     * @return the original String
     * @see #encodeToValidUrl
     */
    public static String decodeUrl(
            String s )
    {
        try {
            String ret = URLDecoder.decode( s, UTF8 );
            return ret;
            
        } catch( UnsupportedEncodingException ex ) {
            log.error( ex );
            return null;
        }
    }
    
    /**
     * Helper method to escape a String suitably before it can be appended to the query parameters
     * in a URL.
     *
     * @param s the String
     * @return the escaped String
     * @see #decodeUrlArgument
     */
    public static String encodeToValidUrlArgument(
            String s )
    {
        try {
            String ret = URLEncoder.encode( s, UTF8 );
            // but, given Tomcat and http://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2007-0450,
            // we have to undo escaped slashes
            ret = ret.replaceAll( "%2[Ff]", "/" );
            
            return ret;

        } catch( UnsupportedEncodingException ex ) {
            log.error( ex );
            return null;
        }
    }
    
    /**
     * Helper method to descape a String suitable before it is extracted as one of the query parameters
     * in a URL.
     *
     * @param s the String
     * @return the descaped String
     * @see #encodeToValidUrlArgument
     */
    public static String decodeUrlArgument(
            String s )
    {
        try {
            String ret = URLDecoder.decode( s, UTF8 );
            return ret;
            
        } catch( UnsupportedEncodingException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
     * Append an argument pair to a URL.
     *
     * @param url the URL to which we append the argument
     * @param argumentPair the already-escaped argument, such as <tt>foo</tt> or <tt>foo=bar</tt>, without ambersand or question mark separators
     * @return the result
     */
    public static URL appendArgumentPairToUrl(
            URL    url,
            String argumentPair )
    {
        try {
            String urlString = url.toExternalForm();
            String ret = appendArgumentPairToUrl( urlString, argumentPair );
            return new URL( ret );
        } catch( MalformedURLException ex ) {
            log.error( ex );
            return url; // some kind of fallback
        }
    }

    /**
     * Append an argument pair to a URL.
     *
     * @param url the URL to which we append the argument
     * @param argumentPair the already-escaped argument, such as <tt>foo</tt> or <tt>foo=bar</tt>, without ambersand or question mark separators
     * @return the result
     */
    public static String appendArgumentPairToUrl(
            String url,
            String argumentPair )
    {
        StringBuilder buf = new StringBuilder( url.length() + argumentPair.length() + 5 ); // fudge
        buf.append( url );
        appendArgumentPairToUrl( buf, argumentPair );
        return buf.toString();
    }

    /**
     * Append an argument pair to a URL.
     *
     * @param url the URL to which we append the argument
     * @param argumentPair the already-escaped argument, such as <tt>foo</tt> or <tt>foo=bar</tt>, without ambersand or question mark separators
     * @return the result
     */
    public static StringBuilder appendArgumentPairToUrl(
            StringBuilder url,
            String        argumentPair )
    {
        if( url.indexOf( "?" ) >= 0 ) {
            url.append(  '&' );
        } else {
            url.append(  '?' );
        }
        url.append( argumentPair );
        return url;
    }

    /**
     * Append an argument to a URL.
     *
     * @param url the URL to which we append the argument
     * @param name the name of the argument, not escaped yet
     * @param value the value of the argument, not escaped yet
     * @return the result
     */
    public static String appendArgumentToUrl(
            String url,
            String name,
            String value )
    {
        StringBuilder buf = new StringBuilder( url.length() + name.length() + value.length() + 10 ); // fudge
        buf.append( url );
        appendArgumentToUrl( buf, name, value );
        return buf.toString();
    }

    /**
     * Append an argument to a URL.
     *
     * @param url the URL to which we append the argument
     * @param name the name of the argument, not escaped yet
     * @param value the value of the argument, not escaped yet
     * @return the result
     */
    public static StringBuilder appendArgumentToUrl(
            StringBuilder url,
            String        name,
            String        value )
    {
        if( url.indexOf( "?" ) >= 0 ) {
            url.append(  '&' );
        } else {
            url.append(  '?' );
        }
        url.append( encodeToValidUrlArgument( name ));
        if( value != null ) {
            url.append( '=' );
            url.append( encodeToValidUrlArgument( value ));
        }
        return url;
    }

    /**
     * Append an argument to a URL if it does not exist yet; replace if it exists already.
     *
     * @param url the URL to which we append the argument
     * @param name the name of the argument, not escaped yet
     * @param value the value of the argument, not escaped yet
     * @return the result
     */
    public static String replaceOrAppendArgumentToUrl(
            String url,
            String name,
            String value )
    {
        int q = url.indexOf( '?' );
        if( q < 0 ) {
            return appendArgumentToUrl( url, name, value );
        }
        String    query      = url.substring( q+1 );
        String [] args       = query.split( "&" );
        String    nameEquals = name + "=";

        for( int i=0 ; i<args.length ; ++i ) {
            if( args[i].startsWith( nameEquals )) {
                // replace
                StringBuilder ret = new StringBuilder( url.length() + 10 ); // fudge
                ret.append( url.substring( 0, q ));
                ret.append( '?' );
                for( int j=0 ; j<args.length ; ++j ) {
                    if( j == i ) {
                        ret.append( encodeToValidUrlArgument( name ));
                        if( value != null ) {
                            ret.append( '=' );
                            ret.append( encodeToValidUrlArgument( value ));
                        }
                    } else {
                        ret.append( args[j] );
                    }
                }
                return ret.toString();
            }
        }

        return appendArgumentToUrl( url, name, value );
    }

    /**
     * Append an argument to a URL if it does not exist yet; replace if it exists already.
     *
     * @param url the URL to which we append the argument
     * @param name the name of the argument, not escaped yet
     * @param value the value of the argument, not escaped yet
     * @return the result
     */
    public static void replaceOrAppendArgumentToUrl(
            StringBuilder url,
            String        name,
            String        value )
    {
        int q = url.indexOf( "?" );
        if( q < 0 ) {
            appendArgumentToUrl( url, name, value );
            return;
        }
        String    query      = url.substring( q+1 );
        String [] args       = query.split( "&" );
        String    nameEquals = name + "=";
        
        for( int i=0 ; i<args.length ; ++i ) {
            if( args[i].startsWith( nameEquals )) {
                // replace
                url.delete( q+1, url.length() );
                for( int j=0 ; j<args.length ; ++j ) {
                    if( j == i ) {
                        url.append( encodeToValidUrlArgument( name ));
                        if( value != null ) {
                            url.append( '=' );
                            url.append( encodeToValidUrlArgument( value ));
                        }
                    } else {
                        url.append( args[j] );
                    }
                }
                return;
            }
        }

        appendArgumentToUrl( url, name, value );
    }
    
    /**
     * Obtain a named argument from a URL.
     *
     * @param u the URL
     * @param arg the name of the argument
     * @return the value of the named argument
     */
    public static String getUrlArgument(
            String u,
            String arg )
    {
        int q = u.indexOf( '?' );
        if( q < 0 ) {
            return null;
        }
        String args = u.substring( q + 1 );
        String [] pairs = args.split( "&" );
        for( int i=0 ; i<pairs.length ; ++i ) {
            String current = pairs[i];
            int    equals  = current.indexOf( '=' );
            if( equals < 0 ) {
                continue; // won't have a value
            }
            String name = decodeUrlArgument( current.substring( 0, equals ));
            if( arg.equals( name )) {
                String value = decodeUrlArgument( current.substring( equals+1 ));
                return value;
            }
        }
        return null;
    }

    /**
     * Encode a String a quoted String per the HTTP spec.
     *
     * @param raw the to-be-quoted String
     * @return the quoted String
     */
    public static String encodeToQuotedString(
            String raw )
    {
        StringBuilder buf = new StringBuilder( raw.length() + 4 ); // fudge

        buf.append( '"' );
        for( int i=0 ; i<raw.length() ; ++i ) {
            char c = raw.charAt( i );
            switch( c ) {
                case '"':
                    buf.append( "\\\"" );
                    break;
                default:
                    buf.append( c );
                    break;
            }
        }
        buf.append( '"' );
        return buf.toString();
    }

    /**
     * Decode a quoted String per the HTTP spec. If this is not a quoted String,
     * return the String unchanged.
     *
     * @param quoted the input String
     * @return the de-quoted String
     */
    public static String decodeFromQuotedString(
            String quoted )
    {
        if( quoted.length() < 2 ) {
            return quoted;
        }
        if( !quoted.startsWith( "\"" )) {
            return quoted;
        }
        if( !quoted.endsWith( "\"" )) {
            return quoted;
        }

        StringBuilder buf = new StringBuilder( quoted.length()-2 );
        for( int i=1 ; i<quoted.length()-1 ; ++i ) {
            char c = quoted.charAt( i );
            switch( c ) {
                case '\\':
                    if( i<quoted.length()-1 ) {
                        // not last character
                        if( quoted.charAt( i+1 ) == '"' ) {
                            continue;
                        } else {
                            buf.append( c ); // something else
                        }
                    } else {
                        // last char
                        buf.append( c );
                    }
                    break;
                default:
                    buf.append( c );
                    break;
            }
        }
        return buf.toString();
    }

    /**
     * Encode a cookie's name safely. Notably, PHP has this
     * nastly habit of turning periods into underscores.
     *
     * @param name the to-be-encoded name
     * @return the encoded name
     */
    public static String encodeCookieName(
            String name )
    {
        try {
            String temp = URLEncoder.encode( name, UTF8 );
            String ret  = temp.replaceAll( "\\.", "!" );

            return ret;

        } catch( UnsupportedEncodingException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
     * Decode a cookie's name safely. Notably, PHP has this
     * nastly habit of turning periods into underscores.
     *
     * @param encoded the encoded name
     * @return the decoded name
     */
    public static String decodeCookieName(
            String encoded )
    {
        try {
            String temp = encoded.replaceAll( "!", "." );
            String ret = URLDecoder.decode( temp, UTF8 );
            return ret;

        } catch( UnsupportedEncodingException ex ) {
            log.error( ex );
            return null;
        }
    }

    /**
     * Helper method to parse a date/time format such as for the cookie expiration.
     * This is inspired by http://mail-archives.apache.org/mod_mbox/commons-dev/200304.mbox/%3C20030417030031.64641.qmail@icarus.apache.org%3E
     * 
     * @param s the String to parse
     * @return the found Date
     * @throws ParseException thrown if the String could not be parsed
     */
    public static Date parseCookieDateTime(
            String s )
        throws
            ParseException
    {
        ParseException firstException = null;

        // we try out formats until one works
        for( int i= 0 ; i<theCookieDateFormats.length ; ++i ) {
            try {
                Date ret = theCookieDateFormats[i].parse( s );
                return ret;

            } catch( ParseException ex ) {
                if( firstException == null ) {
                    firstException = ex;
                }
            }
        }
        throw firstException;
    }

    /**
     * Helper method to convert a Map of parameters into a POST'able String.
     *
     * @param pars the parameters
     * @return the String
     */
    protected static String parsToString(
            Map<String,String> pars )
    {
        String           sep       = "";
        StringBuilder    parBuffer = new StringBuilder();

        Iterator<String> iter      = pars.keySet().iterator();

        while( iter.hasNext() ) {
            String key   = iter.next();
            String value = pars.get( key );

            parBuffer.append( sep );
            parBuffer.append( encodeToValidUrl( key ));
            parBuffer.append( "=" );
            parBuffer.append( encodeToValidUrl( value ));
            sep = "&";
        }

        return parBuffer.toString();
    }

    /**
     * Our ResourceHelper.
     */
    private static final ResourceHelper theResourceHelper = ResourceHelper.getInstance( HTTP.class );

    /**
     * The Pattern to extract the charset from the content type.
     */
    protected static final Pattern theContentTypePattern = Pattern.compile( "([^;]*)(;.*charset=(.*))?", Pattern.CASE_INSENSITIVE );

    /**
     * The several different possible DateFormat for cookie time stamps.
     */
    public static final DateFormat [] theCookieDateFormats = {
            new SimpleDateFormat( "EEE, dd-MMM-yyyy hh:mm:ss z" ), // RFC1123,
            new SimpleDateFormat( "EEEE, dd-MMM-yy HH:mm:ss zzz" ), // RFC1036,
            new SimpleDateFormat( "EEE MMM d HH:mm:ss yyyy" ),
            new SimpleDateFormat( "EEE, dd-MMM-yyyy HH:mm:ss z" ),
            new SimpleDateFormat( "EEE, dd-MMM-yyyy HH-mm-ss z" ),
            new SimpleDateFormat( "EEE, dd MMM yy HH:mm:ss z" ),
            new SimpleDateFormat( "EEE dd-MMM-yyyy HH:mm:ss z" ),
            new SimpleDateFormat( "EEE dd MMM yyyy HH:mm:ss z" ),
            new SimpleDateFormat( "EEE dd-MMM-yyyy HH-mm-ss z" ),
            new SimpleDateFormat( "EEE dd-MMM-yy HH:mm:ss z" ),
            new SimpleDateFormat( "EEE dd MMM yy HH:mm:ss z" ),
    };

    /**
     * Timeout for establishing HTTP connections, in milliseconds.
     */
    public static final int HTTP_CONNECT_TIMEOUT = theResourceHelper.getResourceIntegerOrDefault( "HttpConnectTimeout", 10000 );

    /**
     * Timeout for reading from an established HTTP connection, in milliseconds.
     */
    public static final int HTTP_READ_TIMEOUT = theResourceHelper.getResourceIntegerOrDefault( "HttpReadTimeout", 10000 );

    /**
     * Only allocate the charset once.
     */
    public static final String UTF8 = "utf-8";

    /**
     * MIME type for POST'd forms.
     */
    public static final String FORMENCODED_MIME = "application/x-www-form-urlencoded";

    /**
     * Encapsulates the response from an HTTP request.
     */
    public static abstract class Response
            implements
                CanBeDumped
    {
        /**
         * Constructor.
         *
         * @param url the URL of which this is the Response
         * @param responseCode the HTTP response code
         * @param stream the InputStream from which we read the content of the Response
         * @param lastModified the time when the stream was last modified
         * @param headerFields the HTTP header fields
         * @throws IOException thrown if an I/O problem occurred
         */
        Response(
                URL                                url,
                String                             acceptHeader,
                Map<String,? extends CharSequence> cookies,
                int                                connectTimeout,
                int                                readTimeout,
                HostnameVerifier                   hostnameVerifier,
                String                             responseCode,
                InputStream                        stream,
                long                               lastModified,
                Map<String,List<String>>           headerFields )
            throws
                IOException
        {
            theUrl              = url;
            theAcceptHeader     = acceptHeader;
            theSentCookies      = cookies;
            theConnectTimeout   = connectTimeout;
            theReadTimeout      = readTimeout;
            theHostnameVerifier = hostnameVerifier;
            theResponseCode     = responseCode;
            theResponseLastModified     = lastModified;

            // turns out that HTTP headers are supposed to be case insensitive, but the Java implementation
            // does not do that ... so we do it ourselves.

            theReceivedHeaderFields = new HashMap<String,List<String>>( headerFields.size() );
            theReceivedCookies      = new HashSet<OutgoingSaneCookie>();
            
            Iterator<String> iter = headerFields.keySet().iterator();
            while( iter.hasNext() ) {
                String     key   = iter.next();
                Collection value = headerFields.get( key ); // Java version of key -- still upper-case
                ArrayList<String> newValue = new ArrayList<String>();
                
                if( key != null ) {
                    key = key.toLowerCase(); // now turn lower-case
                }
                if( key != null && value != null ) {
                    for( Object current : value ) {
                        newValue.add( (String) current );
                    }
                    theReceivedHeaderFields.put( key, newValue );
                }
                if( "set-cookie".equals( key )) {
                    String [] components = ArrayHelper.copyIntoNewArray( newValue, String.class ); // (String)value).split( ";" );
                    for( String nvpairs : components ) {
                        String cookieName    = null;
                        String cookieValue   = null;
                        String cookieDomain  = null;
                        String cookiePath    = null;
                        Date   cookieExpires = null;
                        for( String current : nvpairs.split( ";\\w*" ) ) {
                            int equals = current.indexOf( '=' );
                            if( equals >=0 ) {
                                // ignore if no =
                                String key2   = current.substring( 0, equals ).trim();
                                String value2 = current.substring( equals+1 ).trim();

                                key2 = key2.toLowerCase();

                                if( "domain".equals( key2 )) {
                                    cookieDomain = value2;
                                } else if( "path".equals( key2 )) {
                                    cookiePath = value2;
                                } else if( "expires".equals( key2 )) {
                                    try {
                                        cookieExpires = parseCookieDateTime( value2 );
                                    } catch( ParseException ex ) {
                                        log.error( ex );
                                    }
                                } else if( "version".equals( key2 )) {
                                    // skip
                                } else if( "max-age".equals( key2 )) {
                                    int seconds = Integer.parseInt( value2 );
                                    cookieExpires = new Date( System.currentTimeMillis() + 1000L * seconds );
                                } else {
                                    cookieName = decodeCookieName( key2 );
                                    if( value2.startsWith( "\"" ) && value2.endsWith( "\"" )) {
                                        cookieValue = value2.substring( 1, value2.length()-1 );
                                    } else {
                                        cookieValue = value2;
                                    }
                                }
                            }
                        }
                        OutgoingSimpleSaneCookie newCookie = OutgoingSimpleSaneCookie.create( cookieName, cookieValue, cookieDomain, cookiePath, cookieExpires );
                        theReceivedCookies.add( newCookie );
                    }
                }
            }

            if( stream != null ) {
                theReceivedContent = org.infogrid.util.StreamUtils.slurp( stream );
            } else {
                theReceivedContent = null;
            }
        }

        /**
         * Obtain the URL to which this is the Response.
         *
         * @return the URL
         */
        public URL getURL()
        {
            return theUrl;
        }

        /**
         * Obtain name of the HTTP method that was used.
         *
         * @return name of the HTTP method
         */
        public abstract String getMethod();

        /**
         * Obtain the HTTP response code.
         *
         * @return the HTTP response code (could potentially be null)
         */
        public String getResponseCode()
        {
            return theResponseCode;
        }

        /**
         * Obtain the time this Response was last modified.
         *
         * @return the time this Response was last modified
         */
        public long getLastModified()
        {
            return theResponseLastModified;
        }

        /**
         * Does this response indicate success.
         *
         * @return true for all HTTP 200 status codes
         */
        public boolean isSuccess()
        {
            boolean ret = theResponseCode.startsWith( "2" );
            return ret;
        }

        /**
         * Is this response a redirect.
         *
         * @return true if it is a redirect
         */
        public boolean isRedirect()
        {
            boolean ret
                    =    theResponseCode.startsWith( "301" )
                      || theResponseCode.startsWith( "302" )
                      || theResponseCode.startsWith( "303" )
                      || theResponseCode.startsWith( "307" );

            return ret;
        }

        /**
         * Follow the redirect contained in this response. If no redirect is contained, return null.
         *
         * @return the Response after following the redirect, or null
         * @throws IOException thrown if the redirect failed
         */
        public abstract Response followRedirect()
            throws
                IOException;

        /**
         * Helper method to determine the content type and character set.
         */
        protected void determineContentTypeAndCharset()
        {
            List<String> fields = theReceivedHeaderFields.get( "content-type" );
            if( fields != null ) {
                for( String rawContentType : fields ) {
                    if( rawContentType != null ) {
                        rawContentType = rawContentType.trim();

                        Matcher contentTypeMatcher = theContentTypePattern.matcher( rawContentType );
                        if( contentTypeMatcher.find() ) {
                            theReceivedContentType = contentTypeMatcher.group( 1 );
                            if( contentTypeMatcher.groupCount() >= 3 ) {
                                theReceivedCharset = contentTypeMatcher.group( 3 );
                                if( theReceivedCharset != null && theReceivedCharset.length() > 0 ) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

        /**
         * Obtain the content (MIME) type.
         *
         * @return the content (MIME) type (could potentially be null)
         */
        public String getContentType()
        {
            if( theReceivedContentType == null ) {
                determineContentTypeAndCharset();
            }
            return theReceivedContentType;
        }

        /**
         * Obtain the char set, if applicable.
         *
         * @return the char set
         */
        public String getCharset()
        {
            if( theReceivedCharset == null ) {
                determineContentTypeAndCharset();
            }
            return theReceivedCharset;
        }

        /**
         * Obtain the content in the Response.
         *
         * @return the content in the response (could potentially be null)
         */
        public byte [] getContent()
        {
            return theReceivedContent;
        }

        /**
         * Obtain the content in the Response as String
         *
         * @return the content in the response (could potentially be null)
         */
        public String getContentAsString()
        {
            if( theReceivedContent == null ) {
                return null;
            }
            String charset = getCharset();
            if( charset != null ) {
                try {
                    return new String( theReceivedContent, charset );

                } catch( UnsupportedEncodingException ex ) {
                    log.warn( ex );
                }
            }
            return new String( theReceivedContent );
        }

        /**
         * Obtain the redirection URL, if any.
         *
         * @return the redirection URL, if any
         */
        public String getLocation()
        {
            return getSingleHttpHeaderField( "location" );
        }

        /**
         * Obtain all HTTP headers in this Response.
         *
         * @return a Map of all HTTP headers in this Response
         */
        public Map<String,List<String>> getHttpHeaderFields()
        {
            return Collections.unmodifiableMap( theReceivedHeaderFields );
        }

        /**
         * Obtain the value of a particular HTTP header, or null if not present.
         *
         * @param headerName name of the header field to retrieve
         * @return value of a particular HTTP header, or null
         */
        public List<String> getHttpHeaderField(
                String headerName )
        {
            List<String> ret = theReceivedHeaderFields.get( headerName.toLowerCase() );
            return ret;
        }

       /**
        * Obtain the value of a particular HTTP header field if at most one is
        * given, or null if not present.
        *
        * @param headerName name of the header field to retrieve
        * @return value of a particular HTTP header, or null
        */
        public String getSingleHttpHeaderField(
                String headerName )
        {
            List<String> ret = theReceivedHeaderFields.get( headerName.toLowerCase() );
            if( ret == null || ret.isEmpty() ) {
                return null;
            }
            if( ret.size() == 1 ) {
                return ret.get( 0 );
            }
            throw new IllegalStateException( "Header field " + headerName + " has " + ret.size() + " values, not 1." );
        }

        /**
         * Obtain all cookies received.
         * 
         * @return the set of cookies
         */
        public Set<OutgoingSaneCookie> getCookies()
        {
            return Collections.unmodifiableSet( theReceivedCookies );
        }

        /**
         * Obtain a named cookie, or null.
         * 
         * @param name the name of the Cookie
         * @return the Cookie, if any
         */
        public OutgoingSaneCookie getCookie(
                String name )
        {
            Set<OutgoingSaneCookie> cookies = getCookies();
            if( cookies == null || cookies.isEmpty() ) {
                return null;
            }
            for( OutgoingSaneCookie current : cookies ) {
                if( name.equals( current.getName() )) {
                    return current;
                }
            }
            return null;
        }

        /**
         * Obtain the value of a named cookie, or null.
         * 
         * @param name the name of the Cookie
         * @return the value of the Cookie, or null
         */
        public String getCookieValue(
                String name )
        {
            OutgoingSaneCookie found = getCookie( name );
            if( found != null ) {
                return found.getValue();
            } else {
                return null;
            }
        }

        /**
         * Dump this object.
         *
         * @param d the Dumper to dump to
         */
        public void dump(
                Dumper d )
        {
            d.dump( this,
                    new String[] {
                        "theResponseCode",
                        "theLastModified",
                        "theHeaderFields",
                        "theContent",
                        "theContent(length)",
                        "theContent(string)",
                        "theCookies"
                    },
                    new Object[] {
                        theResponseCode,
                        theResponseLastModified,
                        theReceivedHeaderFields,
                        theReceivedContent,
                        ( theReceivedContent != null ) ? theReceivedContent.length : "n/a",
                        ( theReceivedContent != null ) ? new String( theReceivedContent ) : null,
                        theReceivedCookies,
                    } );
        }

        /**
         * The URL to which this is the Response.
         */
        protected URL theUrl;

        /**
         * The Accept Header used when this Response was obtained.
         */
        protected String theAcceptHeader;

        /**
         * The Cookies sent when this Response was obtained.
         */
        protected Map<String,? extends CharSequence> theSentCookies;

        /**
         * The connect timeout used when this Response was obtained.
         */
        protected int theConnectTimeout;

        /**
         * The read timeout used when this Response was obtained.
         */
        protected int theReadTimeout;

        /**
         * The HostnameVerifier used when this Response was obtained.
         */
        protected HostnameVerifier theHostnameVerifier;

        /**
         * The HTTP status in the Response.
         */
        protected String theResponseCode;

        /**
         * The time this Response was last modified.
         */
        protected long theResponseLastModified;

        /**
         * The received content in the Response.
         */
        protected byte [] theReceivedContent;

        /**
         * The HTTP header fields.
         */
        protected Map<String,List<String>> theReceivedHeaderFields;
        
        /**
         * The received content type.
         */
        protected String theReceivedContentType;
        
        /**
         * The character set.
         */
        protected String theReceivedCharset;
        
        /**
         * The Cookies.
         */
        protected Set<OutgoingSaneCookie> theReceivedCookies;
    }

    /**
     * A Response to an HTTP GET request.
     */
    public static class GetResponse
            extends
                Response
    {
        /**
         * Constructor.
         *
         * @param url the URL of which this is the Response
         * @param responseCode the HTTP response code
         * @param stream the InputStream from which we read the content of the Response
         * @param lastModified the time when the stream was last modified
         * @param headerFields the HTTP header fields
         * @throws IOException thrown if an I/O problem occurred
         */
        GetResponse(
                URL                                url,
                String                             acceptHeader,
                Map<String,? extends CharSequence> cookies,
                int                                connectTimeout,
                int                                readTimeout,
                HostnameVerifier                   hostnameVerifier,
                String                             responseCode,
                InputStream                        stream,
                long                               lastModified,
                Map<String,List<String>>           headerFields )
            throws
                IOException
        {
            super( url, acceptHeader, cookies, connectTimeout, readTimeout, hostnameVerifier, responseCode, stream, lastModified, headerFields );
        }

        /**
         * Obtain name of the HTTP method that was used.
         *
         * @return name of the HTTP method
         */
        public String getMethod()
        {
            return "GET";
        }

        /**
         * Follow the redirect contained in this response. If no redirect is contained, return null.
         *
         * @return the Response after following the redirect, or null
         * @throws IOException thrown if the redirect failed
         */
        public GetResponse followRedirect()
            throws
                IOException
        {
            String newUrl = getLocation();
            if( newUrl == null ) {
                return null;
            }
            return http_get(
                    newUrl,
                    theAcceptHeader,
                    false,
                    theSentCookies,
                    theConnectTimeout,
                    theReadTimeout,
                    theHostnameVerifier );
        }
    }

    /**
     * A Response to an HTTP POST request.
     */
    public static class PostResponse
            extends
                Response
    {
        /**
         * Constructor.
         *
         * @param url the URL of which this is the Response
         * @param responseCode the HTTP response code
         * @param stream the InputStream from which we read the content of the Response
         * @param lastModified the time when the stream was last modified
         * @param headerFields the HTTP header fields
         * @throws IOException thrown if an I/O problem occurred
         */
        PostResponse(
                URL                                url,
                String                             acceptHeader,
                Map<String,? extends CharSequence> cookies,
                int                                connectTimeout,
                int                                readTimeout,
                HostnameVerifier                   hostnameVerifier,
                String                             responseCode,
                InputStream                        stream,
                long                               lastModified,
                Map<String,List<String>>           headerFields )
            throws
                IOException
        {
            super( url, acceptHeader, cookies, connectTimeout, readTimeout, hostnameVerifier, responseCode, stream, lastModified, headerFields );
        }

        /**
         * Obtain name of the HTTP method that was used.
         *
         * @return name of the HTTP method
         */
        public String getMethod()
        {
            return "POST";
        }

        /**
         * Follow the redirect contained in this response. If no redirect is contained, return null.
         *
         * @return the Response after following the redirect, or null
         * @throws IOException thrown if the redirect failed
         */
        public PostResponse followRedirect()
            throws
                IOException
        {
            String newUrl = getLocation();
            if( newUrl == null ) {
                return null;
            }
            return http_post(
                    new URL( newUrl ),
                    thePostedContentType,
                    thePostedPayload,
                    theAcceptHeader,
                    false,
                    theSentCookies,
                    theConnectTimeout,
                    theReadTimeout,
                    theHostnameVerifier );
        }

        /**
         * The content posted to obtain this Response.
         */
        protected byte [] thePostedPayload;

        /**
         * The content type posted to obtain this Response.
         */
        protected String thePostedContentType;
    }
}
