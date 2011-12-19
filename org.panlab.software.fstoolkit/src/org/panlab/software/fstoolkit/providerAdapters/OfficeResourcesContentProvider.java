package org.panlab.software.fstoolkit.providerAdapters;

import java.util.Vector;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IViewSite;

import FederationOffice.Office;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.providersite.Site;
import FederationOffice.resources.OfferedResource;
import FederationOffice.resources.ResourceCategory;
import FederationOffice.services.Taxonomy;
import FederationOffice.uiObjects.OfficeManager;
import FederationOffice.uiObjects.UiObjectsFactory;
import FederationOffice.uiObjects.ui_TaxonomyTreeItem;
import FederationOffice.users.ResourcesProvider;

public class OfficeResourcesContentProvider implements
		IStructuredContentProvider, ITreeContentProvider {

	private IViewSite viewSite;
	private Vector<Office> officeList;
	private Boolean showResourcesByTaxonomy;
	private Boolean showResourcesByProvider;
	
	 /* The content provider class is responsible for
	 * providing objects to the view. It can wrap
	 * existing objects in adapters or simply return
	 * objects as-is. These objects may be sensitive
	 * to the current input of the view, or ignore
	 * it and always show the same content 
	 * (like Task List, for example).
	 */
	 
	
	public OfficeResourcesContentProvider(IViewSite viewSite,Boolean showResourcesByTaxonomy, 
			Boolean showResourcesByProvider ) {
		super();
		this.viewSite = viewSite;
		this.showResourcesByTaxonomy = showResourcesByTaxonomy;
		this.showResourcesByProvider = showResourcesByProvider;
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

		
		if (showResourcesByProvider){
			for (int i = 0; i < office.getRegisteredUsers().size() ; i++) {
				if (office.getRegisteredUsers().get(i) instanceof ResourcesProvider ){
					 ResourcesProvider rp = (ResourcesProvider) office.getRegisteredUsers().get(i);
					 ui_TaxonomyTreeItem rProviderItem = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();//new TreeParent( tax  );
					 rProviderItem.setOfficeElement(rp);
					 rootOffice.getChildNodes().add(rProviderItem);
					 rProviderItem.setParentNode(rootOffice);
					 AddResourcesByProvider(   rProviderItem, rp  );
					 
				}
				
				
			}
			
			
		}
		
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
		
		if (showResourcesByTaxonomy)
			AddResourcesCategoriesOfTaxonomy(   node, taxonomy  );
		
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
	
	private void AddResourcesByProvider(ui_TaxonomyTreeItem item,
			ResourcesProvider rp) {

		for( int i = 0; i < rp.getOfferedSiteList().size(); i++) {
			Site site = rp.getOfferedSiteList().get(i);
			ui_TaxonomyTreeItem siteItem = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();
			siteItem.setOfficeElement(site);
			item.getChildNodes().add(siteItem);// addChild(root);
			siteItem.setParentNode(item);
			
			for(int j = 0; j<site.getOfferedResourcesList().size();j++){
				ui_TaxonomyTreeItem resItem = UiObjectsFactory.eINSTANCE
						.createui_TaxonomyTreeItem();// new TreeObject(
														// office.getOfferedServices().get(i)
														// );
				OfferedResource r = site.getOfferedResourcesList().get(j);
				resItem.setOfficeElement(r);
				siteItem.getChildNodes().add(resItem);// addChild(root);
				resItem.setParentNode(siteItem);
			}
		}
		
		
		
	}

}
