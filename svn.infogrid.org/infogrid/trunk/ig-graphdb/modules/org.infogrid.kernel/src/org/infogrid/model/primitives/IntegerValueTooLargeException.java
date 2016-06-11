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

package org.infogrid.model.primitives;

/**
 * Thrown if an IntegerValue was given that was too large for the maximum of its IntegerDataType.
 */
public class IntegerValueTooLargeException
        extends
            IntegerValueNotInDomainException
{
    /**
     * Constructor.
     *
     * @param value the invalid value
     * @param type the DataType whose domain was violated
     */
    protected IntegerValueTooLargeException(
            IntegerValue    value,
            IntegerDataType type )
    {
        super( value, type );
    }
}
