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

package org.panlab.tgw.ptm.iface;
import org.panlab.tgw.resources.PTMResource;
import org.panlab.tgw.util.XMLElement;
import org.panlab.tgw.util.XMLUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.netbeans.xml.schema.repo.ConfigParamCompositeDocument.ConfigParamComposite;
import org.netbeans.xml.schema.repo.ResourceInstanceDocument.ResourceInstance;
import org.netbeans.xml.schema.repo.ResourceSpecDocument.ResourceSpec;
import org.panlab.tgw.restclient.RepoAdapter;
/**
 *
 * @author kkoutso
 */
class TypeThread  extends Thread
{
    private static Log log = LogFactory.getLog(TypeThread.class);
    private String m_type;
    private String m_conf;
    private final String m_ptm_id;

    public TypeThread(String resource_type, String data, String ptm_id)
    {
        m_type = resource_type;
        m_conf = data;
        m_ptm_id = ptm_id;
    }

    public void run()
    {
        try
        {
            //sleep(Integer.parseInt(System.getProperty("singleton.thread")));
            ResourceSpec rs = RepoAdapter.getResourceSpec(m_type, m_ptm_id);
            if(rs!=null)
            {
                log.info("The following Spec is already in the Repository for ptm: "+m_ptm_id);
                log.info(rs.getId());
                log.info(rs.getCommonName());
                log.info(rs.getDescription());
                //log.info(RepoAdapter.createResourceInstance(m_id,rs.getId(),"9"));
            }
            else
            {
                log.info(m_type + " spec not found");
                log.info("<Creating Atomic(s) for type"+m_type+">");
                Object[] elems= XMLUtil.getElements(m_conf);
                String[] atomic_ids = new String[elems.length];
                for(int i=0; i< elems.length; i++)
                {
                    XMLElement elem = (XMLElement) elems[i];
                    atomic_ids[i] = RepoAdapter.createAtomic(elem.m_name, elem.m_attributes.get("type").replace("\"",""), "","Atomic Parameter Created by Teagle Gateway");
                    log.info(atomic_ids[i]);
                }
                log.info("</Creating Atomic(s) for type"+m_type+">");

                log.info("<Creating Composite for type"+m_type+">");
                String cpc = RepoAdapter.createComposite(m_type,atomic_ids,"Composite Parameter Created by Teagle Gateway");
                log.info(cpc);
                log.info("</Creating Composite for type"+m_type+">");

                log.info("<Creating Resource Spec for type"+m_type+">");
                String rSp = RepoAdapter.createResourceSpec(m_type, cpc);
                log.info(rSp);
                log.info("</Creating Resource Spec for type"+m_type+">");

                log.info("<Updating PTM Info with new type"+m_type+">");
                log.info(RepoAdapter.updatePtmInfo(RepoAdapter.getPtmInfoId(m_ptm_id), rSp));
                log.info("</Updating PTM Info with new type"+m_type+">");
            }
            



        }
        catch(Exception error)
        {
            log.error(error.getMessage());
            error.printStackTrace();
        }
    }

}
