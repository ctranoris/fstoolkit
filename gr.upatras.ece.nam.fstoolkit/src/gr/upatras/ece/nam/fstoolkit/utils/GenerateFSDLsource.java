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
package gr.upatras.ece.nam.fstoolkit.utils;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

import brokermodel.BrokermodelPackage;
import brokermodel.federationscenarios.RequestedFederationScenario;

public class GenerateFSDLsource {

	
	public static void Model2FSDLSource( RequestedFederationScenario fedScenario ,String fpath, String filename){
		
		 // get project root folder as absolute file system path
	    //IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
	    //IResource resource = root.findMember(new Path(buildSpec.getProject().getName()));
	    //String containerName = resource.getLocation().toPortableString();

	    // configure outlets
	    OutputImpl output = new OutputImpl();

	    Outlet outlet = new Outlet( fpath );
		System.out.println("Model2FSDLSource source will be generated to: "+fpath);
	    outlet.setOverwrite(true);
	    output.addOutlet(outlet);

	    // create execution context
	    Map<String, Variable> globalVarsMap = new HashMap<String, Variable>();
	    XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null, globalVarsMap, null, null);
	    EmfRegistryMetaModel metamodel = new EmfRegistryMetaModel() {
	        @Override
	        protected EPackage[] allPackages() {
	            return new EPackage[] { BrokermodelPackage.eINSTANCE, EcorePackage.eINSTANCE };
	        }
	    };
	    execCtx.registerMetaModel(metamodel);

	    // generate
	    System.out.println("Model2FSDLSource generate FSDL facade");

	    XpandFacade facade = XpandFacade.create(execCtx);
	    String templatePath = "template::FSDLTemplate::main";
	    facade.evaluate(templatePath, fedScenario, filename);

	    // refresh the project to get external updates:
	    //resource.refreshLocal(IResource.DEPTH_INFINITE, monitor);

	
	}
}
