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

package org.panlab.software.fstoolkit.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.panlab.software.fstoolkit.Activator;
import org.panlab.software.fstoolkit.utils.GenerateFSDLsource;

import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.uiObjects.ui_TaxonomyTreeItem;

public class VCTImportWizard extends Wizard implements INewWizard {
	private VCTImportWizardPageOne pageOne;
	private ISelection selection;
	private RequestedFederationScenario fedScenario;

	public VCTImportWizard() {
		super();
		setNeedsProgressMonitor(true);
		this.setWindowTitle("VCT Import Wizard");
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		System.out.println("VCTImportWizard init selection= "+selection.toString());
		this.selection = selection;
		Object TreeObj = ((IStructuredSelection)selection).getFirstElement();
		fedScenario = (RequestedFederationScenario)(( ui_TaxonomyTreeItem)TreeObj).getOfficeElement();

	}
	

	public void addPages() {
		pageOne = new VCTImportWizardPageOne(selection);
		addPage(pageOne);
	}

	@Override
	public boolean performFinish() {
	final String containerName = pageOne.getContainerName();
	final String fileName = pageOne.getFileName();
	
	
	IRunnableWithProgress op = new IRunnableWithProgress() {
		public void run(IProgressMonitor monitor) throws InvocationTargetException {
			try {
				doFinish(containerName, fileName,  monitor);
			} catch (CoreException e) {
				throw new InvocationTargetException(e);
			} finally {
				monitor.done();
			}
		}
	};
	try {
		getContainer().run(true, false, op);
	} catch (InterruptedException e) {
		return false;
	} catch (InvocationTargetException e) {
		Throwable realException = e.getTargetException();
		MessageDialog.openError(getShell(), "Error", realException.getMessage());
		return false;
	}
	return true;
	}

	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */

	private void doFinish(
		String containerName,
		String fileName,
		IProgressMonitor monitor)
		throws CoreException {
		// create a sample file
		monitor.beginTask("Importing "+fedScenario.getName()+". Applying Model2Model transformation", 4);
		IWorkspaceRoot root= ResourcesPlugin.getWorkspace().getRoot();
		// get project root folder as absolute file system path
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
	    String targetPath = resource.getLocation().toPortableString();
		monitor.worked(1);
		
		//WE MUST TAKE THIS FROM THE PLUGIN!
		Activator.getDefault().	LoadScenarioFromOffice(fedScenario);
		
		monitor.worked(1);
		
		monitor.setTaskName("Generating FSDK for "+fedScenario.getName()+". Applying Model2Text transformation");
		
		//process.Model2Code(targetPath, targetLanguage);
		GenerateFSDLsource.Model2FSDLSource( fedScenario, targetPath, fileName);
		
		monitor.worked(1);

		monitor.setTaskName("Refresh the project to get external updates");
	    resource.refreshLocal(IResource.DEPTH_INFINITE, null);
		monitor.worked(1);

		monitor.setTaskName("Opening "+fileName+" file for editing...");

		String vfileToOpen =   fileName;
		
		final IFile file = container.getFile(new Path( vfileToOpen ));

		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}
			}
		});
		
		monitor.worked(1);
		
	}

	
	

	/**
	 * We will initialize file contents with a sample text.
	 */

	

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "org.panlab.software.fstoolkit", IStatus.OK, message, null);
		throw new CoreException(status);
	}
}
