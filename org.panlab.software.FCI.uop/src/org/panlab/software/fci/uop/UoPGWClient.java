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

package org.panlab.software.fci.uop;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;



/**
 * The PanlabGWClient is a simple class  for GET and POST requests
 * to the Teagle GW. POST is used to set values like this XML "update request" to a rubis_db resource :
 * <pre>{@code
 * <rubis_db action="update">
 * <configuration>
 * 	<context><vctId>ctranoris_rubbis_db</vctId></context>
 * 	<configuration>
 * 		<VLANID>23</VLANID>
 * 		<IP>10.0.0.1</IP>
 * 		<GW>10.0.0.250</GW>
 * 		<MEM>256</MEM>
 * 		<DISKSPACE>1000</DISKSPACE>
 * 	</configuration>
 * </configuration>
 * </rubis_db>
 * }</pre>
 * The POST is done to the address <b>http://panlabGWAddress/ptm/resourceInstance</b>
 * <br>
 * Here is an example:
 * <pre>{@code
 * PanlabGWClient u = new PanlabGWClient( TEAGLE_GW_URL	);
 * u.POSTexecute( "uop.rubis_db-9", "uop",
 * "<rubis_db action=\"update\">" +
 * 	"<configuration>" +
 * 		"<context><vctId>ctranoris_rubbis_db</vctId></context>" +
 * 		"<configuration>" +
 * 			"<VLANID>23</VLANID><IP>10.0.0.1</IP>" +
 * 			"<GW>10.0.0.250</GW>" +
 * 			"<MEM>256</MEM>" +
 * 			"<DISKSPACE>10000</DISKSPACE>" +
 * 			"<CPUCAP>0</CPUCAP>" +
 * 		"</configuration>" +
 * 	"</configuration>" +
 * "</rubis_db>"
 * 	);
 * 		
 * //An example for GET!
 * u.GETexecute("uop.rubis_cl-14", "uop" );
 * XMLutils x = new XMLutils();
 * String s = x.getNodeValueFromXML(u.getResponse_stream(), "//MEM/text()");
 * System.out.println("Value = " + s);
 * }</pre>
 * <br>
 * <b>Warning for GET: It works with RAs that they have been defined properly with RADL!</b> 
 * @author ctranoris
 *  
 */
public class UoPGWClient {
	private String uopGWAddress;
//	private static UoPGWClient pgwInstance;
	private static String userAgent="FCI 1.0.0";
	InputStream response_stream;

	public UoPGWClient(String tgwaddr) {
		super();
		uopGWAddress = tgwaddr;
	}



	/**
	 * It makes a POST towards the gateway
	 * @author ctranoris
	 * @param resourceInstance sets the name of the resource Instance, e.g.: uop.rubis_db-27
	 * @param ptmAlias sets the name of the provider URI, e.g.: uop
	 * @param content sets the name of the content; send in utf8
	 */
	public void POSTexecute(String resourceInstance, String ptmAlias,
			String content) {
		HttpClient client = new HttpClient();
		String tgwcontent = content;

		// resource instance is like uop.rubis_db-6 so we need to make it like
		// this /uop/uop.rubis_db-6
		String ptm = ptmAlias;
		String url = uopGWAddress + "/" + ptm + "/" + resourceInstance;
		System.out.println("Request: " + url);

		// Create a method instance.
		PostMethod post = new PostMethod(url);
		post.setRequestHeader("User-Agent", userAgent);
		post.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded");

		// Provide custom retry handler is necessary
		post.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
				new DefaultHttpMethodRetryHandler(3, false));

		RequestEntity requestEntity = null;
		try {
			requestEntity = new StringRequestEntity(tgwcontent,
					"application/x-www-form-urlencoded", "utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		post.setRequestEntity(requestEntity);

		try {
			// Execute the method.
			int statusCode = client.executeMethod(post);

			if (statusCode != HttpStatus.SC_OK) {
				System.err.println("Method failed: " + post.getStatusLine());
			}

			// Deal with the response.
			// Use caution: ensure correct character encoding and is not binary
			// data
			// print the status and response
			InputStream responseBody = post.getResponseBodyAsStream();

			CopyInputStream cis = new CopyInputStream(responseBody);
			response_stream = cis.getCopy();
			System.out.println("Response body=" + "\n"
					+ convertStreamToString(response_stream));
			response_stream.reset();
			
//			System.out.println("for address: " + url + " the response is:\n "
//					+ post.getResponseBodyAsString());

		} catch (HttpException e) {
			System.err.println("Fatal protocol violation: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Fatal transport error: " + e.getMessage());
			e.printStackTrace();
		} finally {
			// Release the connection.
			post.releaseConnection();
		}

	}
	
	/**
	 * It makes a GET towards the gateway. The response is retrieved with the {@link  UoPGWClient#getResponse_stream()} ;
	 * @author ctranoris
	 * @param resourceInstance sets the name of the resource Instance, e.g.: uop.rubis_db-27
	 * @param ptmAlias sets the name of the resource Instance, e.g.: uop
	 * @see UoPGWClient#getResponse_stream()
	 */
	public void GETexecute(String resourceInstance, String ptmAlias) {
//		HttpClient client = new HttpClient();

		// resource instance is like uop.rubis_db-6 so we need to make it like
		// this /uop/uop.rubis_db-6
		String ptm = ptmAlias;
		String url = uopGWAddress + "/" + ptm + "/" + resourceInstance;
		System.out.println("Request: " + url);

		// Create a method instance.
		GetMethod get = new GetMethod(url);
		get.setRequestHeader("User-Agent", userAgent);
		get.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded");

		try {
			// execute the GET
//			int status = client.executeMethod(get);

			// print the status and response
			InputStream responseBody = get.getResponseBodyAsStream();

			CopyInputStream cis = new CopyInputStream(responseBody);
			response_stream = cis.getCopy();
			System.out.println("Response body=" + "\n"
					+ convertStreamToString(response_stream));
			response_stream.reset();

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

	}

	/**
	 * @return the response_stream from a GET request
	 * @author ctranoris
	 * @see UoPGWClient#GETexecute(String, String)
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
	 * @return the response_stream as string from the last GET/POST request. 
	 * This must be used with caution since if the GET or POST is called 
	 * again the client is responsible to handle it with the same object.
	 * @author ctranoris
	 * @see UoPGWClient#GETexecute(String, String)
	 * @see UoPGWClient#POSTexecute(String, String, String)
	 * @see UoPGWClient#getResponse_stream()
	 */
	public String getResponse_streamAsString() {
		try {
			return convertStreamToString(response_stream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "";
	}

	/**
	 * @return the converted stream as string 
	 * @author ctranoris
	 */
	public String convertStreamToString(InputStream is) throws IOException {
		/*
		 * To convert the InputStream to String we use the
		 * BufferedReader.readLine() method. We iterate until the BufferedReader
		 * return null which means there's no more data to read. Each line will
		 * appended to a StringBuilder and returned as String.
		 */
		if (is != null) {
			StringBuilder sb = new StringBuilder();
			String line;

			try {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(is, "UTF-8"));
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
				while (read() > -1)
					;
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

		public int read() throws IOException {
			// _is.reset();
			int got = _is.read();
			if (got > -1) {
				_copy.write((byte) got);
			}
			return got;
		}

		public InputStream getCopy() {
			return new ByteArrayInputStream(_copy.toByteArray());
		}

	}
}