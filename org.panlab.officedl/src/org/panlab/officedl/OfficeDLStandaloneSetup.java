
package org.panlab.officedl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class OfficeDLStandaloneSetup extends OfficeDLStandaloneSetupGenerated{

	public static void doSetup() {
		new OfficeDLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

