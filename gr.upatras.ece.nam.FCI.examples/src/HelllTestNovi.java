import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import gr.upatras.ece.nam.fci.core.FCI;
import gr.upatras.ece.nam.fci.core.ParameterValuePair;
import gr.upatras.ece.nam.fci.core.ResourceContext;
import gr.upatras.ece.nam.fci.core.ResourceGroup;
import gr.upatras.ece.nam.fci.core.ResourceProvider;
import gr.upatras.ece.nam.fci.core.ResourceProxy;
import gr.upatras.ece.nam.fci.core.ServiceType;
import gr.upatras.ece.nam.fci.sfa.SFAUtils;

import brokermodel.fcielements.AuthorizationKey;
import brokermodel.fcielements.FCICredentials;

public class HelllTestNovi {

	FCICredentials creds;
	AuthorizationKey key;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new HelllTestNovi();

	}

	public HelllTestNovi() {
		CreateScenario();
	}

	private void CreateScenario() {
		FCI fci = FCI.getInstance();
		
		
		Map<String, String> opts = new HashMap<String, String>();
		
		opts.put(SFAUtils.REGISTRY_URL, "https://150.254.160.18:12345");
		opts.put(SFAUtils.AM_URL, "https://150.254.160.18:12346");
		opts.put(SFAUtils.SM_URL, "https://150.254.160.18:12347");
		opts.put(SFAUtils.KEYSTORE_FILEPATH, "C:\\Users\\ctranoris\\Desktop\\_downloads\\tmp\\plckeys\\novi\\client3.p12");
		opts.put(SFAUtils.KEYSTORE_PASSWORD, "123456");
		opts.put(SFAUtils.TRUSTSTORE_FILEPATH , "C:\\Users\\ctranoris\\Desktop\\_downloads\\tmp\\plckeys\\novi\\client3.keystore");
		opts.put(SFAUtils.TRUSTSTORE_PASSWORD, "123456");
		opts.put(SFAUtils.AUTHORITY, "novipl.novi");
		opts.put(SFAUtils.USERNAME, "novipl.novi.celia_velayos2");
		opts.put(SFAUtils.SELF_CERTIFICATE_FILEPATH, "C:\\Users\\ctranoris\\Desktop\\_downloads\\tmp\\plckeys\\novi\\certForClient.txt");
				
		FCICredentials cred = fci.createFCICredentials(opts);

		AuthorizationKey authKey = fci.createAuthorizationKey(cred);
		
		ResourceContext sfa = fci.createResourceContext(SFAUtils.RESOURCE_CONTEXT_NAME, authKey);


		System.out.println("Office name: " + sfa.getBrokerModel().getName() );
				
		for (ServiceType elem : sfa.getAvailableServices()) {
			System.out.println("Service: " + elem.getName() + "("
					+ elem.getDescription() + ")");
		}

		ServiceType service = sfa.getServiceType("node");

		for (ResourceProvider elem : sfa.getResourceProvidersForServiceType(service)) {
			System.out.println("Service Provider: " + elem.getName() + "("+ elem.getDescription() + ")");
		}
		
		ResourceProvider provider = sfa.getFirstResourceProviderOfService(service);
		System.out.println("A first available Provider: " + provider.getName());

		ResourceGroup myGroup = fci.createResourceGroup("ScenarioExample");

//		List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
//		ParameterValuePair p = new ParameterValuePair("input", "Christos");
//		params.add(p);
//		ResourceProxy resourceEcho = sfa.createResourceProxy("myTempVCT", "myEchoResource", provider, service, params);
//		
//		System.out.println("Echo resource GUID: " + resourceEcho.getGUID());
//		myGroup.addResourceProxy(resourceEcho);
//		
//		// Update all resources of group
//		System.out.println("Echo output = "+ resourceEcho.getParameterValueOfResource("output", true));
//		
//
//		// Terminate the group..terminate any contained resources
		myGroup.TearDownResources();
	}

	

}
