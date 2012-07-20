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

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 *
 * @author kkoutso
 */
public class PwdAuthenticator extends Authenticator
{
    public PasswordAuthentication getPasswordAuthentication()
    {
        String username = System.getProperty("repoUser");
        String password = System.getProperty("repoPass");
        return new PasswordAuthentication(username, password.toCharArray());
    }
}
