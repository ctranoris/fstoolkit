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
		import gr.upatras.ece.nam.fci.core.FCI;
		import gr.upatras.ece.nam.fci.core.ParameterValuePair;
		import gr.upatras.ece.nam.fci.core.ResourceContext;
		import gr.upatras.ece.nam.fci.core.ResourceGroup;
		import gr.upatras.ece.nam.fci.core.ResourceProvider;
		import gr.upatras.ece.nam.fci.core.ResourceProxy;
		import gr.upatras.ece.nam.fci.core.ServiceType;
		import brokermodel.fcielements.AuthorizationKey;
		import brokermodel.fcielements.FCICredentials;
		
		public class myScenario {
			

			FCI fci = FCI.getInstance();
			
			//for each imported office, we need a Resource Context	
			 //TODO: Please enter here identity for p2e
			String _username_p2e ="ctranoris";
			String _password_p2e ="tranorispwd!";
			ResourceContext _context_p2e;
			
			public ResourceContext _return_context_p2e(){ 
				//credentials for amazon Broker
				FCICredentials cred = fci.createFCICredentials(_username_p2e, _password_p2e);
				AuthorizationKey authKey = fci.createAuthorizationKey(cred);
				ResourceContext _context_p2e = fci.createResourceContext("p2e", authKey);
				return _context_p2e;
			}
			
					
			//
			private ResourceProxy createResource_myOSIMSCreateSubscriberAccount(){
				//Create a service type by its name
				ServiceType service = _context_p2e.getServiceType("OSIMSCreateSubscriberAccount");
				
				//get a resource provider 
				ResourceProvider provider = _context_p2e.getResourceProviderByName("uopcampus");
				
				
				//create Parameters of a resource
				List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
				ParameterValuePair p;
				p = new ParameterValuePair("Username", "christosXXX", "usern");
				params.add(p);
				p = new ParameterValuePair("Password", "12345ZZ", "pwd");
				params.add(p);
				//ResourceProxy resource_myOSIMSCreateSubscriberAccount = _context_p2e.createResourceProxy("myScenario", "myOSIMSCreateSubscriberAccount_null", provider, service, params);
				ResourceProxy resource_myOSIMSCreateSubscriberAccount = _context_p2e.createResourceProxy(
						"myScenario", 
						"imscreateuseraccount",
						"myOSIMSCreateSubscriberAccount_null", provider, service, params);
				return  resource_myOSIMSCreateSubscriberAccount;
			}
			/**
			 * @param args
			 */
			public static void main(String[] args) {
				new myScenario();
		
			}
			
			//for each imported office, we need credentials
		
			public myScenario() {
				CreateContexts();
				CreateScenario();
			}
			
			public void CreateContexts(){
				_context_p2e = _return_context_p2e();
				
			}
		
			private void CreateScenario() {
		    //    Group (for grouping resources)
				ResourceGroup myGroup = FCI.getInstance().createResourceGroup("myGroup");
				//all creates				
				ResourceProxy resource_myOSIMSCreateSubscriberAccount = createResource_myOSIMSCreateSubscriberAccount();
				System.out.println("myOSIMSCreateSubscriberAccount resource GUID: " + resource_myOSIMSCreateSubscriberAccount.getGUID());
				myGroup.addResourceProxy(resource_myOSIMSCreateSubscriberAccount);
								 
				
//				System.out.println("Echo input = "+ resource_myecho.getParameterValueOfResource("input", true));
//				//assignments
//				// Update assignments for resources of group

				
				//example reads
				System.out.println("myOSIMSCreateSubscriberAccount username = "+ resource_myOSIMSCreateSubscriberAccount.getParameterValueOfResource("Username", true));
				System.out.println("myOSIMSCreateSubscriberAccount password = "+ resource_myOSIMSCreateSubscriberAccount.getParameterValueOfResource("Password", true));
				
				// Terminate the group..terminate any contained resources and release scenario
				myGroup.TearDownResources();
				}
		
			
		
		
		}
		
