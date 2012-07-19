package gr.upatras.ece.nam.fstoolkit.views.FSDLView;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.jface.util.Assert;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import brokermodel.NamedElement;
import brokermodel.provider.NamedElementItemProvider;
import brokermodel.uiObjects.ui_TaxonomyTreeItem;

/**
 * The Label section on the Button tab.
 * 
 * @author Anthony Hunter
 */
@SuppressWarnings("deprecation")
public class OfferedResourcesTabbedElementSection extends AbstractPropertySection {

	private CLabel labelText;
	private org.eclipse.swt.widgets.Label labelText2;
	private NamedElement buttonElement;
	OfferedResourcesTabbedPropertySheetPage myPropertySheetPage;

//	private ModifyListener listener = new ModifyListener() {
//
//		public void modifyText(ModifyEvent arg0) {
//			// ButtonElementProperties properties = (ButtonElementProperties)
//			// buttonElement
//			// .getAdapter(IPropertySource.class);
//			// properties.setPropertyValue(ButtonElementProperties.PROPERTY_TEXT,
//			// labelText.getText());
//		}
//	};

	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Composite composite = getWidgetFactory()
				.createFlatFormComposite(parent);
		FormData data;

		

		//      labelText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		labelText = getWidgetFactory().createCLabel(composite, "-"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);

		FontData[] boldFontData = getModifiedFontData(aTabbedPropertySheetPage
				.getControl().getFont().getFontData(), SWT.BOLD);
		Font boldFont = new Font(Display.getCurrent(), boldFontData);

		labelText.setFont(boldFont);
		labelText.setLayoutData(data);
		// labelText.addModifyListener(listener);
		
		CLabel labelLabel = getWidgetFactory().createCLabel(composite, "Name:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(labelText,-ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(labelText, 0, SWT.CENTER);
		labelLabel.setLayoutData(data);


		//      labelText = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		labelText2 = getWidgetFactory().createLabel(composite, "-"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH+2);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment ( labelText, 0   );
		
		
		//boldFontData = getModifiedFontData(aTabbedPropertySheetPage.getControl().getFont().getFontData(), SWT.ITALIC );
		//boldFont = new Font(Display.getCurrent(), boldFontData);
		//labelText2.setFont(boldFont);
		Color color = Display.getCurrent().getSystemColor( SWT.COLOR_DARK_BLUE );
		labelText2.setForeground(color );		
		labelText2.setLayoutData(data);
		// labelText.addModifyListener(listener);

		CLabel labelLabel2 = getWidgetFactory().createCLabel(composite,
		"Description:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(labelText2,	-ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(labelText2, 0, SWT.CENTER);
		labelLabel2.setLayoutData(data);


		myPropertySheetPage = (OfferedResourcesTabbedPropertySheetPage) aTabbedPropertySheetPage;

	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		Assert.isTrue(selection instanceof IStructuredSelection);
		Object input = ((IStructuredSelection) selection).getFirstElement();

//		System.out.println("============Label section setInput = " + input + " ================");
		if (input instanceof NamedElement)
			this.buttonElement = (NamedElement) input;
		if (input instanceof ui_TaxonomyTreeItem)
			this.buttonElement = ((ui_TaxonomyTreeItem) input)
					.getBrokerElement();

	}

	public void refresh() {
		// labelText.removeModifyListener(listener); listeners if we want to
		// enable some editing
		ComposedAdapterFactory adp = (ComposedAdapterFactory) myPropertySheetPage.getAdapterFactory();

		if (this.buttonElement != null) {
			// ui_TaxonomyTreeItemItemProvider nadp =
			// (ui_TaxonomyTreeItemItemProvider) adp.adapt(buttonElement,
			// IItemPropertySource.class);
			NamedElementItemProvider nadp = (NamedElementItemProvider) adp
					.adapt(buttonElement, IItemPropertySource.class);
			//
			labelText.setText(nadp.getText(buttonElement)); // this gives as the
															// text from the
															// ItemProvider
															// adapter..(as it
															// is from the .edit
															// plugin)
			String desc = "-";
			if ( buttonElement.getDescription() !=null)
					desc = buttonElement.getDescription();
			labelText2.setText( desc );
			
		} else
			labelText.setText("--");

		// labelText.addModifyListener(listener);
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
}