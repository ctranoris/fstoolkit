/**
 *  Copyright 2010, Konstantinos Koutsopoulos (k.koutsopoulos@yahoo.gr), Nikos Mouratidis (nmouratid@teemail.gr)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */


package org.panlab.tgw.restclient;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.Authenticator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.MediaType;
import javax.xml.namespace.QName;
import javax.xml.parsers.*;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.xmlbeans.XmlException;
import org.netbeans.xml.schema.repo.ConfigParamAtomicDocument;
import org.netbeans.xml.schema.repo.ConfigParamAtomicDocument.ConfigParamAtomic;
import org.netbeans.xml.schema.repo.ConfigParamAtomicInstanceDocument;
import org.netbeans.xml.schema.repo.ConfigParamCompositeDocument;
import org.netbeans.xml.schema.repo.ConfigParamCompositeDocument.ConfigParamComposite;
import org.netbeans.xml.schema.repo.ConfigParamCompositeInstanceDocument;
import org.netbeans.xml.schema.repo.ConfigletDocument.Configlet;
import org.netbeans.xml.schema.repo.GeometryDocument;
import org.netbeans.xml.schema.repo.GeometryDocument.Geometry;
import org.netbeans.xml.schema.repo.ListDocument;
import org.netbeans.xml.schema.repo.PtmDocument.Ptm;
import org.netbeans.xml.schema.repo.PtmInfoDocument.PtmInfo;
import org.netbeans.xml.schema.repo.ResourceInstanceDocument;
import org.netbeans.xml.schema.repo.ResourceInstanceDocument.ResourceInstance;
import org.netbeans.xml.schema.repo.ResourceInstanceInstanceDocument;
import org.netbeans.xml.schema.repo.ResourceSpecDocument.ResourceSpec;
//import org.netbeans.xml.schema.repo.ResourceSpecsDocument.ResourceSpecs.ResourceSpec;
import org.netbeans.xml.schema.repo.ResourceSpecsDocument.ResourceSpecs;
import org.netbeans.xml.schema.repo.impl.GeometryDocumentImpl;
import org.netbeans.xml.schema.repo.impl.GeometryDocumentImpl.GeometryImpl;
import org.netbeans.xml.schema.repo.impl.ResourceInstanceInstanceDocumentImpl;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.netbeans.xml.schema.repo.ConfigletDocument;
import org.netbeans.xml.schema.repo.ConfigletInstanceDocument;
import org.netbeans.xml.schema.repo.PtmInfoDocument;
import org.netbeans.xml.schema.repo.PtmInfoInstanceDocument;
import org.netbeans.xml.schema.repo.PtmInfoInstanceDocument.PtmInfoInstance;
import org.netbeans.xml.schema.repo.ResourceSpecDocument;
import org.netbeans.xml.schema.repo.ResourceSpecInstanceDocument;

/**
 *
 * @author kkoutso
 */
public class RepoAdapter {
    private static Log log = LogFactory.getLog(RepoAdapter.class);

