package gr.upatras.ece.nam.fstoolkit.FCIgenerator.project;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class GenerateFCICommand extends AbstractHandler {

	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();


		IWorkbench workbench = PlatformUI.getWorkbench();
		// Instantiates and initializes the wizard
		VCTImportWizard wizard = new VCTImportWizard();
		wizard.init( workbench, (org.eclipse.jface.viewers.IStructuredSelection)selection);
	    // Instantiates the wizard container with the wizard and opens it
	    Shell shell =
	          PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	    WizardDialog dialog = new WizardDialog(shell, wizard);
	    dialog.create();
	    dialog.open();
		return null;
	}

}
