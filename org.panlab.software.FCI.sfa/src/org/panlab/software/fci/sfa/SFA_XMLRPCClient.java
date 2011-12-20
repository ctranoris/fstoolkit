package org.panlab.software.fci.sfa;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcClientException;
import org.apache.xmlrpc.client.XmlRpcSunHttpTransport;
import org.apache.xmlrpc.client.XmlRpcSunHttpTransportFactory;

import FederationOffice.fcielements.AuthorizationKey;

public class SFA_XMLRPCClient {

	private AuthorizationKey authorizationKey;
	
	final static XmlRpcClient client = new XmlRpcClient();
	final static XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
	private String registry_url;
	private String am_url;
	private String sm_url;
	private String SFAcredential;
	private String username ;
	private String self_certificate_text ;//= "";

	
	private static SFA_XMLRPCClient  instance;
	
	public static SFA_XMLRPCClient getInstance(){
		if (instance == null){
			instance = new SFA_XMLRPCClient();
		}
		return instance;
	}
	
	public void Init_SFA_XMLRPCClient(AuthorizationKey authorizationKey){
		
		if ((this.getSFACredential()!=null) && ( !this.getSFACredential().equals("")) )
			return;//no need to initialize again
		
		this.authorizationKey = authorizationKey;
		this.registry_url = authorizationKey.getCredentials().getCredoptions().get(SFAUtils.REGISTRY_URL);				
		this.am_url = authorizationKey.getCredentials().getCredoptions().get(SFAUtils.AM_URL);
		this.sm_url = authorizationKey.getCredentials().getCredoptions().get(SFAUtils.SM_URL);
		this.username = authorizationKey.getCredentials().getCredoptions().get(SFAUtils.USERNAME );
		
		
		System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
		System.setProperty("javax.net.ssl.keyStore", 
				authorizationKey.getCredentials().getCredoptions().get(SFAUtils.KEYSTORE_FILEPATH ) );
		System.setProperty("javax.net.ssl.keyStorePassword", 
				authorizationKey.getCredentials().getCredoptions().get(SFAUtils.KEYSTORE_PASSWORD ) );

		System.setProperty("javax.net.ssl.trustStoreType", "jks");
		System.setProperty("javax.net.ssl.trustStore", 
				authorizationKey.getCredentials().getCredoptions().get(SFAUtils.TRUSTSTORE_FILEPATH ) );
		System.setProperty("javax.net.ssl.trustStorePassword", 
				authorizationKey.getCredentials().getCredoptions().get(SFAUtils.TRUSTSTORE_PASSWORD ) );
		//System.setProperty("javax.net.debug", "all");
		
		try {
			self_certificate_text = readFileContents( authorizationKey.getCredentials().getCredoptions().get(SFAUtils.SELF_CERTIFICATE_FILEPATH ) );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		

		SSLContext sc = null;
		try {
			sc = SSLContext.getDefault(); // SSLContext.getInstance("TLS");
		} catch (NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		}

		sc.getClientSessionContext().setSessionTimeout(0);
		// //////////
		// Create empty HostnameVerifier This is to trust in SSL even it the CN
		// value is different from the requested url
		HostnameVerifier hv = new HostnameVerifier() {
			@Override
			public boolean verify(String arg0, SSLSession arg1) {
				return true;
			}
		};

		HttpsURLConnection.setDefaultHostnameVerifier(hv);

		SFAcredential = GetSelfCredential();
		
	}

	/** Read the contents of the given file. */
	 protected String readFileContents(String fFileName) throws IOException {
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
	 
	public Object execXMLRPC_registry(String commandName, Vector<Serializable> params) {
		return execXMLRPC(commandName, params, registry_url);
	}


	public Object execXMLRPC_aggregate(String commandName, Vector<Serializable> params) {
		return execXMLRPC(commandName, params, am_url);
	}
	
	public Object execXMLRPC_sliceManager(String commandName, Vector<Serializable> params) {
		
		return execXMLRPC(commandName, params, sm_url);
	}
	
	public Object execXMLRPC(String commandName, Vector<Serializable> params, String url) {

	    Object result = null;
	    
	    try {
	    	
	    	invalidateSessions();
	        
			config.setServerURL(new URL( url )) ; 
			config.setReplyTimeout(10000);
			config.setContentLengthOptional(true);
		    
		    client.setConfig(config);
		    client.setTypeFactory(new MyTypeFactory(client));
		    
		     System.out.println("============================================================");
		     System.out.println("client.getTransportFactory().toString()");
		     System.out.println( client.getTransportFactory().toString() );
		     
		     org.apache.xmlrpc.client.XmlRpcSunHttpTransportFactory f =  (XmlRpcSunHttpTransportFactory) client.getTransportFactory();
		     
		     System.out.println( f.getTransport().toString() );
		     org.apache.xmlrpc.client.XmlRpcSunHttpTransport t = (XmlRpcSunHttpTransport) f.getTransport();
		    
			try {
				result = client.execute(commandName, params);
			    return result;
				
			} catch (XmlRpcClientException e) {
				 e.printStackTrace();
			} catch (XmlRpcException e) {
				e.printStackTrace();
			}


		     
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	     return result;
		
	}


	private void invalidateSessions() {
		SSLContext sc = null;
		try {
			sc = SSLContext.getDefault(); //SSLContext.getInstance("TLS");
		} catch (NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		}
		
		sc.getClientSessionContext().setSessionTimeout(0);

		sc.getClientSessionContext().setSessionCacheSize(0);
	
		Enumeration<byte[]> a = sc.getClientSessionContext().getIds();	
		if (a.hasMoreElements() )
			sc.getClientSessionContext().getSession( a.nextElement() ).invalidate();
		
	}

	
	public String getSFACredential(){
		return SFAcredential;
	}
	
	private String GetSelfCredential() {

		System.out.println("GetSelfCredential()");
		Object result;
		Vector<Serializable> params = new Vector<Serializable>();

		params.addElement(new String(self_certificate_text));
		params.addElement(new String(username));
		params.addElement(new String("user"));
		result = execXMLRPC_registry("GetSelfCredential", params);

		if (result!=null)
			return result.toString();
		else
			return null;
	}

	public Object GetVersion() {
		System.out.println("GetVersion()");
		Object result;
		Vector<Serializable> params = new Vector<Serializable>();
		// try {
		// cred = URLEncoder.encode( cred, "UTF-8" );
		// } catch (UnsupportedEncodingException e) {
		// e.printStackTrace();
		// }

		result = execXMLRPC_aggregate("GetVersion", params);

		return result;
	}

	public void ShowRecord() {
		System.out.println("ListResources()");
		Object result;
		Vector<Serializable> params = new Vector<Serializable>();
		params.addElement(new String("plc.uopplcbase"));
		String cred = SFAcredential;
		// try {
		// cred = URLEncoder.encode( cred, "UTF-8" );
		// } catch (UnsupportedEncodingException e) {
		// e.printStackTrace();
		// }

		params.addElement(cred);

		result = execXMLRPC_registry("Show", params);
		if (result != null)
			System.out.println("The toString of List is: " + result.toString());
		else
			System.out.println("The toString of List is: null");

	}

	public void ListResources() {

		System.out.println("ListResources()");
		Object result;
		Vector<Serializable> params = new Vector<Serializable>();
		// params.addElement( new String("plc.uopplcbase"));
		String cred = SFAcredential;
		params.addElement(cred);

		HashMap<String, String> auth = new HashMap<String, String>();
		auth.put("type", "ProtoGENI");
		auth.put("version", "2");
		HashMap<String, HashMap<String, String>> geni_rspec_version = new HashMap<String, HashMap<String, String>>();
		geni_rspec_version.put("geni_rspec_version", auth);

		params.addElement(geni_rspec_version);

		result = execXMLRPC_aggregate("ListResources", params);

	}

	public void ListRecords() {
		System.out.println("ListRecords()");
		Object result;
		Vector<Serializable> params = new Vector<Serializable>();
		params.addElement(new String("plc.uopplcbase"));
		String cred = SFAcredential;
		// try {
		// cred = URLEncoder.encode( cred, "UTF-8" );
		// } catch (UnsupportedEncodingException e) {
		// e.printStackTrace();
		// }

		params.addElement(cred);

		result = execXMLRPC_registry("List", params);
	}


	

}
