/*************************************************************************
Copyright 2010 Panlab 

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 

http://www.apache.org/licenses/LICENSE-2.0 
Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License. 
*************************************************************************/


import java.util.ArrayList;
import java.util.List;		
import org.panlab.software.fci.core.AuthorizationKey;
import org.panlab.software.fci.core.FCI;
import org.panlab.software.fci.core.FCICredentials;
import org.panlab.software.fci.core.ParameterValuePair;
import org.panlab.software.fci.core.ResourceContext;
import org.panlab.software.fci.core.ResourceGroup;
import org.panlab.software.fci.core.ResourceProvider;
import org.panlab.software.fci.core.ResourceProxy;
import org.panlab.software.fci.core.ServiceType;

public class echo {
	//TODO: Please enter here identity for amazon
	String _username_amazon ="ENTER USERNAME";
	String _password_amazon ="ENTER PASSWORD";

	//TODO: Please enter here identity for panlab
	String _username_panlab ="ENTER USERNAME";
	String _password_panlab ="ENTER PASSWORD";
	
	FCI fci = FCI.getInstance();
	
	//for each imported office, we need credentials and authorizationkey(?)	
	
	
	ResourceContext _context_amazon;
	public ResourceContext _return_context_amazon(){ 
		//credentials for amazon Office
		FCICredentials cred = new FCICredentials(_username_amazon, _password_amazon);
		AuthorizationKey authKey = fci.createAuthorizationKey(cred);
		ResourceContext _context_amazon = fci.createResourceContext("amazon", authKey);
		return _context_amazon;
	}

	ResourceContext _context_panlab;
	public ResourceContext _return_context_panlab(){ 
		//credentials for panlab Office
		FCICredentials cred = new FCICredentials(_username_panlab, _password_panlab);
		AuthorizationKey authKey = fci.createAuthorizationKey(cred);
		ResourceContext _context_panlab = fci.createResourceContext("panlab", authKey);
		return _context_panlab;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new echo();

	}
	
	//for each imported office, we need credentials

	public echo() {
		CreateContexts();
		CreateScenario();
	}
	
	public void CreateContexts(){
		_context_amazon = _return_context_amazon();
		_context_panlab = _return_context_panlab();
	}

	private void CreateScenario() {
        

//        //browse all available services
//        for (ServiceType elem : _context_panlab.getAvailableServices()) {
//            System.out.println("Service: " + elem.getName() + "("
//                    + elem.getDescription() + ")");
//        }

        //Create a service type by its name
        ServiceType service = _context_panlab.getServiceType("echo");

//        //check all who offer that service
//        for (ResourceProvider elem : _context_panlab.getResourceProvidersForServiceType(service)) {
//            System.out.println("Service Provider: " + elem.getName() + "("+ elem.getDescription() + ")");
//        }
       
//        ResourceProvider provider = panlab.getFirstResourceProviderOfService(service);
//        System.out.println("A first available Provider: " + provider.getName());
       
//        //get a resource provider by its PTM alias
        ResourceProvider provider = _context_panlab.getResourceProviderByURI("uop");
//       
//        //Group (for grouping resources)
        ResourceGroup myGroup = FCI.getInstance().createResourceGroup("myGroup");
//
        //create Parameters of a resource
        List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
        ParameterValuePair p;
        p = new ParameterValuePair("input", "hello");
        params.add(p);
        p = new ParameterValuePair("sleeptime_ms", "hello");
        params.add(p);
        p = new ParameterValuePair("output", "");
        params.add(p);
//        p = new ParameterValuePair("VM_name", "MyVM");
//        params.add(p);
//        p = new ParameterValuePair("VM_memory", "1024");
//        params.add(p);
//        p = new ParameterValuePair("VM_number_of_CPU", "1");
//        params.add(p);
//        p = new ParameterValuePair("VM_template", "server964");
//        params.add(p);
////        p = new ParameterValuePair("sleeptime_ms", "2000");
////        params.add(p);
        ResourceProxy resourceEcho = _context_panlab.createResourceProxy("myEchoScenario", "echo_rp12_s12_or10782", provider, service, params);
//        
        System.out.println("Echo resource GUID: " + resourceEcho.getGUID());
        myGroup.addResourceProxy(resourceEcho);
//       
        // Update all resources of group
        System.out.println("Echo output = "+ resourceEcho.getParameterValueOfResource("output", true));
       
        // Terminate the group..terminate any contained resources
        myGroup.TearDownResources();
    }

	


}

