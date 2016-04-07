package com.test.project.courseManagementSystem.domain;

/**
 * Created by beigui on 2016/3/24.
 */
public abstract class Property {
    protected int id;
    protected String name;

    public Property() {
    }

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
        return this.getClass().getSimpleName() +"{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
