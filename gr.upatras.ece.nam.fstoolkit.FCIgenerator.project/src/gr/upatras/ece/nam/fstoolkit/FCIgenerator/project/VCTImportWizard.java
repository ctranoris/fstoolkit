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

public class VCTImportWizard extends Wizard implements INewWizard {
	private VCTImportWizardPageOne pageOne;
	private ISelection selection;

	public VCTImportWizard() {
		super();
		setNeedsProgressMonitor(true);
		this.setWindowTitle("Federation Computing Interface Generator");
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		//System.out.println("VCTImportWizard init selection= "+selection);
		this.selection = selection;
		
	}
	

	public void addPages() {
		pageOne = new VCTImportWizardPageOne(selection);
		addPage(pageOne);
	}

	@Override
	public boolean performFinish() {
	final String containerName = pageOne.getContainerName();
	final String fileName = "";
	
	final String  username = pageOne.getUserName();
	final String  password = pageOne.getPassword();
	final String  vctname = pageOne.getVCTText();
	final String  targetLanguage = pageOne.getTargetLanguage();
	
	IRunnableWithProgress op = new IRunnableWithProgress() {
		public void run(IProgressMonitor monitor) throws InvocationTargetException {
			try {
				doFinish(containerName, fileName, username, password, vctname, targetLanguage, monitor);
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
		String username, String password, String vctname, String targetLanguage,
		IProgressMonitor monitor)
		throws CoreException {
		// create a sample file
		monitor.beginTask("Generating FCI for "+vctname+". Applying Model2Model transformation", 4);
		IWorkspaceRoot root= ResourcesPlugin.getWorkspace().getRoot();
		// get project root folder as absolute file system path
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
	    String targetPath = resource.getLocation().toPortableString();
		monitor.worked(1);
		
		RepoXML2VCT process = new RepoXML2VCT(username, password, vctname);
		monitor.worked(1);
		
		monitor.setTaskName("Generating FCI for "+vctname+". Applying Model2Text transformation");
		process.Model2Code(targetPath, targetLanguage);
		monitor.worked(1);

		monitor.setTaskName("Refresh the project to get external updates");
	    resource.refreshLocal(IResource.DEPTH_INFINITE, null);
		monitor.worked(1);

		monitor.setTaskName("Opening example file for editing...");

		String vfileToOpen = null;
		if (targetLanguage.equalsIgnoreCase("Java")){
			vfileToOpen = "example/Main.java";
		}
		else if (targetLanguage.equalsIgnoreCase("C")){
			vfileToOpen = vctname+".c";
		}
		
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

//	private InputStream openContentStream(String username, String password, String vctname) {
//
//		
//		String contents =  username+","+password+","+vctname ;
//		
//		
//		//prepei prwta na brw kai to user id!
//		RepoClient c = new RepoClient(
//				"http://repos.pii.tssg.org:8080/repository/rest/vct", 
//				username, password, vctname);
//		//InputStream instream = null;
//		c.execute("http://repos.pii.tssg.org:8080/repository/rest/vct");
//				 
//		return new ByteArrayInputStream(contents.getBytes());
//	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "gr.upatras.ece.nam.fsdl.ui", IStatus.OK, message, null);
		throw new CoreException(status);
	}
}
