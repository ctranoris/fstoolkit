package gr.upatras.ece.nam.fstoolkit.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import gr.upatras.ece.nam.fstoolkit.extensionpoint.WorkflowEnginesBrowser;

import brokermodel.ScenarioStatus;
import brokermodel.extensionInterfaces.IWorkflowEngine;
import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.uiObjects.ui_TaxonomyTreeItem;

public class DeleteRunningScenarioCommand extends AbstractHandler {


	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection  selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
			if (!MessageDialog.openQuestion(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), 
					"Delete Scenario", "Would you like a permanent delete of selected Scenario?")){
				return null;
			}
			for (Object obj : strucSelection.toArray()) {
				System.out.println("tearDownScenarioAction =" + obj.toString()  );
				if (obj instanceof ui_TaxonomyTreeItem){
					if ( ((ui_TaxonomyTreeItem)obj).getBrokerElement() instanceof RequestedFederationScenario ){
						for (IWorkflowEngine wEngine : WorkflowEnginesBrowser.getInstance().getWorkflowEngines()) {
							RequestedFederationScenario scenario = 
								(RequestedFederationScenario)((ui_TaxonomyTreeItem)obj).getBrokerElement();
							if ((scenario.getStatus()==ScenarioStatus.NEW ) || (scenario.getStatus()==ScenarioStatus.PROVISIONING )
									|| (scenario.getStatus()==ScenarioStatus.RUNNING ) || (scenario.getStatus()==ScenarioStatus.SCHEDULED_PROVISIONING )){
								MessageDialog.openInformation(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), 
									"Delete Scenario",  "Cannot delete: "+scenario.getName()+". Please shut down scenario first.");
							}else
								wEngine.DeletePermanentlyScenario(scenario);
						}
					}
				}	
			}
		}
		return null;
		
	}


}
