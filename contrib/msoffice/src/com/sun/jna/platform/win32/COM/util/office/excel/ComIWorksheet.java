/*
 * The contents of this file is dual-licensed under 2 
 * alternative Open Source/Free licenses: LGPL 2.1 and 
 * Apache License 2.0. (starting with JNA version 4.0.0).
 * 
 * You can freely decide which license you want to apply to 
 * the project.
 * 
 * You may obtain a copy of the LGPL License at:
 * 
 * http://www.gnu.org/licenses/licenses.html
 * 
 * A copy is also included in the downloadable source code package
 * containing JNA, in file "LGPL2.1".
 * 
 * You may obtain a copy of the Apache License at:
 * 
 * http://www.apache.org/licenses/
 * 
 * A copy is also included in the downloadable source code package
 * containing JNA, in file "AL2.0".
 */

package com.sun.jna.platform.win32.COM.util.office.excel;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;

@ComInterface(iid="{000208D8-0000-0000-C000-000000000046}")
public interface ComIWorksheet {
        @ComProperty
        ComIWorkbook getParent();
    
	@ComProperty
	String getName();
	
	@ComProperty
	ComIRange getRange(String cell1);
        
        @ComProperty
        ComIRange getRange(String cell1, String cell2);

	@ComProperty
	ComIApplication getApplication();

        @ComProperty
        ComIRange getCells();
        
        @ComProperty
        Shapes getShapes();
        
	@ComProperty
	ComIRange getRows(Object identifier);
        
	@ComProperty
	ComIRange getColumns(Object identifier);
}
