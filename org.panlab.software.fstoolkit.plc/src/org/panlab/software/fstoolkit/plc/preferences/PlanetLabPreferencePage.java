package org.panlab.software.fstoolkit.plc.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.panlab.software.fstoolkit.plc.Activator;

public class PlanetLabPreferencePage extends PreferencePage  implements
		IWorkbenchPreferencePage {
	
	
	 private Text fieldOne;

	public PlanetLabPreferencePage(){
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		
//		ImageDescriptor imageDesc = new ;
		setImageDescriptor( AbstractUIPlugin.imageDescriptorFromPlugin( "org.panlab.software.fstoolkit.plc",  "icons/plc_logo.gif") );
		setDescription("Please fill your credentials for PlanetLab Central(s)");
		
	}
	
	
	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub
		
	}

	
	

	public class PasswordFieldEditor extends StringFieldEditor {
	    public PasswordFieldEditor(String name,
	            String label, Composite parent) {
	        super(name, label, parent);
	    }


	    protected void doFillIntoGrid(Composite parent, int numColumns)
	    {
	        // Creates the text control
	        super.doFillIntoGrid(parent, numColumns);


	        // Now we can set the echo character
	        getTextControl().setEchoChar('*');
	    }
	}




	@Override
	protected Control createContents(Composite parent) {

	    // Get the preference store
	    IPreferenceStore preferenceStore = getPreferenceStore();
	    
	    Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		layout.verticalSpacing = 2;
        GridData gd= new GridData(GridData.FILL_BOTH);
        gd.horizontalSpan= 2;
        container.setLayoutData(gd);
        
        Composite tableComposite= new Composite(container, SWT.NONE);
        tableComposite.setLayout(layout);
        GridData data= new GridData(GridData.FILL_BOTH);
        data.widthHint= 360;
        data.heightHint= convertHeightInCharsToPixels(10);
        tableComposite.setLayoutData(data);
        
	    Tree tree = new Tree(tableComposite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
	    tree.setLayoutData(data);
	    tree.setLinesVisible(true);
	    tree.setHeaderVisible(true);
	    TreeColumn column1 = new TreeColumn(tree, SWT.LEFT);
	    column1.setText("Name");
	    column1.setWidth(160);
	    TreeColumn column2 = new TreeColumn(tree, SWT.LEFT);
	    column2.setText("URL (XML-RPC API)");
	    column2.setWidth(160);
	    TreeColumn column3 = new TreeColumn(tree, SWT.LEFT);
	    column3.setText("Username");
	    column3.setWidth(160);
	    for (int i = 0; i < 4; i++) {
	      TreeItem item = new TreeItem(tree, SWT.NONE);
	      item.setText(new String[] { "UoP PlanetLab TestDefault_" + i, "https://150.140.186.118/PLCAPI/", "tranoris@gmail.com" });
//	      for (int j = 0; j < 4; j++) {
//	        TreeItem subItem = new TreeItem(item, SWT.NONE);
//	        subItem
//	            .setText(new String[] { "subitem " + j, "jklmnop",
//	                "qrs" });
//	        for (int k = 0; k < 4; k++) {
//	          TreeItem subsubItem = new TreeItem(subItem, SWT.NONE);
//	          subsubItem.setText(new String[] { "subsubitem " + k, "tuv",
//	              "wxyz" });
//	        }
//	      }
	    }
	    
	    
	    Composite buttons= new Composite(container, SWT.NULL);
		buttons.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
		layout= new GridLayout();
		layout.marginHeight= 0;
		layout.marginWidth= 0;
		buttons.setLayout(layout);
		
		Button button = new Button(buttons, SWT.PUSH);
	    button.setText("Add");
	    button.setLayoutData(getButtonGridData(button));
	    
	    button = new Button(buttons, SWT.PUSH);
	    button.setText("Edit");
	    button.setLayoutData(getButtonGridData(button));
	    button = new Button(buttons, SWT.PUSH);
	    button.setText("Delete");
	    button.setLayoutData(getButtonGridData(button));
	    
	    return container;
	}

	
	@Override
	public boolean performOk() {
		// Get the preference store
	    IPreferenceStore preferenceStore = getPreferenceStore();

	    // Set the values from the fields
	    if (fieldOne != null) preferenceStore.setValue(PLCPreferenceConstants.P_PLCUSERNAME, fieldOne.getText());
//	    if (fieldTwo != null) preferenceStore.setValue(TWO, fieldTwo.getText());
//	    if (fieldThree != null)
//	        preferenceStore.setValue(THREE, fieldThree.getText());

	    // Return true to allow dialog to close
	    return true;
	}
	
	private static GridData getButtonGridData(Button button) {
		GridData data= new GridData(GridData.FILL_HORIZONTAL);
		// TODO replace SWTUtil
//		data.widthHint= SWTUtil.getButtonWidthHint(button);
//		data.heightHint= SWTUtil.getButtonHeightHint(button);

		return data;
	}
	

}
