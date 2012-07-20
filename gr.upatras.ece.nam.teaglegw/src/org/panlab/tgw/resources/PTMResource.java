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

package org.panlab.tgw.resources;
import org.panlab.tgw.Notification;
import org.panlab.ptm.t1.*;
import org.panlab.ptm.t1.types.ProvisioningResponse;
import org.panlab.tgw.util.*;
import java.net.URL;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.*;
import org.panlab.tgw.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author kkoutso
 * 
 */
// The Java class will be hosted at the URI path "/dummy"
@Path("/{ptmid}/{resourceid}")
public class PTMResource 
{
    private static Log log = LogFactory.getLog(PTMResource.class);

    static int classIndex=0;
    int j=0;
    public static final Hashtable<String, String>  m_ids = new Hashtable<String, String>();

    public PTMResource()
    {
        j = classIndex++;
    }

    public static String createError(String errorInfo, String ra_id, String type)
    {
        log.info(XMLUtil.xmlHeader
           +"<"
           +type+" status=\"FAIL\" code=\"410\"><uuid type=\"string\">"
           +ra_id+"</uuid><info>"
           +errorInfo+"</info></"
           +type+">");
        return XMLUtil.xmlHeader
           +"<"
           +type+" status=\"FAIL\" code=\"410\"><uuid type=\"string\">"
           +ra_id+"</uuid><info>"
           +errorInfo+"</info></"
           +type+">";
    }
    public static String createOK(String ra_id, String type)
    {
        log.info(XMLUtil.xmlHeader
           +"<"
           +type+" status=\"SUCCESS\">"+
           (ra_id!=null?"<uuid type=\"string\">"+ra_id+"</uuid>":"")+
           "</"+type+">");
        return XMLUtil.xmlHeader
           +"<"
           +type+" status=\"SUCCESS\">"+
           (ra_id!=null?"<uuid type=\"string\">"+ra_id+"</uuid>":"")+
           "</"+type+">";
    }
    private String createOK(String ra_id, String type, String request_id)
    {
        log.info(XMLUtil.xmlHeader
           +"<"
           +type+" status=\"SUCCESS\"  requestId=\""+request_id+"\">"+
           (ra_id!=null?"<uuid type=\"string\">"+ra_id+"</uuid>":"")+
           "</"+type+">");
        return XMLUtil.xmlHeader
           +"<"
           +type+" status=\"SUCCESS\"  requestId=\""+request_id+"\">"+
           (ra_id!=null?"<uuid type=\"string\">"+ra_id+"</uuid>":"")+
           "</"+type+">";
    }
    // The Java method will process HTTP GET requests
    @GET    // The Java method will produce content identified by the MIME Media
    // type "text/plain"
    @Produces("text/xml")
    //@Consumes("text/xml")
    public String getResource(
            @PathParam("ptmid") String ptmid,
            @PathParam("resourceid") String resourceid
            )
    {
        log.info("GET ("+j+") /"+ptmid+"/"+resourceid);//+content);
        String type = resourceid.substring(resourceid.lastIndexOf(".")+1,resourceid.lastIndexOf("-"));
        if(org.panlab.tgw.App.getStatus(ptmid)!=0)
        {
            return createError
               (
                org.panlab.tgw.App.statusText(org.panlab.tgw.App.getStatus(ptmid)),
                resourceid,
                type
               );
        }
        try
        {
            T1ServiceLocator l = new T1ServiceLocator();
            T1SoapBindingStub stub = (T1SoapBindingStub)(l.getT1((URL)(org.panlab.tgw.App.ptm_indexes.get(ptmid))));
            ProvisioningResponse res = stub.query("default_vct",resourceid, "<get></get>",null);
            log.info(res.getConfig_data());
            return res.getConfig_data();

        }
        catch (Exception error)
        {
            error.printStackTrace();
            return createError
               (
                error.getMessage(),
                resourceid,
                type
               );
        }
    }

