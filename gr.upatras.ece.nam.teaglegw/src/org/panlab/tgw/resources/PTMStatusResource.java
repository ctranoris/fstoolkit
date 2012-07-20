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
import org.panlab.ptm.t1.types.ProvisioningResponse;
import org.panlab.tgw.util.*;
import java.net.URL;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.*;
import org.panlab.tgw.*;

/**
 *
 * @author kkoutso
 * 
 */
// The Java class will be hosted at the URI path "/dummy"
@Path("/")
public class PTMStatusResource 
{
    static int classIndex=0;
    int j=0;

    public PTMStatusResource()
    {
        j = classIndex++;
    }

    public static String createError(String errorInfo, String ra_id, String type)
    {
        return XMLUtil.xmlHeader
           +"<"
           +type+" status=\"FAIL\" code=\"410\"><uuid type=\"string\">"
           +ra_id+"</uuid><info>"
           +errorInfo+"</info></"
           +type+">";
    }
    public static String createOK(String ra_id, String type)
    {
        return XMLUtil.xmlHeader
           +"<"
           +type+" status=\"SUCCESS\">"+
           (ra_id!=null?"<uuid type=\"string\">"+ra_id+"</uuid>":"")+
           "</"+type+">";
    }
    private String createOK(String ra_id, String type, String request_id)
    {
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
    public String getResource( ) 
    {
        Enumeration<String> en = org.panlab.tgw.App.ptm_indexes.keys();
        String temp = XMLUtil.xmlHeader;
        temp+="<ptms>";
        while(en.hasMoreElements())
        {
            String tmp = en.nextElement();
            temp += "<"+tmp+">"+org.panlab.tgw.App.statusText(App.ptm_status.get(tmp))+"</"+tmp+">"+"\n";
        }
        temp+="</ptms>";
        return temp;

    }


}    

