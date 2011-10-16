package org.panlab.software.fstoolkit.plc.preferences;

import org.eclipse.jface.dialogs.StatusDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class EditPLCAccountDialog extends StatusDialog {

	protected PLCAccount account;
	private Text plcNameText;
	private Text urlApiText;
	private Text usernameText;
	private Text passwordText;
	
	public EditPLCAccountDialog(Shell parent, PLCAccount account, boolean edit) {
		super(parent);
		this.account = account;
		String title= edit
				? "Edit PLC account"
				: "New PLC account";
			setTitle(title);
			
		// TODO Auto-generated constructor stub
	}

	public PLCAccount getAccount() {
		return this.account;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		layout.verticalSpacing = 2;
		GridData gd= new GridData(GridData.FILL_BOTH);
        gd.horizontalSpan= 2;
        gd.widthHint = 400;
        container.setLayoutData(gd); 

        createLabel(container, "PLC name:");
		//int descFlags= fIsNameModifiable ? SWT.BORDER : SWT.BORDER | SWT.READ_ONLY;
        GridData  gdtext= new GridData(GridData.FILL_HORIZONTAL );
        gdtext.widthHint = 250;
		plcNameText = new Text(container, SWT.BORDER );
		plcNameText.setLayoutData(gdtext);
		plcNameText.setText(account.getPlcName());
		
        createLabel(container, "URL API (XML RPC):");
		//int descFlags= fIsNameModifiable ? SWT.BORDER : SWT.BORDER | SWT.READ_ONLY;
		urlApiText = new Text(container, SWT.BORDER );
		urlApiText.setLayoutData(gdtext);
		urlApiText.setText(account.getUrlapi() );

		createLabel(container, "Username:");
		//int descFlags= fIsNameModifiable ? SWT.BORDER : SWT.BORDER | SWT.READ_ONLY;
		usernameText = new Text(container, SWT.BORDER );
		usernameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		usernameText.setText(account.getUsername() );

		createLabel(container, "Password:");
		//int descFlags= fIsNameModifiable ? SWT.BORDER : SWT.BORDER | SWT.READ_ONLY;
		passwordText = new Text(container, SWT.BORDER );
		passwordText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		passwordText.setEchoChar('*');
		passwordText.setText(account.getPassword() );

		return super.createDialogArea(container);
	}
	
	private static Label createLabel(Composite parent, String name) {
		Label label= new Label(parent, SWT.NULL);
		label.setText(name);
		//label.setLayoutData(new GridData());

		return label;
	}

	private static Text createText(Composite parent) {
		Text text= new Text(parent, SWT.BORDER);
		
		return text;
	}
	
	@Override
	protected void okPressed() {
		account.setPlcName( this.plcNameText.getText() );
		account.setUrlapi(this.urlApiText.getText());
		account.setUsername(this.usernameText.getText());
		account.setPassword(this.passwordText.getText());
		super.okPressed();
	}
	
}
