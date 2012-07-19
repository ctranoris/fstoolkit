package gr.upatras.ece.nam.fstoolkit.commands;

import org.eclipse.core.expressions.PropertyTester;

import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.federationscenarios.ResourceGroup;
import brokermodel.federationscenarios.ResourceRequest;
import brokermodel.uiObjects.ui_TaxonomyTreeItem;

public class CheckScenariosSelectedProperty extends PropertyTester {

	public CheckScenariosSelectedProperty() {
		//System.out.println("CheckScenariosSelectedProperty constructor ====" );
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		//System.out.println("CheckScenariosSelectedProperty "+property+", "+ receiver.toString());
		if (property.equals("isSelectedScenarios"))
			return isSelectedScenarios((ui_TaxonomyTreeItem)receiver);
		else if (property.equals("isSelectedResourceRequest"))
			return isSelectedResourceRequest((ui_TaxonomyTreeItem)receiver);
		else if (property.equals("isSelectedResourceGroup"))
			return isSelectedResourceGroup((ui_TaxonomyTreeItem)receiver);
		
		
		return false;
	}
	
	
	private boolean isSelectedResourceGroup(ui_TaxonomyTreeItem ui_TaxonomyTreeItem) {
		return ui_TaxonomyTreeItem.getBrokerElement() instanceof ResourceGroup;
	}

	public boolean isSelectedScenarios(ui_TaxonomyTreeItem ui_TaxonomyTreeItem) {
		return ui_TaxonomyTreeItem.getBrokerElement() instanceof RequestedFederationScenario;
		
	}

	public boolean isSelectedResourceRequest(ui_TaxonomyTreeItem ui_TaxonomyTreeItem) {
		return ui_TaxonomyTreeItem.getBrokerElement() instanceof ResourceRequest;
		
	}
}
