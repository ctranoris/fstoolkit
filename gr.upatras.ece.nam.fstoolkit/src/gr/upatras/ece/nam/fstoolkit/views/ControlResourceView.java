package gr.upatras.ece.nam.fstoolkit.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.part.ViewPart;
import gr.upatras.ece.nam.fstoolkit.extensionpoint.WorkflowEnginesBrowser;

import brokermodel.Broker;
import brokermodel.extensionInterfaces.IWorkflowEngine;
import brokermodel.federationscenarios.FederationscenariosFactory;
import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.federationscenarios.ResourceGroup;
import brokermodel.federationscenarios.ResourceRequest;
import brokermodel.federationscenarios.ResourceSettingInstance;
import brokermodel.resources.ResourceSetting;

public class ControlResourceView extends ViewPart {

	private FormToolkit toolkit;
	private ScrolledForm form;
	private ResourceRequest resourceRequest;
	private ResourceGroup resourceGroup;

	private ArrayList<Text> readValuesTextfields= new ArrayList<Text>();
	private ArrayList<Text> updateValuesTextfields= new ArrayList<Text>();
	
	
	public ControlResourceView() {

	}

	@Override
	public void createPartControl(Composite parent) {
		// this.setPartName( this.getViewSite().getSecondaryId() );
		toolkit = new FormToolkit(parent.getDisplay());
		form = toolkit.createScrolledForm(parent);
	}

	public void setResourceRequest(ResourceRequest resourceRequest) {
		if ( (this.resourceRequest!=null) || (this.resourceGroup!=null)) //we are already have associated resource here
			return;
		this.resourceRequest = resourceRequest;
		//we create here by default a group and add it here
		this.resourceGroup = FederationscenariosFactory.eINSTANCE.createResourceGroup();
		this.resourceGroup.getGroupedResources().add(resourceRequest);
		
		createFormControls();
	}
	
	public void setResourceGroup(ResourceGroup resGroup) {
		if ( (this.resourceRequest!=null) || (this.resourceGroup!=null))//we are already have associated resource here
			return;
		this.resourceGroup = resGroup;
		resourceRequest = resGroup.getGroupedResources().get(0);//we assign by default the first resource in group here
		createFormControls();
	}

	public void createFormControls() {
		if (this.resourceRequest == null)
			return;

		if (this.resourceGroup.getGroupedResources().size()>1){
			this.setPartName(resourceGroup.getName());
			form.setText("Group of resources: "+resourceGroup.getName() );
		}else{
			this.setPartName(resourceRequest.getName());
			form.setText(resourceRequest.getName() + " : "+ resourceRequest.getRuntimeInfo().getGUID());
		}

		
		TableWrapLayout  clayout = new TableWrapLayout ();
		
		form.getBody().setLayout(clayout);
		clayout.numColumns  =2;
		

		AddInfoSection();
		AddActionsSection();
		AddSetValuesSection();

		if (this.resourceGroup.getGroupedResources().size()==1)
			AddReadValuesSection(); //has no meaning to add for many resources
		
		
		form.reflow(true);

	}