    static String addSchemaDefinition(String response)
    {
        try
        {
            ByteArrayInputStream bais =  new ByteArrayInputStream(response.getBytes());
            DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = fact.newDocumentBuilder();
            Document doc = builder.parse(bais);

            Attr attr = doc.createAttribute("xmlns");
            attr.setValue("http://xml.netbeans.org/schema/repo.xsd");
            //attr.setValue("http://www.w3.org/2001/XMLSchema");
            doc.getDocumentElement().setAttributeNode(attr);
            ByteArrayOutputStream  baos = new ByteArrayOutputStream();
            Result result = new StreamResult(baos);
            // Write the DOM document to the file
            doc.setXmlStandalone(false);
            Transformer xformer = TransformerFactory.newInstance().newTransformer();
            Source source = new DOMSource(doc);
            xformer.transform(source, result);

            response = new String(baos.toByteArray());
            return response;
        }
        catch(Exception error)
        {
            return null;
        }
    }
    static
    {
        Authenticator.setDefault(new PwdAuthenticator());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException
    {
        // TODO code application logic here


    }

  public static String createResourceInstance(String commonname, String rSpec, String state, String[] cfgId)
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/resourceInstance/");
        ResourceInstanceInstanceDocument riDoc = ResourceInstanceInstanceDocument.Factory.newInstance();
        riDoc.addNewResourceInstanceInstance();
        riDoc.getResourceInstanceInstance().setCommonName(commonname);
        riDoc.getResourceInstanceInstance().setResourceSpec(rSpec);
        riDoc.getResourceInstanceInstance().setStateId(state);
        riDoc.getResourceInstanceInstance().setShared("true");
        for(int i=0; i<cfgId.length; i++)
            riDoc.getResourceInstanceInstance().setConfigurationDataArray(cfgId);

        riDoc.getResourceInstanceInstance().setGeometry("1");
        riDoc.getResourceInstanceInstance().setDescription("singleton "+commonname);

        String request  = riDoc.toString();
        request = request.replace(" xmlns=\"http://xml.netbeans.org/schema/repo.xsd\"", "");
        request = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+request;

        System.out.println(request);
        String resp = r.type(MediaType.TEXT_XML).post(String.class, request);
        System.out.println(resp);


        resp = addSchemaDefinition(resp);
        try
        {
            ResourceInstanceDocument pcDoc = ResourceInstanceDocument.Factory.parse(resp);
            return pcDoc.getResourceInstance().getId();
        }
        catch (XmlException ex)
        {
            return null;
        }


    }
  public static String createConfiglet( String value, String paramID)
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/configlet/");
        ConfigletInstanceDocument riDoc = ConfigletInstanceDocument.Factory.newInstance();

        ConfigParamAtomic cfa = getAtomic(paramID);

        riDoc.addNewConfigletInstance();

        riDoc.getConfigletInstance().setCommonName(cfa.getCommonName());
        riDoc.getConfigletInstance().setDescription(cfa.getDescription());
        riDoc.getConfigletInstance().setParamValue(value);
        riDoc.getConfigletInstance().addNewConfigurationParametersAtomic().setConfigParamAtomic(cfa.getId());


        String request  = riDoc.toString();
        request = request.replace(" xmlns=\"http://xml.netbeans.org/schema/repo.xsd\"", "");
        request = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+request;

        System.out.println(request);
        String resp = r.type(MediaType.TEXT_XML).post(String.class, request);
        System.out.println(resp);


