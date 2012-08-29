package gr.upatras.ece.nam.fstoolkit.uop.preferences;


import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import gr.upatras.ece.nam.fstoolkit.uop.Activator;

public class UoPPreferencePage extends PreferencePage implements
IWorkbenchPreferencePage {


	private Text registryUrlText;
	private Text usernameText;
	private Text passwordText;
	private Button enableAccountChb;
	private Text testConnection;
	
	public UoPPreferencePage() {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		
//		ImageDescriptor imageDesc = new ;
		setImageDescriptor( AbstractUIPlugin.imageDescriptorFromPlugin( "gr.upatras.ece.nam.fstoolkit.uop",  
				"icons/ppeLogo.png") );
		setDescription("Please fill your credentials for PPE at University of Patras");
		
		if (getPreferenceStore().getString( UoPBrokerPreferenceConstants.UOPRegistryURL ).equals("") ){
			getPreferenceStore().setValue(UoPBrokerPreferenceConstants.UOPRegistryURL, 
					"http://nam.ece.upatras.gr");
		}
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
		GridData gdButton= new GridData(GridData.FILL_HORIZONTAL );
		gdButton.widthHint = 120;
		
		GridData gd= new GridData(GridData.FILL_BOTH);
        gd.horizontalSpan= 2;
        gd.widthHint = 640;
        gd.heightHint  = 400;
		gd.horizontalAlignment = SWT.FILL;
        container.setLayoutData(gd); 


		createLabel(container, "");
        enableAccountChb = new Button(container, SWT.CHECK );
        enableAccountChb.setText("Enable this account");
        enableAccountChb.setSelection( preferenceStore.getBoolean( UoPBrokerPreferenceConstants.UOPENABLEDACCOUNT  ) );
        enableAccountChb.setLayoutData(gdButton);        
        
        
        createLabel(container, "Registry URL:");
		//int descFlags= fIsNameModifiable ? SWT.BORDER : SWT.BORDER | SWT.READ_ONLY;
        GridData  gdtext= new GridData(GridData.FILL_HORIZONTAL );
//        gdtext.widthHint = 250;
        registryUrlText = new Text(container, SWT.BORDER );
        registryUrlText.setLayoutData(gdtext);
        registryUrlText.setText( preferenceStore.getString( UoPBrokerPreferenceConstants.UOPRegistryURL ));
        
        createLabel(container, "Username:");
		//int descFlags= fIsNameModifiable ? SWT.BORDER : SWT.BORDER | SWT.READ_ONLY;
		usernameText = new Text(container, SWT.BORDER );
		usernameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		usernameText.setText( preferenceStore.getString( UoPBrokerPreferenceConstants.UOPUSERNAME) );
        
        createLabel(container, "Password:");
		//int descFlags= fIsNameModifiable ? SWT.BORDER : SWT.BORDER | SWT.READ_ONLY;
		passwordText = new Text(container, SWT.BORDER );
		passwordText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		passwordText.setEchoChar('*');
		passwordText.setText( preferenceStore.getString( UoPBrokerPreferenceConstants.UOPPASSWORD) );
        

		createLabel(container, "");
        testConnection = new Text(container, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.verticalAlignment = SWT.FILL;
		gridData.grabExcessVerticalSpace = true;
		gridData.heightHint = 200;
		testConnection.setLayoutData(gridData);
		testConnection.setText("Press the Test button after filling your settings to test connectivity.");
		

		createLabel(container, "");
		Button button = new Button(container, SWT.PUSH);
		button.setText("Test / Update model");        
        
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				testConnectivity();
			}
		});
        
        
        
		parent.redraw();
	    return container;
        
	    
	}
	
	
	protected void testConnectivity() {
		
		testConnection.setText( Activator.getDefault().checkhUoPAuth(usernameText.getText() , passwordText.getText()) );		
	}
	
	@Override
	public boolean performOk() {
		// Get the preference store
	    IPreferenceStore preferenceStore = getPreferenceStore();
	 
	    preferenceStore.setValue( UoPBrokerPreferenceConstants.UOPENABLEDACCOUNT , enableAccountChb.getSelection() );
	    preferenceStore.setValue(UoPBrokerPreferenceConstants.UOPUSERNAME, usernameText.getText() );
	    preferenceStore.setValue(UoPBrokerPreferenceConstants.UOPPASSWORD, passwordText.getText() );
	    preferenceStore.setValue(UoPBrokerPreferenceConstants.UOPRegistryURL , registryUrlText.getText());
	    
	    return true;
	}

//	@Override
//	protected void createFieldEditors() {
//		addField( new StringFieldEditor(UoPBrokerPreferenceConstants.P_UOPUSERNAME, "UoP username:", getFieldEditorParent()));
//		addField( new PasswordFieldEditor(UoPBrokerPreferenceConstants.P_UOPPASSWORD, "UoP password:", getFieldEditorParent()) );
//		
//		
//	}

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
	
	private static Label createLabel(Composite parent, String name) {
		Label label= new Label(parent, SWT.NULL );
		label.setText(name);
		label.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING) );

		return label;
	}
}