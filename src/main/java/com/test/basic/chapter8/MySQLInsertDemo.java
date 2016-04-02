package com.test.basic.chapter8;

import java.sql.*;

/**
 * Created by beigui on 2016/2/21.
 */
public class MySQLInsertDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");  //加载数据库驱动
        String url = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8";
        String user = "root";
        String password = "password";
        String sql = "insert into users(username, password) VALUES(?, ?)";
        //建立数据库连接，获得连接对象conn
        Connection conn = DriverManager.getConnection(url, user, password);
        //创建一个Statement对象
        PreparedStatement statement = conn.prepareStatement(sql);
        //为问号内容赋值
        statement.setString(1, "用户1");
        statement.setString(2, "密码1");
        //执行sql语句
        System.out.println(statement.executeUpdate());
        //关闭数据库连接相关对象
        statement.close();
        conn.close();
    }
}
