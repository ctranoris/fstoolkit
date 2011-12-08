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

import javax.net.ssl.SSLContext;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcClientException;
import org.apache.xmlrpc.client.XmlRpcSunHttpTransport;
import org.apache.xmlrpc.client.XmlRpcSunHttpTransportFactory;


public class SFAMainxmlrpc {

	
	
    /**
	 * @param args
	 */

	final static XmlRpcClient client = new XmlRpcClient();
	final static XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
	private static String SFAcredential;
//	private static String registry_url = "https://plc:12345";
//	private static String sm_url = "https://plc:12347";
//	private static String keystore = "C:\\Users\\ctranoris\\Desktop\\_downloads\\tmp\\plckeys\\client1plc.p12";
//	private static String authority = "plc.uoppldef.tranoris";
	private static String registry_url = "https://pla:12345";
	private static String sm_url = "https://pla:12347";
	private static String keystore = "C:\\Users\\ctranoris\\Desktop\\_downloads\\tmp\\plckeys\\sfa1inria.p12";
	private static String authority = "pla.openlab.tranoris";

	public static void main(String[] args) {
		//the key will contain self signed certificate for the client
				//Need to self sign this client (see also advices from http://emo.sourceforge.net/cert-login-howto.html)

				//Get the private key that used for PLC e.g. tranoris.pkey (rename the id_rsa to tranoris.pkey)
				
				//Generate a certificate request (the client1plc.req)
				//C:\Users\ctranoris\Desktop\_downloads\tmp\plckeys>
				//c:\OpenSSL-Win32\bin\openssl req -new -key tranoris.pkey -subj "/C=GR/ST=Achaia/CN=plc.uoppldef.tranoris/EMAILADDRESS=tranoris@ece.upatras.gr" -config "c:\OpenSSL-Win32\bin\openssl.cfg" -out client1plc.req
				//C:\Users\ctranoris\Desktop\_downloads\tmp\plckeys>c:\OpenSSL-Win32\bin\openssl req -new -key tranoris.pkey -subj "/C=GR/ST=Achaia/CN=pla.openlab.tranoris/EMAILADDRESS=tranoris@ece.upatras.gr" -config "c:\OpenSSL-Win32\bin\openssl.cfg" -out sfa1inria.req
		
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
			    System.setProperty("javax.net.ssl.trustStore", "C:\\Users\\ctranoris\\Desktop\\_downloads\\tmp\\myplc.keystore");
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
		    
		    
			result = execXMLRPC_registry("GetVersion", params);
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



	private static void ListResources() {
	    
	    System.out.println("ListResources()");
			Object result;
			Vector<Serializable> params = new Vector<Serializable>();
		    //params.addElement( new String("plc.uopplcbase"));
		    String cred = SFAcredential;		    
		    params.addElement(  cred );		    
		    
		    HashMap<String, String> auth = new HashMap<String, String>();
		    auth.put("type", "ProtoGENI");
		    auth.put("version", "2");		    
			HashMap<String, HashMap<String, String> > geni_rspec_version = new HashMap<String, HashMap<String, String>>();
			geni_rspec_version.put("geni_rspec_version", auth);
		    	 	    
			params.addElement( geni_rspec_version );

			result = execXMLRPC_aggregate("ListResources", params);
			
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
				"MIIC9jCCAd4CCQDcMCK6VBKdVjANBgkqhkiG9w0BAQUFADA9MQswCQYDVQQGEwJH\n"+
				"UjEPMA0GA1UECAwGQWNoYWlhMR0wGwYDVQQDDBRwbGEub3BlbmxhYi50cmFub3Jp\n"+
				"czAeFw0xMTEyMDcxODM2MjBaFw0xNjEyMDUxODM2MjBaMD0xCzAJBgNVBAYTAkdS\n"+
				"MQ8wDQYDVQQIDAZBY2hhaWExHTAbBgNVBAMMFHBsYS5vcGVubGFiLnRyYW5vcmlz\n"+
				"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsSvxbmgfl47s2xhPwLOb\n"+
				"NMhJ/qZK9lBbA1kv+R1yGdKoDRwRTIGMVOFe+ahaI2Ul3T+SpNOyRKGtisMupO12\n"+
				"RiFurLm+g/k979hTp8vfMoDep1HxFkSPEFeDjK6QTbTNbYFKJmo2DIadJR70NqTg\n"+
				"b9bt67B4D8oC3BrcmHjbDQJEaX8+uV6moplI/26Krux1wZesi9SCD/bMHRYrxoaG\n"+
				"VmBpaT6Y7zJoGjk5BUZVwlBSxP1iPRTA12a2piQd+xDGOJBuqmLnShGrEH2vEqot\n"+
				"Z4ZRKeC/XAqZiOG9AuqMX/aVnFTTWQ8wxQevwDO2ocCqsz5h+DL8QdBBCayab12F\n"+
				"fwIDAQABMA0GCSqGSIb3DQEBBQUAA4IBAQBfdRjFrE7s/x7GtTvcQYU/Pj83Zjzc\n"+
				"h1gMuO5eNb+2GsMMYa8LTk3QZaLAsszCzxULWkAo1jKl5cQADqIMLZNX41dny8ma\n"+
				"l20JptFLc5AXsRaqMC88HOFrFE2J7FTEf5lBXbsYwfzo4VN6VW3n43GWditfIzNO\n"+
				"oPjPCETIH7WaHBg2oHJ+MHaFRroWdY/KuDbX7JATZIQpK2ws9noAlwaQafMagRih\n"+
				"Ft+m1UsPQ8fFNGw6T6ASUIplERqyEw74KvCnxPRvKVjUIzameVD9FdAHqqJ9GHUu\n"+
				"bHPtUz2dDR8Y4ICYreryWazHB+sqV5RyKQHeaZaVFdvyPYqhiWFQuo65\n"+
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


	private static Object execXMLRPC_aggregate(String commandName, Vector<Serializable> params) {
	
		return execXMLRPC(commandName, params, sm_url);
	}
	
	private static Object execXMLRPC(String commandName, Vector<Serializable> params, String url) {
		
	    try {
	    	
	    	invalidateSessions();
	        
			config.setServerURL(new URL( url )) ; //http://192.168.56.101:12345 //registry
//			config.setServerURL(new URL("https://plc:12346")); //http://192.168.56.101:12345 //aggregate??
//			config.setServerURL(new URL("https://plc:12347")); //http://192.168.56.101:12345 //slicemgr??
			config.setReplyTimeout(10000);
			config.setContentLengthOptional(true);
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
					Set<String> ks = map.keySet();
					for (String k : ks) {
						if (map.get(k) instanceof Object[]) {
							System.out.println("-> The " + k + " are: ");
							printObjectArray((Object[]) map.get(k));
						} else {
							System.out.println("-> The " + k + " is: " + map.get(k));
						}
					}
				    	
			    }else {			    
			    	printObjectArray ( (Object[]) result );
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



	private static void printObjectArray(Object[] objects) {
		// Object[] objects = (Object[]) result;
		if (objects != null && objects.length > 0) {
			for (Object object : objects) {
				if (object instanceof Map) {
					Map map = (Map) object;
					Set<String> ks = map.keySet();
					for (String k : ks) {
						if (map.get(k) instanceof Object[]) {
							System.out.println("-> The " + k + " are: ");
							printObjectArray((Object[]) map.get(k));
						} else {
							System.out.println("-> The " + k + " is: " + map.get(k));
						}

					}
					System.out.println("The toString  is: " + map.toString());
				}else{
					System.out.println(" " + object.toString());
				}
			}

		}
	}
	
	


}
