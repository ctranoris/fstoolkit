package org.panlab.software.fstoolkit.commands;

import org.eclipse.core.expressions.PropertyTester;

import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceGroup;
import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.uiObjects.ui_TaxonomyTreeItem;

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
		return ui_TaxonomyTreeItem.getOfficeElement() instanceof ResourceGroup;
	}

	public boolean isSelectedScenarios(ui_TaxonomyTreeItem ui_TaxonomyTreeItem) {
		return ui_TaxonomyTreeItem.getOfficeElement() instanceof RequestedFederationScenario;
		
	}

	public boolean isSelectedResourceRequest(ui_TaxonomyTreeItem ui_TaxonomyTreeItem) {
		return ui_TaxonomyTreeItem.getOfficeElement() instanceof ResourceRequest;
		
	}
}