        resp = addSchemaDefinition(resp);
        try
        {
            ConfigletDocument pcDoc = ConfigletDocument.Factory.parse(resp);
            return pcDoc.getConfiglet().getId();
        }
        catch (XmlException ex)
        {
            return null;
        }


    }
  public static String updateResourceInstance(String commonName, String state)
    {
      ResourceInstance ri = getResourceInstance(commonName);
      if(ri == null)
          return null;

        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/resourceInstance/"+ri.getId());
        ResourceInstanceInstanceDocument riDoc = ResourceInstanceInstanceDocument.Factory.newInstance();
        riDoc.addNewResourceInstanceInstance();
        riDoc.getResourceInstanceInstance().setCommonName(ri.getCommonName());
        riDoc.getResourceInstanceInstance().setResourceSpec(ri.getResourceSpec().getId());
        riDoc.getResourceInstanceInstance().setStateId(state);
        riDoc.getResourceInstanceInstance().setShared("true");
        riDoc.getResourceInstanceInstance().setDescription("singleton "+ri.getCommonName());

        String request  = riDoc.toString();
        request = request.replace(" xmlns=\"http://xml.netbeans.org/schema/repo.xsd\"", "");
        request = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+request;

        System.out.println(request);
        String resp = r.type(MediaType.TEXT_XML).put(String.class, request);


        resp = addSchemaDefinition(resp);
        try
        {
            ResourceInstanceDocument pcDoc = ResourceInstanceDocument.Factory.parse(resp);
            return pcDoc.getResourceInstance().getId();
        }
        catch (XmlException ex)
        {
            return null;
        }


    }
    public static ResourceInstance getResourceInstance(String type)
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/resourceInstance/");


        String resp = r.get(String.class);

        //System.out.println(resp);
        resp = addSchemaDefinition(resp);
        try
        {
            ListDocument lDoc = ListDocument.Factory.parse(resp);
            ResourceInstance[] riArray = lDoc.getList().getResourceInstanceArray();

            for(int i=0; i<riArray.length; i++)
                if(riArray[i].isSetCommonName() && riArray[i].getCommonName().equalsIgnoreCase(type))
                    return riArray[i];
        }
        catch (XmlException ex)
        {
            ex.printStackTrace();
            return null;
        }
        return null;

    }
    public static ResourceSpec getResourceSpec(String type)
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/resourceSpec/");


        String resp = r.get(String.class);

        //System.out.println(resp);
        resp = addSchemaDefinition(resp);
        try
        {
            ListDocument lDoc = ListDocument.Factory.parse(resp);
            ResourceSpec[] rsArray = lDoc.getList().getResourceSpecArray();

            for(int i=0; i<rsArray.length; i++)
                if(rsArray[i].isSetCommonName() && rsArray[i].getCommonName().equalsIgnoreCase(type))
                    return rsArray[i];
        }
        catch (XmlException ex)
        {
            ex.printStackTrace();
            return null;
        }
        return null;

    }


    public static String createAtomic(String commonName, String paramType, String defaultValue, String description)
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/configParamAtomic/");
        ConfigParamAtomicInstanceDocument pDoc = ConfigParamAtomicInstanceDocument.Factory.newInstance();
        pDoc.addNewConfigParamAtomicInstance();
        pDoc.getConfigParamAtomicInstance().setCommonName(commonName);
        pDoc.getConfigParamAtomicInstance().setConfigParamType(paramType);
        pDoc.getConfigParamAtomicInstance().setDefaultParamValue(defaultValue);
        pDoc.getConfigParamAtomicInstance().setDescription(description);

        String request  = pDoc.toString();
        request = request.replace(" xmlns=\"http://xml.netbeans.org/schema/repo.xsd\"", "");
        request = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+request;

        String resp = r.type(MediaType.TEXT_XML).post(String.class, request);


        resp = addSchemaDefinition(resp);
        try
        {
            ConfigParamAtomicDocument pcDoc = ConfigParamAtomicDocument.Factory.parse(resp);
            return pcDoc.getConfigParamAtomic().getId();
        }
        catch (XmlException ex)
        {
            return null;
        }
        

    }
   public static String updateAtomic(int id, String commonName, String paramType, String defaultValue, String description)
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/configParamAtomic/"+id);
        ConfigParamAtomicInstanceDocument pDoc = ConfigParamAtomicInstanceDocument.Factory.newInstance();
        pDoc.addNewConfigParamAtomicInstance();
        pDoc.getConfigParamAtomicInstance().setCommonName(commonName);
        pDoc.getConfigParamAtomicInstance().setConfigParamType(paramType);
        pDoc.getConfigParamAtomicInstance().setDefaultParamValue(defaultValue);
        pDoc.getConfigParamAtomicInstance().setDescription(description);

        String request  = pDoc.toString();
        request = request.replace(" xmlns=\"http://xml.netbeans.org/schema/repo.xsd\"", "");
        request = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+request;

        String resp = r.type(MediaType.TEXT_XML).put(String.class, request);
        System.out.println(resp);
        resp = addSchemaDefinition(resp);
        try
        {
            ConfigParamAtomicDocument pcDoc = ConfigParamAtomicDocument.Factory.parse(resp);
            return pcDoc.getConfigParamAtomic().getId();
        }
        catch (XmlException ex)
        {
            ex.printStackTrace();
            return null;
        }


    }
    public static String createComposite(String commonName, String[] atomic, String description)
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/configParamComposite/");
        ConfigParamCompositeInstanceDocument pDoc = ConfigParamCompositeInstanceDocument.Factory.newInstance();
        pDoc.addNewConfigParamCompositeInstance();
        pDoc.getConfigParamCompositeInstance().setCommonName(commonName);
        pDoc.getConfigParamCompositeInstance().setDescription(description);
        pDoc.getConfigParamCompositeInstance().setConfigParamsArray(atomic);


        String request  = pDoc.toString();
        request = request.replace(" xmlns=\"http://xml.netbeans.org/schema/repo.xsd\"", "");
        request = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+request;

        String resp = r.type(MediaType.TEXT_XML).post(String.class, request);
        System.out.println(resp);
        resp = addSchemaDefinition(resp);
        try
        {
            ConfigParamCompositeDocument pcDoc = ConfigParamCompositeDocument.Factory.parse(resp);
            return pcDoc.getConfigParamComposite().getId();
        }
        catch (XmlException ex)
        {
            ex.printStackTrace();
            return null;
        }


    }
    public static String updateComposite(String id, String commonName, String[] atomic, String description)
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/configParamComposite/"+id);
        ConfigParamCompositeInstanceDocument pDoc = ConfigParamCompositeInstanceDocument.Factory.newInstance();
        pDoc.addNewConfigParamCompositeInstance();
        pDoc.getConfigParamCompositeInstance().setCommonName(commonName);
        pDoc.getConfigParamCompositeInstance().setDescription(description);
        pDoc.getConfigParamCompositeInstance().setConfigParamsArray(atomic);


        String request  = pDoc.toString();
        request = request.replace(" xmlns=\"http://xml.netbeans.org/schema/repo.xsd\"", "");
        request = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+request;

        String resp = r.type(MediaType.TEXT_XML).put(String.class, request);
        System.out.println(resp);
        resp = addSchemaDefinition(resp);
        try
        {
            ConfigParamCompositeDocument pcDoc = ConfigParamCompositeDocument.Factory.parse(resp);
            return pcDoc.getConfigParamComposite().getId();
        }
        catch (XmlException ex)
        {
            ex.printStackTrace();
            return null;
        }


    }
    public static ConfigParamComposite getComposite(int id)
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/configParamComposite/"+id);



        String resp = r.get(String.class);

        System.out.println(resp);
        resp = addSchemaDefinition(resp);
        try
        {
            ConfigParamCompositeDocument pcDoc = ConfigParamCompositeDocument.Factory.parse(resp);
            return pcDoc.getConfigParamComposite();
        }
        catch (XmlException ex)
        {
            ex.printStackTrace();
            return null;
        }


    }
    public static String updateAddToComposite(int id, String[] atomic)
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/configParamComposite/"+id);
        ConfigParamCompositeInstanceDocument pDoc = ConfigParamCompositeInstanceDocument.Factory.newInstance();
        pDoc.addNewConfigParamCompositeInstance();

        ConfigParamComposite cC = getComposite(id);

        String[] paramArray = new String[atomic.length+cC.getConfigParams().sizeOfConfigParamAtomicArray()];

        System.arraycopy(atomic, 0, paramArray, 0, atomic.length);

        ConfigParamAtomic[] cA = cC.getConfigParams().getConfigParamAtomicArray();

        for(int i=0; i<cA.length; i++)
            paramArray[i+atomic.length] = cA[i].getId();



        pDoc.getConfigParamCompositeInstance().setConfigParamsArray(paramArray);


        String request  = pDoc.toString();
        request = request.replace(" xmlns=\"http://xml.netbeans.org/schema/repo.xsd\"", "");
        request = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+request;

        String resp = r.type(MediaType.TEXT_XML).put(String.class, request);
        System.out.println(resp);
        resp = addSchemaDefinition(resp);
        try
        {
            ConfigParamCompositeDocument pcDoc = ConfigParamCompositeDocument.Factory.parse(resp);
            return pcDoc.getConfigParamComposite().getId();
        }
        catch (XmlException ex)
        {
            ex.printStackTrace();
            return null;
        }


    }
    public static String updateOrganization(int id, String[] configParams )
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/configParamComposite/"+id);
        ConfigParamCompositeInstanceDocument pDoc = ConfigParamCompositeInstanceDocument.Factory.newInstance();
        pDoc.addNewConfigParamCompositeInstance();
