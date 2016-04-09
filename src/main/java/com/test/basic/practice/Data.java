package com.test.basic.practice;

/**
 * Created by beigui on 2016/4/9.
 */
public class Data {
    private String username;
    private String password;
    public Data(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Data{" +
                "password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
