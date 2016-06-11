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

package org.infogrid.util.naming;

import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import org.infogrid.util.logging.Log;
import org.infogrid.util.text.HasStringRepresentation;
import org.infogrid.util.text.StringRepresentation;
import org.infogrid.util.text.StringRepresentationParameters;
import org.infogrid.util.text.StringifierException;

/**
 * Helper Exception class to report Naming errors better than with the default NamingExceptions.
 */
public class NamingReportingException
        extends
            NamingException
        implements
            HasStringRepresentation
{
    private static final Log  log              = Log.getLogInstance( NamingReportingException.class ); // our own, private logger
    private static final long serialVersionUID = 1L; // helps with serialization

    /**
     * Constructor.
     * 
     * @param name the name for which a problem occurred
     * @param ctx the naming context in which the exception occurred
     * @param cause the underlying cause for this exception -- the original NamingException
     */
    public NamingReportingException(
            String          name,
            Context         ctx,
            NamingException cause )
    {
        super( cause.getExplanation() );
        
        initCause( cause );
     
        theName          = name;
        theNamingContext = ctx;
    }

    /**
     * Obtain a String representation of this instance that can be shown to the user.
     *
     * @param rep the StringRepresentation
     * @param pars collects parameters that may influence the String representation. Always provided.
     * @return String representation
     * @throws StringifierException thrown if there was a problem when attempting to stringify
     */
    public String toStringRepresentation(
            StringRepresentation           rep,
            StringRepresentationParameters pars )
        throws
            StringifierException
    {
        String indentString = rep.formatEntry( getClass(), "Indent", pars );

        StringBuilder contextDump = new StringBuilder();
        
        boolean hasAppended = false;
        try {
            hasAppended = appendThisContext( rep, 0, theNamingContext, "java:comp/env", indentString, contextDump );
            
        } catch( NamingException ex ) {
            log.warn( ex );
            contextDump.append( "[naming exception occurred]" );
        }
        if( !hasAppended ) {
            contextDump.append( rep.formatEntry( getClass(), "NoBindings", pars ));
        }
        
        String ret = rep.formatEntry( getClass(), "String", pars, theName, contextDump.toString(), this );
        return ret;
    }
    
    /**
     * Recursively invoked helper method to dump a context.
     * 
     * @param rep the StringRepresentation to use
     * @param indentLevel the number of indents to make
     * @param ctx the current naming Context
     * @param nameFilter the name filter to use when listing bindings in the context
     * @param indentString the String to prepend for one level of ident
     * @param buf the StringBuilder to append to
     * @return false if nothing has been appended
     * @throws NamingException a naming problem occurred
     */
    protected boolean appendThisContext(
            StringRepresentation rep,
            int                  indentLevel,
            Context              ctx,
            String               nameFilter,
            String               indentString,
            StringBuilder        buf )
        throws
            NamingException
    {
        boolean ret = false;

        NamingEnumeration<Binding> iter = ctx.listBindings( nameFilter );
        while( iter.hasMore() ) {
            Binding current = iter.next();

            String name      = current.getName();
            String className = current.getClassName();

            StringBuilder indent = new StringBuilder();
            for( int i=0 ; i<indentLevel ; ++i ) {
                indent.append( indentString );
            }
            try {
                buf.append( rep.formatEntry(
                        getClass(),
                        "Binding",
                        null,
                        indent.toString(),
                        name,
                        className ));
            } catch( StringifierException ex ) {
                log.error( ex );
                buf.append( indent ).append( name );
            }
            
            Object child = current.getObject();
            if( child instanceof Context ) {
                appendThisContext( rep, indentLevel+1, (Context) child, "", indentString, buf );
            }
            ret = true;
        } 
        return ret;
    }

    /**
     * Obtain the start part of a String representation of this object that acts
     * as a link/hyperlink and can be shown to the user.
     *
     * @param rep the StringRepresentation
     * @param pars collects parameters that may influence the String representation. Always provided.
     * @return String representation
     */
    public String toStringRepresentationLinkStart(
            StringRepresentation           rep,
            StringRepresentationParameters pars )
    {
        return "";
    }

    /**
     * Obtain the end part of a String representation of this MeshBase that acts
     * as a link/hyperlink and can be shown to the user.
     * 
     * @param rep the StringRepresentation
     * @param pars collects parameters that may influence the String representation. Always provided.
     * @return String representation
     */
    public String toStringRepresentationLinkEnd(
            StringRepresentation           rep,
            StringRepresentationParameters pars )
    {
        return "";
    }

    /**
     * The name for which the problem occurred.
     */
    protected String theName;

    /**
     * The naming Context in which the problem occurred.
     */
    protected Context theNamingContext;
}
