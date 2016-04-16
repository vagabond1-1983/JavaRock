package com.test.salesSystem.service;

import com.test.salesSystem.domain.User;

import java.util.Map;

/**
 * Created by beigui on 2016/4/16.
 */

public class insertdata {


    public insertdata(String driver,String url,String username,String password) {
        DBUtil.getConnection(driver,url,username,password);
    }

    public void insertUser(Map users){
        String sql = "insert into user value(?, ?, ?)";
        for(Object item : users.values()){
            User u = (User) item;

            DBUtil.insertOrUpdate(sql, u.getId().toString(), u.getName(), u.getSex());
        }
//    public void insertWare(List users){
//        String sql = "insert into User value(?)";
//        for(Object item : users){
//            User u = (User) item;
//            DBUtil.insertOrUpdate(sql, u.getId().toString());
//        }
//    public void insertSell(List users){
//        String sql = "insert into User value(?)";
//        for(Object item : users){
//            User u = (User) item;
//            DBUtil.insertOrUpdate(sql, u.getId().toString());
//        }







    }
}
