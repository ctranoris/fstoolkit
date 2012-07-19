package gr.upatras.ece.nam.fstoolkit.views.FSDLView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IViewPart;

import brokermodel.ScenarioStatus;
import brokermodel.extensionInterfaces.IProvisioningJobEvent;
import brokermodel.extensionInterfaces.IProvisioningJobListener;

public class RunningScenariosProvisioningJobListener implements
		IProvisioningJobListener {
	
	private IViewPart view_part;
	
	public RunningScenariosProvisioningJobListener(IViewPart view_part){
		this.view_part = view_part;
	}
	
	@Override
	public void initialize(EObject source) {

	}

	@Override
	public void eventOccured(IProvisioningJobEvent event) {
		
		if (view_part==null)
			return;
		
		if (event.statusChangedOnScenario() !=null){
			System.out.println("ProvisioningJobListener scenario = "+event.statusChangedOnScenario().getName()+
				" status = "+ event.statusChangedOnScenario().getStatus().getName() );
			
			if (event.statusChangedOnScenario().getStatus() == ScenarioStatus.SCHEDULED_PROVISIONING  )
				((RunningScenariosView)view_part).runWorkflowEngineExtensionAndLoadRunningScenarios( );
			if (event.statusChangedOnScenario().getStatus() == ScenarioStatus.DELETED  )
				((RunningScenariosView)view_part).runWorkflowEngineExtensionAndLoadRunningScenarios( );
		}

		if (event.statusChangedOnResource()  !=null){
			System.out.println("ProvisioningJobListener resource = "+event.statusChangedOnResource().getName()+
					" status = "+ event.statusChangedOnResource().getRuntimeInfo().getStatus().getName()  );
		}
		
		((RunningScenariosView)view_part).startUpdateTree(event.statusChangedOnScenario());	

	}

	@Override
	public void terminate() {
		// TODO Auto-generated method stub

	}
	
	
	@Override
	public EClass eClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource eResource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EObject eContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EReference eContainmentFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<EObject> eContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eIsProxy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<EObject> eCrossReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eUnset(EStructuralFeature feature) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments)
			throws InvocationTargetException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Adapter> eAdapters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eDeliver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eNotify(Notification notification) {
		// TODO Auto-generated method stub

	}

	

}
