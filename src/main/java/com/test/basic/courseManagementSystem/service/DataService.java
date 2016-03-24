package com.test.basic.courseManagementSystem.service;

import com.test.basic.chapter8.DBUtil;
import com.test.basic.courseManagementSystem.domain.Teacher;

import java.sql.Connection;
import java.util.Map;

/**
 * Created by beigui on 2016/3/24.
 */
public class DataService {
    private String driver = "com.mysql.jdbc.Driver";
    private String url;
    private String username = "root";
    private String password = "password";
    private Connection conn = null;

    public DataService(String url) {
        this.url = url;
        conn = DBUtil.getConnection(driver, url, username, password);
    }

    public void insert(Map<Integer, Teacher> teachers) {
        String sql = "insert into Teacher(id, name) values(?,?)";
        for (Teacher item : teachers.values()) {
            DBUtil.insertOrUpdate(sql, item.getId() + "", item.getName());
        }
    }
}
