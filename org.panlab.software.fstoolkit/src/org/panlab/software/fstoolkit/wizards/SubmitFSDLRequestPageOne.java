package org.panlab.software.fstoolkit.wizards;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.panlab.software.fstoolkit.extensionpoint.WorkflowEnginesBrowser;

import FederationOffice.extensionInterfaces.IWorkflowEngine;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (mpe).
 */

public class SubmitFSDLRequestPageOne extends WizardPage {
//	private Text fileText;
//	private ISelection selection;	
	private Combo cmbEngines;
	
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public SubmitFSDLRequestPageOne(ISelection selection) {
		super("wizardPage SubmitFSDLRequestPageOne");
		setTitle("Submit FSDL file describing proposed implementation");
		setDescription("The description of opened FSDL file with *.fsdl extension," +
				"will be submitted for reservation and provisioning");
		//this.selection = selection;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */	
	public void createControl(Composite parent) {
		//create page content
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 1;
		layout.verticalSpacing = 9;
		
		Label label = new Label(container, SWT.NULL);
		label.setText("&Please choose a workflow engine:");// here to check extension points of plugins implementing an engine
		cmbEngines = new Combo(container, SWT.VERTICAL |  SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		//runWorkflowEngineExtension(cmbEngines);
		//cmbEngines.get
		
		for (IWorkflowEngine wEngine : WorkflowEnginesBrowser.getInstance().getWorkflowEngines()) {
			cmbEngines.add(wEngine.getEngineName());
			cmbEngines.setData(wEngine.getEngineName(), wEngine);
		}  
		
		cmbEngines.select(0);
		WorkflowEnginesBrowser.getInstance().setSelectedProvisioningEngine( 
				(IWorkflowEngine)cmbEngines.getData( cmbEngines.getText() ) );
		
		cmbEngines.addSelectionListener( new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println(e.toString() );				
				IWorkflowEngine wengine = (IWorkflowEngine)e.widget.getData( ((Combo)e.widget).getText() );
				WorkflowEnginesBrowser.getInstance().setSelectedProvisioningEngine(wengine );				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
//		Text txt = new Text(container, SWT.BORDER| SWT.READ_ONLY | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL );
//		GridData gridData = new GridData();
//		gridData.widthHint=420;
//		gridData.heightHint =200;
//		txt.setLayoutData(gridData);		
		
		//what about if every resource broker has its own provisioning engine? Ans: He needs to provide a M2M engine proxy
		//If we have hybrid scenarios, can we select different provisioning engines? 
		//Ans: This is not simple. It depends.The way that we can access the Prov Engine should 
		//be described probably in the Resource Broker/Federation Office model
		
		setControl(container);
	}
	
	

//	public IWorkflowEngine getSelectedProvisioningEngine(){
//		return (IWorkflowEngine)cmbEngines.getData(  cmbEngines.getText()  );
//	}


	
}