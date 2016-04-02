package com.test.basic.chapter8;

import java.sql.*;

/**
 * Created by beigui on 2016/2/21.
 */
public class MySQLQueryDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");  //加载数据库驱动
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String user = "root";
        String password = "password";
        String sql = "select * from users";
        //建立数据库连接，获得连接对象conn
        Connection conn = DriverManager.getConnection(url, user, password);
        //创建一个Statement对象
//        Statement statement = conn.createStatement();
//        ResultSet rs = statement.executeQuery(sql);
        PreparedStatement statement = conn.prepareStatement(sql);
        //获得查询后的结果集
        ResultSet rs = statement.executeQuery();
        //对结果集进行遍历，取出结果
        while (rs.next()) {
            System.out.println(rs.getString("username"));
        }
        //关闭数据库连接相关对象
        rs.close();
        statement.close();
        conn.close();
    }
}
