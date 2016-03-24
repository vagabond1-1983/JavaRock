package com.test.basic.courseManagementSystem.domain;

/**
 * Created by beigui on 2016/3/24.
 */
public abstract class Property {
    protected int id;
    protected String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
