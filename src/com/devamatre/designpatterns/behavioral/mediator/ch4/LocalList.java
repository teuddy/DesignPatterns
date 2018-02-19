/******************************************************************************
 * Copyright (C) Devamatre Inc. 2009-2018.
 * 
 * This code is licensed to Devamatre under one or more contributor license 
 * agreements. The reproduction, transmission or use of this code or the 
 * snippet is not permitted without prior express written consent of Devamatre. 
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the license is distributed on an "AS IS" BASIS, WITHOUT 
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied and the 
 * offenders will be liable for any damages. All rights, including  but not
 * limited to rights created by patent grant or registration of a utility model 
 * or design, are reserved. Technical specifications and features are binding 
 * only insofar as they are specifically and expressly agreed upon in a written 
 * contract.
 * 
 * You may obtain a copy of the License for more details at:
 *      http://www.devamatre.com/licenses/license.txt.
 *      
 * Devamatre reserves the right to modify the technical specifications and or 
 * features without any prior notice.
 *****************************************************************************/
package com.devamatre.designpatterns.behavioral.mediator.ch4;

import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 * @author Rohtash Lakra (rohtash.lakra@devamatre.com)
 * @author Rohtash Singh Lakra (rohtash.singh@gmail.com)
 * @created 2018-02-19 10:15:53 AM
 * @version 1.0.0
 * @since 1.0.0
 */
public class LocalList extends JList implements Command {
	private Mediator mediator;

	/**
	 * 
	 * @param defObj
	 * @param mediator
	 */
	public LocalList(DefaultListModel defObj, Mediator mediator) {
		super(defObj);
		this.mediator = mediator;
		mediator.registerLocalList(this);
	}

	public void processEvent() {
		mediator.LocalListSelect();
	}
}