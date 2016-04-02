package com.test.basic.chapter8;

import java.sql.*;

/**
 * Created by beigui on 2016/4/2.
 */
public class MySQLConnectionDemo {
    public static void main(String[] args) {
        //加载驱动程序
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //创建数据连接对象
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String username = "root";
        String password = "password";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            //执行sql
            String sql = "select * from users where username = ? and password = ?";
            //创建Statement对象
            statement = connection.prepareStatement(sql);
            statement.setString(1, "user1");
            statement.setString(2, "password1");
            rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getRow());
                System.out.println(rs.getString("password"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭数据库连接
            try {
                if (null != rs) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (null != statement) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (null != connection) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
