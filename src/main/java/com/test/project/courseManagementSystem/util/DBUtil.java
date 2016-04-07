package com.test.project.courseManagementSystem.util;

import java.sql.*;

/**
 * Created by beigui on 2016/2/23.
 * 把数据库操作放到这个工具类中，直接进行操作
 */
public class DBUtil {
    private static Connection conn = null;
    private static PreparedStatement preStatement = null;
    private static ResultSet rs = null;

    //获取连接。饿汉式 推荐 。懒汉式就是在构造时连接上，然后方法返回connection。
    public static Connection getConnection(String driver, String url, String username, String password) {
        try {
            if (null == conn || conn.isClosed()) {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, username, password);
            }
        } catch (ClassNotFoundException cex) {
            cex.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //关闭连接。在不用数据库时，要关闭连接。
    public static void close() {
        if (null != conn) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //查询方法，打印出结果集
    public static void query(String sql) {
        if (null == conn) {
            return;
        }
        try {
            preStatement = conn.prepareStatement(sql);
            rs = preStatement.executeQuery();
            //获取列数
            int columns = rs.getMetaData().getColumnCount();
            int rows = 1;
            //循环一组一组取结果集
            while (rs.next()) {
                System.out.println("第" + rows + "行：");
                //按列下标取出某行某列的数据
                for (int i = 1; i < columns; i++) {
                    System.out.println("第" + i + "列数据：" + rs.getString(i));
                }
                rows++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //最终别忘了做关闭操作
            if (null != rs) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (null != preStatement) {
                try {
                    preStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static ResultSet queryReturnRS(String sql) {
        if (null == conn) {
            return null;
        }
        try {
            preStatement = conn.prepareStatement(sql);
            rs = preStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    //插入或者是更新。params是一个不定长度的字符串数组，相当于String[] params
    public static void insertOrUpdate(String sql, String... params) {
        if (null == conn) {
            return;
        }
        try {
            preStatement = conn.prepareStatement(sql);
            int i = 1;
            //设置参数值。这个写法相当于for(int i = 0; i < params.length; i++) {String item = params[i];}
            for (String item : params) {
                preStatement.setString(i++, item);
            }
            System.out.println("插入记录结果：" +preStatement.executeUpdate());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //别忘了关闭
            if (null != rs) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (null != preStatement) {
                try {
                    preStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
