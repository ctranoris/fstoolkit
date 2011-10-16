package org.panlab.software.fstoolkit.plc.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.Window;
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
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
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
	private Tree tree;
	 
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
        
	    tree = new Tree(tableComposite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
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
	    
	    int accountsnum = preferenceStore.getInt("AccountNums");
	    
	    for (int i = 0; i < accountsnum; i++) {
	      TreeItem item = new TreeItem(tree, SWT.NONE);
	      PLCAccount account = new PLCAccount( 
	    		  preferenceStore.getString("PLCNAME_" + i ), 
	    		  preferenceStore.getString("URL_" + i ), 
	    		  preferenceStore.getString("USERNAME_" + i ), 
	    		  preferenceStore.getString("PASSWORD_" + i ));
		
	      item.setData( account );
	      
	      item.setText(new String[] { 
	    		  account.getPlcName() , 
	    		  account.getUrlapi() , 
	    		  account.getUsername() });
	    }
	    
	    
	    Composite buttons= new Composite(container, SWT.NULL);
		buttons.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
		layout= new GridLayout();
		layout.marginHeight= 0;
		layout.marginWidth= 0;
		buttons.setLayout(layout);
		
		Button button = new Button(buttons, SWT.PUSH);
	    button.setText("Add");
	    button.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				add();
			}

		});
	    button.setLayoutData(getButtonGridData(button));
	    
	    button = new Button(buttons, SWT.PUSH);
	    button.setText("Edit");
	    button.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				edit();
			}

		});
	    
	    button.setLayoutData(getButtonGridData(button));
	    button = new Button(buttons, SWT.PUSH);
	    button.setText("Delete");
	    button.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				delete();
			}

		});
	    
	    button.setLayoutData(getButtonGridData(button));
	    
	    return container;
	}

	protected void add() {
		PLCAccount account = new PLCAccount("", "", "", "");
		PLCAccount newaccount = editPLCAccount(account, false);
		if (newaccount != null){
			TreeItem item = new TreeItem(tree, SWT.NONE);
		      
		      item.setData( newaccount  );
		      
		      item.setText(new String[] { 
		    		  newaccount .getPlcName() , 
		    		  newaccount .getUrlapi() , 
		    		  newaccount .getUsername() });
		}
		
	}

	protected void delete() {
		// TODO Auto-generated method stub
		
	}


	protected void edit() {
		TreeItem item = tree.getSelection()[0];  
		PLCAccount account = (PLCAccount) tree.getData();
		PLCAccount newaccount = editPLCAccount(account, true);
		if (newaccount != null){
		      
		      item.setData( newaccount  );
		      
		      item.setText(new String[] { 
		    		  newaccount .getPlcName() , 
		    		  newaccount .getUrlapi() , 
		    		  newaccount .getUsername() });
		}
		
	}


	protected PLCAccount editPLCAccount(PLCAccount account, boolean edit) {
		EditPLCAccountDialog dialog= new EditPLCAccountDialog(getShell(), account, edit);
		if (dialog.open() == Window.OK) {
			return dialog.getAccount();
		}
		return null;
	}

	@Override
	public boolean performOk() {
		// Get the preference store
	    IPreferenceStore preferenceStore = getPreferenceStore();
	    
	    preferenceStore.setValue("AccountNums", tree.getItemCount() );
	    
	    for (int i = 0; i < tree.getItemCount(); i++) {
	      TreeItem item = tree.getItem(0);
	      PLCAccount account = (PLCAccount) item.getData();
	      preferenceStore.setValue("PLCNAME_" + i , account.getPlcName()); 
		  preferenceStore.setValue("URL_" + i , account.getUrlapi());
		  preferenceStore.setValue("USERNAME_" + i , account.getUsername()); 
		  preferenceStore.setValue("PASSWORD_" + i , account.getPassword() );

	    }   
	    // Set the values from the fields
	    
	    
//	    if (fieldOne != null) preferenceStore.setValue(PLCPreferenceConstants.P_PLCUSERNAME, fieldOne.getText());
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
