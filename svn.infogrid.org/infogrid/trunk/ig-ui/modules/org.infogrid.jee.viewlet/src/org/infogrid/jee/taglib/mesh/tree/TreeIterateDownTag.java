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

package org.infogrid.jee.taglib.mesh.tree;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import org.infogrid.jee.taglib.IgnoreException;
import org.infogrid.util.logging.Log;

/**
 * <p>Renders the HTML to traverse one level down in a tree outline.</p>
 * @see <a href="package-summary.html">Details in package documentation</a>
 */
public class TreeIterateDownTag
    extends
        AbstractTreeIterateTag
{
    private static final Log  log              = Log.getLogInstance( TreeIterateDownTag.class ); // our own, private logger
    private static final long serialVersionUID = 1L; // helps with serialization

    /**
     * Constructor.
     */
    public TreeIterateDownTag()
    {
        // noop
    }

    /**
     * Our implementation of doStartTag().
     *
     * @return evaluate or skip body
     * @throws JspException thrown if an evaluation error occurred
     * @throws IgnoreException thrown to abort processing without an error
     */
    @Override
    protected int realDoStartTag()
        throws
            JspException,
            IgnoreException
    {
        Tag parentTag = getParent();
        if( parentTag == null || !( parentTag instanceof TreeIterateTag )) {
            throw new JspException( "TreeIterateDownTag tag must be directly contained in an TreeIterateTag tag" );
        }

        TreeIterateTag realParentTag = (TreeIterateTag) parentTag;
        if( !isWithinBounds( realParentTag.getCurrentLevel() )) {
            return SKIP_BODY;
        }
        if( realParentTag.processDownTag() ) {
            if( log.isTraceEnabled() ) {
                log.traceMethodCallEntry( this, "realDoStartTag - include" );
            }
            return EVAL_BODY_INCLUDE;
        } else {
            return SKIP_BODY;
        }
    }
}
