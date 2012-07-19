package gr.upatras.ece.nam.fstoolkit.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class FSDLResourceAdvisorWizard extends Wizard implements INewWizard {
	private FSDLResourceAdvisorPageOne pageOne;
	private FSDLResourceAdvisorPageTwo pageTwo;
	private ISelection selection;

	public FSDLResourceAdvisorWizard() {
		super();
		setNeedsProgressMonitor(true);
		this.setWindowTitle("Resource Advisor");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		
	}
	@Override
	public boolean canFinish() {
		
		return this.pageTwo.getOfferedPlanID()>=0;
	}
	
	
	
	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	@Override
	public boolean performFinish() {
		
		return pageTwo.FinishPrepareRequest() ;
	}


	@Override
	public void addPages() {
		pageOne = new FSDLResourceAdvisorPageOne(selection);
		addPage(pageOne);
		pageTwo = new FSDLResourceAdvisorPageTwo(selection);
		addPage(pageTwo);
	}
	
}
