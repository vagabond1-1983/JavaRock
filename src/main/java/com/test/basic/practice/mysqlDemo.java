package com.test.basic.practice;

import java.sql.*;

/**
 * Created by beigui on 2016/4/9.
 * @author xueguiyang & weiyuxin
 */
public class mysqlDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url ="jdbc:mysql://127.0.0.1:3306/test";
        String username = "root";
        String password = "password";
        String mysql = "Select * from users";
        ResultSet rs = null;
        PreparedStatement state = null;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url,username,password);
            state = conn.prepareStatement(mysql);
            rs= state.executeQuery();
            while(rs.next()){
                Data data = new Data(rs.getString("username"),rs.getString(password));
                System.out.println(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (null != rs) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != state){
                try {
                    state.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (null != conn){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
