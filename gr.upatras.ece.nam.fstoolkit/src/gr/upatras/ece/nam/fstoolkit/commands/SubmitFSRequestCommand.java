package gr.upatras.ece.nam.fstoolkit.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import gr.upatras.ece.nam.fstoolkit.wizards.SubmitFSDLRequestWizard;

import brokermodel.federationscenarios.RequestedFederationScenario;

public class SubmitFSRequestCommand extends AbstractHandler  {


	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
//		IWorkbench workbench = PlatformUI.getWorkbench();
//		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		

		// Instantiates and initializes the wizard
		SubmitFSDLRequestWizard wizard = new SubmitFSDLRequestWizard(checkInfrastructureReq());
		
		//wizard.init( workbench.getActiveWorkbenchWindow(), (IStructuredSelection)selection);
	    // Instantiates the wizard container with the wizard and opens it
	    Shell shell =
	          PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	    WizardDialog dialog = new WizardDialog(shell, wizard);
	    dialog.create();
	    dialog.open();
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
		RequestedFederationScenario sourceFedScenario = (RequestedFederationScenario) resource.getContents().get(0);
		
		
		return (sourceFedScenario.getInfrastructureRequest()!=null) &&
			(sourceFedScenario.getInfrastructureRequest().getReqOfferedResources().size()>0);
	}

}
