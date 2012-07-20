#!/bin/sh
java -Djavax.net.ssl.trustStore=../.keystore -Djavax.net.ssl.trustStorePassword=changeit -DrepoUser=kkoutso -DrepoPass=cbr1100xx  -cp teaglegw.jar org.panlab.tgw.restclient.PtmInfoParser $1
