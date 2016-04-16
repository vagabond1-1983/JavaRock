package com.test.salesSystem.main;

import com.test.salesSystem.domain.Sell;
import com.test.salesSystem.domain.User;
import com.test.salesSystem.domain.Ware;
import com.test.salesSystem.service.insertdata;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by beigui on 2016/4/16.
 * @author lichangxin & fangweili & maxiaoyu & jiabin & xueguiyang
 */
public class Running {
    public static void main(String[] args) throws ConfigurationException {
        String datafile = "WareSalesSystemInfo.xml";
        XMLConfiguration xml = null;
        xml = new XMLConfiguration(datafile);

        Map<Integer, User> user = new TreeMap<Integer, User>();
        Map<Integer, Ware> ware = new TreeMap<Integer, Ware>();

        List<Sell> sell = new ArrayList<Sell>();

        List< Object > userIDList = xml.getList( "Users.User.id" );
        List< Object > userNameList = xml.getList( "Users.User.name" );
        List< Object > userSexList = xml.getList( "Users.User.sex" );


        for (int i = 1 ; i<=userIDList.size() ; i++ ){
            User user1 = new User();
            user1.setId(Integer.valueOf(userIDList.get(i-1).toString()));
            user1.setName(userNameList.get(i-1).toString());
            user1.setSex(userSexList.get(i-1).toString());
            user.put( user1.getId(), user1 );
        }

        List< Object > wareIDList = xml.getList( "Wares.Ware.id" );
        List< Object > wareNameList = xml.getList( "Wares.Ware.name" );
        List< Object > warePriceList = xml.getList( "Wares.Ware.price" );


        for (int j = 1 ; j<=wareIDList.size() ; j++ ){
            Ware ware1 = new Ware();
            ware1.setId(Integer.valueOf(wareIDList.get(j-1).toString()));
            ware1.setName(wareNameList.get(j-1).toString());
            ware1.setPrice(Float.valueOf(warePriceList.get(j-1).toString()));
            ware.put( ware1.getId(), ware1 );
        }

        List< Object > sellUserIDList = xml.getList( "Sell.SellCount.userId" );
        List< Object > sellWareIDList = xml.getList( "Sell.SellCount.wareId" );
        List< Object > sellCountList = xml.getList( "Sell.SellCount.count" );

        for (int i = 1; i <= sellUserIDList.size() ; i++ ){
            Sell sell1 = new Sell();
            sell1.setUser(user.get(Integer.valueOf(sellUserIDList.get(i-1).toString())));
            sell1.setWare(ware.get(Integer.valueOf(sellWareIDList.get(i-1).toString())));
            sell1.setCount(Integer.valueOf(sellCountList.get(i-1).toString()));
            sell.add(i-1,sell1);
        }
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/salessystem?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "password";

        insertdata dataservice = new insertdata(driver,url,username,password);
        dataservice.insertUser(user);
//        dataservice.insertWare(ware);
//        dataservice.insertSell(sell);
//        dataservice.query(ware);



    }
}