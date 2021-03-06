package gr.upatras.ece.nam.fstoolkit.scenariotofci;
import gr.upatras.ece.nam.brokerdsl.BrokerDSLStandaloneSetup;
import gr.upatras.ece.nam.fsdl.ui.internal.FSDLActivator;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

import brokermodel.federationscenarios.RequestedFederationScenario;



public class Scenario2fciWizard extends Wizard implements INewWizard {
	

	private Scenario2fciWizardPageOne pageOne;
	private RequestedFederationScenario scenario;

	Injector injector;
	
	public Scenario2fciWizard(RequestedFederationScenario scenario) {
		super();
		setNeedsProgressMonitor(true);
		this.setWindowTitle("Federation Computing Interface Generator");
		this.scenario = scenario;
		injector = FSDLActivator.getInstance().getInjector(FSDLActivator.GR_UPATRAS_ECE_NAM_FSDL_FSDL);
		
		
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		System.out.println("Scenario2fciWizard init selection= "+selection);
		//ui_TaxonomyTreeItem
		//this.selection = selection;
		
		
	}

	public void addPages() {
		pageOne = new Scenario2fciWizardPageOne(scenario);
		addPage(pageOne);
	}

	@Override
	public boolean performFinish() {

		final String containerName = pageOne.getContainerName();
		final String fileName = "";
		
		final RequestedFederationScenario scenario = pageOne.getScenario();
		final String  targetLanguage = pageOne.getTargetLanguage();
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, scenario, targetLanguage, monitor);
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
		RequestedFederationScenario scenario, String targetLanguage,
		IProgressMonitor monitor)
		throws CoreException {
		// create a sample file
		monitor.beginTask("Generating FCI for "+scenario.getName() +". Applying Model2Model transformation", 4);
		IWorkspaceRoot root= ResourcesPlugin.getWorkspace().getRoot();
		// get project root folder as absolute file system path
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
	    String targetPath = resource.getLocation().toPortableString();
		monitor.worked(1);

		
		Model2Code( scenario, targetPath, targetLanguage);
		monitor.worked(1);

		monitor.setTaskName("Generating FCI for "+scenario.getName()+". Applying Model2Text transformation");
		
		monitor.worked(1);

		monitor.setTaskName("Refresh the project to get external updates");
	    resource.refreshLocal(IResource.DEPTH_INFINITE, null);
		monitor.worked(1);

		monitor.setTaskName("Opening example file for editing...");

		String vfileToOpen = null;
		if (targetLanguage.equalsIgnoreCase("Java")){
			vfileToOpen = "scenario/"+scenario.getName()+".java";
		}
		else if (targetLanguage.equalsIgnoreCase("C")){
			vfileToOpen = scenario.getName()+".c";
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
	
	
	/**
	 * Initiates the M2T transformation and dispatches it to the proper function
	 * @param fpath the src path to save the generated code
	 * @param targetLanguage currently takes values: Java, C
	 * @author ctranoris
	 */
	public void Model2Code(RequestedFederationScenario scenario, String fpath, String targetLanguage){
		if (targetLanguage.equalsIgnoreCase("Java")){
			Model2JavaCode( scenario, fpath);
		}
		else if (targetLanguage.equalsIgnoreCase("C")){
			//Model2C(fpath);
		}
	}

	/**
	 * 	Generate the java code from the model
	 * @param fpath
	 * @author ctranoris
	 */


	public void Model2JavaCode(RequestedFederationScenario scenario, String fpath){
	
		if (!EPackage.Registry.INSTANCE.containsKey("http://nam.ece.upatras.gr/brokerdsl/BrokerDSL")) {
			new BrokerDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		}
		
		//new gr.upatras.ece.nam.fsdl.FSDLStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		
		//FSDLGenerator generator = new FSDLGenerator();
		//
		//JavaIoFileSystemAccess fileAccess =new JavaIoFileSystemAccess( );
		JavaIoFileSystemAccess fileAccess =   injector.getInstance(JavaIoFileSystemAccess.class);
		fileAccess.setOutputPath(fpath);
		
//		na koitaksw giati otna bazw fsdl sto src den bgainei sto src-gen
		
		//mporeis na kaneis debug edw kai na mpeis stin klasi na deis ti fortwnei to resource
		IGenerator generator =   injector.getInstance(IGenerator.class);
		generator.doGenerate( scenario.eResource() , fileAccess);
	
	}
}
