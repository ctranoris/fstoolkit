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

	
	private ResourceProxy createResource_myecho(){
		//Create a service type by its name
        ServiceType service = _context_panlab.getServiceType("echo");
       
//        //get a resource provider 
        ResourceProvider provider = _context_panlab.getResourceProviderByURI("uop");
//       
//
        //create Parameters of a resource
        List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
        ParameterValuePair p;
        //p = new ParameterValuePair("input", "hello");
        //params.add(p);
        p = new ParameterValuePair("sleeptime_ms", "1000");
        params.add(p);
        p = new ParameterValuePair("output", "");
        params.add(p);
        ResourceProxy resource_myecho = _context_panlab.createResourceProxy("myEchoScenario", "echo_rp12_s12_or10782", provider, service, params);
        return  resource_myecho;
	}
	
	private ResourceProxy createResource_myCompute(){
		//Create a service type by its name
        ServiceType service = _context_amazon.getServiceType("Compute");
      //check all who offer that service
        for (ResourceProvider elem : _context_amazon.getResourceProvidersForServiceType(service)) {
            System.out.println("ResourceProvider: " + elem.getName() + "(description: "+ elem.getDescription() + ")");
            for (String s : elem.getURIs() ) {
                System.out.println("uri: " + s );
			}
        }

        //get a resource provider 
        ResourceProvider provider = _context_amazon.getResourceProviderByURI("eu-west-1");
        
      //create Parameters of a resource
        List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
        ParameterValuePair p;
        p = new ParameterValuePair("Region", "eu-west-1");
        params.add(p);
        p = new ParameterValuePair("InstanceType", "m1.small");
        params.add(p);
        p = new ParameterValuePair("AMIid", "ami-47cefa33");
        params.add(p);
//        p = new ParameterValuePair("PublicDnsName", ""); //output
//        params.add(p);
//        p = new ParameterValuePair("InstanceID", ""); //output
//        params.add(p);
        
        
        ResourceProxy resource_myCompute = _context_amazon.createResourceProxy("myEchoScenario", "echo_rp12_s12_or10782", provider, service, params);
        return  resource_myCompute;
	}
	
	private void CreateScenario() {
        

//    Group (for grouping resources)
      ResourceGroup myGroup = FCI.getInstance().createResourceGroup("myGroup");
      //all creates
      ResourceProxy resource_myecho = createResource_myecho();
      ResourceProxy resource_myCompute = createResource_myCompute();

      System.out.println("myecho resource GUID: " + resource_myecho.getGUID());
      System.out.println("myCompute resource GUID: " + resource_myCompute.getGUID());
      myGroup.addResourceProxy(resource_myecho);
      myGroup.addResourceProxy(resource_myCompute);
 

      System.out.println("Echo input = "+ resource_myecho.getParameterValueOfResource("input", true));
      //assignments
      // Update assignments for resources of group
      String publicdnsname = resource_myCompute.getParameterValueOfResource("publicdnsname", true);
      resource_myecho.updateParameterValueOfResource("input", publicdnsname);
      
      System.out.println("Echo input = "+ resource_myecho.getParameterValueOfResource("input", true));
      System.out.println("Echo output = "+ resource_myecho.getParameterValueOfResource("output", true));
       
      // Terminate the group..terminate any contained resources
      myGroup.TearDownResources();
    }

	


}

