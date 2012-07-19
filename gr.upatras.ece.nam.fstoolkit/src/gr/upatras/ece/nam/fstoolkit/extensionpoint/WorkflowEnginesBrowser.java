package gr.upatras.ece.nam.fstoolkit.extensionpoint;

import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;

import brokermodel.extensionInterfaces.IWorkflowEngine;

public class WorkflowEnginesBrowser {

	private static WorkflowEnginesBrowser instance;
	private IWorkflowEngine selectedEngine;	
	private ArrayList<IWorkflowEngine> engines;
	
	// This is the ID from your extension point
	private static final String IWORKFLOWENGINE_ID = "gr.upatras.ece.nam.fstoolkit.extensionpoint.workflowengine";

	public WorkflowEnginesBrowser(){
		engines = new ArrayList<IWorkflowEngine>();
		runWorkflowEngineExtension(engines);
		if (engines.size()>0)
			selectedEngine = engines.get(0);
	}
	
	public static WorkflowEnginesBrowser getInstance(){
		if (instance == null){
			instance = new WorkflowEnginesBrowser();
		}
		
		return instance;
	}
	
	public ArrayList<IWorkflowEngine> getWorkflowEngines(){
		return engines;
	}
	
	private void runWorkflowEngineExtension(final ArrayList<IWorkflowEngine> engines) {
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(IWORKFLOWENGINE_ID);
		
		try {
			for (IConfigurationElement e : config) {
				System.out.println("Evaluating extension "+IWORKFLOWENGINE_ID);
				final Object o = e.createExecutableExtension("class");
				if (o instanceof IWorkflowEngine) {
					ISafeRunnable runnable = new ISafeRunnable() {
						@Override
						public void handleException(Throwable exception) {
							System.out.println("Exception in client");
						}

						@Override
						public void run() throws Exception {
							engines.add( (IWorkflowEngine) o );
						}
					};
					SafeRunner.run(runnable);
				}
			}
		} catch (CoreException ex) {
			System.out.println(ex.getMessage());
		}
	}
	

	public IWorkflowEngine getSelectedProvisioningEngine(){
		return selectedEngine;
	}
	

	public void setSelectedProvisioningEngine(IWorkflowEngine wengine){
		this.selectedEngine = wengine;
	}
	
}
