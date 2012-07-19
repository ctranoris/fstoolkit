package gr.upatras.ece.nam.fstoolkit.localprovisioningengine;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import brokermodel.BrokermodelPackage;
import brokermodel.experimentRuntime.ExperimentRuntimeFactory;
import brokermodel.experimentRuntime.RunningScenarios;
import brokermodel.federationscenarios.RequestedFederationScenario;

public class LocalRuntimeScenariosMgt {

	private static LocalRuntimeScenariosMgt instance;
	private RunningScenarios runningScenarios;
	
	public RunningScenarios getRunningScenarios() {
		return runningScenarios;
	}

	public static LocalRuntimeScenariosMgt getInstance(){
		if (instance==null)
			instance = new LocalRuntimeScenariosMgt();
		return instance;
	}
	
	public LocalRuntimeScenariosMgt(){
		LoadStoredScenarios();
	}
	
	
	private void LoadStoredScenarios() {
		// Initialize the model
		BrokermodelPackage.eINSTANCE.eClass();
		
		// As of here we preparing to save the model content
		// Register the XMI resource factory for the .office extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("runningscenarios", new XMIResourceFactoryImpl());
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		// Create a resource 
		String uri = Activator.getDefault().getStateLocation().toOSString() + "\\local.runningscenarios";

		Resource resourceFile = resSet.createResource( URI.createFileURI( uri ) );
		
		try {
			if (resourceFile.getURI().isFile()  ) { 
				System.out.println("Loading scenario from: " + uri);
				resourceFile.load(Collections.EMPTY_MAP);
				// Get the first model element and cast it to the right type
				runningScenarios = (RunningScenarios) resourceFile.getContents().get(0);
			} 
		} catch (IOException e) {
			e.printStackTrace();
			//this will happen probably the first time
			runningScenarios = ExperimentRuntimeFactory.eINSTANCE.createRunningScenarios();
			SaveRunningScenarios();
		}
	}

	public void SaveRunningScenarios(){
		// Initialize the model
		BrokermodelPackage.eINSTANCE.eClass();
		
		// As of here we preparing to save the model content
		// Register the XMI resource factory for the .office extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("runningscenarios", new XMIResourceFactoryImpl());
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		// Create a resource 
		String uri = Activator.getDefault().getStateLocation().toOSString() + "\\local.runningscenarios";

		Resource resourceFile = resSet.createResource( URI.createFileURI( uri ));
		resourceFile.getContents().add(runningScenarios);

		try {
			System.out.println("Saving runningScenarios to: " + uri);
			resourceFile.save(Collections.EMPTY_MAP);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public RequestedFederationScenario LoadScenario(String scenarioName) {
		
		// Initialize the model
		BrokermodelPackage.eINSTANCE.eClass();
		
		// As of here we preparing to save the model content
		// Register the XMI resource factory for the .office extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("scenario", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		// Create a resource 
		String uri = Activator.getDefault().getStateLocation().toOSString() + "\\"+scenarioName+".scenario";

		Resource resourceFile = resSet.createResource( URI.createFileURI( uri ));
		
		try {
				System.out.println("Loading scenario from: "+uri);				
				resourceFile.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Get the first model element and cast it to the right type
		return (RequestedFederationScenario)resourceFile.getContents().get(0);
		
	}
	
	
	/**
	 * It will create a new scenario based on the given one, if the given one is not already saved. 
	 * 
	 * @param scenario the source scenario to be saved
	 * @return if the scenario is not saved and not on the running list it will return a copy of the requested scenario.
	 * Otherwise it will return the same requested.
	 */
	public RequestedFederationScenario SaveRunningScenarioModel(RequestedFederationScenario scenario){
		RequestedFederationScenario savedScenario;		
		
		if (scenario.getRuntimeInfo() == null){
			ScenarioSolver s = new ScenarioSolver();
			savedScenario = s.prepareScenarioRequest(scenario); 
			// Initialize the model
			BrokermodelPackage.eINSTANCE.eClass();
			
			// As of here we preparing to save the model content
			// Register the XMI resource factory for the .office extension
	
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("scenario", new XMIResourceFactoryImpl());
			// Obtain a new resource set
			ResourceSet resSet = new ResourceSetImpl();
	
			DateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss"); 
	    	Date dateNow = new Date ();	    	
			String tempResourceName = savedScenario.getName()+"_"+sdf.format(dateNow)+".scenario";
			// Create a resource 
			String uri = Activator.getDefault().getStateLocation().toOSString() + "\\"+ tempResourceName;	
			Resource resourceFile = resSet.createResource( URI.createFileURI( uri ));
			resourceFile.getContents().add(savedScenario);
			
			//elementFormDefault
			
			try {
				System.out.println("Saving runningScenario to: " + uri);
//				Map<String, String> options = new HashMap<String, String>();
//		        //change as needed according to the type of resource
//		        //you are using
//				options.put(XMIResource.OPTION_ENCODING, "UTF-8");
//				resourceFile.save(options);
				resourceFile.save(Collections.EMPTY_MAP);
	
			} catch (IOException e) {
				e.printStackTrace();
			}			
			//take it from the file now
			savedScenario = (RequestedFederationScenario)resourceFile.getContents().get(0);
			runningScenarios.getRequestedScenarios().add(savedScenario);
		} else{
			savedScenario = scenario;
			try {
				System.out.println("Saving runningScenario:");
				savedScenario.eResource().save(Collections.EMPTY_MAP);
	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		SaveRunningScenarios();	
		return savedScenario;
	}
	
	public boolean checkIfScenarioExists(RequestedFederationScenario scenario){
		return runningScenarios.getRequestedScenarios().contains(scenario);
	}

	public void DeleteScenarioModel(RequestedFederationScenario scenario) {
		try {
			scenario.eResource().delete(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		runningScenarios.getRequestedScenarios().remove(scenario);
		SaveRunningScenarios();			
	}

}
