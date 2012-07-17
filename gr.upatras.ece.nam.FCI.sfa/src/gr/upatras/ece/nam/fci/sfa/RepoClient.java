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

package gr.upatras.ece.nam.fci.sfa;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;



/**
 * This class handles the connection to the Repository
 * @author ctranoris
 *
 */
public class RepoClient {

	String repoHostAddress="";
	String username;
	String password;
	InputStream response_stream;
	
	
	/**
	 * @return the response_stream
	 */
	public InputStream getResponse_stream() {
		CopyInputStream cis = new CopyInputStream(response_stream);
		InputStream ret_stream = cis.getCopy();
		try {
			response_stream.reset();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret_stream;
	}

	/**
	 * The constructor of a {@link RepoClient} class. 
	 * @param repoaddr the address of the repository
	 * @param user the Panlab username 
	 * @param pass the Panlab password
	 * @param vct  the requested VCT name
	 */
	public RepoClient(String repoaddr, String user, String pass) {
		super();		
		repoHostAddress=repoaddr;
		username=user;
		password=pass;
	}
	
	/**
	 * Make a GET call towards the repository. The BASIC Authentication is handled automatically
	 * @param tgwaddr
	 */
	public void execute(String tgwaddr){		

		String reqRepoURL=repoHostAddress+tgwaddr;
		HttpClient client = new HttpClient();

		// pass our credentials to HttpClient, they will only be used for
		// authenticating to servers with realm "realm" on the host
		// "www.verisign.com", to authenticate against an arbitrary realm 
		// or host change the appropriate argument to null.
		client.getState().setCredentials(
				new AuthScope(null, 8080),
				new UsernamePasswordCredentials( username, password)
		);

		// create a GET method that reads a file over HTTPS, 
		// we're assuming that this file requires basic 
		// authentication using the realm above.
		GetMethod get = new GetMethod(reqRepoURL);
		System.out.println( "Request: "+ reqRepoURL );
		get.setRequestHeader("User-Agent", "RepoM2M-1.00");
		//get.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

		// Tell the GET method to automatically handle authentication. The
		// method will use any appropriate credentials to handle basic
		// authentication requests.  Setting this value to false will cause
		// any request for authentication to return with a status of 401.
		// It will then be up to the client to handle the authentication.
		get.setDoAuthentication( true );

		try {
			// execute the GET
			client.executeMethod(get);

			// print the status and response
			InputStream responseBody = get.getResponseBodyAsStream();
			
			CopyInputStream cis = new CopyInputStream(responseBody);
			response_stream = cis.getCopy();
			System.out.println("Response body=" + "\n" + convertStreamToString(response_stream) );
			response_stream.reset();
			//return theinputstream;

		} catch (HttpException e) {
		      System.err.println("Fatal protocol violation: " + e.getMessage());
		      e.printStackTrace();
			e.printStackTrace();
		} catch (IOException e) {
		      System.err.println("Fatal transport error: " + e.getMessage());
			e.printStackTrace();
		} finally {
			// release any connection resources used by the method
			get.releaseConnection();
		}
		//return null;	    

	}
	
	public String convertStreamToString(InputStream is) throws IOException {
        /*
         * To convert the InputStream to String we use the BufferedReader.readLine()
         * method. We iterate until the BufferedReader return null which means
         * there's no more data to read. Each line will appended to a StringBuilder
         * and returned as String.
         */
        if (is != null) {
            StringBuilder sb = new StringBuilder();
            String line;

            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append("\n");
                }
            } finally {
                is.close();
            }
            return sb.toString();
        } else {        
            return "";
        }
    }
	
	public class CopyInputStream extends FilterInputStream {

		private ByteArrayOutputStream _copy = new ByteArrayOutputStream();
		private InputStream _is;

		public CopyInputStream(InputStream is) {
			super(is);
			_is = is;
			try {
				while (read()>-1)
				;
			} catch (IOException e) {

				e.printStackTrace();
			}
			
		}

		public int read() throws IOException {
			//_is.reset();
			int got = _is.read();
			if (got > -1) {
				_copy.write((byte) got);
			}
			return got;
		}
		
//		public int read2() throws IOException {
//			if (_is != null) {
//	            StringBuilder sb = new StringBuilder();
//	            String line;
//
//	            try {
//	                BufferedReader reader = new BufferedReader(new InputStreamReader(_is, "UTF-8"));
//	                while ((line = reader.re readLine()) != null) {
//	                    sb.append(line).append("\n");
//	                }
//	            } finally {
//	                _is.close();
//	            }
//				return 0;
//	        } else {        
//				return 0;
//	        }
//		}

		public InputStream getCopy() {
			return new ByteArrayInputStream(_copy.toByteArray() ); 
		}

	}



	
}
