/*
 * @(#)AnimatingContext.java	1.6 01/12/03
 *
 * Copyright 2002 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package java2d;


/**
 * The interface for a DemoSurface that animates.
 */
public interface AnimatingContext {
        public void step(int w, int h);
        public void reset(int newwidth, int newheight);
}
