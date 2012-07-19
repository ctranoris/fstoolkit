package gr.upatras.ece.nam.fstoolkit.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import gr.upatras.ece.nam.fstoolkit.Activator;
import gr.upatras.ece.nam.fstoolkit.extensionpoint.WorkflowEnginesBrowser;

import brokermodel.federationscenarios.RequestedFederationScenario;

public class SubmitFSDLRequestWizard extends Wizard implements IWizard {
	
	private boolean infrastructureReqExists;
	private FSDLResourceAdvisorPageOne resourceAdvisorPageOne;
	private FSDLResourceAdvisorPageTwo resourceAdvisorPageTwo;
	private SubmitFSDLRequestPageOne submitFSDLRequestPageOne;
	private RequestedFederationScenario sourceFedScenario;

	public SubmitFSDLRequestWizard(boolean infrastructureReqExists){
		super();
		setNeedsProgressMonitor(true);
		this.setWindowTitle("Submit Federation Scenario Request");
		this.infrastructureReqExists = infrastructureReqExists;
		
	}
	
	@Override
	public void addPages() {
		super.addPages();
		if (!infrastructureReqExists){
			resourceAdvisorPageOne = new FSDLResourceAdvisorPageOne(null);
			addPage(resourceAdvisorPageOne);
			resourceAdvisorPageTwo = new FSDLResourceAdvisorPageTwo(null);
			addPage(resourceAdvisorPageTwo);
			
		}else{
			prepareWorkflow();
		}
		
		submitFSDLRequestPageOne = new SubmitFSDLRequestPageOne(null);
		addPage(submitFSDLRequestPageOne);
	}

	
	
	
	@Override
	public boolean canFinish() {
		
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#getNextPage(org.eclipse.jface.wizard.IWizardPage)
	 */
	@Override
	public IWizardPage getNextPage(IWizardPage page) {

		System.out.println("getNextPage: "+page.toString() );
		
		if ( (page instanceof SubmitFSDLRequestPageOne)  ){
			prepareWorkflow();	
		}
		return super.getNextPage(page);
	}
	
	public void prepareWorkflow(){
		if (resourceAdvisorPageTwo!=null)
			resourceAdvisorPageTwo.FinishPrepareRequest();
		
		LoadModel();
	}
	
	private void LoadModel(){
		//System.out.println("LoadModel()" );
		
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		
		IEditorPart editor = page.getActiveEditor();

		IFile modelFile;
		
		modelFile = (IFile) editor.getEditorInput().getAdapter(IFile.class);
//		if (modelFile != null) {
//			System.out.println("LoadModel()" + modelFile.getLocation().toString() );
//		}
		
		
		try {

			ResourceSet resourceSet = new ResourceSetImpl();
			URI uri = URI.createFileURI(modelFile.getLocation().toString());
			//System.out.println("uri" + uri.toString() );
			org.eclipse.emf.ecore.resource.Resource resource = resourceSet.getResource(uri, true);
			sourceFedScenario = (RequestedFederationScenario) resource.getContents().get(0);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	
	
	@Override
	public boolean performFinish() {
		if (sourceFedScenario == null)
			return false; //don;t let user close the window from OK, if for some reason there is no scenario
		
		WorkflowEnginesBrowser.getInstance().getSelectedProvisioningEngine().ScheduleScenario(sourceFedScenario);
		ShowPreferredPrespective();
		return true;
	}

	private void ShowPreferredPrespective() {
		final IWorkbenchWindow workbenchWindow = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow();
		IPerspectiveDescriptor activePerspective = workbenchWindow.getActivePage().getPerspective();
		final String preferredPerspectiveId = "gr.upatras.ece.nam.fstoolkit.FSOperationPerspective";
	        if (activePerspective == null || !activePerspective.getId().equals(preferredPerspectiveId)){ 
	        	//if (MessageDialog.openQuestion(workbenchWindow.getShell(), "Show Perspective", "Would you like to switch to Operation Perspective?")){
	            // Switching of the perspective is delayed using Display.asyncExec
	            // because switching the perspective while the workbench is
	            // activating parts might cause conflicts.
	            Display.getCurrent().asyncExec(new Runnable() {

	                public void run() {
	                    try {
	                        workbenchWindow.getWorkbench().showPerspective(preferredPerspectiveId,
	                                workbenchWindow);
	                        //updateViewPart();
	                		
	                    } catch (WorkbenchException e) {
//	                        log.warn("Could not switch to preferred perspective "
//	                                + preferredPerspectiveId + " for " + part.getClass(), e);
	                    }
	                }

	            });
	        }
	    }
	
}
