package gr.upatras.ece.nam.fstoolkit.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import gr.upatras.ece.nam.fstoolkit.extensionpoint.WorkflowEnginesBrowser;

import brokermodel.extensionInterfaces.IWorkflowEngine;
import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.federationscenarios.ResourceRequest;
import brokermodel.uiObjects.ui_TaxonomyTreeItem;

public class ShutDownResourceCommand extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
			if (!MessageDialog.openQuestion(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), 
					"Shut Down Resource", "Would you like to Shut Down selected resource?")){
				return null;
			}
			
			for (Object obj : strucSelection.toArray()) {
				System.out.println("shutDownResourceAction =" + obj.toString()  );
				if (obj instanceof ui_TaxonomyTreeItem){
					if ( ((ui_TaxonomyTreeItem)obj).getBrokerElement() instanceof ResourceRequest ){
						for (IWorkflowEngine wEngine : WorkflowEnginesBrowser.getInstance().getWorkflowEngines()) {
							//System.out.println("tearDownScenarioAction =" + viewer.getSelection().toString() );
							ResourceRequest resourceReq = 
								(ResourceRequest)((ui_TaxonomyTreeItem)obj).getBrokerElement();
							RequestedFederationScenario scenario = null;
							if (resourceReq.eContainer()!=null)
								if (resourceReq.eContainer().eContainer()!=null)
									scenario =(RequestedFederationScenario)resourceReq.eContainer().eContainer() ;
							wEngine.ShutDownResource(scenario, resourceReq);
						}
					}
				}	
			}
		}
		return null;
	}

}
