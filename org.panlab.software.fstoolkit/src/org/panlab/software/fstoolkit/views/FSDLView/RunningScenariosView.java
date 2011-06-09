package org.panlab.software.fstoolkit.views.FSDLView;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.panlab.software.fstoolkit.extensionpoint.WorkflowEnginesBrowser;
import org.panlab.software.fstoolkit.providerAdapters.RunningScenariosContentProvider;
import org.panlab.software.fstoolkit.providerAdapters.RunningScenariosLabelProvider;

import FederationOffice.Office;
import FederationOffice.extensionInterfaces.IProvisioningJobListener;
import FederationOffice.extensionInterfaces.IWorkflowEngine;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.provider.FederationOfficeItemProviderAdapterFactory;
import FederationOffice.uiObjects.ui_TaxonomyTreeItem;

public class RunningScenariosView extends ViewPart 
implements ITabbedPropertySheetPageContributor{ //we need this to display the selected item to the Tabbed property sheet editor


	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	private ComposedAdapterFactory adapterFactory;
	private Thread myUpdateThread;
	private RunningScenariosProvisioningJobListener provisioningJobListener;
	private RunningScenariosContentProvider runningScenariosProvider;
	
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.panlab.software.fstoolkit.views.RunningScenariosView";
	
	
	public RunningScenariosView() {

	}


	@Override
	public void createPartControl(Composite parent) {
		// Just a little bit layout
		//parent.setLayout(new GridLayout(1, false));
		PatternFilter patternFilter = new PatternFilter();
	    final FilteredTree filter = new FilteredTree(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL|
	    		SWT.BORDER | SWT.FULL_SELECTION , patternFilter, true);
	    viewer = filter.getViewer(); 
	    viewer.getTree().setHeaderVisible(true);
	    viewer.getTree().setLinesVisible(true);
	    
		//viewer = new TreeViewer(parent , SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL );
		drillDownAdapter = new DrillDownAdapter(viewer);
		
		getSite().setSelectionProvider(viewer);
		
		initializeRunningResourcesDomain();
		initializeColumns();		
		initializeJobListeners();
		
		viewer.setSorter(new NameSorter());
		viewer.setInput( getViewSite() );

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "org.panlab.software.fstoolkit.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();

	}
	


	private void initializeColumns() {
		FontData[] boldFontData= getModifiedFontData(viewer.getTree().getFont().getFontData(), SWT.BOLD);
		Font boldFont = new Font(Display.getCurrent(), boldFontData);

		TreeViewerColumn column = new TreeViewerColumn(viewer, SWT.NONE);
		column.getColumn().setWidth(200);
		column.getColumn().setMoveable(true);
		column.getColumn().setText("Requested Resource");
		column.setLabelProvider(new RunningScenariosLabelProvider( boldFont ) );
		//viewer.getTree().setSortColumn(column.getColumn());

		column = new TreeViewerColumn(viewer, SWT.NONE);
		column.getColumn().setWidth(100);
		column.getColumn().setMoveable(true);
		column.getColumn().setText("GUID");
		column.setLabelProvider(new ColumnLabelProvider(){
			public String getText(Object element){
				if ( (element instanceof ui_TaxonomyTreeItem) && 
						( ((ui_TaxonomyTreeItem)element).getOfficeElement() instanceof ResourceRequest ) ) {
					ResourceRequest resReq= (ResourceRequest) ((ui_TaxonomyTreeItem)element).getOfficeElement() ;
					
					if (resReq.getRuntimeInfo()!=null)
						return resReq.getRuntimeInfo().getGUID() ;
				}					
				return "";
			}
			});
		
		column = new TreeViewerColumn(viewer, SWT.NONE);
		column.getColumn().setWidth(200);
		column.getColumn().setMoveable(true);
		column.getColumn().setText("Resource Type");
		column.setLabelProvider(new ColumnLabelProvider(){
			public String getText(Object element){
				if ( (element instanceof ui_TaxonomyTreeItem) && 
						( ((ui_TaxonomyTreeItem)element).getOfficeElement() instanceof ResourceRequest ) ) {
					ResourceRequest resReq= (ResourceRequest) ((ui_TaxonomyTreeItem)element).getOfficeElement() ;
					String provider = ( (Office)resReq.getRefOfferedResource().getBelongsToSite().getBelongsToProvider().eContainer()).getName() +
								"."+resReq.getRefOfferedResource().getBelongsToSite().getBelongsToProvider().getName()+
								"."+resReq.getRefOfferedResource().getBelongsToSite().getName();
					return provider+"."+ resReq.getRefOfferedResource().getName();
				}					
				return "";
			}
			});
		
		column = new TreeViewerColumn(viewer, SWT.NONE);
		column.getColumn().setWidth(100);
		column.getColumn().setMoveable(true);
		column.getColumn().setText("Service");
		column.setLabelProvider(new ColumnLabelProvider(){
			public String getText(Object element){
				if ( (element instanceof ui_TaxonomyTreeItem) && 
						( ((ui_TaxonomyTreeItem)element).getOfficeElement() instanceof ResourceRequest ) ) {
					ResourceRequest resReq= (ResourceRequest) ((ui_TaxonomyTreeItem)element).getOfficeElement() ;
					String officeName = 
						((Office)resReq.getRefOfferedResource().getImplOfferedService().eContainer()).getName() ;
					return officeName+"."+ resReq.getRefOfferedResource().getImplOfferedService().getName() ;
				}					
				return "";
			}
			});
	}


	public void setFocusOnSelectedScenario( RequestedFederationScenario sourceFedScenario ){
		
		for (TreeItem iterable_element : viewer.getTree().getItems() ) {
			if (iterable_element.getData() instanceof ui_TaxonomyTreeItem)
				if ( ((ui_TaxonomyTreeItem)iterable_element.getData()).getOfficeElement()!=null  )
					if ( ((ui_TaxonomyTreeItem)iterable_element.getData()).getOfficeElement() instanceof RequestedFederationScenario ){
						RequestedFederationScenario tempScen = (RequestedFederationScenario) (((ui_TaxonomyTreeItem)iterable_element.getData()).getOfficeElement());
						if ( tempScen == sourceFedScenario ){
							viewer.expandToLevel( iterable_element, 4);
							iterable_element.setExpanded(true);
							viewer.refresh();
							return;
						}
					}
		}
	}
	
	public void initializeRunningResourcesDomain() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactory factory = (AdapterFactory) new FederationOfficeItemProviderAdapterFactory() ;		
		adapterFactory.addAdapterFactory( factory);
			
		runningScenariosProvider = new RunningScenariosContentProvider( getViewSite());
		for (IWorkflowEngine wEngine : WorkflowEnginesBrowser.getInstance().getWorkflowEngines()) {
			runningScenariosProvider.AddRunningScenarios(wEngine.getRunningScenarios() );
		}
		viewer.setContentProvider( runningScenariosProvider );	
		
		//viewer.expandToLevel(2);
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

	private void fillContextMenu(IMenuManager manager) {
		
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		drillDownAdapter.addNavigationActions(manager);
	}
	

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}
	


	

	public void startUpdateTree( final RequestedFederationScenario scenario ) {
		System.out.println("============startUpdateTree start =============== ");
		myUpdateThread = new Thread() {

			public void run() {

				while (true) {
					if (viewer.getTree().isDisposed()) 
						 return;
						 
//					RunningScenariosContentProvider contprovider = (RunningScenariosContentProvider)viewer.getContentProvider();
//					contprovider.updateModel();
					viewer.getTree().getDisplay().asyncExec(new Runnable() {

						public void run() {
							if (scenario!=null)
								setFocusOnSelectedScenario( scenario );
							
							viewer.refresh();
							
						}
					});
					
					return;//run only one time					

//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}// try
						// }//for
				}// while
			}// run
		};// thread

		myUpdateThread.start();
	}
	
	private void makeActions() {
		
		
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				//openScenarioAction.run();
			}
		});
	}

	
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	
	private void fillLocalToolBar(IToolBarManager manager) {

		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		drillDownAdapter.addNavigationActions(manager);
	}
	
	
	@Override
	public void setFocus() {

	}

	class NameSorter extends ViewerSorter {
		
	}
	

	private void initializeJobListeners() {
		provisioningJobListener = new RunningScenariosProvisioningJobListener(this);
		runProvisioningJobListenerExtension();		
	}
	
	/**
	 * @see IDialogPage#createControl(Composite)
	 */	// This is the ID from your extension point
	private static final String IPROVISIONINGJOB_ID = "org.panlab.software.fstoolkit.extensionpoint.provisioningjoblistener";

	private void runProvisioningJobListenerExtension() {
		IConfigurationElement[] config = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(IPROVISIONINGJOB_ID);
		try {
			for (IConfigurationElement e : config) {
				System.out.println("Evaluating extension "+IPROVISIONINGJOB_ID);
				final Object o = e.createExecutableExtension("class");
				if (o instanceof IProvisioningJobListener) {
					ISafeRunnable runnable = new ISafeRunnable() {
						@Override
						public void handleException(Throwable exception) {
							System.out.println("Exception in client");
						}

						@Override
						public void run() throws Exception {
							//register this viewer on available provisioning engines
							((IProvisioningJobListener)o).initialize(provisioningJobListener);
						}
					};
					SafeRunner.run(runnable);
				}
			}
		} catch (CoreException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
	
	public void runWorkflowEngineExtensionAndLoadRunningScenarios() {
		runningScenariosProvider.clearScenarios();
		for (IWorkflowEngine wEngine : WorkflowEnginesBrowser.getInstance().getWorkflowEngines()) {
			runningScenariosProvider.AddRunningScenarios(wEngine.getRunningScenarios() );
		}
				
	}


	@Override
	public String getContributorId() {
		//System.out.println("RunningScenarios getContributorId() = "+ getSite().getId());
		return getSite().getId();
	}
	
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
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
			RunningScenariosTabbedPropertySheetPage tp = new RunningScenariosTabbedPropertySheetPage(this);			
			return  tp;
		
//		if (key.equals(IPropertySheetPage.class)) {
//			return getPropertySheetPage(); 
		} else if (key.equals(IGotoMarker.class)) {
			return this;
		} else {
			return super.getAdapter(key);
		}
	}
	
	
}
