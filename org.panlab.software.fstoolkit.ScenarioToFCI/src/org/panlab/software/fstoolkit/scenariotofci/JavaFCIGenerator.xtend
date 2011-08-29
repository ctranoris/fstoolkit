package org.panlab.software.fstoolkit.scenariotofci

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject
import com.google.inject.Inject

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import FederationOffice.Office
import FederationOffice.federationscenarios.RequestedFederationScenario
import FederationOffice.resources.OfferedResource
import org.eclipse.xtext.naming.IQualifiedNameProvider

class JavaFCIGenerator  implements IGenerator {


	@Inject extension IQualifiedNameProvider nameProvider 
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		System::out.println( "resource="+resource.toString )
		for(EObject e: resource.allContentsIterable.filter(typeof( RequestedFederationScenario ))) {
			e.toClass(fsa)
			
			
    	}
    	
	}

	def addResourceContext(Office e) {
		 '''
		public ResourceContext _resource_context_«e.name»(){ 
			FCICredentials cred = new FCICredentials(_username_«e.name», _password_«e.name»);
			FCI fci = FCI.getInstance();
			AuthorizationKey authKey = fci.createAuthorizationKey(cred);
			ResourceContext _context_«e.name» = fci.createResourceContext("«e.name»", authKey);
			return _context_«e.name» ;
		}
		
		'''
	}

	

	def dispatch toClass(RequestedFederationScenario e, IFileSystemAccess fsa) {
		System::out.println( "compile2="+e.toString )
		
		for(reqResource : e.infrastructureRequest.reqOfferedResources ){
			reqResource.refOfferedResource.toClass(fsa);	
		}
		
		fsa.generateFile("scenario/"+e.name + ".java", '''
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
		
		package scenario;
		
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
		
		public class «e.name» {
		
			//for each imported office, we need credentials and authorizationkey(?)
			
			«FOR  s : e.infrastructureRequest.reqOfferedResources»
				«var office =  s.refOfferedResource.belongsToSite.belongsToProvider.eContainer as Office»
				//credentials for «office.name» Office
				String _username_«office.name» ="ENTER USERNAME";
				String _password_«office.name» ="ENTER PASSWORD";
				«addResourceContext(office)»
			«ENDFOR»
			/**
			 * @param args
			 */
			public static void main(String[] args) {
				new «e.name»();
		
			}
			
			//for each imported office, we need credentials
		
			public «e.name»() {
				CreateContexts();
				CreateScenario();
			}
			
			public void CreateContexts(){
				
			}
		
			private void CreateScenario() {
		        //credentials for Panlab Office
		        FCICredentials cred = new FCICredentials("synchromedia", "pii-2010");
		
		        FCI fci = FCI.getInstance();
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
		
		''')
	}
	
	

	def dispatch void toClass(OfferedResource e, IFileSystemAccess fsa) {
		fsa.generateFile("services/"+e.name + ".java", '''
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
		
		package services;
		
		public class «e.name» {

		private String instanceName;
		private String scenarioID;
		private String ptmAlias;
		private XMLutils xmlutil;
		
		public «e.name»(String instName, String scenarioid) {
			//Auto-generated constructor stub
			instanceName = instName;
			scenarioID = scenarioid;
			
		}
		
		public String getInstanceName(){
			return instanceName;
		}
		
		''')	

	}

	def dispatch void toClass(EObject m, IFileSystemAccess fsa) { }

}
	