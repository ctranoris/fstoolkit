/*************************************************************************
Copyright 2010 Panlab 

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 

http://www.apache.org/licenses/LICENSE-2.0 
Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License. 
*************************************************************************/

package gr.upatras.ece.nam.fstoolkit.views.FSDLView;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.wizard.WizardDialog;
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
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import gr.upatras.ece.nam.fstoolkit.Activator;
import gr.upatras.ece.nam.fstoolkit.providerAdapters.BrokerTaxonomiesContentProvider;
import gr.upatras.ece.nam.fstoolkit.providerAdapters.BrokerTaxonomiesLabelProvider;
import gr.upatras.ece.nam.fstoolkit.wizards.VCTImportWizard;

import brokermodel.provider.BrokermodelItemProviderAdapterFactory;
import brokermodel.uiObjects.ui_TaxonomyTreeItem;

public class ScenariosView extends ViewPart{

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "gr.upatras.ece.nam.fstoolkit.views.ScenariosView";
	
	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	private Action importVCTAction;
	//private PropertySheetPage propertySheetPage;

	private ComposedAdapterFactory adapterFactory;
	
	public ScenariosView() {
		
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
		
		initializeScenariosDomain();
		
//		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory) );
		FontData[] boldFontData= getModifiedFontData(viewer.getTree().getFont().getFontData(), SWT.BOLD);
		Font boldFont = new Font(Display.getCurrent(), boldFontData);
//		viewer.setLabelProvider(new ScenariosLabelProvider( boldFont ) );
		viewer.setLabelProvider(new BrokerTaxonomiesLabelProvider( boldFont ) );
		
		viewer.setSorter(new NameSorter());
		viewer.setInput( getViewSite() );

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "gr.upatras.ece.nam.fstoolkit.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();

	}
	
	public void initializeScenariosDomain() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

//		adapterFactory.addAdapterFactory(new myServicesItemProviderAdapterFactory());
		AdapterFactory factory = (AdapterFactory) new BrokermodelItemProviderAdapterFactory() ;		
		adapterFactory.addAdapterFactory( factory);

		BrokerTaxonomiesContentProvider vctsProvider = new BrokerTaxonomiesContentProvider( getViewSite(), false, false, true);
		vctsProvider.AddBrokersFromManager( Activator.getDefault().getBrokerManager() );
		viewer.setContentProvider( vctsProvider );
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
				ScenariosView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(importVCTAction);
//		manager.add(action2);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	
	private void makeActions() {
		
		importVCTAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object TreeObj = ((IStructuredSelection)selection).getFirstElement();
				
				brokermodel.NamedElement obj = (( ui_TaxonomyTreeItem  ) TreeObj).getBrokerElement() ;
				if (!(obj instanceof brokermodel.federationscenarios.RequestedFederationScenario  ))
					return;

				System.out.println("============ RequestedFederationScenario: "+ obj.toString() );
				
//				PanlabServices.getInstance().LoadFSbyVCT( 
//						(brokermodel.federationscenarios.RequestedFederationScenario)obj);
				
				VCTImportWizard wiz = new VCTImportWizard();
				wiz.init(getViewSite().getWorkbenchWindow().getWorkbench() , (IStructuredSelection)selection);
				// Instantiates the wizard container with the wizard and opens it
			    WizardDialog dialog = new WizardDialog( viewer.getControl().getShell(), wiz);
			    dialog.create();
			    dialog.open();
			}
		};

		importVCTAction.setText("Import selected VCT");
		importVCTAction.setToolTipText("Import selected VCT from panlab Broker as FSDL definition");
		importVCTAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJ_ELEMENT));
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				importVCTAction.run();
			}
		});
	}

	
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(importVCTAction);
		manager.add(new Separator());
	}

	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(importVCTAction);
		
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
	}
	
	
	class NameSorter extends ViewerSorter {
		
		
	}


	@Override
	public void setFocus() {
		
	}
	


}
