package org.panlab.software.fstoolkit.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.panlab.software.fstoolkit.wizards.FSDLResourceAdvisorWizard;

public class ResourceAdvisorCommand extends  AbstractHandler  {


	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Instantiates and initializes the wizard
		FSDLResourceAdvisorWizard wizard = new FSDLResourceAdvisorWizard();
		//wizard.init( workbench.getActiveWorkbenchWindow(), (IStructuredSelection)selection);
	    // Instantiates the wizard container with the wizard and opens it
	    Shell shell =
	          PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	    WizardDialog dialog = new WizardDialog(shell, wizard);
	    dialog.create();
	    dialog.open();
		return null;
	}


}
