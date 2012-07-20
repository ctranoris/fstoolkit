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
class ActivationThread extends Thread
{
    private static Log log = LogFactory.getLog(ActivationThread.class);
    private String m_id;
    private String m_type;
    private final String m_ptm_id;
    private final String m_data;

    public ActivationThread(String resource_id, String data, String ptm_id)
    {
        log.info(resource_id+" "+data+" "+ptm_id);
        m_id = resource_id;
        m_type = resource_id.substring(resource_id.lastIndexOf(".")+1,resource_id.lastIndexOf("-"));
        m_ptm_id = ptm_id;
        m_data = data;
        log.info(m_id+" "+m_type+" "+m_ptm_id+" "+m_data);
    }

    public void run()
    {
        //while(true)
        try
        {
            sleep(Integer.parseInt(System.getProperty("singleton.thread")));
            if(PTMResource.m_ids.containsKey(m_id))
                log.info(m_id + " is associated with vctid "+ PTMResource.m_ids.get(m_id)+" no further action required");
            else
            {
                log.info(m_id + " is not associated with vctid "+ PTMResource.m_ids.get(m_id)+" will be treated as a singleton");
                ResourceInstance ri = RepoAdapter.getResourceInstance(m_id);
                if(ri!=null)
                {
                    log.info(m_id + "is already in Repository");
                    log.info(ri.getId());
                    log.info(ri.getCommonName());
                    log.info(ri.getDescription());
                    log.info(ri.getGeometry());
                    log.info(ri.getResourceSpec());
                    log.info(ri.getState());

                    //log.info(m_id + "updating only the state");

                    //RepoAdapter.updateResourceInstance(m_id, "9");

                }
                else
                {
                    log.info(m_id + " not in the Repository");
                    ResourceSpec rs = RepoAdapter.getResourceSpec(m_type, m_ptm_id);
                    if(rs!=null)
                    {
                        ConfigParamComposite cpc = RepoAdapter.getComposite(rs.getConfigurationParameters().getId());
                        ConfigParamAtomic[] cpa_array = cpc.getConfigParams().getConfigParamAtomicArray();

                        String[] cfgIds = new String[cpa_array.length];
                        for(int i=0; i<cpa_array.length; i++)
                        {
                            ConfigParamAtomic cpa = RepoAdapter.getAtomic(cpa_array[i].getId());
                            String value = XMLUtil.getXMLElement(m_data, cpa.getCommonName());
                            cfgIds[i] = RepoAdapter.createConfiglet(value, cpa_array[i].getId());
                        }

                        RepoAdapter.createResourceInstance(m_id, rs.getId(), "9", cfgIds);
                    }
                    else
                        log.info(m_type + " spec not found");

                }
                

            }
            //break;

        }
        catch(Exception error)
        {
            log.error(error.getMessage());
            error.printStackTrace();
        }
    }

}
