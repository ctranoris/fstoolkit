package org.panlab.software.fstoolkit.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.panlab.software.fstoolkit.extensionpoint.WorkflowEnginesBrowser;

import FederationOffice.extensionInterfaces.IWorkflowEngine;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.uiObjects.ui_TaxonomyTreeItem;

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
					if ( ((ui_TaxonomyTreeItem)obj).getOfficeElement() instanceof ResourceRequest ){
						for (IWorkflowEngine wEngine : WorkflowEnginesBrowser.getInstance().getWorkflowEngines()) {
							//System.out.println("tearDownScenarioAction =" + viewer.getSelection().toString() );
							ResourceRequest resourceReq = 
								(ResourceRequest)((ui_TaxonomyTreeItem)obj).getOfficeElement();
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
