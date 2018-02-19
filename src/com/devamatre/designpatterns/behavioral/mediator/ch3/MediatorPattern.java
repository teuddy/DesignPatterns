/******************************************************************************
 * Copyright (C) Devamatre Inc 2009-2018
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
package com.devamatre.designpatterns.behavioral.mediator.ch3;

/**
 * 
 * @author Rohtash Lakra (rohtash.lakra@devamatre.com)
 * @author Rohtash Singh Lakra (rohtash.singh@gmail.com)
 * @created 2005-11-23 10:09:14 AM
 * @version 1.0.0
 * @since 1.0.0
 */
public class MediatorPattern {
	/**
	 * 
	 * @param arguments
	 */
	public static void main(String[] arguments) {
		System.out.println("Example for the Mediator pattern");
		System.out.println("In this demonstration, the ContactMediatorImpl class will");
		System.out.println(" coordinate updates between three controls in a GUI - the");
		System.out.println(" ContactDisplayPanel, the ContactEditorPanel, and the");
		System.out.println(" ContactSelectorPanel. As its name suggests, the Mediator");
		System.out.println(" mediates the activity between the elements of the GUI,");
		System.out.println(" translating method calls from one panel into the appropriate");
		System.out.println(" method calls on the other GUI components.");
		Contact contact = new ContactImpl("", "", "", "");
		Contact contact1 = new ContactImpl("Duke", "", "Java Advocate", "The Patterns Guild");
		ContactMediatorImpl mediator = new ContactMediatorImpl();
		mediator.addContact(contact);
		mediator.addContact(contact1);
		GUIMediator guiMediator = new GUIMediator();
		guiMediator.setContactMediator(mediator);
		guiMediator.createGui();
	}
}