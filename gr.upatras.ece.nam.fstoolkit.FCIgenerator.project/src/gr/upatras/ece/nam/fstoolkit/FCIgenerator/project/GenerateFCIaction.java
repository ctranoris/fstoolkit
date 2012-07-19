/*************************************************************************
Copyright 2010 Christos Tranoris, University of Patras 

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 

http://www.apache.org/licenses/LICENSE-2.0 
Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License. 
*************************************************************************/

package gr.upatras.ece.nam.fstoolkit.FCIgenerator.project;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;

public class GenerateFCIaction implements IWorkbenchWindowActionDelegate {

	private ISelection select;
		
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		action.setEnabled(  selection instanceof org.eclipse.jface.viewers.IStructuredSelection );
		select = selection;
		
	}
	
	

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub

	}



	@Override
	public void run(IAction action) {
		IWorkbench workbench = PlatformUI.getWorkbench();
		// Instantiates and initializes the wizard
		VCTImportWizard wizard = new VCTImportWizard();
		wizard.init( workbench, (org.eclipse.jface.viewers.IStructuredSelection)select);
	    // Instantiates the wizard container with the wizard and opens it
	    Shell shell =
	          PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	    WizardDialog dialog = new WizardDialog(shell, wizard);
	    dialog.create();
	    dialog.open();
		
	}

}
