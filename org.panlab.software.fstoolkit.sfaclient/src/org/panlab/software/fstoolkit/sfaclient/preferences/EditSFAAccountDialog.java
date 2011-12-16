package org.panlab.software.fstoolkit.sfaclient.preferences;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.StatusDialog;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.FileDialog;

public class EditSFAAccountDialog extends StatusDialog {

	protected SFAAccount account;
	private Text registryUrlText;
	private Text aggregateUrlText;
	private Text sliceManagerUrlText;
	private Text keystoreFileNameText;
	private Text keystorePasswordText;
	private Text usernameText;
	private Text authorityText;
	private Text certificateText;
	private Text testConnection;
	private Text trustStoreFileNameText;
	private Text trustStorePasswordText;
	

	
	
	public EditSFAAccountDialog(Shell parent, SFAAccount account, boolean edit) {
		super(parent);
		this.account = account;
		String title= edit
				? "Edit SFA account"
				: "New SFA account";
			setTitle(title);
			
		// TODO Auto-generated constructor stub
	}

	public SFAAccount getAccount() {
		return this.account;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 2;
		GridData gdButton= new GridData(GridData.FILL_HORIZONTAL );
		gdButton.widthHint = 120;
		
		GridData gd= new GridData(GridData.FILL_BOTH);
        gd.horizontalSpan= 2;
        gd.widthHint = 640;
        gd.heightHint  = 400;
		gd.horizontalAlignment = SWT.FILL;
        container.setLayoutData(gd); 

        createLabel(container, "Registry URL:");
		//int descFlags= fIsNameModifiable ? SWT.BORDER : SWT.BORDER | SWT.READ_ONLY;
        GridData  gdtext= new GridData(GridData.FILL_HORIZONTAL );
        gdtext.widthHint = 250;
        registryUrlText = new Text(container, SWT.BORDER );
        registryUrlText.setLayoutData(gdtext);
        registryUrlText.setText(account.getRegistry_url());
        createLabel(container, "");
        
        createLabel(container, "Aggregate URL:");
		//int descFlags= fIsNameModifiable ? SWT.BORDER : SWT.BORDER | SWT.READ_ONLY;
        gdtext= new GridData(GridData.FILL_HORIZONTAL );
        gdtext.widthHint = 250;
        aggregateUrlText = new Text(container, SWT.BORDER );
        aggregateUrlText.setLayoutData(gdtext);
        aggregateUrlText.setText(account.getAggregate_url());
        createLabel(container, "");
        
        createLabel(container, "Slice Manager URL:");
		//int descFlags= fIsNameModifiable ? SWT.BORDER : SWT.BORDER | SWT.READ_ONLY;
        gdtext= new GridData(GridData.FILL_HORIZONTAL );
        gdtext.widthHint = 250;
        sliceManagerUrlText = new Text(container, SWT.BORDER );
        sliceManagerUrlText.setLayoutData(gdtext);
        sliceManagerUrlText.setText(account.getSlicemanager_url());
        createLabel(container, "");
		
        createLabel(container, "Authority (HRN):");
		//int descFlags= fIsNameModifiable ? SWT.BORDER : SWT.BORDER | SWT.READ_ONLY;
        authorityText = new Text(container, SWT.BORDER );
        authorityText.setLayoutData(gdtext);
        authorityText.setText(account.getAuthority() );
        createLabel(container, "");
        

		createLabel(container, "Username (HRN):");
		//int descFlags= fIsNameModifiable ? SWT.BORDER : SWT.BORDER | SWT.READ_ONLY;
		usernameText = new Text(container, SWT.BORDER );
		usernameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		usernameText.setText(account.getUsername() );
        createLabel(container, "");

		
        createLabel(container, "p12 Keystore Filename (.p12):");
		//int descFlags= fIsNameModifiable ? SWT.BORDER : SWT.BORDER | SWT.READ_ONLY;
        keystoreFileNameText = new Text(container, SWT.BORDER );
        keystoreFileNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        keystoreFileNameText.setText(account.getKeystoreFileName() );
        keystoreFileNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
        Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
        button.setLayoutData(gdButton);
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse(keystoreFileNameText);
			}
		});

		
		
		createLabel(container, "p12 Keystore Password:");
		//int descFlags= fIsNameModifiable ? SWT.BORDER : SWT.BORDER | SWT.READ_ONLY;
		keystorePasswordText = new Text(container, SWT.BORDER );
		keystorePasswordText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		keystorePasswordText.setEchoChar('*');
		keystorePasswordText.setText(account.getKeystorePassword() );
        createLabel(container, "");
        
        
        createLabel(container, "Trust Filename (.keystore):");
		//int descFlags= fIsNameModifiable ? SWT.BORDER : SWT.BORDER | SWT.READ_ONLY;
        trustStoreFileNameText = new Text(container, SWT.BORDER );
        trustStoreFileNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        trustStoreFileNameText.setText(account.getTrustStoreFileName() );
        trustStoreFileNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
        button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
        button.setLayoutData(gdButton);
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse(trustStoreFileNameText);
			}
		});

		
		
		createLabel(container, "Trust Password:");
		//int descFlags= fIsNameModifiable ? SWT.BORDER : SWT.BORDER | SWT.READ_ONLY;
		trustStorePasswordText = new Text(container, SWT.BORDER );
		trustStorePasswordText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		trustStorePasswordText.setEchoChar('*');
		trustStorePasswordText.setText(account.getTrustStorePassword() );
        createLabel(container, "");
        
        
        
        createLabel(container, "self-signed Certificate Filename (.sscrt):");
		//int descFlags= fIsNameModifiable ? SWT.BORDER : SWT.BORDER | SWT.READ_ONLY;
        certificateText = new Text(container, SWT.BORDER );
        certificateText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        certificateText.setText(account.getCertificateFileName() );
        certificateText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
        button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
        button.setLayoutData(gdButton);
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse(certificateText);
			}
		});

		createLabel(container, "Test connection:");
        
		testConnection = new Text(container, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.verticalAlignment = SWT.FILL;
		gridData.grabExcessVerticalSpace = true;
		gridData.heightHint = 200;
		testConnection.setLayoutData(gridData);
		testConnection.setText("Press the Test button after filling your settings to test connectivity.");
		
		button = new Button(container, SWT.PUSH);
		button.setText("Test");
		button.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING) );
		
        button.setLayoutData(gdButton);
        
        
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				testConnectivity();
			}
		});
        
        
        

		return super.createDialogArea(container);
	}
	
	protected void testConnectivity() {
		testConnection.setText("test result...");
		
		String certtext = "";
		try {
			certtext = read(this.certificateText.getText());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		
		String res = SFAMainxmlrpc.testMe(this.registryUrlText.getText(), 
				this.sliceManagerUrlText.getText(),
				this.keystoreFileNameText.getText(),
				this.keystorePasswordText.getText(),
				this.trustStoreFileNameText.getText(),
				this.trustStorePasswordText.getText(),
				this.authorityText.getText(),
				this.usernameText.getText(),
				certtext).toString() ;
		
		testConnection.setText(res);
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	private void handleBrowse(Text textField) {
//		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
//				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
//				"Select new file");
//		if (dialog.open() == ContainerSelectionDialog.OK) {
//			Object[] result = dialog.getResult();
//			if (result.length == 1) {
//				textField.setText(((Path) result[0]).toString());
//			}
//		}
		FileDialog dialog = new FileDialog(getShell());
		
		String fileName = dialog.open();
		if (fileName != null) {
				textField.setText(fileName);
		}
	}

	protected void dialogChanged() {
		// TODO Auto-generated method stub
		
	}

	private static Label createLabel(Composite parent, String name) {
		Label label= new Label(parent, SWT.NULL );
		label.setText(name);
		label.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING) );

		return label;
	}

	private static Text createText(Composite parent) {
		Text text= new Text(parent, SWT.BORDER);
		
		return text;
	}
	
	@Override
	protected void okPressed() {
		account.setRegistry_url (this.registryUrlText.getText());
		account.setAggregate_url(this.aggregateUrlText.getText());
		account.setSlicemanager_url(this.sliceManagerUrlText.getText());
		account.setAuthority(this.authorityText.getText()) ;
		account.setUsername(this.usernameText.getText());
		account.setKeystoreFileName(this.keystoreFileNameText.getText());
		account.setKeystorePassword(this.keystorePasswordText.getText());
		account.setCertificateFileName(this.certificateText.getText());
		account.setTrustStoreFileName(this.trustStoreFileNameText.getText());
		account.setTrustStorePassword(this.trustStorePasswordText.getText());
		super.okPressed();
	}

	
	/** Read the contents of the given file. */
	 protected String read(String fFileName) throws IOException {
	    StringBuilder text = new StringBuilder();
	    String NL = System.getProperty("line.separator");
	    Scanner scanner = new Scanner(new FileInputStream(fFileName), "UTF-8");
	    try {
	      while (scanner.hasNextLine()){
	        text.append(scanner.nextLine() + NL);
	      }
	    }
	    finally{
	      scanner.close();
	    }
	    return text.toString() ;
	  }

}



