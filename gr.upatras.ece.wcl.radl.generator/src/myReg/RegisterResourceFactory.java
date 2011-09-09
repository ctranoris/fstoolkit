package myReg;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;


public class RegisterResourceFactory extends AbstractWorkflowComponent {

	@Override
	public void checkConfiguration(Issues issues) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {

		System.out.println("---------------> invokeInternal new OfficeDLStandaloneSetup().createInjectorAndDoEMFRegistration();");
		//new OfficeDLStandaloneSetup().createInjectorAndDoEMFRegistration();

	}

}
