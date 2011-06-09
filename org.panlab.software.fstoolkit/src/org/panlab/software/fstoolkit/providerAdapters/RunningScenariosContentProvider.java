package org.panlab.software.fstoolkit.providerAdapters;

import java.util.ArrayList;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IViewSite;

import FederationOffice.experimentRuntime.RunningScenarios;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceGroup;
import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.uiObjects.UiObjectsFactory;
import FederationOffice.uiObjects.ui_TaxonomyTreeItem;

public class RunningScenariosContentProvider implements
		IStructuredContentProvider, ITreeContentProvider {

	private IViewSite viewSite;
	private ui_TaxonomyTreeItem invisibleRoot;
	
	 /* The content provider class is responsible for
	 * providing objects to the view. It can wrap
	 * existing objects in adapters or simply return
	 * objects as-is. These objects may be sensitive
	 * to the current input of the view, or ignore
	 * it and always show the same content 
	 * (like Task List, for example).
	 */
	 
	
	public RunningScenariosContentProvider(IViewSite viewSite) {
		super();
		this.viewSite = viewSite;
	}

	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] getChildren(Object parentElement) {

		
		if (parentElement instanceof ui_TaxonomyTreeItem) {
			if (((ui_TaxonomyTreeItem)parentElement).getChildNodes().size()>0){
				return ((ui_TaxonomyTreeItem)parentElement).getChildNodes().toArray() ;
			}
		}
		return new Object[0];
	}

	@Override
	public Object getParent(Object child) {
		if (child instanceof ui_TaxonomyTreeItem) {
			return ((ui_TaxonomyTreeItem)child).getParentNode();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object parentElement) {
		if (parentElement instanceof ui_TaxonomyTreeItem)
			return ((ui_TaxonomyTreeItem)parentElement).getChildNodes().size()>0 ;
		return false;
	}

	@Override
	public Object[] getElements(Object parent) {
		if (parent.equals( viewSite )) {
			if (invisibleRoot==null) {
				invisibleRoot = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();  //ui_TaxonomyTreeItem( null );
				invisibleRoot.setDisplayName("Invisible root");
			}
			return getChildren(invisibleRoot);
			
		}
		return getChildren(parent);
	}
	
//	public void AddOfficesFromManager(OfficeManager officeMng) {
//		for (int i = 0; i < officeMng.getOfficesRef().size() ; i++) {
//			AddOffice(officeMng.getOfficesRef().get(i));
//		}
//		
//	}
	
	public void AddRunningScenarios(RunningScenarios runningScenarios) {
		//ui_TaxonomyTreeItem rootOffice = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();
		//rootOffice.setOfficeElement( null );		
		
		if (invisibleRoot==null) {
			invisibleRoot = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();
			invisibleRoot.setDisplayName("Invisible node");
		}
		
		//invisibleRoot.getChildNodes().add(rootOffice);
		//rootOffice.setParentNode(invisibleRoot);
		AddUserRunningScenarios(invisibleRoot, runningScenarios );		
	}

	private void AddUserRunningScenarios(ui_TaxonomyTreeItem rootObj, RunningScenarios runningScenarios) {
		ui_TaxonomyTreeItem rootMyRunScen = rootObj;
		
		for (int j = 0; j < runningScenarios.getRequestedScenarios().size(); j++){
			ui_TaxonomyTreeItem root = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();
			RequestedFederationScenario rs = runningScenarios.getRequestedScenarios().get(j);
			root.setOfficeElement( rs );
			rootMyRunScen.getChildNodes().add(root);
			AddResourcesOfScenario(root, rs);
		}
	}
	
	public void AddResourcesOfScenario(ui_TaxonomyTreeItem root,
			RequestedFederationScenario aFS) {
		if ( aFS.getInfrastructureRequest() == null)
			return;
		
		//this array will be used only here to signal requests that are inside a group, so not to add them again
		ArrayList<ResourceRequest> tempRes = new ArrayList<ResourceRequest>();
		
		//add groups first
		for (int i = 0; i < aFS.getInfrastructureRequest().getResourceGroups().size() ; i++) {
			ui_TaxonomyTreeItem treeItemGroup = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();
			ResourceGroup resG = aFS.getInfrastructureRequest().getResourceGroups().get(i);
			treeItemGroup.setOfficeElement(  resG );
			root.getChildNodes().add(treeItemGroup);
			treeItemGroup.setParentNode(root);
			for (int j = 0; j < resG.getGroupedResources().size() ; j++) {
				ui_TaxonomyTreeItem treeItem = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();
				treeItem.setOfficeElement(  resG.getGroupedResources().get(j) );
				treeItemGroup.getChildNodes().add(treeItem);
				treeItem.setParentNode(treeItemGroup);
				tempRes.add(resG.getGroupedResources().get(j));
			}
		}
		
		for (int i = 0; i < aFS.getInfrastructureRequest().getReqOfferedResources().size() ; i++) 
			if ( ! tempRes.contains(aFS.getInfrastructureRequest().getReqOfferedResources().get(i)) ){
				//if not added already the resource in a group
				ui_TaxonomyTreeItem treeItem = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();
				treeItem.setOfficeElement(  aFS.getInfrastructureRequest().getReqOfferedResources().get(i) );
				root.getChildNodes().add(treeItem);
				treeItem.setParentNode(root);
			}
		
		
	}


	public void updateModel(){
		
	
	}


	public void clearScenarios() {
		invisibleRoot.getChildNodes().clear() ;
		
	}
	
	

}