	private void AddInfoSection() {
		Section section = toolkit.createSection(form.getBody(), Section.DESCRIPTION|
				Section.TITLE_BAR|  Section.TWISTIE|Section.EXPANDED);
		TableWrapData td = new TableWrapData(TableWrapData.FILL);
		td.colspan = 2;
		section.setLayoutData(td);
		section.setText("Information");
		if (this.resourceGroup.getGroupedResources().size()>1){
			section.setDescription("Information for all resources of selected group");			
		}else
			section.setDescription("Information for selected resource");
		Composite sectionClient = toolkit.createComposite(section);
		
		GridLayout gd = new GridLayout();
		gd.verticalSpacing = 2;
		gd.horizontalSpacing=7;
		gd.numColumns = 6;
		sectionClient.setLayout(gd);		
		section.setClient(sectionClient);
		
		Label label = toolkit.createLabel( sectionClient, "Name"  );
		FontData[] boldFontData= getModifiedFontData(label.getFont().getFontData(), SWT.BOLD);
		Font boldFont = new Font(Display.getCurrent(), boldFontData);
		label.setFont(boldFont);		
		label = toolkit.createLabel( sectionClient, "Status"  );
		label.setFont(boldFont);
		label = toolkit.createLabel( sectionClient, "GUID"  );
		label.setFont(boldFont);
		label = toolkit.createLabel( sectionClient, "Description"  );
		label.setFont(boldFont);
		label = toolkit.createLabel( sectionClient, "Type"  );
		label.setFont(boldFont);
		label = toolkit.createLabel( sectionClient, "Provider"  );
		label.setFont(boldFont);
		for (ResourceRequest resource : resourceGroup.getGroupedResources()) {
			label = toolkit.createLabel( sectionClient, resource.getName()  );
			label = toolkit.createLabel( sectionClient, resource.getRuntimeInfo().getStatus().getName()   );
			label = toolkit.createLabel( sectionClient, resource.getRuntimeInfo().getGUID()   );
			label = toolkit.createLabel( sectionClient, resource.getDescription()  );
			label = toolkit.createLabel( sectionClient, resource.getRefOfferedResource().getImplOfferedService().getName()  );
			String provider = 
				( (Broker)resource.getRefOfferedResource().getBelongsToSite().getBelongsToProvider().eContainer()).getName() +
				"."+resource.getRefOfferedResource().getBelongsToSite().getBelongsToProvider().getName()+
				"."+resource.getRefOfferedResource().getBelongsToSite().getName();
			
			label = toolkit.createLabel( sectionClient, provider  );
			
		}
		
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

	private void AddActionsSection() {
		Section section = toolkit.createSection(form.getBody(), Section.DESCRIPTION|
				Section.TITLE_BAR|  Section.TWISTIE|Section.EXPANDED);
		TableWrapData td = new TableWrapData(TableWrapData.FILL);
		td.colspan = 2;
		section.setLayoutData(td);
		section.setText("Actions");
		if (this.resourceGroup.getGroupedResources().size()>1){
			section.setDescription("Actions on all resources of selected group");			
		}else
			section.setDescription("Actions on selected resource");
		Composite sectionClient = toolkit.createComposite(section);
		
		GridLayout gd = new GridLayout();
		gd.numColumns = 4;
		sectionClient.setLayout(gd);		
		
		section.setClient(sectionClient);
		
		
		Hyperlink link = toolkit.createHyperlink(sectionClient, "Restart",
				SWT.WRAP);
		link.addHyperlinkListener(new HyperlinkAdapter() {
			public void linkActivated(HyperlinkEvent e) {
				System.out.println("Restart Link activated!");
			}
		});
		
		Hyperlink link2 = toolkit.createHyperlink(sectionClient, "Shut down",
				SWT.WRAP);
		link2.addHyperlinkListener(new HyperlinkAdapter() {
			public void linkActivated(HyperlinkEvent e) {
				System.out.println("Shut down Link activated!");
			}
		});
		

		Hyperlink linkDelete = toolkit.createHyperlink(sectionClient, "Delete",
				SWT.WRAP);
		linkDelete.addHyperlinkListener(new HyperlinkAdapter() {
			public void linkActivated(HyperlinkEvent e) {
				System.out.println("Delete Link activated!");
			}
		});
	}

	private void AddSetValuesSection() {
		Section section = toolkit.createSection(form.getBody(), Section.DESCRIPTION|
				Section.TITLE_BAR|  Section.TWISTIE|Section.EXPANDED);
		TableWrapData  td = new TableWrapData (TableWrapData.FILL);
		td.colspan = 1;
		section.setLayoutData(td);
		section.addExpansionListener(new ExpansionAdapter() {
			public void expansionStateChanged(ExpansionEvent e) {
			form.reflow(true);
		}
		});
		section.setText("Set parameters");
		if (this.resourceGroup.getGroupedResources().size()>1){
			section.setDescription("Set a value and press Post to provision it to all resources of group");			
		}else
			section.setDescription("Set a value and press Post to provision it to selected resource");		
		Composite sectionClient = toolkit.createComposite(section);
		GridLayout gd = new GridLayout();
		gd.numColumns = 3;
		sectionClient.setLayout(gd);
		section.setClient(sectionClient);
		
		for (ResourceSetting resourceSetting : resourceRequest.getRefOfferedResource().getResourceSettings() ){
			
			//find if there is in resourceSetting
			ResourceSettingInstance resResourceSettingInstance = null;
			for (ResourceSettingInstance s : resourceRequest.getReqResourceSettings()) {
				if (s.getRefResourceSetting().getName().equalsIgnoreCase(resourceSetting.getName()) ){
					resResourceSettingInstance = s;
					break;
				}
			}
			
			Label label = toolkit.createLabel( sectionClient, resourceSetting.getName() +"("+ resResourceSettingInstance.getName() +")"  );
			final Text text = toolkit.createText(sectionClient, "" );

			text.setEditable(resResourceSettingInstance.getRefResourceSetting().isWritable() );
			text.setEnabled(text.getEditable());
			
			text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			Hyperlink link = toolkit.createHyperlink(sectionClient, "Update",
					SWT.WRAP);
			updateValuesTextfields.add(text);
			final ResourceSettingInstance settingToUpdate = resResourceSettingInstance;
			text.setData(settingToUpdate);
			
			link.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					System.out.println("UPDATE Link activated!");
					
					for (IWorkflowEngine wEngine : WorkflowEnginesBrowser.getInstance().getWorkflowEngines()) {
						//System.out.println("tearDownScenarioAction =" + viewer.getSelection().toString() );
						
						RequestedFederationScenario scenario = null;
						if (resourceRequest.eContainer()!=null)
							if (resourceRequest.eContainer().eContainer()!=null)
								scenario =(RequestedFederationScenario)resourceRequest.eContainer().eContainer() ;
						settingToUpdate.setStaticValue(text.getText());
						
						org.eclipse.emf.common.util.BasicEList<ResourceSettingInstance> settings = 
								new BasicEList<ResourceSettingInstance>();
						
						settings.add(settingToUpdate);
						
						wEngine.UpdateResource(scenario, resourceRequest, settings) ;
					}
				}
			});
		}
		
		Hyperlink link = toolkit.createHyperlink(sectionClient, "Update All values",
				SWT.WRAP);
		link.addHyperlinkListener(new HyperlinkAdapter() {
			public void linkActivated(HyperlinkEvent e) {
				System.out.println("Post All values Link activated!");
				org.eclipse.emf.common.util.BasicEList<ResourceSettingInstance> settings = 
						new BasicEList<ResourceSettingInstance>();
				
				for (Text t : updateValuesTextfields) {
					ResourceSettingInstance settingToUpdate = (ResourceSettingInstance)t.getData();
					settingToUpdate.setStaticValue(t.getText());					
					settings.add(settingToUpdate);
				}
				for (IWorkflowEngine wEngine : WorkflowEnginesBrowser.getInstance().getWorkflowEngines()) {
					//System.out.println("tearDownScenarioAction =" + viewer.getSelection().toString() );
					
					RequestedFederationScenario scenario = null;
					if (resourceRequest.eContainer()!=null)
						if (resourceRequest.eContainer().eContainer()!=null)
							scenario =(RequestedFederationScenario)resourceRequest.eContainer().eContainer() ;
					
					
					wEngine.UpdateResource(scenario, resourceRequest, settings ) ;
				}				
				
			}
		});

		//Button button = toolkit.createButton(sectionClient, "A checkbox in a form", SWT.CHECK);
		
	}

	
	
	private void AddReadValuesSection() {
		Section section = toolkit.createSection(form.getBody(), Section.DESCRIPTION|
				Section.TITLE_BAR|  Section.TWISTIE|Section.EXPANDED);
		TableWrapData td = new TableWrapData(TableWrapData.FILL);
		td.colspan = 1;		
		section.setLayoutData(td);
		section.addExpansionListener(new ExpansionAdapter() {
			public void expansionStateChanged(ExpansionEvent e) {
			form.reflow(true);
		}
		});
		section.setText("Read parameters of resource");
		section.setDescription("Description of section");
		Composite sectionClient = toolkit.createComposite(section);
		GridLayout gd = new GridLayout();
		gd.numColumns = 3;
		sectionClient.setLayout(gd);
		section.setClient(sectionClient);
		
		for (ResourceSetting resourceSetting : resourceRequest.getRefOfferedResource().getResourceSettings() ){
			
			//find if there is in ResourceSettingInstance
			ResourceSettingInstance resResourceSettingInstance = null;
			for (ResourceSettingInstance s : resourceRequest.getReqResourceSettings()) {
				if (s.getRefResourceSetting().getName().equalsIgnoreCase(resourceSetting.getName()) ){
					resResourceSettingInstance = s;
					break;
				}
			}
			
			if (resResourceSettingInstance!=null){
			
				final Label label = toolkit.createLabel( sectionClient, resourceSetting.getName() +"("+ resResourceSettingInstance.getName() +")"  );
				final Text text = toolkit.createText(sectionClient, "" );
				text.setEditable(false);
				text.setEnabled(text.getEditable());
				text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				Hyperlink link = toolkit.createHyperlink(sectionClient, "Refresh", SWT.WRAP);
				
				readValuesTextfields.add(text);
				
				final ResourceSettingInstance settingToRead = resResourceSettingInstance;
				text.setData(settingToRead);
				
				link.addHyperlinkListener(new HyperlinkAdapter() {
					public void linkActivated(HyperlinkEvent e) {
						System.out.println("Refresh Link activated for "+  label.getText() +"!");
						
						
						for (IWorkflowEngine wEngine : WorkflowEnginesBrowser.getInstance().getWorkflowEngines()) {
							//System.out.println("tearDownScenarioAction =" + viewer.getSelection().toString() );
							
							RequestedFederationScenario scenario = null;
							if (resourceRequest.eContainer()!=null)
								if (resourceRequest.eContainer().eContainer()!=null)
									scenario =(RequestedFederationScenario)resourceRequest.eContainer().eContainer() ;
							String val = wEngine.ReadResource(scenario, resourceRequest, settingToRead, true) ;
							text.setText(val);
						}
					}
				});
			}
		}
		
		Hyperlink link = toolkit.createHyperlink(sectionClient, "Refresh All values",
				SWT.WRAP);
		link.addHyperlinkListener(new HyperlinkAdapter() {
			public void linkActivated(HyperlinkEvent e) {
				System.out.println("Refresh All values Link activated!");
				
				
				for (Text t : readValuesTextfields) {
					ResourceSettingInstance settingToRead = (ResourceSettingInstance)t.getData();
					for (IWorkflowEngine wEngine : WorkflowEnginesBrowser.getInstance().getWorkflowEngines()) {
						//System.out.println("tearDownScenarioAction =" + viewer.getSelection().toString() );
						
						RequestedFederationScenario scenario = null;
						if (resourceRequest.eContainer()!=null)
							if (resourceRequest.eContainer().eContainer()!=null)
								scenario =(RequestedFederationScenario)resourceRequest.eContainer().eContainer() ;
						String val = wEngine.ReadResource(scenario, resourceRequest, settingToRead, true) ;
						t.setText(val);
					}
				}
			}
		});
		
		//Button button = toolkit.createButton(sectionClient, "Refresh automatically", SWT.CHECK);
		

		
	}

	@Override
	public void setFocus() {
		form.setFocus();

	}

	/**
	 * Disposes the toolkit
	 */
	public void dispose() {
		toolkit.dispose();
		super.dispose();
	}

}
