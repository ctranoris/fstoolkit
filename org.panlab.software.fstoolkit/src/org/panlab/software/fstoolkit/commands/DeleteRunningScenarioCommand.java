package org.panlab.software.fstoolkit.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.panlab.software.fstoolkit.extensionpoint.WorkflowEnginesBrowser;

import FederationOffice.VTStatus;
import FederationOffice.extensionInterfaces.IWorkflowEngine;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.uiObjects.ui_TaxonomyTreeItem;

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
					if ( ((ui_TaxonomyTreeItem)obj).getOfficeElement() instanceof RequestedFederationScenario ){
						for (IWorkflowEngine wEngine : WorkflowEnginesBrowser.getInstance().getWorkflowEngines()) {
							RequestedFederationScenario scenario = 
								(RequestedFederationScenario)((ui_TaxonomyTreeItem)obj).getOfficeElement();
							if ((scenario.getStatus()==VTStatus.NEW ) || (scenario.getStatus()==VTStatus.PROVISIONING )
									|| (scenario.getStatus()==VTStatus.RUNNING ) || (scenario.getStatus()==VTStatus.SCHEDULED_PROVISIONING )){
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
