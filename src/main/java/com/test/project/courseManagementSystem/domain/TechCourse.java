package com.test.project.courseManagementSystem.domain;

/**
 * Created by beigui on 2016/3/24.
 */
public class TechCourse {
    private Teacher teacher;
    private Course course;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
