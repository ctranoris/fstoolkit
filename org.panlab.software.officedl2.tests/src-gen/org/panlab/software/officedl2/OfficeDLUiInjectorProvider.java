/*
* generated by Xtext
*/
package org.panlab.software.officedl2;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class OfficeDLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.panlab.software.officedl2.ui.internal.OfficeDLActivator.getInstance().getInjector("org.panlab.software.officedl2.OfficeDL");
	}
	
}
