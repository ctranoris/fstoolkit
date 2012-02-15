package org.panlab.software.fstoolkit.sfaclient.preferences;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.panlab.software.fstoolkit.sfaclient.Activator;

public class SFAPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {

	private Tree tree;
	
	public SFAPreferencePage() {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		
//		ImageDescriptor imageDesc = new ;
		setImageDescriptor( AbstractUIPlugin.imageDescriptorFromPlugin( "org.panlab.software.fstoolkit.sfaclient",  "icons/sfa_logo.gif") );
		setDescription("Please fill your credentials for Slice Federation Architecture (SFA) authorities");		
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
	    column1.setText("SFA URL");
	    column1.setWidth(160);
	    TreeColumn column2 = new TreeColumn(tree, SWT.LEFT);
	    column2.setText("Username (HRN)");
	    column2.setWidth(160);
	    TreeColumn column3 = new TreeColumn(tree, SWT.LEFT);
	    column3.setText("Authority (HRN)");
	    column3.setWidth(160);
	    
	    int accountsnum = preferenceStore.getInt("AccountNums");
	    
	    for (int i = 0; i < accountsnum; i++) {
	      TreeItem item = new TreeItem(tree, SWT.NONE);
	      SFAAccount account = new SFAAccount( 
	    		  preferenceStore.getString("REGISTRYURL_" + i ), 
	    		  preferenceStore.getString("AGGREGATEURL_" + i ), 
	    		  preferenceStore.getString("SLICEMGRURL_" + i ), 
	    		  preferenceStore.getString("KEYSTORE_" + i ), 
	    		  preferenceStore.getString("KEYSTOREPASSWORD_" + i ), 
	    		  preferenceStore.getString("USERNAME_" + i ), 
	    		  preferenceStore.getString("AUTHORITY_" + i ), 
	    		  preferenceStore.getString("CERTIFICATEFILENAME_" + i ),
	    		  preferenceStore.getString("TRUSTSTORE_" + i ), 
	    		  preferenceStore.getString("TRUSTSTOREPASSWORD_" + i ), 
	    		  preferenceStore.getString("SFAVERSION_" + i ), 
	    		  preferenceStore.getString("SFATYPE_" + i ), 
	    		  preferenceStore.getBoolean("ENABLEDACCOUNT_" + i ), 
	    		  preferenceStore.getBoolean("CACHEMODEL_" + i ) 	    		  
	    		  );
		
	      item.setData( account );
	      
	      item.setText(new String[] { 
	    		  account.getRegistry_url() ,
	    		  account.getUsername(),
	    		  account.getAuthority() });
	    }
	    

		GridData gdButton= new GridData(GridData.FILL_HORIZONTAL );
		gdButton.widthHint = 120;
		
	    Composite buttons= new Composite(container, SWT.NULL);
		buttons.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
		layout= new GridLayout();
		layout.marginHeight= 0;
		layout.marginWidth= 0;
		buttons.setLayout(layout);
		
		Button button = new Button(buttons, SWT.PUSH);
	    button.setText("Add");
        button.setLayoutData(gdButton);
	    button.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				add();
			}

		});
	    button.setLayoutData(getButtonGridData(button));
	    
	    button = new Button(buttons, SWT.PUSH);
	    button.setText("Edit");
        button.setLayoutData(gdButton);
	    button.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				edit();
			}

		});
	    
	    button.setLayoutData(getButtonGridData(button));
	    button = new Button(buttons, SWT.PUSH);
	    button.setText("Delete");
        button.setLayoutData(gdButton);
	    button.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				delete();
			}

		});
	    
	    button.setLayoutData(getButtonGridData(button));
	    
	    
	    
	    
	    return container;
	}

	protected void add() {
		SFAAccount account = new SFAAccount("https://url:12345", "https://url:12346", "https://url:12347",  
				"", "", "", 
				"plc.<baseurl>", "", "", "", "2", "SFA", true, false);
		SFAAccount newaccount = editSFAAccount(account, false);
		if (newaccount != null){
			TreeItem item = new TreeItem(tree, SWT.NONE);
		      
		      item.setData( newaccount  );
		      
		      item.setText(new String[] { 
		    		  newaccount.getRegistry_url() ,
		    		  newaccount.getUsername(),
		    		  newaccount.getAuthority() });
		}
		
	}

	protected void delete() {
		TreeItem item = tree.getSelection()[0];  
		item.dispose();
		item=null;
	}


	protected void edit() {
		TreeItem item = tree.getSelection()[0];  
		SFAAccount account = (SFAAccount) item.getData();
		SFAAccount newaccount = editSFAAccount(account, true);
		if (newaccount != null){
		      
		      item.setData( newaccount  );
		      
		      item.setText(new String[] { 
		    		  newaccount.getRegistry_url() ,
		    		  newaccount.getUsername(),
		    		  newaccount.getAuthority() });
		}
		
	}


	protected SFAAccount editSFAAccount(SFAAccount account, boolean edit) {
		EditSFAAccountDialog dialog= new EditSFAAccountDialog(getShell(), account, edit);
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
	      TreeItem item = tree.getItem(i);
	      SFAAccount account = (SFAAccount) item.getData();		  

		  preferenceStore.setValue("REGISTRYURL_" + i , account.getRegistry_url());
		  preferenceStore.setValue("AGGREGATEURL_" + i , account.getAggregate_url());
		  preferenceStore.setValue("SLICEMGRURL_" + i , account.getSlicemanager_url());
		  preferenceStore.setValue("KEYSTORE_" + i , account.getKeystoreFileName()); 
		  preferenceStore.setValue("KEYSTOREPASSWORD_" + i , account.getKeystorePassword() );
		  preferenceStore.setValue("USERNAME_" + i , account.getUsername() );
		  preferenceStore.setValue("AUTHORITY_" + i , account.getAuthority() );
		  preferenceStore.setValue("CERTIFICATEFILENAME_" + i , account.getCertificateFileName() );
		  preferenceStore.setValue("TRUSTSTORE_" + i , account.getTrustStoreFileName ()); 
		  preferenceStore.setValue("TRUSTSTOREPASSWORD_" + i , account.getTrustStorePassword() );
		  preferenceStore.setValue("SFAVERSION_" + i , account.getSFAVersion() );
		  preferenceStore.setValue("SFATYPE_" + i , account.getSFAType() );
		  preferenceStore.setValue("ENABLEDACCOUNT_" +i, account.getEnabledAccount());
		  preferenceStore.setValue("CACHEMODEL_" +i, account.getCacheModel());

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
