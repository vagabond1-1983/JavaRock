package com.test.courseManage.domain;

/**
 * Created by beigui on 2016/4/9.
 * 教师课程关联类
 * 教师跟课程之间的关系是多对多的，即一个教师可以教多门课程，而一门课程可以由多个教师去教
 */
public class TeacherCourse {
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
