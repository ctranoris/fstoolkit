package org.panlab.software.fstoolkit.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.panlab.software.fstoolkit.scenariotofci.Scenario2fciWizard;

import FederationOffice.federationscenarios.RequestedFederationScenario;

public class Scenario2FCICommand extends AbstractHandler  {

	private RequestedFederationScenario sourceFedScenario;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// Instantiates and initializes the wizard
		if (checkInfrastructureReq()){
		    // Instantiates the wizard container with the wizard and opens it
			Scenario2fciWizard wizard = new Scenario2fciWizard(sourceFedScenario);
			Shell shell =
			          PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			    WizardDialog dialog = new WizardDialog(shell, wizard);
			    dialog.create();
			    dialog.open();
		}else{
			MessageDialog.openError(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), 
					"Generate FCI",  "Cannot generate FCI for scenario: "+sourceFedScenario.getName()+", because there is no Infrastructure Request section. Please either define it or run the Resource Advisor.");
			
		}
		    
	

		return null;
	}

	public boolean checkInfrastructureReq(){
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		
		IEditorPart editor = page.getActiveEditor();
		
		IFile modelFile = (IFile) editor.getEditorInput().getAdapter(IFile.class);
		if (modelFile != null) {
			System.out.println("checkInfrastructureReq()" + modelFile.getLocation().toString() );
		}
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createFileURI(modelFile.getLocation().toString());
		System.out.println("uri" + uri.toString() );
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.getResource(uri, true);
		sourceFedScenario = (RequestedFederationScenario) resource.getContents().get(0);
		
		
		return (sourceFedScenario.getInfrastructureRequest()!=null) &&
			(sourceFedScenario.getInfrastructureRequest().getReqOfferedResources().size()>0);
	}
	

}
