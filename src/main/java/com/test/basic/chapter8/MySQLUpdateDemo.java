package com.test.basic.chapter8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by beigui on 2016/2/21.
 */
public class MySQLUpdateDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");  //加载数据库驱动
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String user = "root";
        String password = "password";
        String sql = "update users set password = ? where username = ?";
        //建立数据库连接，获得连接对象conn
        Connection conn = DriverManager.getConnection(url, user, password);
        //创建一个Statement对象
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, "password111");
        statement.setString(2, "user1");
        //执行sql语句
        System.out.println(statement.executeUpdate());
        //关闭数据库连接相关对象
        statement.close();
        conn.close();
    }
}
