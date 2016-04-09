package com.test.courseManage.domain;

import java.util.List;

/**
 * Created by beigui on 2016/4/9.
 * TODO
 */
public class TeacherCourseRef {
    private List<Teacher> teachers;
    private List<Course> courses;

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
