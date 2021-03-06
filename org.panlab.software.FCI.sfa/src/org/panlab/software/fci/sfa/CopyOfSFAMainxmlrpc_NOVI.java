/*************************************************************************
Copyright 2011 Christos Tranoris, University of Patras 

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

package org.panlab.software.fci.sfa;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
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


public class CopyOfSFAMainxmlrpc_NOVI {

   
	final static XmlRpcClient client = new XmlRpcClient();
	final static XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
	private static String SFAcredential;
	private static String registry_url = "https://150.254.160.18:12345";
	private static String am_url = "https://150.254.160.18:12346";
	private static String sm_url = "https://150.254.160.18:12347";
	private static String keystore = "C:\\Users\\ctranoris\\Desktop\\_downloads\\tmp\\plckeys\\novi\\client3.p12";
	private static String authority = "novipl.novi.celia_velayos2";	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//the key will contain self signed certificate for the client
				//Need to self sign this client (see also advices from http://emo.sourceforge.net/cert-login-howto.html)

				//Get the private key that used for PLC e.g. tranoris.pkey (rename the id_rsa to tranoris.pkey)
				
				//Generate a certificate request (the client1plc.req)
				//C:\Users\ctranoris\Desktop\_downloads\tmp\plckeys>
				//c:\OpenSSL-Win32\bin\openssl req -new -key tranoris.pkey -subj "/C=GR/ST=Achaia/CN=plc.uoppldef.tranoris/EMAILADDRESS=tranoris@ece.upatras.gr" -config "c:\OpenSSL-Win32\bin\openssl.cfg" -out client1plc.req
				//c:\OpenSSL-Win32\bin\openssl req -new -key tranoris.pkey -subj "/C=GR/ST=Achaia/CN=pla.openlab.tranoris/EMAILADDRESS=tranoris@ece.upatras.gr" -config "c:\OpenSSL-Win32\bin\openssl.cfg" -out sfa1inria.req
				//c:\OpenSSL-Win32\bin\openssl req -new -key tranoris.pkey -subj "/C=GR/ST=Achaia/CN=pla.openlab.ctranoris/EMAILADDRESS=ctranoris@upatras.gr" -config "c:\OpenSSL-Win32\bin\openssl.cfg" -out sfa1inriactranoris.req
		
				//SKIP this example because will generate ALSO a private .key and certificate req .req file
				//c:\OpenSSL-Win32\bin\openssl req -new -newkey rsa:1024 -nodes -out client1plc.req -keyout client1plc.key -subj "/C=GR/ST=Achaia/CN=plc.uoppldef.tranoris/EMAILADDRESS=tranoris@ece.upatras.gr" -config "c:\OpenSSL-Win32\bin\openssl.cfg"
				
				
				//now the self-signed certificate client1plc.pem)
				//c:\OpenSSL-Win32\bin\openssl x509 -trustout -signkey tranoris.pkey -days 1825 -req -in client1plc.req -out client1plc.pem

				//now the pkcs12 for java client
				//c:\OpenSSL-Win32\bin\openssl pkcs12 -export -in client1plc.pem -inkey tranoris.pkey -out client1plc.p12 -name "FSToolkit cert"
				
				//I guess the public key (for tranoris.pkey, the id_rsa.pub) should be also uploaded  to myplc
				
			    System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");;
			    System.setProperty("javax.net.ssl.keyStore", keystore);			    
			    System.setProperty("javax.net.ssl.keyStorePassword", "123456");
			    
			    //in the keystore we put to trust the myplc server
			    //todo this you need to import the PLC server's public key to keystore
			    //read http://confluence.atlassian.com/display/JIRA/Connecting+to+SSL+services
			    //eg. : openssl s_client  -connect 192.168.56.101:12345
			    //then save to a file the -----BEGIN?END CERTIFICATE----- parts e.g.  plc.crt
			    //then keytool -import -alias myplccrt -keystore myplc.keystore -file plc.crt

			    
			    System.setProperty("javax.net.ssl.trustStoreType", "jks");
			    System.setProperty("javax.net.ssl.trustStore", "C:\\Users\\ctranoris\\Desktop\\_downloads\\tmp\\plckeys\\novi\\client3.keystore");
			    System.setProperty("javax.net.debug", "all");
			    System.setProperty("javax.net.ssl.trustStorePassword", "123456");

			   
			     System.out.println("Tstep 1");
			     
			     SSLContext sc = null;
					try {
						sc = SSLContext.getDefault(); //SSLContext.getInstance("TLS");
					} catch (NoSuchAlgorithmException e1) {
						e1.printStackTrace();
					}
					
					sc.getClientSessionContext().setSessionTimeout(0);
					
					
					////////////
					// Create empty HostnameVerifier This is to trust in SSL even it the CN value is different from the requested url
				    HostnameVerifier hv = new HostnameVerifier() {
								@Override
				                public boolean verify(String arg0, SSLSession arg1) {
				                        return true;
				                }
				    };

				    HttpsURLConnection.setDefaultHostnameVerifier(hv);
					
					////////////
			     
			    SFAcredential = GetSelfCredential(); 
			     

				Enumeration<byte[]> a = sc.getClientSessionContext().getIds();	
				if (a.hasMoreElements() )
					sc.getClientSessionContext().getSession( a.nextElement() ).invalidate();
			     
				
				//List displays all the Records in the Registry for a given authority or subauthority. 
			    //ListRecords();
			    ListResources();
//				GetVersion();
//			    ShowRecord();
		
	}
		

	private static void GetVersion() {
		    System.out.println("GetVersion()");
			Object result;
			Vector<Serializable> params = new Vector<Serializable>();
	
			
//		    try {
//				cred = URLEncoder.encode( cred, "UTF-8" );
//			} catch (UnsupportedEncodingException e) {
//				e.printStackTrace();
//			}
		    

//			result = execXMLRPC_aggregate("GetVersion", params);
			result = execXMLRPC_sliceManager("GetVersion", params);
			
		     System.out.println("result.toString() = " + result.toString() );
		}




	private static void ShowRecord() {
		System.out.println("ListResources()");
		Object result;
		Vector<Serializable> params = new Vector<Serializable>();
	    params.addElement( new String("plc.uopplcbase"));
	    String cred = SFAcredential;
//	    try {
//			cred = URLEncoder.encode( cred, "UTF-8" );
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
	    
	    params.addElement(  cred );
	    
		result = execXMLRPC_registry("Show", params);
		if (result!=null)
			System.out.println("The toString of List is: "+ result.toString());
		else
			System.out.println("The toString of List is: null");
	
}



	public static String ListResources() {

		System.out.println("ListResources()");
		
		String xml="";
		Object result;
		Vector<Serializable> params = new Vector<Serializable>();
	    //params.addElement( new String("plc.uopplcbase"));
	    String cred = SFAcredential;		    
	    params.addElement(  cred );		    
	    
	    HashMap<String, Object> auth = new HashMap<String, Object>();
//	    auth.put("type", "ProtoGENI");
//	    auth.put("version", "2");
	    
	    auth.put("version", "1");
	    auth.put("type", "SFA");
//	    java.util.List<String>  extensions = new java.util.ArrayList<String>();
	    //auth.put ("extensions", extensions );
	    //auth.put("namespace", null);
//	    auth.put("schema", null);
	    
		HashMap<String, HashMap<String, Object> > rspec_version = new HashMap<String, HashMap<String, Object>>();
		//geni_rspec_version.put("geni_rspec_version", auth);
		rspec_version.put("rspec_version", auth);	 	    
		
		params.addElement( rspec_version );

//		result = execXMLRPC_aggregate("ListResources", params);
		result = execXMLRPC_sliceManager("ListResources", params);
		
		if (result instanceof Map){
	    	Map map = (Map) result;
	    	Set<String> ks = map.keySet();
	    	//System.out.println("xmltype: " + map.get("value").toString()  );
	    	xml = (String) map.get("value");
		}else 
			xml = result.toString();
		
		return xml;

	}	




	private static String GetSelfCredential() {

	    System.out.println("GetSelfCredential()");
		Object result;
		Vector<Serializable> params = new Vector<Serializable>();
		
		//this Param comes out from command openssl x509 -text -in client1plc.pem
	    //we must have uploaded a public ssh key to myplc. So copy client1plc.pem to a linux machine
	    //chmod 600 client1plc.key,   ssh-keygen -y -f client1plc.key > client1plc.pub
	    //Upload to myplc the client1plc.pub
	    //don't forget to run the sfa-import-plc.py so the new pub key is available to sfa
		
		//the following for myPLC
//		params.addElement( new String("-----BEGIN CERTIFICATE-----\n"+
//				"MIIC+DCCAeACCQC8vGomhquv7TANBgkqhkiG9w0BAQUFADA+MQswCQYDVQQGEwJH\n"+
//				"UjEPMA0GA1UECAwGQWNoYWlhMR4wHAYDVQQDDBVwbGMudW9wcGxkZWYudHJhbm9y\n"+
//				"aXMwHhcNMTExMTI5MTE0NDAyWhcNMTYxMTI3MTE0NDAyWjA+MQswCQYDVQQGEwJH\n"+
//				"UjEPMA0GA1UECAwGQWNoYWlhMR4wHAYDVQQDDBVwbGMudW9wcGxkZWYudHJhbm9y\n"+
//				"aXMwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCxK/FuaB+XjuzbGE/A\n"+
//				"s5s0yEn+pkr2UFsDWS/5HXIZ0qgNHBFMgYxU4V75qFojZSXdP5Kk07JEoa2Kwy6k\n"+
//				"7XZGIW6sub6D+T3v2FOny98ygN6nUfEWRI8QV4OMrpBNtM1tgUomajYMhp0lHvQ2\n"+
//				"pOBv1u3rsHgPygLcGtyYeNsNAkRpfz65XqaimUj/boqu7HXBl6yL1IIP9swdFivG\n"+
//				"hoZWYGlpPpjvMmgaOTkFRlXCUFLE/WI9FMDXZramJB37EMY4kG6qYudKEasQfa8S\n"+
//				"qi1nhlEp4L9cCpmI4b0C6oxf9pWcVNNZDzDFB6/AM7ahwKqzPmH4MvxB0EEJrJpv\n"+
//				"XYV/AgMBAAEwDQYJKoZIhvcNAQEFBQADggEBAEY7QWQJvPPVpaJ5gequ/3Z8PkQM\n"+
//				"qSgw9wC/os95CyjlHxlQm7JlREb04/B73AjTNQV6VJQIoan0oC3EHD73vvUDaJyz\n"+
//				"V+g7pmFUK/+f2tvXwXKxef9ROPh71Ai6QkQpw1RRp+qtHKcs8IKplkfsvKqYThg7\n"+
//				"FeiXIp1SIIclX6Z6IfKCWru/BYuSRVw+HrbbpTz4wgDufIYZivaVuODBQwwXUN9U\n"+
//				"WC1yxbK0YugFupY9v+MPplrMBU3kpCNeTdoV7xYF28abaWlSHC+16704o4I10xae\n"+
//				"AqPE2T+hDmlBrDbBLRFyc4XGumZuvCqs28uJiOylC+M2cELDE+D0wq1HNl0=\n"+
//				"-----END CERTIFICATE-----") );
		
		//the following for SFA_INRIA
		  params.addElement( new String("-----BEGIN CERTIFICATE-----\n"+
				  "MIIDADCCAegCCQCPuuD9KjEVMjANBgkqhkiG9w0BAQUFADBDMQswCQYDVQQGEwJH\n"+
				  "UjEPMA0GA1UECAwGQWNoYWlhMSMwIQYDVQQDDBpub3ZpcGwubm92aS5jZWxpYV92\n"+
				  "ZWxheW9zMjAeFw0xMjAyMDIxMzI4MTBaFw0xNzAxMzExMzI4MTBaMEMxCzAJBgNV\n"+
				  "BAYTAkdSMQ8wDQYDVQQIDAZBY2hhaWExIzAhBgNVBAMMGm5vdmlwbC5ub3ZpLmNl\n"+
				  "bGlhX3ZlbGF5b3MyMIIBIDANBgkqhkiG9w0BAQEFAAOCAQ0AMIIBCAKCAQEA0h8O\n"+
				  "+/EaO86M0IXVBpR7ikfc2JCVZgZj3ivlGhvPpIosl4VMEsr42BHvLbz/thRTdaqM\n"+
				  "JZh5gNdBC6lmHlN9Y77zB/3cYItQ054yUoiPjv8oDIkpeanBCU/wa+wV5IqcQyH9\n"+
				  "a0m3kQkO5+E+D/WoB1/Ke6Fx+9oaFq0UjituSxpGJCArZXWsRWjnTf/C+gxYbEdH\n"+
				  "k2biEQoCwxJwxnjqalsNhvDtX5lahe4xkknj3T1D4BQXIygJ5oVZf+eMyvrMZKNZ\n"+
				  "+w+HL+08oy5AhQjEE/z6srYoCdH8L0sLBFRfVHUMXfgkQ6hwrzFHCBtdEdTxRu74\n"+
				  "nWaaR+gmSSPxCcN95wIBIzANBgkqhkiG9w0BAQUFAAOCAQEASzJ44Vk9PKirp65X\n"+
				  "LFnExslN5EO415dUNbEZnHB53i33pSjAVwf3GsYI4O7ANvSjLZeLz9IkmllprAN7\n"+
				  "j8MGt8B2mnAOZ7NRJpfJ/kRGNHcWTr5Mp1KRU322HzpFzhSY3u5zJVYLIXOOiED7\n"+
				  "gtvv+gSpQ3KkND7spLe2UADtlScLpWw4Oz8NAqzJ179ULKRmdSKFVDBx9nL9ZZuR\n"+
				  "YhOx9y9RErR7IjAHW0OSOmsXFezU4/xZr/F8y5erHI937D4K4QIDtLA09+eCGfi1\n"+
				  "PCspgeE0CI0CNUu6cv/LB+1crfygRIxUYYapywhzIRfsCrfJuyS85xPx/aj7RMjo\n"+
				  "xdNQNg==\n"+
				  "-----END CERTIFICATE-----") );
						                                   
						    params.addElement( new String(authority));
						    params.addElement( new String("user"));
		result = execXMLRPC_registry("GetSelfCredential", params);
		
		return result.toString();
	}

	

	private static void ListRecords() {
	    System.out.println("ListRecords()");
		Object result;
		Vector<Serializable> params = new Vector<Serializable>();
	    params.addElement( new String("plc.uopplcbase"));
	    String cred = SFAcredential;
//	    try {
//			cred = URLEncoder.encode( cred, "UTF-8" );
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
	    
	    params.addElement(  cred );
	    
		result = execXMLRPC_registry("List", params);
	}

		

	private static Object execXMLRPC_registry(String commandName, Vector<Serializable> params) {

		return execXMLRPC(commandName, params, registry_url);
//		return execXMLRPC(commandName, params, "https://vplc08.pl.sophia.inria.fr:12345");
	}


	private static Object execXMLRPC_sliceManager(String commandName, Vector<Serializable> params) {
	
		return execXMLRPC(commandName, params, sm_url);
	}
	
	private static Object execXMLRPC_aggregate(String commandName, Vector<Serializable> params) {
		
		return execXMLRPC(commandName, params, am_url);
	}
	
	private static Object execXMLRPC(String commandName, Vector<Serializable> params, String url) {
		
	    try {
	    	
	    	invalidateSessions();
	        
			config.setServerURL(new URL( url )) ; //http://192.168.56.101:12345 //registry
//			config.setServerURL(new URL("https://plc:12346")); //http://192.168.56.101:12345 //aggregate??
//			config.setServerURL(new URL("https://plc:12347")); //http://192.168.56.101:12345 //slicemgr??
			config.setReplyTimeout(10000);
			config.setContentLengthOptional(true);
			config.setEnabledForExtensions(true);
		    //XmlRpcClient client = new XmlRpcClient();
		    
		    client.setConfig(config);
		    client.setTypeFactory(new MyTypeFactory(client));
		    
		     System.out.println("============================================================");
		     System.out.println("client.getTransportFactory().toString()");
		     System.out.println( client.getTransportFactory().toString() );
		     
		     org.apache.xmlrpc.client.XmlRpcSunHttpTransportFactory f =  (XmlRpcSunHttpTransportFactory) client.getTransportFactory();
			 
		     
		     System.out.println( f.getTransport().toString() );
		     org.apache.xmlrpc.client.XmlRpcSunHttpTransport t = (XmlRpcSunHttpTransport) f.getTransport();
		     
		     
		     System.out.println("============================================================");
		    
		    
		    Object result;
		    System.out.println("Tstep 3");
		     
			try {
				result = client.execute(commandName, params);

			    if (result instanceof String){
				     System.out.println("The toString of result is: "+ result.toString());
			    	
			    }else if (result instanceof Map){
			    	Map map = (Map) result;
			    	printMap("", map);
					
				    	
			    }else {			    
			    	printObjectArray ( "",  (Object[]) result );
			    }
			   
			    
			    return result;
				
			} catch (XmlRpcClientException e) {
				// TODO Auto-generated catch block
			     System.out.println("Tstep 3.4");
			     e.toString();
				e.printStackTrace();
			} catch (XmlRpcException e) {
			     System.out.println("Tstep 3.5");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		     System.out.println("Tstep 4");

		     
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	     System.out.println("Tstep 5");
	     
	     return null;
		
	}


	



	private static void invalidateSessions() {
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


	private static void printMap(String tab, Map map) {
		System.out.println(tab+"-> printMap");
		tab = tab+"\t";
		Set<String> ks = map.keySet();
		for (String k : ks) {
			
			if (map.get(k) instanceof Object[]) {
				System.out.println(tab +"-> The " + k + " are (Objects): ");
				printObjectArray(tab, (Object[]) map.get(k) );

			} else if (map.get(k) instanceof Map) {
				System.out.println(tab +"-> The " + k + " are (Map): ");
				printMap(tab , (Map) map.get(k));
			}else {
				System.out.println(tab +  k + " = " + map.get(k));
			}
		}
		
	}
	private static void printObjectArray(String tab, Object[] objects) {
		// Object[] objects = (Object[]) result;
		System.out.println(tab+"-> printObjectArray");
		tab = tab+"\t";
		if (objects != null && objects.length > 0) {
			for (Object object : objects) {
				if (object instanceof Map) {
					Map map = (Map) object;
					Set<String> ks = map.keySet();
					for (String k : ks) {
						if (map.get(k) instanceof Object[]) {
							System.out.println(tab +"-> The " + k + " are (Objects): ");
							printObjectArray(tab, (Object[]) map.get(k));
						} else if (map.get(k) instanceof Map) {
							System.out.println(tab +"-> The " + k + " are (Map): ");
							printMap(tab , (Map) map.get(k));
						}else {
							System.out.println(tab +  k + " = " + map.get(k));
						}

					}
				}else{
					System.out.println(" " + object.toString());
				}
			}

		}
	}
	
	


}
