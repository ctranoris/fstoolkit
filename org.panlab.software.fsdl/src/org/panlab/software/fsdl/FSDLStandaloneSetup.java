
package org.panlab.software.fsdl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FSDLStandaloneSetup extends FSDLStandaloneSetupGenerated{

	public static void doSetup() {
		new FSDLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

