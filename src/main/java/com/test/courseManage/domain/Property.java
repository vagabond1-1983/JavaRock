package com.test.courseManage.domain;

/**
 * Created by beigui on 2016/4/9.
 * 属性类，是课程类、学生类、教师类的父类
 */
public abstract class Property {
    private int id;
    private String name;

    public Property(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
