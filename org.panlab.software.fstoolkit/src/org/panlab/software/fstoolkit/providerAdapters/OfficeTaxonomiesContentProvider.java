package org.panlab.software.fstoolkit.providerAdapters;

import java.util.Vector;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IViewSite;

import FederationOffice.Office;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.resources.ResourceCategory;
import FederationOffice.services.Taxonomy;
import FederationOffice.uiObjects.OfficeManager;
import FederationOffice.uiObjects.UiObjectsFactory;
import FederationOffice.uiObjects.ui_TaxonomyTreeItem;

public class OfficeTaxonomiesContentProvider implements
		IStructuredContentProvider, ITreeContentProvider {

	private IViewSite viewSite;
	private Vector<Office> officeList;
	private Boolean showServices;
	private Boolean showResources;
	private Boolean showScenarios;
	
	 /* The content provider class is responsible for
	 * providing objects to the view. It can wrap
	 * existing objects in adapters or simply return
	 * objects as-is. These objects may be sensitive
	 * to the current input of the view, or ignore
	 * it and always show the same content 
	 * (like Task List, for example).
	 */
	 
	
	public OfficeTaxonomiesContentProvider(IViewSite viewSite,Boolean showServices, Boolean showResources, Boolean showScenarios ) {
		super();
		this.viewSite = viewSite;
		this.showServices = showServices;
		this.showResources = showResources;
		this.showScenarios = showScenarios;
		officeList = new Vector<Office>();
	}

	
	
	private ui_TaxonomyTreeItem invisibleRoot;
	
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
	
	public void AddOfficesFromManager(OfficeManager officeMng) {
		for (int i = 0; i < officeMng.getOfficesRef().size() ; i++) {
			AddOffice(officeMng.getOfficesRef().get(i));
		}
		
	}
	
	private void AddOffice(Office office) {
		ui_TaxonomyTreeItem rootOffice = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();
		rootOffice.setOfficeElement(office);	
		
		officeList.add(office);
		
		if (invisibleRoot==null) {
			invisibleRoot = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();
			invisibleRoot.setDisplayName("Invisible node");
		}
		
		invisibleRoot.getChildNodes().add(rootOffice);
		rootOffice.setParentNode(invisibleRoot);
		

		for (int i = 0; i < office.getContributedTaxonomies().size(); i++) {
			ui_TaxonomyTreeItem root = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();//new TreeParent( office.getContributedTaxonomies().get(i)  );
			root.setOfficeElement( office.getContributedTaxonomies().get(i) );
			rootOffice.getChildNodes().add(root);
			root.setParentNode(rootOffice);
			
			AddTaxonomiesOfTaxonomy(  root, office.getContributedTaxonomies().get(i) );
		}		
		//AddOfferedServices(rootOffice, office );
		
		DeleteEmptyTaxonomyNodes(rootOffice);
		
	}
	
	private void DeleteEmptyTaxonomyNodes(ui_TaxonomyTreeItem node) {
				
		for (int i = node.getChildNodes().size()-1; i>=0;i--){
			if ( node.getChildNodes().get(i).getOfficeElement() instanceof Taxonomy){
				DeleteEmptyTaxonomyNodes( node.getChildNodes().get(i) ); 				
			}									
		}	
		
		if ( node.getOfficeElement() instanceof Taxonomy){
			if (node.getChildNodes().size()==0){
				node.getParentNode().getChildNodes().remove(node) ;
				node.setParentNode(null);	
			}
		}
		
	}

	/**********************************
	private void AddOfferedServices(ui_TaxonomyTreeItem rootObj, Office office) {
			ui_TaxonomyTreeItem rootServices = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();//new TreeParent( null  );
			rootServices.setDisplayName("All Services");
			rootObj.getChildNodes().add(rootServices);// addChild(rootServices);		
			rootServices.setParentNode(rootObj);
			
			for (int i = 0; i < office.getOfferedServices().size()  ; i++) {			
				ui_TaxonomyTreeItem root = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();//new TreeObject( office.getOfferedServices().get(i)  );
				root.setOfficeElement(office.getOfferedServices().get(i));
				rootServices.getChildNodes().add(root);// addChild(root);
				root.setParentNode(rootServices);
			}		
	}
	******************************/
	
	

	private void AddTaxonomiesOfTaxonomy(ui_TaxonomyTreeItem node,
			Taxonomy taxonomy) {
		
		for (int i = 0; i < taxonomy.getTaxonomies().size() ; i++) {
			Taxonomy tax = taxonomy.getTaxonomies().get(i);
			ui_TaxonomyTreeItem root = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();//new TreeParent( tax  );
			root.setOfficeElement(tax);
			node.getChildNodes().add(root);// addChild(root);
			root.setParentNode(node);
			
			AddTaxonomiesOfTaxonomy(  root, tax );
//			AddServicesOfTaxonomy(  root, tax );
//			AddResourcesCategoriesOfTaxonomy(  root, tax );
		}
		

		if (showServices)
			AddServicesOfTaxonomy(  node, taxonomy );
		if (showResources)
			AddResourcesCategoriesOfTaxonomy(   node, taxonomy  );
		if (showScenarios)
			AddScenariosOfTaxonomy(   node, taxonomy  );
	}
	
	private void AddServicesOfTaxonomy(ui_TaxonomyTreeItem invisibleRoot2,
			Taxonomy taxonomy) {
		
		for (int i = 0; i < taxonomy.getHasServices().size() ; i++) {
			ui_TaxonomyTreeItem root = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();//new TreeParent( serv  );
			root.setOfficeElement(taxonomy.getHasServices().get(i));
			
			invisibleRoot2.getChildNodes().add(root);// addChild(root);
			root.setParentNode(invisibleRoot2);
		}
	}
	
	private void AddResourcesCategoriesOfTaxonomy(ui_TaxonomyTreeItem invisibleRoot2,
			Taxonomy taxonomy) {
		
		for (int i = 0; i < taxonomy.getCategories().size() ; i++) {
			ResourceCategory resCateg = taxonomy.getCategories().get(i);
			ui_TaxonomyTreeItem root = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();//new TreeParent( resCateg  );
			root.setOfficeElement(resCateg);
			
			invisibleRoot2.getChildNodes().add(root);// addChild(root);
			root.setParentNode(invisibleRoot2);
			AddSResourcesOfResourceCategory(  root, resCateg );
		}
	}

		
	private void AddSResourcesOfResourceCategory(ui_TaxonomyTreeItem invisibleRoot2,
			ResourceCategory resCat ) {
		
		for (int i = 0; i < resCat.getResourcelist().size()  ; i++) {
			
			ui_TaxonomyTreeItem root = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();//new TreeObject( resCat.getResourcelist().get(i)  );
			root.setOfficeElement(resCat.getResourcelist().get(i));
			invisibleRoot2.getChildNodes().add(root);// addChild(root);
			root.setParentNode(invisibleRoot2);
		}
	}
	
	private void AddScenariosOfTaxonomy(ui_TaxonomyTreeItem rootObj,
			Taxonomy taxonomy) {

		for (int j = 0; j < taxonomy.getHasScenarios().size(); j++) {
			ui_TaxonomyTreeItem root = UiObjectsFactory.eINSTANCE
					.createui_TaxonomyTreeItem();// new TreeObject(
													// office.getOfferedServices().get(i)
													// );
			RequestedFederationScenario aFS = taxonomy.getHasScenarios().get(j);
			root.setOfficeElement(aFS);
			rootObj.getChildNodes().add(root);// addChild(root);
			root.setParentNode(rootObj);
		}
	}

}
