package com.test.salesSystem.domain;

/**
 * Created by beigui on 2016/4/16.
 */
public class Sell {
    private  User user;
    private  Ware ware;
    private  Integer count;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Ware getWare() {
        return ware;
    }

    public void setWare(Ware ware) {
        this.ware = ware;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
