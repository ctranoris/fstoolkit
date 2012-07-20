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
import java.util.Hashtable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.netbeans.xml.schema.repo.ConfigParamAtomicDocument.ConfigParamAtomic;
import org.netbeans.xml.schema.repo.ConfigParamCompositeDocument.ConfigParamComposite;
import org.netbeans.xml.schema.repo.ResourceInstanceDocument.ResourceInstance;
import org.netbeans.xml.schema.repo.ResourceSpecDocument.ResourceSpec;
import org.panlab.tgw.restclient.RepoAdapter;
/**
 *
 * @author kkoutso
 */
class ModTypeThread  extends Thread
{
    private static Log log = LogFactory.getLog(ModTypeThread.class);
    private String m_type;
    private String m_conf;
    private final String m_ptm_id;

    public ModTypeThread(String resource_type, String data, String ptm_id)
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
                String specID = rs.getConfigurationParameters().getId();
                log.info("-----------" + specID + "-----------");

                Hashtable<String, ConfigParamAtomic> cpaHash = new Hashtable<String, ConfigParamAtomic>();
                ConfigParamAtomic[] cpa = RepoAdapter.getComposite(specID).getConfigParams().getConfigParamAtomicArray();
                for(int i=0; i< cpa.length; i++)
                {
                    ConfigParamAtomic tempCPA = RepoAdapter.getAtomic(cpa[i].getId());
                    log.info("    "+tempCPA.getCommonName());
                    log.info("    "+tempCPA.getConfigParamType());
                    log.info("    "+tempCPA.getDescription());
                    log.info("    "+tempCPA.getId());
                    cpaHash.put(tempCPA.getCommonName(), tempCPA);
                }

                log.info("<Creating Atomic(s) for type"+m_type+">");
                Object[] elems= XMLUtil.getElements(m_conf);
                String[] atomic_ids = new String[elems.length];
                for(int i=0; i< elems.length; i++)
                {
                    XMLElement elem = (XMLElement) elems[i];
                    if(!cpaHash.containsKey(elem.m_name))
                    {
                        atomic_ids[i] = RepoAdapter.createAtomic(elem.m_name, elem.m_attributes.get("type").replace("\"",""), "","Atomic Parameter Created by Teagle Gateway");
                        log.info(atomic_ids[i]);
                    }
                    else
                    {
                        ConfigParamAtomic tempCPA = cpaHash.get(elem.m_name);
                        tempCPA.setConfigParamType(elem.m_attributes.get("type").replace("\"",""));
                        atomic_ids[i] = tempCPA.getId();
                    }
                }
                log.info("</Creating Atomic(s) for type"+m_type+">");

                log.info("<Updating Composite for type"+m_type+">");

                String cpc = RepoAdapter.updateComposite(rs.getConfigurationParameters().getId(), m_type,atomic_ids,"Composite Parameter Updated by Teagle Gateway");
                log.info(cpc);
                log.info("</Updating Composite for type"+m_type+">");

            }
            



        }
        catch(Exception error)
        {
            log.error(error.getMessage());
            error.printStackTrace();
        }
    }

}
