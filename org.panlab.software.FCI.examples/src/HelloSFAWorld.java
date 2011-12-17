import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.panlab.software.fci.core.FCI;
import org.panlab.software.fci.core.ParameterValuePair;
import org.panlab.software.fci.core.ResourceContext;
import org.panlab.software.fci.core.ResourceGroup;
import org.panlab.software.fci.core.ResourceProvider;
import org.panlab.software.fci.core.ResourceProxy;
import org.panlab.software.fci.core.ServiceType;

import FederationOffice.fcielements.AuthorizationKey;
import FederationOffice.fcielements.FCICredentials;

public class HelloSFAWorld {

	FCICredentials creds;
	AuthorizationKey key;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new HelloSFAWorld();

	}

	public HelloSFAWorld() {
		CreateScenario();
	}

	private void CreateScenario() {
		FCI fci = FCI.getInstance();
		
		
		Map<String, String> opts = new HashMap<String, String>();
		opts.put("registry_url", "");
		opts.put("sm_url", "");
		opts.put("keystore_FILEPATH", "");
		opts.put("trustStore_FILEPATH", "");
		opts.put("authority", "");
		opts.put("certificate_FILEPATH", "");
		
		
		
		FCICredentials cred = fci.createFCICredentials(opts);

		AuthorizationKey authKey = fci.createAuthorizationKey(cred);
		
		
		
		ResourceContext sfa = fci.createResourceContext("sfa", authKey);

		for (ServiceType elem : sfa.getAvailableServices()) {
			System.out.println("Service: " + elem.getName() + "("
					+ elem.getDescription() + ")");
		}

		ServiceType service = sfa.getServiceType("echo");

		for (ResourceProvider elem : sfa.getResourceProvidersForServiceType(service)) {
			System.out.println("Service Provider: " + elem.getName() + "("+ elem.getDescription() + ")");
		}
		
		ResourceProvider provider = sfa.getFirstResourceProviderOfService(service);
		System.out.println("A first available Provider: " + provider.getName());

		ResourceGroup myGroup = fci.createResourceGroup("ScenarioExample");

		List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
		ParameterValuePair p = new ParameterValuePair("input", "Christos");
		params.add(p);
		ResourceProxy resourceEcho = sfa.createResourceProxy("myTempVCT", "myEchoResource", provider, service, params);
		
		System.out.println("Echo resource GUID: " + resourceEcho.getGUID());
		myGroup.addResourceProxy(resourceEcho);
		
		// Update all resources of group
		System.out.println("Echo output = "+ resourceEcho.getParameterValueOfResource("output", true));
		

		// Terminate the group..terminate any contained resources
		myGroup.TearDownResources();
	}

	

}
