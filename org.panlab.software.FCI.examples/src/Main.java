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

public class Main {

	FCICredentials creds;
	AuthorizationKey key;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Main();

	}

	public Main() {
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

		System.out.println("----------------------------------xenimagestore-----------");
		ServiceType service = panlab.getServiceType("xenimagestore");

		for (ResourceProvider elem : panlab
				.getResourceProvidersForServiceType(service)) {
			System.out.println("Service Provider: " + elem.getName() + "("+ elem.getDescription() + ")");
			for (String uri : elem.getURIs()) {
				System.out.println("Service Provider URI (xenimagestore) : " + uri);
			}
		}

		System.out.println("-------------------------------------xenvmdeploy--------");
		service = panlab.getServiceType("xenvmdeploy");

		for (ResourceProvider elem : panlab
				.getResourceProvidersForServiceType(service)) {
			System.out.println("Service Provider: " + elem.getName() + "("
					+ elem.getDescription() + ")");
			for (String uri : elem.getURIs()) {
				System.out.println("Service Provider URI (xenvmdeploy): " + uri);
			}
		}
		System.out.println("---------------------------------------------");

//		ResourceProvider provider = panlab
//				.getFirstResourceProviderOfService(service);
//		System.out.println("A service first available Provider: " + provider.getName());
//
//		provider = panlab.getResourceProviderByURI("uop");
//		ResourceGroup example = fci.createResourceGroup("ScenarioExample");
//
//		AnExampleToCreateResources(panlab, example);
////		AnExampleToUpdateResources(panlab, example);
////		AnExampleToAskResources(panlab);
//
//		// Terminate the group..terminate any contained resources
//		example.TearDownResources();
		
		
	}

	private void AnExampleToCreateResources(ResourceContext panlab,
			ResourceGroup example) {

		ServiceType service = panlab.getServiceType("rubis_cl");
		ResourceProvider provider = panlab
				.getFirstResourceProviderOfService(service);
		ResourceProxy resourceA = CreateResourceExample(panlab, provider,
				service);
		System.out.println("resourceA GUID: " + resourceA.getGUID());
		example.addResourceProxy(resourceA);

		ResourceProxy resourceB = CreateResourceExample(panlab, provider,
				service);
		System.out.println("resourceB GUID: " + resourceB.getGUID());
		example.addResourceProxy(resourceB);

		// Update all resources of group
		List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
		ParameterValuePair p = new ParameterValuePair("ACTION", "start");
		params.add(p);
		example.updateResources(params);

	}

	private void AnExampleToUpdateResources(ResourceContext panlab,
			ResourceGroup example) {


		ResourceProxy resourceA = panlab.getResourceProxy( "uop.rubis_cl-118" );
		System.out.println("resourceA GUID: " + resourceA.getGUID());
		example.addResourceProxy(resourceA);

		ResourceProxy resourceB = panlab.getResourceProxy( "uop.rubis_cl-119" );
		System.out.println("resourceB GUID: " + resourceA.getGUID());
		example.addResourceProxy(resourceB);

		// Update all resources of group
		List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
		ParameterValuePair p = new ParameterValuePair("ACTION", "stop");
		params.add(p);
		example.updateResources(params);
	}

	private ResourceProxy CreateResourceExample(ResourceContext panlab,
			ResourceProvider provider, ServiceType service) {

		System.out.println("Params of : " + service.getName());
		for (String elem : panlab.getAvailableParamsForServiceType(service)) {
			System.out.println("param: " + elem);
		}

		List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();

		ParameterValuePair p = new ParameterValuePair("VLANID", "23");
		params.add(p);
		p = new ParameterValuePair("IP", "10.0.0.1");
		params.add(p);
		p = new ParameterValuePair("GW", "10.0.0.250");
		params.add(p);
		p = new ParameterValuePair("MEM", "256");
		params.add(p);
		p = new ParameterValuePair("DISKSPACE", "10000");
		params.add(p);
		p = new ParameterValuePair("DBIP", "10.0.0.20");
		params.add(p);
		p = new ParameterValuePair("PROXY_APP_IP", "10.0.0.30");
		params.add(p);
		p = new ParameterValuePair("NUM_CLIENTS", "150");
		params.add(p);
		p = new ParameterValuePair("RAMP_UP_TIME", "60000");
		params.add(p);

		ResourceProxy resource = panlab.createResourceProxy("myTempVCT", "myResource", provider, service, params);

		return resource;
	}
	

	private void AnExampleToAskResources(ResourceContext panlab ){

		ServiceType service = panlab.getServiceType("rubis_cl");
		ResourceProvider provider = panlab
				.getFirstResourceProviderOfService(service);
		
		ResourceProxy resourceB = panlab.createResourceProxyFromResourceGUID( "myTempVCT", "uop.rubis_cl-124", provider, service);
		System.out.println("The Param GW = "+ resourceB.getParameterValueOfResource("GW", true));
		System.out.println("The Param GW (cached) = "+ resourceB.getParameterValueOfResource("GW", false));
		System.out.println("The Param IP = "+ resourceB.getParameterValueOfResource("IP", true));
		System.out.println("The Param IP (cached) = "+ resourceB.getParameterValueOfResource("IP", false));
	}

}
