import java.util.ArrayList;
import java.util.List;

import gr.upatras.ece.nam.fci.core.FCI;
import gr.upatras.ece.nam.fci.core.ParameterValuePair;
import gr.upatras.ece.nam.fci.core.ResourceContext;
import gr.upatras.ece.nam.fci.core.ResourceGroup;
import gr.upatras.ece.nam.fci.core.ResourceProvider;
import gr.upatras.ece.nam.fci.core.ResourceProxy;
import gr.upatras.ece.nam.fci.core.ServiceType;

import brokermodel.fcielements.AuthorizationKey;
import brokermodel.fcielements.FCICredentials;

public class HelloPanlabWorld {

	FCICredentials creds;
	AuthorizationKey key;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new HelloPanlabWorld();

	}

	public HelloPanlabWorld() {
		CreateScenario();
	}

	private void CreateScenario() {
		FCI fci = FCI.getInstance();
		FCICredentials cred = fci.createFCICredentials("ctranoris", "ctranoris");

		AuthorizationKey authKey = fci.createAuthorizationKey(cred);
		ResourceContext panlab = fci.createResourceContext("panlab", authKey);

		for (ServiceType elem : panlab.getAvailableServices()) {
			System.out.println("Service: " + elem.getName() + "("
					+ elem.getDescription() + ")");
		}

		ServiceType service = panlab.getServiceType("echo");

		for (ResourceProvider elem : panlab.getResourceProvidersForServiceType(service)) {
			System.out.println("Service Provider: " + elem.getName() + "("+ elem.getDescription() + ")");
		}
		
		ResourceProvider provider = panlab.getFirstResourceProviderOfService(service);
		System.out.println("A first available Provider: " + provider.getName());

		ResourceGroup myGroup = fci.createResourceGroup("ScenarioExample");

		List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
		ParameterValuePair p = new ParameterValuePair("input", "Christos", "myinp");
		params.add(p);
		ResourceProxy resourceEcho = panlab.createResourceProxy("myTempVCT", "myEchoResource", provider, service, params);
		
		System.out.println("Echo resource GUID: " + resourceEcho.getGUID());
		myGroup.addResourceProxy(resourceEcho);
		
		// Update all resources of group
		System.out.println("Echo output = "+ resourceEcho.getParameterValueOfResource("output", true));
		

		// Terminate the group..terminate any contained resources
		myGroup.TearDownResources();
	}

	


}
