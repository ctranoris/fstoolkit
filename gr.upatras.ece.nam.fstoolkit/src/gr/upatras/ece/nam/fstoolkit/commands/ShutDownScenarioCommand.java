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
import brokermodel.uiObjects.ui_TaxonomyTreeItem;

public class ShutDownScenarioCommand extends AbstractHandler  {

	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
			if (!MessageDialog.openQuestion(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), 
					"Shut Down Scenario", "Would you like to Shut Down selected Scenario?")){
				return null;
			}
			
			for (Object obj : strucSelection.toArray()) {
				System.out.println("tearDownScenarioAction =" + obj.toString()  );
				if (obj instanceof ui_TaxonomyTreeItem){
					if ( ((ui_TaxonomyTreeItem)obj).getBrokerElement() instanceof RequestedFederationScenario ){
						for (IWorkflowEngine wEngine : WorkflowEnginesBrowser.getInstance().getWorkflowEngines()) {
							//System.out.println("tearDownScenarioAction =" + viewer.getSelection().toString() );							
							RequestedFederationScenario scenario = 
								(RequestedFederationScenario)((ui_TaxonomyTreeItem)obj).getBrokerElement();
							wEngine.ShutDownScenario(scenario);
						}
					}
				}	
			}
		}
		return null;
	}
//
//
//	@Override
//	public boolean isEnabled() {
//		boolean allScenarios = true;
//		if (selection != null & selection instanceof IStructuredSelection) {
//			IStructuredSelection strucSelection = (IStructuredSelection) selection;
//			for (Object obj : strucSelection.toArray()) {
//				if (obj instanceof ui_TaxonomyTreeItem) {
//					allScenarios = allScenarios && (((ui_TaxonomyTreeItem) obj).getOfficeElement() instanceof RequestedFederationScenario);
//				}else
//					allScenarios = false;
//			}
//			
//			return allScenarios;
//		}
//		
//		return false;
//	}
	
	

	
}
