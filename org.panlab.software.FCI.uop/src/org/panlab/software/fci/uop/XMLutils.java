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

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Simple class to be used with XPATH expressions to get node values from XML responses
 * 
 * 	<pre>{@code
 *	//An example for GET!
 *	u.GETexecute("uop.rubis_cl-14", "uop" );
 *	XMLutils x = new XMLutils();
 *	String s = x.getNodeValueFromXML(u.getResponse_stream(), "//MEM/text()");
 *	System.out.println("Value = " + s);
 *	}</pre>
 * @author ctranoris
 *
 */
public class XMLutils {
	private boolean displayLog = false;

	
	//Constructor
	public XMLutils(boolean displayLog) {
		this.displayLog = displayLog;
	}
	
	public String getNodeValueFromXML(InputStream xml, String exp)  {
		
		NodeList nodes = getNodeListFromXML( xml,  exp);

		if ((nodes!=null) && (nodes.getLength()>0))
			return nodes.item(0).getNodeValue();//always return the i=0 node
		else
			return null;

	} 
	
	public NodeList getNodeListFromXML(InputStream xml, String exp)  {
		// Standard of reading a XML file
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder = null;
		Document doc = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		
		try {
			doc = builder.parse( xml ); 
			return  getNodeListFromObject(doc, exp );
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	
	public String getNodeValueFromObject(Object item, String exp)  {
		
		NodeList nodes = getNodeListFromObject( item,  exp);

		if (nodes.getLength()>0)
			return nodes.item(0).getNodeValue();//always return the i=0 node
		else
			return "";

	}
	
	
	
	/**
	 * helper function to extract a Node List from an Object Item according to an XPATH expression
	 * @param item is usually the xml Document
	 * @param exp an XPATH expression
	 * @return a nodelist
	 * @author ctranoris
	 */
	public NodeList getNodeListFromObject(Object item, String exp)  {
		XPathExpression expr = null;			

		// Create a XPathFactory
		XPathFactory xFactory = XPathFactory.newInstance();

		// Create a XPath object
		XPath xpath = xFactory.newXPath();

		// Compile the XPath expression
		try {
			log("XPath expression = "+exp   );
			expr = xpath.compile(exp);
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		
		// Run the query and get a nodeset
		Object result = null;
		try {
			result = expr.evaluate(item, XPathConstants.NODESET);
			// Cast the result to a DOM NodeList
			NodeList nodes = (NodeList) result;
			return nodes;
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		
		
		return null;

		
	}
	
	private void log(String txt){
		if (displayLog)
			System.out.println(  txt);
	}
}
