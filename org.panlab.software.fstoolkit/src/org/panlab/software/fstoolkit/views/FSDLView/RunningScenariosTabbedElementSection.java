package org.panlab.software.fstoolkit.views.FSDLView;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.jface.util.Assert;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import FederationOffice.NamedElement;
import FederationOffice.Office;
import FederationOffice.experimentRuntime.RuntimeElement;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.provider.NamedElementItemProvider;
import FederationOffice.uiObjects.ui_TaxonomyTreeItem;

/**
 * The Label section on the Button tab.
 * 
 * @author Anthony Hunter
 */
@SuppressWarnings("deprecation")
public class RunningScenariosTabbedElementSection extends AbstractPropertySection {

	private CLabel labelElementName;
	private CLabel lblStatus;
	private CLabel lblDescription;
	private CLabel lblResourceType;
	private CLabel lblProvider;
	private NamedElement namedElement;
	RunningScenariosTabbedPropertySheetPage myPropertySheetPage;


	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
//		FormData data;
//
//		labelElementName = getWidgetFactory().createCLabel(composite, "-"); //$NON-NLS-1$
//		data = new FormData();
//		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH+20);
//		data.right = new FormAttachment(100, 0);
//		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
//
//		FontData[] boldFontData = getModifiedFontData(aTabbedPropertySheetPage.getControl().getFont().getFontData(), SWT.BOLD);
//		Font boldFont = new Font(Display.getCurrent(), boldFontData);
//		labelElementName.setFont(boldFont);
//		labelElementName.setLayoutData(data);
//		
//		CLabel labelLabel = getWidgetFactory().createCLabel(composite, "Name:"); //$NON-NLS-1$
//		data = new FormData();
//		data.left = new FormAttachment(0, 0);
//		data.right = new FormAttachment(labelElementName,-ITabbedPropertyConstants.HSPACE);
//		data.top = new FormAttachment(labelElementName, 0, SWT.CENTER);
//		labelLabel.setLayoutData(data);

		labelElementName = AddLabel(composite, null, "Name:");
		lblStatus = AddLabel(composite, labelElementName, "Status:");
		lblDescription = AddLabel(composite, lblStatus, "Description:");
		lblResourceType = AddLabel(composite, lblDescription, "Resource Type:");
		lblProvider = AddLabel(composite, lblResourceType, "Provider:");

//		labelStatus = getWidgetFactory().createCLabel(composite, "-"); //$NON-NLS-1$
//		data = new FormData();
//		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH+2);
//		data.right = new FormAttachment(100, 0);
//		data.top = new FormAttachment ( labelElementName, 0   );		
//		
//		Color color = Display.getCurrent().getSystemColor( SWT.COLOR_DARK_BLUE );
//		labelStatus.setForeground(color );		
//		labelStatus.setLayoutData(data);
//
//		CLabel labelLabel2 = getWidgetFactory().createCLabel(composite, "Status:"); //$NON-NLS-1$
//		data = new FormData();
//		data.left = new FormAttachment(0, 0);
//		data.right = new FormAttachment(labelStatus,	-ITabbedPropertyConstants.HSPACE);
//		data.top = new FormAttachment(labelStatus, 0, SWT.CENTER);
//		labelLabel2.setLayoutData(data);
		
		
		myPropertySheetPage = (RunningScenariosTabbedPropertySheetPage) aTabbedPropertySheetPage;

	}
	
	private CLabel AddLabel(Composite composite, CLabel parentLabel, String tagName){
		CLabel lbl = getWidgetFactory().createCLabel(composite, "-"); //$NON-NLS-1$
		FormData data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH+20);
		data.right = new FormAttachment(100, 0);
		if (parentLabel!=null)
			data.top = new FormAttachment ( parentLabel, 0   );
		else
			data.top = new FormAttachment ( 0, 0);//ITabbedPropertyConstants.VSPACE   );
		
		Color color = Display.getCurrent().getSystemColor( SWT.COLOR_DARK_BLUE );
		lbl.setForeground(color );		
		lbl.setLayoutData(data);

		CLabel labelLabel2 = getWidgetFactory().createCLabel(composite, tagName); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(lbl,	-ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(lbl, 0, SWT.CENTER);
		labelLabel2.setLayoutData(data);
		
		return lbl;
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		Assert.isTrue(selection instanceof IStructuredSelection);
		Object input = ((IStructuredSelection) selection).getFirstElement();

//		System.out.println("============Label section setInput = " + input + " ================");
		if (input instanceof NamedElement)
			this.namedElement = (NamedElement) input;

		if (input instanceof ui_TaxonomyTreeItem)
			this.namedElement = ((ui_TaxonomyTreeItem) input)
					.getOfficeElement();

	}

	public void refresh() {
		// labelText.removeModifyListener(listener); listeners if we want to
		// enable some editing
		ComposedAdapterFactory adp = (ComposedAdapterFactory) myPropertySheetPage
				.getAdapterFactory();

		if (this.namedElement != null) {

			NamedElementItemProvider nadp = (NamedElementItemProvider) adp
					.adapt(namedElement, IItemPropertySource.class);
			//this gives as the text from the ItemProvider adapter..
			//(as it is from the .edit plugin)
			labelElementName.setText(nadp.getText(namedElement)); 
			RuntimeElement rtInfo = null ;
			lblResourceType.setText("");
			lblStatus.setText("-");

			String description = namedElement.getDescription();
			if (namedElement.getDescription() == null)
				description = "";
			lblDescription.setText(description);
			
			if ( namedElement instanceof ResourceRequest){
				ResourceRequest resReq = (ResourceRequest)namedElement;
				rtInfo = resReq.getRuntimeInfo();
				String provider = ( (Office)resReq.getRefOfferedResource().getBelongsToSite().getBelongsToProvider().eContainer()).getName() +
				"."+resReq.getRefOfferedResource().getBelongsToSite().getBelongsToProvider().getName()+
				"."+resReq.getRefOfferedResource().getBelongsToSite().getName();
				lblResourceType.setText( resReq.getRefOfferedResource().getName() );
				lblProvider.setText(provider);
				lblStatus.setText( rtInfo.getStatus().getName() );
			}
			
			if ( namedElement instanceof RequestedFederationScenario){				
				lblStatus.setText( ((RequestedFederationScenario)namedElement).getStatus().getName() );
				rtInfo = ((RequestedFederationScenario)namedElement).getRuntimeInfo();
				lblDescription.setText(description + "("+ rtInfo.getDescription() + ")");
			}
			

		} else
			labelElementName.setText("--");

	}

//	private static FontData[] getModifiedFontData(FontData[] originalData,
//			int additionalStyle) {
//		FontData[] styleData = new FontData[originalData.length];
//		for (int i = 0; i < styleData.length; i++) {
//			FontData base = originalData[i];
//			styleData[i] = new FontData(base.getName(), base.getHeight(),
//					base.getStyle() | additionalStyle);
//			// System.out.println("FONT = "+ base.getName());
//			// System.out.println("FONT getHeight= "+ base.getHeight());
//		}
//		return styleData;
//	}
}