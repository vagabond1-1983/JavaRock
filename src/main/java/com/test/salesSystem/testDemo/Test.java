package com.test.salesSystem.testDemo;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

import java.util.List;

/**
 * Created by beigui on 2016/4/16.
 */
public class Test {
    public static void main( String[] args ) throws ConfigurationException {
        XMLConfiguration xml = new XMLConfiguration( "WreSalesSystemInfo.xml" );
        List< Object > userIDList = xml.getList( "Users.User.id" );

        for (int i = 1 ; i<=userIDList.size() ; i++ ){
            userIDList.get(i-1);
        }







    }
}

