
package gr.upatras.ece.nam.brokerdsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BrokerDSLStandaloneSetup extends BrokerDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new BrokerDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

