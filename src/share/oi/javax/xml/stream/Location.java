/*
 * Portions Copyright  2000-2008 Sun Microsystems, Inc. All Rights
 * Reserved.  Use is subject to license terms.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License version
 * 2 only, as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License version 2 for more details (a copy is
 * included at /legal/license.txt).
 * 
 * You should have received a copy of the GNU General Public License
 * version 2 along with this work; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA
 * 
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa
 * Clara, CA 95054 or visit www.sun.com if you need additional
 * information or have any questions.
 */

package javax.xml.stream;

/**
 * Provides information on the location of an event.
 *
 * All the information provided by a Location is optional.  For example
 * an application may only report line numbers.
 *
 * @version 1.0
 * @author Copyright (c) 2003 by BEA Systems. All Rights Reserved.
 */
public interface Location {
  /**
   * Return the line number where the current event ends,
   * returns -1 if none is available.
   * @return the current line number
   */
  public int getLineNumber();

  /**
   * Return the column number where the current event ends,
   * returns -1 if none is available.
   * @return the current column number
   */
  public int getColumnNumber();
  
  /**
   * Return the byte or character offset into the input source this location
   * is pointing to. If the input source is a file or a byte stream then 
   * this is the byte offset into that stream, but if the input source is 
   * a character media then the offset is the character offset. 
   * Returns -1 if there is no offset available.
   * @return the current offset
   */
  public int getCharacterOffset();

  /**
   * Returns the public ID of the XML
   * @return the public ID, or null if not available
   */
  public String getPublicId();

  /**
   * Returns the system ID of the XML
   * @return the system ID, or null if not available
   */
  public String getSystemId();
}



