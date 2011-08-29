package org.panlab.software.fstoolkit.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.panlab.software.fstoolkit.scenariotofci.Scenario2fciWizard;

public class Scenario2FCICommand extends AbstractHandler  {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
			

			IWorkbench workbench = PlatformUI.getWorkbench();
			// Instantiates and initializes the wizard
			Scenario2fciWizard wizard = new Scenario2fciWizard();
			wizard.init( workbench, strucSelection);
		    // Instantiates the wizard container with the wizard and opens it
		    Shell shell =
		          PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		    WizardDialog dialog = new WizardDialog(shell, wizard);
		    dialog.create();
		    dialog.open();
		}

		return null;
	}

	

}
