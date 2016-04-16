package com.test.courseManage.domain;

/**
 * Created by beigui on 2016/4/9.
 * 成绩类：包括课程信息、学生信息、成绩
 * 具体是指某一个学生一门课程的一次成绩
 */
public class Score {
    private Course course;
    private Student student;
    private float score;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "course=" + course +
                ", student=" + student +
                ", score=" + score +
                '}';
    }
}
