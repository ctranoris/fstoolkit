/*************************************************************************
Copyright 2010 Christos Tranoris, University of Patras 

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 

http://www.apache.org/licenses/LICENSE-2.0 
Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License. 
*************************************************************************/

package gr.upatras.ece.nam.fstoolkit.FCIgenerator.project;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

public class VCTImportWizardPageOne extends WizardPage {
	private Text usernameText;
	private Text passwordText;
	private Text VCTText;
	private Text containerText;
	private Combo targetLanguage;
//	private ControlDecoration dec;
	

	/**
	 * @param vCTText the vCTText to set
	 */

	private ISelection selection;

	protected VCTImportWizardPageOne(ISelection selection) {
		super("Generate Federation Computing Interface");
		setTitle("Generate Panlab Federation Computing Interface for a target language");
		setDescription("This wizard generates new Federation Computing Interface files " +
				"and an example application for a selected target language " +
				"given a Panlab account and a VCT name.");
		this.selection = selection;
		//System.out.println("VCTImportWizardPageOne selection= "+selection);
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		
		Label label = new Label(container, SWT.NULL);
		label.setText("&Username:");
		
		usernameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		usernameText.setLayoutData(gd);
		usernameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		label = new Label(container, SWT.NULL);


		label = new Label(container, SWT.NULL);
		label.setText("&Password:");

		passwordText = new  Text(container, SWT.BORDER | SWT.SINGLE | SWT.PASSWORD);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		passwordText.setLayoutData(gd);
		passwordText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		label = new Label(container, SWT.NULL);
		

		label = new Label(container, SWT.NULL);
		label.setText("&VCT Name:");

		VCTText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		VCTText.setLayoutData(gd);
		VCTText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		label = new Label(container, SWT.NULL);
		
		label = new Label(container, SWT.NULL);
		label.setText("&Target Language:");
		targetLanguage = new Combo(container, SWT.BORDER | SWT.SINGLE| SWT.READ_ONLY );
		gd = new GridData(GridData.FILL_HORIZONTAL);
		targetLanguage.setLayoutData(gd);
		targetLanguage.add("Java");
		targetLanguage.add("C");
		//targetLanguage.add("Python");
		targetLanguage.select(0);
		label = new Label(container, SWT.NULL);
		
		
		label = new Label(container, SWT.NULL);
		label.setText("&Container:");

		containerText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		containerText.setLayoutData(gd);
		containerText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});
		
		initialize();
		dialogChanged();

		setControl(container);

	}
	
	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	private void handleBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				"Select new file container");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				containerText.setText(((Path) result[0]).toString());
			}
		}
	}
	
	public void setContainerText(String containerText) {
		this.containerText.setText(containerText) ;
	}
	
	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		
		if (selection != null && selection.isEmpty() == false
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			
			if (obj instanceof IPackageFragmentRoot){
				try {
					obj = ((IPackageFragmentRoot)obj).getCorrespondingResource();
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (obj instanceof IPackageFragment){
				try {
					obj = ((IPackageFragment)obj).getCorrespondingResource();
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if ( (obj instanceof IResource) || (obj instanceof IContainer) ) {
				IContainer container;
				if (obj instanceof IContainer)
					container = (IContainer) obj;
				else
					container = ((IResource) obj).getParent();
				
				containerText.setText(container.getFullPath().toString());
			}
		}
//		passwordText.setText("");
	}
	
	private void dialogChanged() {
		IResource container = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(new Path(getContainerName()));
		
		if (getUserName().length() == 0) {
			updateStatus("Username must be specified");
			return;
		}
		if (getPassword().length() == 0) {
			updateStatus("Password must be specified");
			return;
		}
		if (getVCTText().length() == 0) {
			updateStatus("VCT name must be specified");
			return;
		}
		
		if (getContainerName().length() == 0) {
			updateStatus("File container must be specified");
			return;
		}
		if (container == null
				|| (container.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("File container must exist");
			return;
		}
		if (!container.isAccessible()) {
			updateStatus("Project must be writable");
			return;
		}
		
		
		updateStatus(null);
	}
	
//	private void showErrorDecorationForControl(Control control){
//		// Create a control decoration to indicate an error.
//		dec = new ControlDecoration(control, SWT.TOP | SWT.LEFT);
//		FieldDecoration errorFieldIndicator = FieldDecorationRegistry.getDefault().
//		   getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
//		dec.setImage(errorFieldIndicator.getImage());
//		dec.setDescriptionText(errorFieldIndicator.getDescription());
//	}
	
	
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	public String getContainerName() {
		return containerText.getText();
	}
	
	public String getUserName() {
		return usernameText.getText();
	}

	public String getPassword() {
		return passwordText.getText();
	}
	public String getVCTText() {
		return VCTText.getText();
	}
	public String getTargetLanguage() {
		return targetLanguage.getText();
	}
	
	
}
