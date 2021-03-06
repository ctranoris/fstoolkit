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

public class SynchromediaPanlabWorld {

	FCICredentials creds;
	AuthorizationKey key;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new SynchromediaPanlabWorld();

	}

	public SynchromediaPanlabWorld() {
		CreateScenario();
	}

	private void CreateScenario() {
        //credentials for Panlab Office
		FCI fci = FCI.getInstance();
		FCICredentials cred = fci.createFCICredentials("synchromedia", "pii-2010");

        AuthorizationKey authKey = fci.createAuthorizationKey(cred);
        ResourceContext panlab = fci.createResourceContext("panlab", authKey);

        //browse all available services
        for (ServiceType elem : panlab.getAvailableServices()) {
            System.out.println("Service: " + elem.getName() + "("
                    + elem.getDescription() + ")");
        }

        //Create a service type by its name
        ServiceType service = panlab.getServiceType("gsnvirtualmachine");

        //check all who offer that service
        for (ResourceProvider elem : panlab.getResourceProvidersForServiceType(service)) {
            System.out.println("Service Provider: " + elem.getName() + "("+ elem.getDescription() + ")");
        }
       
//        ResourceProvider provider = panlab.getFirstResourceProviderOfService(service);
//        System.out.println("A first available Provider: " + provider.getName());
       
        //get a resource provider by its PTM alias
        ResourceProvider provider = panlab.getResourceProviderBySiteURI("synchromedia");
       
        //Group (for grouping resources)
        ResourceGroup myGroup = fci.createResourceGroup("GSNScenarioExample");

        //create Parameters of a resource
        List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
        ParameterValuePair p = new ParameterValuePair("Host_name", "ETS-Host1", "myinp");
        params.add(p);
        p = new ParameterValuePair("VM_name", "MyVM", "myinp");
        params.add(p);
        p = new ParameterValuePair("VM_memory", "1024", "myinp");
        params.add(p);
        p = new ParameterValuePair("VM_number_of_CPU", "1", "myinp");
        params.add(p);
        p = new ParameterValuePair("VM_template", "server964", "myinp");
        params.add(p);
//        p = new ParameterValuePair("sleeptime_ms", "2000");
//        params.add(p);
        ResourceProxy resourceEcho = panlab.createResourceProxy("myTempVCT", "mygsnvirtulamachineResource", provider, service, params);
        
        System.out.println("Echo resource GUID: " + resourceEcho.getGUID());
        myGroup.addResourceProxy(resourceEcho);
       
        // Update all resources of group
        System.out.println("Echo output = "+ resourceEcho.getParameterValueOfResource("output", true));
       
        // Terminate the group..terminate any contained resources
        myGroup.TearDownResources();
    }

	


}
