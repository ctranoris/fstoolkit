package gr.upatras.ece.nam.fstoolkit.providerAdapters;

import java.util.Vector;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IViewSite;

import brokermodel.Broker;
import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.resources.ResourceCategory;
import brokermodel.services.Taxonomy;
import brokermodel.uiObjects.BrokerManager;
import brokermodel.uiObjects.UiObjectsFactory;
import brokermodel.uiObjects.ui_TaxonomyTreeItem;

public class BrokerTaxonomiesContentProvider implements
		IStructuredContentProvider, ITreeContentProvider {

	private IViewSite viewSite;
	private Vector<Broker> officeList;
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
	 
	
	public BrokerTaxonomiesContentProvider(IViewSite viewSite,Boolean showServices, Boolean showResources, Boolean showScenarios ) {
		super();
		this.viewSite = viewSite;
		this.showServices = showServices;
		this.showResources = showResources;
		this.showScenarios = showScenarios;
		officeList = new Vector<Broker>();
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
	
	public void AddBrokersFromManager(BrokerManager officeMng) {
		for (int i = 0; i < officeMng.getBrokersRef().size() ; i++) {
			AddBroker(officeMng.getBrokersRef().get(i));
		}
		
	}
	
	private void AddBroker(Broker office) {
		ui_TaxonomyTreeItem rootBroker = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();
		rootBroker.setBrokerElement(office);	
		
		officeList.add(office);
		
		if (invisibleRoot==null) {
			invisibleRoot = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();
			invisibleRoot.setDisplayName("Invisible node");
		}
		
		invisibleRoot.getChildNodes().add(rootBroker);
		rootBroker.setParentNode(invisibleRoot);
		

		for (int i = 0; i < office.getContributedTaxonomies().size(); i++) {
			ui_TaxonomyTreeItem root = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();//new TreeParent( office.getContributedTaxonomies().get(i)  );
			root.setBrokerElement( office.getContributedTaxonomies().get(i) );
			rootBroker.getChildNodes().add(root);
			root.setParentNode(rootBroker);
			
			AddTaxonomiesOfTaxonomy(  root, office.getContributedTaxonomies().get(i) );
		}		
		//AddOfferedServices(rootBroker, office );
		
		DeleteEmptyTaxonomyNodes(rootBroker);
		
	}
	
	private void DeleteEmptyTaxonomyNodes(ui_TaxonomyTreeItem node) {
				
		for (int i = node.getChildNodes().size()-1; i>=0;i--){
			if ( node.getChildNodes().get(i).getBrokerElement() instanceof Taxonomy){
				DeleteEmptyTaxonomyNodes( node.getChildNodes().get(i) ); 				
			}									
		}	
		
		if ( node.getBrokerElement() instanceof Taxonomy){
			if (node.getChildNodes().size()==0){
				node.getParentNode().getChildNodes().remove(node) ;
				node.setParentNode(null);	
			}
		}
		
	}

	/**********************************
	private void AddOfferedServices(ui_TaxonomyTreeItem rootObj, Broker office) {
			ui_TaxonomyTreeItem rootServices = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();//new TreeParent( null  );
			rootServices.setDisplayName("All Services");
			rootObj.getChildNodes().add(rootServices);// addChild(rootServices);		
			rootServices.setParentNode(rootObj);
			
			for (int i = 0; i < office.getOfferedServices().size()  ; i++) {			
				ui_TaxonomyTreeItem root = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();//new TreeObject( office.getOfferedServices().get(i)  );
				root.setBrokerElement(office.getOfferedServices().get(i));
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
			root.setBrokerElement(tax);
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
			root.setBrokerElement(taxonomy.getHasServices().get(i));
			
			invisibleRoot2.getChildNodes().add(root);// addChild(root);
			root.setParentNode(invisibleRoot2);
		}
	}
	
	private void AddResourcesCategoriesOfTaxonomy(ui_TaxonomyTreeItem invisibleRoot2,
			Taxonomy taxonomy) {
		
		for (int i = 0; i < taxonomy.getCategories().size() ; i++) {
			ResourceCategory resCateg = taxonomy.getCategories().get(i);
			ui_TaxonomyTreeItem root = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();//new TreeParent( resCateg  );
			root.setBrokerElement(resCateg);
			
			invisibleRoot2.getChildNodes().add(root);// addChild(root);
			root.setParentNode(invisibleRoot2);
			AddSResourcesOfResourceCategory(  root, resCateg );
		}
	}

		
	private void AddSResourcesOfResourceCategory(ui_TaxonomyTreeItem invisibleRoot2,
			ResourceCategory resCat ) {
		
		for (int i = 0; i < resCat.getResourcelist().size()  ; i++) {
			
			ui_TaxonomyTreeItem root = UiObjectsFactory.eINSTANCE.createui_TaxonomyTreeItem();//new TreeObject( resCat.getResourcelist().get(i)  );
			root.setBrokerElement(resCat.getResourcelist().get(i));
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
			root.setBrokerElement(aFS);
			rootObj.getChildNodes().add(root);// addChild(root);
			root.setParentNode(rootObj);
		}
	}

}
