
package gr.upatras.ece.wcl;


/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RadlStandaloneSetup extends RadlStandaloneSetupGenerated{

	public static void doSetup() {
		new RadlStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

