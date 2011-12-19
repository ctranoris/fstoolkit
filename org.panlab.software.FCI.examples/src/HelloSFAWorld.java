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
import org.panlab.software.fci.sfa.SFAUtils;

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
		
		opts.put(SFAUtils.REGISTRY_URL, "https://sfa1.pl.sophia.inria.fr:12345");
		opts.put(SFAUtils.AM_URL, "https://sfa1.pl.sophia.inria.fr:12346");
		opts.put(SFAUtils.SM_URL, "https://sfa1.pl.sophia.inria.fr:12347");
		opts.put(SFAUtils.KEYSTORE_FILEPATH, "C:\\Users\\ctranoris\\Desktop\\_downloads\\tmp\\plckeys\\sfa1inriactranoris.p12");
		opts.put(SFAUtils.KEYSTORE_PASSWORD, "123456");
		opts.put(SFAUtils.TRUSTSTORE_FILEPATH , "C:\\Users\\ctranoris\\Desktop\\_downloads\\tmp\\myplc.keystore");
		opts.put(SFAUtils.TRUSTSTORE_PASSWORD, "123456");
		opts.put(SFAUtils.AUTHORITY, "pla.openlab");
		opts.put(SFAUtils.USERNAME, "pla.openlab.ctranoris");
		opts.put(SFAUtils.SELF_CERTIFICATE_FILEPATH, "C:\\Users\\ctranoris\\Desktop\\_downloads\\tmp\\plckeys\\sfa1inriactranoris.sscert");
				
		FCICredentials cred = fci.createFCICredentials(opts);

		AuthorizationKey authKey = fci.createAuthorizationKey(cred);
		
		ResourceContext sfa = fci.createResourceContext(SFAUtils.RESOURCE_CONTEXT_NAME, authKey);

		for (ServiceType elem : sfa.getAvailableServices()) {
			System.out.println("Service: " + elem.getName() + "("
					+ elem.getDescription() + ")");
		}

//		ServiceType service = sfa.getServiceType("echo");
//
//		for (ResourceProvider elem : sfa.getResourceProvidersForServiceType(service)) {
//			System.out.println("Service Provider: " + elem.getName() + "("+ elem.getDescription() + ")");
//		}
//		
//		ResourceProvider provider = sfa.getFirstResourceProviderOfService(service);
//		System.out.println("A first available Provider: " + provider.getName());
//
//		ResourceGroup myGroup = fci.createResourceGroup("ScenarioExample");
//
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
//		myGroup.TearDownResources();
	}

	

}