    @PUT    // The Java method will produce content identified by the MIME Media
    // type "text/plain"
    @Produces("text/xml")
    @Consumes("text/xml")
    public String putResource(
            @PathParam("ptmid") String ptmid,
            @PathParam("resourceid") String resourceid,
            String content
            ) 
    {
        log.info("PUTTING: "+content);
        try
        {
            T1ServiceLocator l = new T1ServiceLocator();
            T1SoapBindingStub stub = (T1SoapBindingStub)(l.getT1((URL)(org.panlab.tgw.App.ptm_indexes.get(ptmid))));
            ProvisioningResponse res = stub.create("default_vct",resourceid, content,null);
            
            log.info(res.getStatus_code());
            log.info(res.getConfig_data());
            log.info(res.getRequest_id());
            return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                    "<resource><statuscode>"+res.getStatus_code()+"</statuscode>"+
                    "<config>"+res.getConfig_data()+"</config>"+
                    "<req_id>"+res.getRequest_id()+"</req_id>"+
                    "</resource>";
        }
        catch (Exception error)
        {
            error.printStackTrace();
            return "<error>"+error.getMessage()+"</error>";
        }
    }    
    @POST    // The Java method will produce content identified by the MIME Media
    // type "text/plain"
    @Produces("text/xml")
    @Consumes("application/x-www-form-urlencoded")
    public String postResource(
            @PathParam("ptmid") String ptmid,
            @PathParam("resourceid") String resourceid,
            String content
            ) 
    {
        log.info("POST ("+j+") /"+ptmid+"/"+resourceid+" "+content);
        try
        {


            XMLElement tempTop = XMLUtil.getTopElement(content);
            if(org.panlab.tgw.App.getStatus(ptmid)!=0)
            {
                String type = tempTop.m_name;
                return createError
                   (
                    org.panlab.tgw.App.statusText(org.panlab.tgw.App.getStatus(ptmid)),
                    resourceid,
                    type
                   );
            }
            if(org.panlab.tgw.App.getRAStatus(resourceid)!=0)
            {
                String type = tempTop.m_name;
                return createError
                   (
                    "RA: "+resourceid+" has reported an error",
                    resourceid,
                    type
                   );
            }
            String context = XMLUtil.getXMLElement(content, "context");
            String vctid = XMLUtil.getXMLElement(context, "vctId");
            content = XMLUtil.getXMLElement(content,"configuration");
            tempTop.m_value = content;
            content = tempTop.toString();
            if(tempTop.m_name.equalsIgnoreCase("vlan"))
            {
                Object[] tempList = XMLUtil.getElements(content);
                if(tempList!=null && tempList.length>0)
                {
                    String tempid = ((XMLElement)(tempList[0])).m_value;
                    tempid=tempid.substring(0,tempid.indexOf("."));
                    ptmid = tempid;
                    resourceid = ptmid+".top-0";
                    log.info("changed to: "+ptmid+"/"+resourceid);
                }
            }
            log.info("POST ("+j+") /"+ptmid+"/"+resourceid+" vctID:"+vctid+" "+content);
            if(ptmid.equalsIgnoreCase("share"))
            {
                T1ServiceLocator l = new T1ServiceLocator();
                T1SoapBindingStub stub;
                XMLElement top = XMLUtil.getTopElement(content);
                Object elements[] = XMLUtil.getElements(content);
                log.info(top.m_name);
                if(top.m_name.equalsIgnoreCase("vpn"))
                {
                    int vpnsize = elements.length;
                    Hashtable<String, String> igwSettings = new Hashtable<String, String>();
                    for(int i=0; i<elements.length; i++)
                    {
                        XMLElement temp = (XMLElement) elements[i];
                        log.info(temp.toString());
                        if (temp.m_attribute != null)
                        {
                            String ptm = temp.m_value.substring(0, temp.m_value.indexOf("."));
                            stub  = (T1SoapBindingStub)(l.getT1((URL)(org.panlab.tgw.App.ptm_indexes.get(ptm))));
                            ProvisioningResponse ref;
                            ref = stub.query(vctid, temp.m_value, "<connectivity></connectivity>", null);
                            log.info(ref.getConfig_data());
                            igwSettings.put(temp.m_value, ref.getConfig_data());
                        }
                    }
                    String vpn_id="";
                    Enumeration<String> en = igwSettings.keys();
                    log.info("igwSettings "+igwSettings.size());
                    while(en.hasMoreElements())
                    {
                        String current = en.nextElement();
                        String currentdetails = igwSettings.get(current);
                        log.info(current +": "+currentdetails);
                        while(en.hasMoreElements())
                        {
                            String other = en.nextElement();
                            String otherdetails = igwSettings.get(other);

                            String ptm = current.substring(0, current.indexOf("."));
                            vpn_id+= current;
                            stub  = (T1SoapBindingStub)(l.getT1((URL)(org.panlab.tgw.App.ptm_indexes.get(ptm))));
                            ProvisioningResponse ref;
                            ref = stub.update(vctid, current, otherdetails, null);
                            log.info(ref.getStatus_code());
                            ptm = other.substring(0, other.indexOf("."));
                            vpn_id+= other;
                            stub  = (T1SoapBindingStub)(l.getT1((URL)(org.panlab.tgw.App.ptm_indexes.get(ptm))));
                            ref = stub.update(vctid, other, currentdetails, null);
                            log.info(ref.getStatus_code());

                        }
                        igwSettings.remove(current);
                        log.info("igwSettings "+igwSettings.size());
                        en = igwSettings.keys();
                    }
                    log.info("VPN_ID: "+vpn_id);
                    return createOK(vpn_id, "vpn");
                }
                else
                return createError("Share ptm expects only vlan or vpn. Check VCT design",resourceid, top.m_name);

            }
            else
            {
                T1ServiceLocator l = new T1ServiceLocator();
                T1SoapBindingStub stub;                
                XMLElement top = XMLUtil.getTopElement(content);
                Object elements[] = XMLUtil.getElements(content);
                String conf = "";
                Vector<String> referencedRAIDs = new Vector<String>();
                for(int i =0; i<elements.length; i++)
                {
                    XMLElement temp = (XMLElement)elements[i];
                    log.info(temp.toString());
                    if(temp.m_attributes.containsKey("type") &&
                       temp.m_attributes.get("type").equalsIgnoreCase("\"reference\""))
                    {
                        if(!(temp.m_value.equalsIgnoreCase("")))
                        {
                            referencedRAIDs.add(temp.m_value);
                            String ptm = temp.m_value.substring(0, temp.m_value.indexOf("."));
                            stub  = (T1SoapBindingStub)(l.getT1((URL)(org.panlab.tgw.App.ptm_indexes.get(ptm))));
                            ProvisioningResponse ref;
                            if(resourceid.endsWith("top-0") && top.m_name.equalsIgnoreCase("vlan"))
                                ref = stub.query(vctid, temp.m_value, "<connectivity></connectivity>", null);
                            else
                                ref = stub.query(vctid, temp.m_value, "<reference></reference>", null);

                            log.info(temp.m_value+" ref data: "+ref.getConfig_data());
                            if(resourceid.endsWith("top-0") && top.m_name.equalsIgnoreCase("vlan"))
                                elements[i] = new XMLElement("item-"+i, null, null, ref.getConfig_data());
                            else
                                elements[i] = new XMLElement(temp.m_name, null, null, ref.getConfig_data());
                        }
                    }
                    if(temp.m_value!=null)
                        conf+=elements[i].toString();
                }
                
                ProvisioningResponse res=null;
                if(top.m_attributes.containsKey("action") &&
                   top.m_attributes.get("action").equalsIgnoreCase("\"update\""))
                {
                    log.info(top.m_attributes.get("action"));
                    log.info("SENDING: "+conf);
                    stub = (T1SoapBindingStub) (l.getT1((URL) (org.panlab.tgw.App.ptm_indexes.get(ptmid))));
                    if(top.m_attributes.containsKey("mode") &&
                       top.m_attributes.get("mode").equalsIgnoreCase("\"asynchronous\""))
                        res = stub.update(vctid, resourceid, conf, "https://"+System.getProperty("publicIP")+":8070/axis/services/TeagleGW");
                    else
                        res = stub.update(vctid, resourceid, conf, null);
			log.info("https://"+java.net.Inet4Address.getLocalHost()+":8070/axis/services/TeagleGW");
                }
                else
                {
                    conf = "<" + top.m_name + ">" + conf + "</" + top.m_name + ">";
                    log.info("SENDING: "+conf);
                    stub = (T1SoapBindingStub) (l.getT1((URL) (org.panlab.tgw.App.ptm_indexes.get(ptmid))));
                    //log.info(vctid+" "+resourceid+" "+conf);
                    if(top.m_attributes.containsKey("mode") &&
                       top.m_attributes.get("mode").equalsIgnoreCase("\"asynchronous\""))
                        res = stub.create(vctid, resourceid, conf, "https://62.103.214.70:8070/axis/services/TeagleGW");
                    else
                        res = stub.create(vctid, resourceid, conf, null);
                    if(res!=null)
                    {
                        if(!(res.getConfig_data().contains("FAIL")))
                            resourceid = XMLUtil.getXMLElement(res.getConfig_data(), "uuid");
                        else
                            resourceid = res.getConfig_data();
                    }
                }
                if(res!=null)
                {
                    int referencedSize = referencedRAIDs.size();
                    if(!(top.m_attributes.containsKey("mode")) ||
                         (
                            top.m_attributes.containsKey("mode")&&
                            !(top.m_attributes.get("mode").equalsIgnoreCase("\"asynchronous\""))
                         )
                       )
                    if(referencedSize>0)
                    {
                        stub  = (T1SoapBindingStub)(l.getT1((URL)(org.panlab.tgw.App.ptm_indexes.get(ptmid))));
                        ProvisioningResponse ref;
                        ref = stub.query(vctid, resourceid, "<reference></reference>", null);
                        conf = "<" + top.m_name + ">" + ref.getConfig_data() + "</" + top.m_name + ">";
                        log.info("The following data have to be sent to all referenced resources by "+resourceid+" :"+conf);
                        if(!org.panlab.tgw.App.CIRCULAR_REFERENCE)
                        {
                            log.info("reverse reference disabled");
                            referencedSize = 0;
                        }
                        for(int k=0; k<referencedSize; k++)
                        {
                            String temp = referencedRAIDs.remove(0);
                            if(temp!=null)
                            {
                                log.info("Updating "+temp);
                                log.info(conf);
                                String ptm = temp.substring(0, temp.indexOf("."));
                                stub  = (T1SoapBindingStub)(l.getT1((URL)(org.panlab.tgw.App.ptm_indexes.get(ptm))));
                                ProvisioningResponse update;
                                update = stub.update(vctid, temp, conf, null);
                                log.info("Updated "+temp+" :"+update.getStatus_code());
                            }
                        }
                    }
                    //String type = resourceid.substring(resourceid.lastIndexOf(".")+1,resourceid.lastIndexOf("-"));
                    String response="";
                    if (top.m_attributes.containsKey("action") &&
                       top.m_attributes.get("action").equalsIgnoreCase("\"update\""))
                    {
                       log.info("RETURNING conf: "+res.getConfig_data());
                       log.info("RETURNING status: "+res.getStatus_code());
                       log.info("RETURNING id: "+res.getRequest_id());
                       response = res.getStatus_code();
                    }
                    else
                    {
                        log.info("RETURNING conf: " + res.getConfig_data());
                        log.info("RETURNING status: " + res.getStatus_code());
                        log.info("RETURNING id: " + res.getRequest_id());
                        response = res.getConfig_data();
                    }
                    if(top.m_attributes.containsKey("mode") &&
                       top.m_attributes.get("mode").equalsIgnoreCase("\"asynchronous\""))
                    {
                        App.async_reqs.put(res.getRequest_id(),
                           new Notification(res.getRequest_id(),
                           "", "", vctid, "RETURN_STATUS",
                           "MESSAGE", "", ptmid, top.m_name, referencedRAIDs));

                        return createOK(null, top.m_name/*type*/, res.getRequest_id());
                    }
                    else
                    {
                        m_ids.put(resourceid, vctid);
                        return createOK(resourceid, top.m_name/*type*/);
                    }
                }
                else
                {
                    //String type = resourceid.substring(resourceid.lastIndexOf(".")+1,resourceid.lastIndexOf("-"));
                    return createError("Null response from PTM", resourceid, top.m_name/*type*/);
                }

            }
        }
        catch (Exception error)
        {
            //error.printStackTrace();
            String type = resourceid.substring(resourceid.lastIndexOf(".")+1,resourceid.lastIndexOf("-"));
            log.info("RETURNING: "+error.getMessage());
            return createError(error.getMessage(),resourceid,type);
        }
    }
    @DELETE    // The Java method will produce content identified by the MIME Media
    // type "text/plain"
    @Produces("text/xml")
    //@Consumes("text/xml")
    public String deleteResource(
            @PathParam("ptmid") String ptmid,
            @PathParam("resourceid") String resourceid//,
//            String content
            ) 
    {
        log.info("DELETING: "+resourceid);
        try
        {
            if(org.panlab.tgw.App.getStatus(ptmid)!=0)
            {
                return createError
                   (
                    org.panlab.tgw.App.statusText(org.panlab.tgw.App.getStatus(ptmid)),
                    resourceid,
                    ""
                   );
            }
            T1ServiceLocator l = new T1ServiceLocator();
            T1SoapBindingStub stub = (T1SoapBindingStub) (l.getT1((URL) (org.panlab.tgw.App.ptm_indexes.get(ptmid))));

            ProvisioningResponse res = stub.delete("default_vct",resourceid, "delete",null);
            log.info(res.getConfig_data());
            return res.getConfig_data();
        }
        catch (Exception error)
        {
            log.error(error.getMessage());
            return "<error>"+error.getMessage()+"</error>";
        }
    }

}    

