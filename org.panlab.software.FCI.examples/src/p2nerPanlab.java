import java.util.ArrayList;
import java.util.List;

import org.panlab.software.fci.core.FCI;
import org.panlab.software.fci.core.ParameterValuePair;
import org.panlab.software.fci.core.ResourceContext;
import org.panlab.software.fci.core.ResourceGroup;
import org.panlab.software.fci.core.ResourceProvider;
import org.panlab.software.fci.core.ResourceProxy;
import org.panlab.software.fci.core.ServiceType;

import FederationOffice.fcielements.AuthorizationKey;
import FederationOffice.fcielements.FCICredentials;

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
		ParameterValuePair p = new ParameterValuePair("Name", "p2ner");
		params.add(p);
		p = new ParameterValuePair("InputURL", "http://150.140.184.236:8001/p2ner.img");
		params.add(p);
		p = new ParameterValuePair("OutputURL", "");
		params.add(p);
		ResourceProxy resourceXENImagestore = panlab.createResourceProxy("myTempVCT", "myXENImagestore", provider, serviceXenImageStore, params);
		
		System.out.println("serviceXenImageDeploy resource GUID: " + resourceXENImagestore.getGUID());
		myGroup.addResourceProxy(resourceXENImagestore);		
		
		String outurl = resourceXENImagestore.getParameterValueOfResource("OutputURL", true);
		System.out.println("serviceXenImageDeploy OutputURL = "+ outurl);
		
		List<ParameterValuePair> paramsXENDeploy = new ArrayList<ParameterValuePair>();
		p = new ParameterValuePair("NAME", "p2server");
		paramsXENDeploy.add(p);
		p = new ParameterValuePair("VLANID", "23");
		paramsXENDeploy.add(p);
		p = new ParameterValuePair("IP", "10.0.0.243");
		paramsXENDeploy.add(p);
		p = new ParameterValuePair("GW", "10.0.0.254");
		paramsXENDeploy.add(p);
		p = new ParameterValuePair("MEM", "512");
		paramsXENDeploy.add(p);
		p = new ParameterValuePair("LOGGER_IP", "10.0.0.243");
		paramsXENDeploy.add(p);
		p = new ParameterValuePair("URL", outurl);
		paramsXENDeploy.add(p);
		p = new ParameterValuePair("CAP", "50");
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
