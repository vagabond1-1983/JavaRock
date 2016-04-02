package com.test.basic.chapter8;

/**
 * Created by beigui on 2016/2/23.
 * 功能：利用DBUtil工具类，更加方便的操作数据库
 */
public class DBDemo {
    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String username = "root";
        String password = "password";

        //connect first
        DBUtil.getConnection(driver, url, username, password);

        //insert
        String insertSQL = "insert into users(username, password) VALUES(?, ?)";
        DBUtil.insertOrUpdate(insertSQL, "user2");
        DBUtil.insertOrUpdate(insertSQL, "pass2");

        //query
        String querySQL = "select * from users";
        DBUtil.query(querySQL);

        //update that row
        String updateSQL = "update users set password = ? where username = ?";
        DBUtil.insertOrUpdate(updateSQL, "pass2", "user2");

        //query again
        DBUtil.query(querySQL);

        //close connection
        DBUtil.close();
    }
}
