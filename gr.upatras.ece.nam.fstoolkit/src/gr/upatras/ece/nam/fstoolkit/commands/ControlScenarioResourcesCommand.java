package gr.upatras.ece.nam.fstoolkit.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import gr.upatras.ece.nam.fstoolkit.views.ControlResourceView;

import brokermodel.federationscenarios.ResourceGroup;
import brokermodel.federationscenarios.ResourceRequest;
import brokermodel.uiObjects.ui_TaxonomyTreeItem;




public class ControlScenarioResourcesCommand extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
			
			
			for (Object obj : strucSelection.toArray()) {
				System.out.println("Control Resource =" + obj.toString()  );
				if (obj instanceof ui_TaxonomyTreeItem){
					if ( (((ui_TaxonomyTreeItem)obj).getBrokerElement() instanceof ResourceRequest) ||
							((ui_TaxonomyTreeItem)obj).getBrokerElement() instanceof ResourceGroup  ){
							//System.out.println("tearDownScenarioAction =" + viewer.getSelection().toString() );							
							//ResourceRequest resourceRequest =  (ResourceRequest)((ui_TaxonomyTreeItem)obj).getOfficeElement();
							
							try {
								IViewPart prosheet = PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow().getActivePage()
									.findView(IPageLayout.ID_PROP_SHEET); //try to position it near Properties View

								IWorkbenchPage activepage;
								if (prosheet!=null)
									activepage = prosheet.getSite().getWorkbenchWindow().getActivePage();
								else
									activepage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
								
								if (((ui_TaxonomyTreeItem)obj).getBrokerElement() instanceof ResourceRequest){
									ResourceRequest resourceRequest =  (ResourceRequest)((ui_TaxonomyTreeItem)obj).getBrokerElement();
									ControlResourceView view_part = 
									(ControlResourceView) activepage.
									showView("org.panlab.software.fstoolkit.views.ControlResourceView", 
											"fscontrol."+resourceRequest.getName()+
											"."+resourceRequest.getRuntimeInfo().getGUID(), 
											org.eclipse.ui.IWorkbenchPage.VIEW_VISIBLE );
								
									view_part.setResourceRequest(resourceRequest);
								}else if (((ui_TaxonomyTreeItem)obj).getBrokerElement() instanceof ResourceGroup){
									ResourceGroup resourceGroup =  (ResourceGroup)((ui_TaxonomyTreeItem)obj).getBrokerElement();
									ControlResourceView view_part = 
									(ControlResourceView) activepage.
									showView("org.panlab.software.fstoolkit.views.ControlResourceView", 
											"fscontrol."+resourceGroup.getName()  , 
											org.eclipse.ui.IWorkbenchPage.VIEW_VISIBLE );
								
									view_part.setResourceGroup(resourceGroup) ;
								}
								
							} catch (PartInitException e) {
								// TODO Auto-geeninerated catch block
								e.printStackTrace();
							}
						
					}
				}	
			}
		}

		
		
		
		
		return null;
	}

}