//        pDoc.getConfigParamCompositeInstance().setCommonName(commonName);
//        pDoc.getConfigParamCompositeInstance().setDescription(description);
//        pDoc.getConfigParamCompositeInstance().setConfigParamsArray(atomic);
//

        String request  = pDoc.toString();
        request = request.replace(" xmlns=\"http://xml.netbeans.org/schema/repo.xsd\"", "");
        request = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+request;

        String resp = r.type(MediaType.TEXT_XML).put(String.class, request);
        System.out.println(resp);

        return null;


    }

    private static boolean containsSpec(PtmInfo pInfo, String id )
    {
        org.netbeans.xml.schema.repo.ResourceSpecsDocument.ResourceSpecs.ResourceSpec[] rSpec =
                pInfo.getResourceSpecsArray()[0].getResourceSpecArray();
        for(int i=0; i<rSpec.length; i++)
        {
            if(rSpec[i].getId().equalsIgnoreCase(id))
                return true;
        }
        return false;

    }

    public static ResourceSpec getResourceSpec(String type, String ptm_id)
    {
        log.info(type+"@"+ptm_id);
        Ptm ptm = getPtm(ptm_id);
        String info_id = ptm.getDescribedByPtmInfo().getId();
        PtmInfo ptmInfo = getPtmInfo(info_id);

        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/resourceSpec/");


        String resp = r.get(String.class);

        //System.out.println(resp);
        resp = addSchemaDefinition(resp);
        try
        {
            ListDocument lDoc = ListDocument.Factory.parse(resp);
            ResourceSpec[] rsArray = lDoc.getList().getResourceSpecArray();


            for(int i=0; i<rsArray.length; i++)
                if(rsArray[i].isSetCommonName() && rsArray[i].getCommonName().equalsIgnoreCase(type))
                {
                    if(containsSpec(ptmInfo, rsArray[i].getId()))
                            return rsArray[i];
                }
        }
        catch (XmlException ex)
        {
            ex.printStackTrace();
            return null;
        }
        return null;
    }
    public static ConfigParamComposite getComposite(String id)
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/configParamComposite/"+id);


        String resp = r.get(String.class);

        //System.out.println(resp);
        resp = addSchemaDefinition(resp);
        try
        {
            ConfigParamCompositeDocument cpcDoc = ConfigParamCompositeDocument.Factory.parse(resp);
            return cpcDoc.getConfigParamComposite();
        }
        catch (XmlException ex)
        {
            ex.printStackTrace();
            return null;
        }
    }
    public static ConfigParamAtomic getAtomic(String id)
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/configParamAtomic/"+id);


        String resp = r.get(String.class);

        //System.out.println(resp);
        resp = addSchemaDefinition(resp);
        try
        {
            ConfigParamAtomicDocument cpcDoc = ConfigParamAtomicDocument.Factory.parse(resp);
            return cpcDoc.getConfigParamAtomic();
        }
        catch (XmlException ex)
        {
            ex.printStackTrace();
            return null;
        }
    }

    public static Ptm getPtm( String ptm_id)
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/ptm/");


        String resp = r.get(String.class);

        //System.out.println(resp);
        resp = addSchemaDefinition(resp);
        try
        {
            ListDocument lDoc = ListDocument.Factory.parse(resp);
            Ptm[] ptmArray = lDoc.getList().getPtmArray();

            for(int i=0; i<ptmArray.length; i++)
                if(ptmArray[i].isSetCommonName() && ptmArray[i].getCommonName().equalsIgnoreCase(ptm_id))
                {
                    return ptmArray[i];
                }
        }
        catch (XmlException ex)
        {
            ex.printStackTrace();
            return null;
        }
        return null;
    }



    public static PtmInfo getPtmInfo( String ptmInfoId)
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/ptmInfo/");


        String resp = r.get(String.class);

        //System.out.println(resp);
        resp = addSchemaDefinition(resp);
        try
        {
            ListDocument lDoc = ListDocument.Factory.parse(resp);
            PtmInfo[] pInfo = lDoc.getList().getPtmInfoArray();

            for(int i=0; i<pInfo.length; i++)
                if(pInfo[i].isSetId() && pInfo[i].getId().equalsIgnoreCase(ptmInfoId))
                {
                    return pInfo[i];
                }
        }
        catch (XmlException ex)
        {
            ex.printStackTrace();
            return null;
        }
        return null;
    }

    public static String getPtmInfoId( String ptmId)
    {
        Ptm ptm = getPtm(ptmId);
        return getPtmInfo(ptm.getDescribedByPtmInfo().getId()).getId();

    }


    public static String updatePtmInfo(String id, String resourceSpecID)
    {
        PtmInfo ptmInfo = getPtmInfo(id);
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/ptmInfo/"+id);
        PtmInfoInstanceDocument pDoc = PtmInfoInstanceDocument.Factory.newInstance();
        pDoc.addNewPtmInfoInstance();
        pDoc.getPtmInfoInstance().setCommonName(ptmInfo.getCommonName());
        pDoc.getPtmInfoInstance().setDescription(ptmInfo.getDescription());
        pDoc.getPtmInfoInstance().setId(ptmInfo.getId());
        ResourceSpecs[] rSpecs = ptmInfo.getResourceSpecsArray();
        rSpecs[0].addNewResourceSpec().setId(resourceSpecID);

        for(int i=0; i<rSpecs[0].sizeOfResourceSpecArray(); i++)
        {
            String[] specs = new String[1];
            PtmInfoInstance.ResourceSpecs newSpec = pDoc.getPtmInfoInstance().addNewResourceSpecs();
            specs[0] = rSpecs[0].getResourceSpecArray()[i].getId();
            newSpec.setResourceSpecArray(specs);
        }



        String request  = pDoc.toString();
        request = request.replace(" xmlns=\"http://xml.netbeans.org/schema/repo.xsd\"", "");
        request = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+request;
        System.out.println(request);

        String resp = r.type(MediaType.TEXT_XML).put(String.class, request);
        System.out.println(resp);
        resp = addSchemaDefinition(resp);
        try
        {
            PtmInfoDocument pcDoc = PtmInfoDocument.Factory.parse(resp);
            return pcDoc.getPtmInfo().getId();
        }
        catch (XmlException ex)
        {
            ex.printStackTrace();
            return null;
        }

    }

    public static String createResourceSpec(String type, String compoId)
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/resourceSpec/");
        ResourceSpecInstanceDocument riDoc = ResourceSpecInstanceDocument.Factory.newInstance();
        riDoc.addNewResourceSpecInstance();
        riDoc.getResourceSpecInstance().setCommonName(type);
        riDoc.getResourceSpecInstance().setDescription("Resource Specification created by Teagle GW");
        riDoc.getResourceSpecInstance().setCost("100");
        riDoc.getResourceSpecInstance().setConfigurationParameters(compoId);


        String request  = riDoc.toString();
        request = request.replace(" xmlns=\"http://xml.netbeans.org/schema/repo.xsd\"", "");
        request = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+request;

        System.out.println(request);
        String resp = r.type(MediaType.TEXT_XML).post(String.class, request);


        resp = addSchemaDefinition(resp);
        try
        {
            ResourceSpecDocument pcDoc = ResourceSpecDocument.Factory.parse(resp);
            return pcDoc.getResourceSpec().getId();
        }
        catch (XmlException ex)
        {
            return null;
        }

    }
    public static String deleteResourceSpec(String Id)
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/resourceSpec/"+Id);
        r.type(MediaType.TEXT_XML).delete();
        return null;
    }

    public static Ptm[] getPtms()
    {
        Client c = Client.create();
        c.setFollowRedirects(true);
        Authenticator.setDefault(new PwdAuthenticator());
        WebResource r = c.resource("http://repos.pii.tssg.org:8080/repository/rest/ptm/");


        String resp = r.get(String.class);

        //System.out.println(resp);
        resp = addSchemaDefinition(resp);
        try
        {
            ListDocument lDoc = ListDocument.Factory.parse(resp);
            return lDoc.getList().getPtmArray();
        }
        catch (XmlException ex)
        {
            ex.printStackTrace();
            return null;
        }
    }

}


