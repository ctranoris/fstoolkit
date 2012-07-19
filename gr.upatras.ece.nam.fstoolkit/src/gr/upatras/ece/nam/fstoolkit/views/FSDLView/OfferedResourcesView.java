package gr.upatras.ece.nam.fstoolkit.views.FSDLView;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import gr.upatras.ece.nam.fstoolkit.Activator;
import gr.upatras.ece.nam.fstoolkit.modules.FSDLSourceCompletion.FSDLSourceCompletion;
import gr.upatras.ece.nam.fstoolkit.providerAdapters.BrokerResourcesContentProvider;
import gr.upatras.ece.nam.fstoolkit.providerAdapters.BrokerTaxonomiesLabelProvider;

import brokermodel.Broker;
import brokermodel.provider.BrokermodelItemProviderAdapterFactory;
import brokermodel.uiObjects.ui_TaxonomyTreeItem;


public class OfferedResourcesView extends ViewPart 
implements ITabbedPropertySheetPageContributor{ //we need this to display the selected item to the Tabbed property sheet editor

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "gr.upatras.ece.nam.fstoolkit.views.OfferedResourcesView";
	
	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	private Action AddServiceCodeAction;
	private Action action2;
//	private PropertySheetPage propertySheetPage;

	private ComposedAdapterFactory adapterFactory;

	public OfferedResourcesView() {
	

	}
	
	
	@Override
	public void createPartControl(Composite parent) {
		// Just a little bit layout
		//parent.setLayout(new GridLayout(1, false));
		PatternFilter patternFilter = new PatternFilter();
	    final FilteredTree filter = new FilteredTree(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL, patternFilter, true);
	    viewer = filter.getViewer(); 
		
		//viewer = new TreeViewer(parent , SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL );
		drillDownAdapter = new DrillDownAdapter(viewer);
		
		getSite().setSelectionProvider(viewer);
		
//		BrokerTaxonomiesContentProvider offProvider = new BrokerTaxonomiesContentProvider( getViewSite(), true, true, false);
//		offProvider.AddBrokersFromManager( Activator.getDefault().getBrokerManager() );
//		viewer.setContentProvider( offProvider );
		
		initializeOfferedResourcesDomain();
		
		FontData[] boldFontData= getModifiedFontData(viewer.getTree().getFont().getFontData(), SWT.BOLD);
		Font boldFont = new Font(Display.getCurrent(), boldFontData);
		viewer.setLabelProvider(new BrokerTaxonomiesLabelProvider( boldFont ) );
		
		viewer.setSorter(new NameSorter());
		viewer.setInput( getViewSite() );

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "gr.upatras.ece.nam.fstoolkit.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
		
		//viewer.expandToLevel(2);
	}
	
	public void initializeOfferedResourcesDomain() {
		// Create an adapter factory that yields item providers.
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactory factory = (AdapterFactory) new BrokermodelItemProviderAdapterFactory() ;		
		adapterFactory.addAdapterFactory( factory);

		BrokerResourcesContentProvider offProvider = new BrokerResourcesContentProvider( getViewSite() ,  false, true);
		offProvider.AddBrokersFromManager( Activator.getDefault().getBrokerManager() );
		viewer.setContentProvider( offProvider );
		viewer.expandToLevel(2);
	}
	
	private static FontData[] getModifiedFontData(FontData[] originalData,
			int additionalStyle) {
		FontData[] styleData = new FontData[originalData.length];
		for (int i = 0; i < styleData.length; i++) {
			FontData base = originalData[i];
			styleData[i] = new FontData(base.getName(), base.getHeight(),
					base.getStyle() | additionalStyle);
			// System.out.println("FONT = "+ base.getName());
			// System.out.println("FONT getHeight= "+ base.getHeight());
		}
		return styleData;
	}


	
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				OfferedResourcesView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(AddServiceCodeAction);
		manager.add(action2);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	
	private void makeActions() {
		
		
		action2 = new Action() {
			public void run() {
				showMessage("Action 2 executed");
			}
		};
		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		
		AddServiceCodeAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object TreeObj = ((IStructuredSelection)selection).getFirstElement();
				
				brokermodel.NamedElement obj = (( ui_TaxonomyTreeItem  ) TreeObj).getBrokerElement() ;
				if (!(obj instanceof brokermodel.services.Service) && !(obj instanceof brokermodel.resources.Resource ))
					return;

				//System.out.println("============ AddServiceCodeAction: "+ obj.toString() );
				FSDLSourceCompletion sc = new FSDLSourceCompletion();
				sc.AddOfferedService(((Broker)obj.eContainer()), 
						(brokermodel.services.Service)obj);
			}
		};

		AddServiceCodeAction.setText("Insert selected object");
		AddServiceCodeAction.setToolTipText("Insert code for selected object");
		AddServiceCodeAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				AddServiceCodeAction.run();
			}
		});
	}

	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"Sample View",
			message);
	}
	
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(AddServiceCodeAction);
		manager.add(new Separator());
		manager.add(action2);
	}

	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(AddServiceCodeAction);
		manager.add(action2);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
	}
	
	
	@Override
	public void setFocus() {

	}
	
	
	class NameSorter extends ViewerSorter {
		
		
	}
	
	//this is used for the Property Tab Sheet
	 /* This is how the framework determines which interfaces we implement.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class key) {     
		if (key.equals(IPropertySheetPage.class)) {			
			OfferedResourcesTabbedPropertySheetPage tp = new OfferedResourcesTabbedPropertySheetPage(this);			
			return  tp;
		
//		if (key.equals(IPropertySheetPage.class)) {
//			return getPropertySheetPage(); 
		} else if (key.equals(IGotoMarker.class)) {
			return this;
		} else {
			return super.getAdapter(key);
		}
	}
	
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	@Override
	public String getContributorId() {
		return getSite().getId();
	}

}
