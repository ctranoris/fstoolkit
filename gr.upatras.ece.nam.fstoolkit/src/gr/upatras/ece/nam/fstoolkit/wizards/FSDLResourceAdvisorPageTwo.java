package gr.upatras.ece.nam.fstoolkit.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.ide.IDE;
import gr.upatras.ece.nam.fstoolkit.Activator;
import gr.upatras.ece.nam.fstoolkit.utils.GenerateFSDLsource;

import brokermodel.federationscenarios.RequestedFederationScenario;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (mpe).
 */

public class FSDLResourceAdvisorPageTwo extends WizardPage {
	private Text containerText;

	private Text fileText;

	private ISelection selection;
	
	private int offeredPlanID=-1;

	public int getOfferedPlanID() {
		return offeredPlanID;
	}

	public void setOfferedPlanID(int offeredPlanID) {
		this.offeredPlanID = offeredPlanID;
	}
	
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public FSDLResourceAdvisorPageTwo(ISelection selection) {
		super("wizardPage FSDLResourceAdvisorPageTwo");
		setTitle("Create a new FSDL file describing proposed implementation");
		setDescription("The new FSDL file with *.fsdl extension will be saved in the chosen folder." +
				"It will describe resources and configuration \nbased on your initial scenario request." +
				"Later, submit this detailed scenario for reservation and provisioning");
		this.selection = selection;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		Label label = new Label(container, SWT.NULL);
		label.setText("&Container:");

		containerText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		containerText.setLayoutData(gd);
		containerText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});
		label = new Label(container, SWT.NULL);
		label.setText("&File name:");

		fileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		fileText.setLayoutData(gd);
		fileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		initialize();
		dialogChanged();
		setControl(container);
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		if (selection != null && selection.isEmpty() == false
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IContainer container;
				if (obj instanceof IContainer)
					container = (IContainer) obj;
				else
					container = ((IResource) obj).getParent();
				containerText.setText(container.getFullPath().toString());
			}
		}

		DateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss"); 
    	Date dateNow = new Date ();
    	sdf.format(dateNow);
    	
		fileText.setText(((FSDLResourceAdvisorPageOne) this.getPreviousPage())
				.getResourceAdvisor().getSourceFedScenario().getName() + "_Request_"+sdf.format(dateNow)+".fsdl");
		containerText.setText(((FSDLResourceAdvisorPageOne) this
				.getPreviousPage()).getResourceAdvisor().getModelFile().getFullPath()
				.removeLastSegments(1).toString());
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	private void handleBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				"Select new file container");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				containerText.setText(((Path) result[0]).toString());
			}
		}
	}

	public void setContainerText(String containerText) {
		this.containerText.setText(containerText) ;
	}

	public void setFileText(String fileText) {
		this.fileText.setText(fileText) ;
	}
	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {
		IResource container = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(new Path(getContainerName()));
		String fileName = getFileName();

		if (getContainerName().length() == 0) {
			updateStatus("File container must be specified");
			return;
		}
		if (container == null
				|| (container.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("File container must exist");
			return;
		}
		if (!container.isAccessible()) {
			updateStatus("Project must be writable");
			return;
		}
		if (fileName.length() == 0) {
			updateStatus("File name must be specified");
			return;
		}
		if (fileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("File name must be valid");
			return;
		}
		int dotLoc = fileName.lastIndexOf('.');
		if (dotLoc != -1) {
			String ext = fileName.substring(dotLoc + 1);
			if (ext.equalsIgnoreCase("fsdl") == false) {
				updateStatus("File extension must be \"fsdl\"");
				return;
			}
		}
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getContainerName() {
		return containerText.getText();
	}

	public String getFileName() {
		return fileText.getText();
	}
	
	
	public boolean FinishPrepareRequest(){
		final String containerName = this.getContainerName();
		final String fileName = this.getFileName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, monitor);
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
			RequestedFederationScenario fedScenario = ((FSDLResourceAdvisorPageOne) this.getPreviousPage()).getResourceAdvisor().getTargetFedScenario();
			monitor.beginTask("Creating "+fedScenario.getName()+".", 4);
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
			Activator.getDefault().	LoadScenarioFromBroker(fedScenario);
			
			monitor.worked(1);
			
			monitor.setTaskName("Generating FSDL for "+fedScenario.getName()+".");
			
			GenerateFSDLsource.Model2FSDLSource( ((FSDLResourceAdvisorPageOne) this.getPreviousPage())
					.getResourceAdvisor().getTargetFedScenario()  , targetPath, fileName);
			
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
	
//	private void doFinish(
//		String containerName,
//		String fileName,
//		IProgressMonitor monitor)
//		throws CoreException {
//		// create a sample file
//		monitor.beginTask("Creating " + fileName, 2);
//		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
//		IResource resource = root.findMember(new Path(containerName));
//		if (!resource.exists() || !(resource instanceof IContainer)) {
//			throwCoreException("Container \"" + containerName + "\" does not exist.");
//		}
//		IContainer container = (IContainer) resource;
////		final IFile file = container.getFile(new Path(fileName));
////		try {
////			InputStream stream = openContentStream();
////			if (file.exists()) {
////				file.setContents(stream, true, true, monitor);
////			} else {
////				file.create(stream, true, monitor);
////			}
////			stream.close();
////			
////		} catch (IOException e) {
////		}
//
//	    String targetPath = resource.getLocation().toPortableString();
//		GenerateFSDLsource.Model2FSDLSource( ((FSDLResourceAdvisorPageOne) this.getPreviousPage())
//				.getResourceAdvisor().getTargetFedScenario()  , targetPath);
//		
//		monitor.worked(1);
//		monitor.setTaskName("Opening file for editing...");
//		getShell().getDisplay().asyncExec(new Runnable() {
//			public void run() {
//				IWorkbenchPage page =
//					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
//				try {
//					IDE.openEditor(page, file, true);
//				} catch (PartInitException e) {
//				}
//			}
//		});
//		monitor.worked(1);
//	}
	
	
	/**
	 * We will initialize file contents with a sample text.
	 */

//	private InputStream openContentStream() {
//		
//		String contents = ((FSDLResourceAdvisorPageOne) this.getPreviousPage())
//				.getResourceAdvisor().prepareRequestString();
//			 
//		return new ByteArrayInputStream(contents.getBytes());
//	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "gr.upatras.ece.nam.fsdl.ui", IStatus.OK, message, null);
		throw new CoreException(status);
	}
	
}