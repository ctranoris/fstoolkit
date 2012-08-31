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

public class p2nerPanlab {

	FCICredentials creds;
	AuthorizationKey key;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new p2nerPanlab();

	}

	public p2nerPanlab() {
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

		ServiceType serviceXenImageStore = panlab.getServiceType("xenimagestore");

//		for (ResourceProvider elem : panlab.getResourceProvidersForServiceType(serviceXenImageStore)) {
//			System.out.println("Service Provider: " + elem.getName() + "("+ elem.getDescription() + ")");
//		}
		
		ResourceProvider provider = panlab.getFirstResourceProviderOfService(serviceXenImageStore);
		System.out.println("A first available Provider for serviceXenImageStore: " + provider.getName());

		ResourceGroup myGroup = fci.createResourceGroup("ScenarioExample");

		List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
		ParameterValuePair p = new ParameterValuePair("Name", "p2ner", "myinp");
		params.add(p);
		p = new ParameterValuePair("InputURL", "http://150.140.184.236:8001/p2ner.img", "myinp");
		params.add(p);
		p = new ParameterValuePair("OutputURL", "", "myinp");
		params.add(p);
		ResourceProxy resourceXENImagestore = panlab.createResourceProxy("myTempVCT", "myXENImagestore", provider, serviceXenImageStore, params);
		
		System.out.println("serviceXenImageDeploy resource GUID: " + resourceXENImagestore.getGUID());
		myGroup.addResourceProxy(resourceXENImagestore);		
		
		String outurl = resourceXENImagestore.getParameterValueOfResource("OutputURL", true);
		System.out.println("serviceXenImageDeploy OutputURL = "+ outurl);
		
		List<ParameterValuePair> paramsXENDeploy = new ArrayList<ParameterValuePair>();
		p = new ParameterValuePair("NAME", "p2server", "myinp");
		paramsXENDeploy.add(p);
		p = new ParameterValuePair("VLANID", "23", "myinp");
		paramsXENDeploy.add(p);
		p = new ParameterValuePair("IP", "10.0.0.243", "myinp");
		paramsXENDeploy.add(p);
		p = new ParameterValuePair("GW", "10.0.0.254", "myinp");
		paramsXENDeploy.add(p);
		p = new ParameterValuePair("MEM", "512", "myinp");
		paramsXENDeploy.add(p);
		p = new ParameterValuePair("LOGGER_IP", "10.0.0.243", "myinp");
		paramsXENDeploy.add(p);
		p = new ParameterValuePair("URL", outurl, "myinp");
		paramsXENDeploy.add(p);
		p = new ParameterValuePair("CAP", "50", "myinp");
		paramsXENDeploy.add(p);

		ServiceType serviceXenImageDeploy = panlab.getServiceType("xenvmdeploy");
		provider = panlab.getFirstResourceProviderOfService(serviceXenImageDeploy);
		System.out.println("A first available Provider for serviceXenImageDeploy: " + provider.getName());
		ResourceProxy resourceXENImageDeploy = 
			panlab.createResourceProxy("myTempVCT", "myXENImageDeploy", provider, serviceXenImageDeploy, paramsXENDeploy);
		myGroup.addResourceProxy(resourceXENImageDeploy);		
		

		// Terminate the group..terminate any contained resources
		myGroup.TearDownResources();
	}

	


}
