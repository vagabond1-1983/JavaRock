package com.test.project.backupCourseManagementSystem.domain;

/**
 * Created by beigui on 2016/4/6.
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
