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
        ResourceProvider provider = panlab.getResourceProviderByURI("synchromedia");
       
        //Group (for grouping resources)
        ResourceGroup myGroup = fci.createResourceGroup("GSNScenarioExample");

        //create Parameters of a resource
        List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
        ParameterValuePair p = new ParameterValuePair("Host_name", "ETS-Host1");
        params.add(p);
        p = new ParameterValuePair("VM_name", "MyVM");
        params.add(p);
        p = new ParameterValuePair("VM_memory", "1024");
        params.add(p);
        p = new ParameterValuePair("VM_number_of_CPU", "1");
        params.add(p);
        p = new ParameterValuePair("VM_template", "server964");
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
