
package gr.upatras.ece.wcl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SDLStandaloneSetup extends SDLStandaloneSetupGenerated{

	public static void doSetup() {
		new SDLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

