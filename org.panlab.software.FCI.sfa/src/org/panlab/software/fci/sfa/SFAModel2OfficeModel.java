package org.panlab.software.fci.sfa;

import FederationOffice.FederationOfficeFactory;
import FederationOffice.Office;
import FederationOffice.fcielements.AuthorizationKey;
import FederationOffice.services.ServicesFactory;
import FederationOffice.services.Taxonomy;
import FederationOffice.users.Account;
import FederationOffice.users.OfficeCustomer;
import FederationOffice.users.UsersFactory;

public class SFAModel2OfficeModel {
	
	private SFA_XMLRPCClient client;
	private Office office;
	private AuthorizationKey authorizationKey;
	private Taxonomy generalTaxonomy;
	
	
	
	public SFAModel2OfficeModel(AuthorizationKey authorizationKey) {
		this.authorizationKey=authorizationKey;
		client = SFA_XMLRPCClient.getInstance();
		client.Init_SFA_XMLRPCClient(authorizationKey);
	}

	
	
	public boolean checkAuthentication() {
		
		
		return (client.getSFACredential()!=null) && ( !client.getSFACredential().equals(""));
	}
	
	/**
	 * Initializes the Office model
	 * @author ctranoris
	 */
	private void InitModel(){
		
		//create a temporary office
		office = FederationOfficeFactory.eINSTANCE.createOffice();	
		office.setName( this.authorizationKey.getCredentials().getCredoptions().get(SFAUtils.AUTHORITY ) );
		office.setAPIGateway( this.authorizationKey.getCredentials().getCredoptions().get(SFAUtils.SM_URL ) );
		
		//create a taxonomy
		generalTaxonomy = ServicesFactory.eINSTANCE.createTaxonomy(); 
		generalTaxonomy.setName("General");
		office.getContributedTaxonomies().add(generalTaxonomy);
		generalTaxonomy.getTaxonomies().add(   ServicesFactory.eINSTANCE.createTaxonomy() );
		generalTaxonomy.getTaxonomies().get(0).setName("General Services");
		

		OfficeCustomer officeUser = UsersFactory.eINSTANCE.createOfficeCustomer()  ;	
		office.getRegisteredUsers().add( officeUser );
		Account account = UsersFactory.eINSTANCE.createAccount() ;
		account.setAuthorizationKey(authorizationKey);
		officeUser.setHasAccount(account );
		
	}

	public void TranformModel() {
		InitModel();
		
	}

	public Office getOffice() {
		return this.office;
	}
	
	


}
