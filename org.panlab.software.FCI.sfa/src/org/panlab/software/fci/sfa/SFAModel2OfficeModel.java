package org.panlab.software.fci.sfa;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import FederationOffice.FederationOfficeFactory;
import FederationOffice.Office;
import FederationOffice.fcielements.AuthorizationKey;
import FederationOffice.services.ServicesFactory;
import FederationOffice.services.Taxonomy;
import FederationOffice.users.Account;
import FederationOffice.users.OfficeCustomer;
import FederationOffice.users.UsersFactory;

public class SFAModel2OfficeModel {
	private boolean displayLog = true;

	private SFA_XMLRPCClient client;
	private Office office;
	private AuthorizationKey authorizationKey;
	private Taxonomy generalTaxonomy;

	private XMLutils xmlutl;
	
	
	public SFAModel2OfficeModel(AuthorizationKey authorizationKey) {
		this.authorizationKey=authorizationKey;
		client = SFA_XMLRPCClient.getInstance();
		client.Init_SFA_XMLRPCClient(authorizationKey);
		xmlutl = new XMLutils(displayLog);
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
		office.setName( this.authorizationKey.getCredentials().getCredoptions().get(SFAUtils.USERNAME  ) );
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
		
		String rspec = client.ListResources();

		System.out.println(rspec);
		System.out.println("=======================================================================");
		if (rspec.equals(""))
			return;
		
		
		Document resourceSpecDocument = xmlutl.getXMLDocFromString( rspec );


		NodeList aggregates = xmlutl.getNodeListFromObject(resourceSpecDocument, "//aggregate");
		
		for (int ixOrgan = 0; ixOrgan < aggregates.getLength(); ixOrgan++) {
			
			Node item = aggregates.item(ixOrgan);
			//String organName = xmlutl.getNodeValueFromObject( item, "name/text()" );
			//String organID = xmlutl.getNodeValueFromObject( organisationSpecNodes.item(ixOrgan), "@id" );
			String organName = xmlutl.getNodeValueFromObject( item, "@name" );
			System.out.println(organName );	
		}
		

		NodeList nodes = xmlutl.getNodeListFromObject(resourceSpecDocument, "//node");
		
		for (int ixOrgan = 0; ixOrgan < nodes.getLength(); ixOrgan++) {
			
			Node item = nodes.item(ixOrgan);
			//String organName = xmlutl.getNodeValueFromObject( item, "name/text()" );
			//String organID = xmlutl.getNodeValueFromObject( organisationSpecNodes.item(ixOrgan), "@id" );
			String organName = xmlutl.getNodeValueFromObject( item, "@component_name" );
			System.out.println(organName );	
		}
		
	}

	public Office getOffice() {
		return this.office;
	}
	
	


}
