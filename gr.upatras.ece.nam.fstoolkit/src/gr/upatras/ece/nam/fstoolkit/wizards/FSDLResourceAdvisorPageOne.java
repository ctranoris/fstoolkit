package gr.upatras.ece.nam.fstoolkit.wizards;

import java.text.DateFormat;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import gr.upatras.ece.nam.fstoolkit.utils.AdvicedOffer;
import gr.upatras.ece.nam.fstoolkit.utils.OfferedPlan;
import gr.upatras.ece.nam.fstoolkit.utils.ResourceAdvisor;

import brokermodel.availabilityContract.ResourceServiceContract;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one .
 */

public class FSDLResourceAdvisorPageOne extends WizardPage {
	
	private ExpandBar bar;
	private ResourceAdvisor advisor;

	
	@Override
	public boolean canFlipToNextPage() {
		return advisor.getPlanID() >=0;
	}
	
	
	

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public FSDLResourceAdvisorPageOne(ISelection selection) {
		super("Resource Advisor FSDLResourceAdvisorPageOne");
		setTitle("Please select a proposed implementation for your scenario ");
		setDescription(
				"This wizard creates a file with *.fsdl extension containing a request with detailed list of " +
				"resources, based on your initial scenario.\n" +
				"NOTICE:The displayed amount is tentative.Additional charges might applied.Please check the generated contract.");
		//this.selection = selection;
		advisor = new ResourceAdvisor();
		
		
	}
	
	
	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {

		bar = new ExpandBar (parent, SWT.V_SCROLL);
		Display display = parent.getShell().getDisplay();
		//Image image = display.getSystemImage(SWT.ICON_INFORMATION);
		
		//getResourceLocator().getImage( "icons/alt_window_16.gif"));

		AddOfferedPlans(display);
		
		bar.setSpacing(8);
		
		initialize();
		dialogChanged();
		setControl(bar);
	}
	
	private void AddOfferedPlans(Display display){

		Composite composite ;
		GridLayout layout;
		for ( int iOffPlan = advisor.getOfferedPlans().size()-1; iOffPlan >=0 ; iOffPlan--) {
			composite = new Composite (bar, SWT.NONE);
			layout = new GridLayout ();
			layout.marginLeft = layout.marginTop = layout.marginRight = layout.marginBottom = 10;
			layout.verticalSpacing = 10;
			composite.setLayout(layout);
			composite.setSize(400, 400);		
			Color gray = display.getSystemColor(SWT.COLOR_INFO_BACKGROUND);
			
			OfferedPlan op = advisor.getOfferedPlans().get(iOffPlan);
			
			Table table = new Table(composite, SWT.BORDER | SWT.FULL_SELECTION);
			table.setBackground(gray);
			table.setLinesVisible (true);
			table.setHeaderVisible (true);
	
			GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
			data.heightHint = 200;
			table.setLayoutData(data);
			String[] titles = {"alias: service", "Resource", "Provider", "Cost/usage", "Subtotal"};
			for (int i=0; i<titles.length; i++) {
				TableColumn column;
				if (i>3)
					column = new TableColumn (table, SWT.RIGHT);
				else
					column = new TableColumn (table, SWT.LEFT);
				column.setText (titles [i]);
			}	
			
			Double total=(double) 0;
			for (int ixAdvicedOffer = 0; ixAdvicedOffer < op.getAdvicedOffers().size(); ixAdvicedOffer++) {
				AdvicedOffer advoffer = op.getAdvicedOffers().get(ixAdvicedOffer);
				//for (int i = 0; i < advoffer.getAdvicedRSContracts().size(); i++) {
					ResourceServiceContract contract = advoffer.getAdvicedRSContract();
					TableItem item = new TableItem (table, SWT.NONE);
					item.setText (0,  advoffer.getResourceRequest().getName()  +":"+ contract.getForOfferedService().getName() );
					
					
					item.setText (1, advoffer.getOfferedResource().getName()  );
					item.setText (2, advoffer.getResourceProvider()   );
					item.setText (3, String.format( " € %(,.2f",contract.getAvailability().getCost().getAmount()) 
							+ "( €/"+ contract.getAvailability().getCost().getPerUnit().getName() +" )" );
					total += advisor.getTotalCostForAdvicedOffer(contract); 
					
					item.setText (4, String.format( " € %(,.2f", advisor.getTotalCostForAdvicedOffer(contract)) );					
				//}				
			}			 
			
			
			Font font1 = new Font(display, "Tahoma", 10, SWT.BOLD);
			TableItem item = new TableItem (table, SWT.NONE);
			item.setText (3, "Total" );		
			item.setFont(font1);
			item.setText (4, String.format( " € %(,.2f", total ) );	
			item.setFont(font1);

			
			for (int i=0; i<titles.length; i++) {
				table.getColumn (i).pack ();
			}				
			table.getColumn (0).setWidth(170);
			table.getColumn (1).setWidth(170);
			table.getColumn (2).setWidth(170);//set this to constant, because it might have a really huge qualified name from advoffer.getFullOfferedResourceID()
			
			Button button = new Button (composite, SWT.PUSH );
			button.setText("Select This Plan >");
			button.setAlignment(SWT.RIGHT);
			button.setData(iOffPlan);
			button.addListener( SWT.Selection, new Listener() {
				public void handleEvent(Event event) {
					Integer planID= (Integer) event.widget.getData() ;
					advisor.setPlanID(planID);
					((FSDLResourceAdvisorPageTwo)getNextPage()).setOfferedPlanID( planID );
					System.out.println("Button.PlanID selected= " +planID );
				
					getWizard().getContainer().showPage( getNextPage() );
				} 				
			});
			
			ExpandItem item0 = new ExpandItem (bar, SWT.NONE, 0);

			String offerID="#";
			if (advisor.getSourceFedScenario().getScheduledPlan() != null){
				java.util.Date  earlyDate= advisor.getSourceFedScenario().getScheduledPlan().getValidFrom() ;
				java.util.Date  lastDate = advisor.getSourceFedScenario().getScheduledPlan().getValidUntil();
				offerID="#"+iOffPlan+
				" Period:" + DateFormat.getInstance().format(earlyDate)  +"-"+ DateFormat.getInstance().format(lastDate)+
				" Total:" + String.format( " € %(,.2f", total) ;
			}
			else{
				offerID="#"+iOffPlan+
				" Period: N/A Total: N/A (pay-as-you-go might apply, provisioning starts as soon as possible)"  ;
			}
			
			item0.setText("Panlab Offer :"+offerID);
			item0.setHeight(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
			item0.setControl(composite);
			Image image = display.getSystemImage(SWT.ICON_INFORMATION);
			item0.setImage(image);
			item0.setExpanded( iOffPlan == 0 );
	
		}
		
	}

	

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	

	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	
	public ResourceAdvisor getResourceAdvisor(){
		return advisor;
	}
	
	
	
	
}