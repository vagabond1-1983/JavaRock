package com.test.project.courseManagementSystem.service;

import com.test.project.courseManagementSystem.util.DBUtil;
import com.test.project.courseManagementSystem.domain.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by beigui on 2016/3/24.
 */
public class DataService {
    private String driver = "com.mysql.jdbc.Driver";
    private String url;
    private String username = "root";
    private String password = "password";
    private Connection conn = null;

    public DataService(String url) {
        this.url = url;
        conn = DBUtil.getConnection(driver, url, username, password);
    }

    public void insertTeachers(Map<Integer, Teacher> teachers) {
        String sql = "insert into teacher(id, name) values(?,?)";
        for (Teacher item : teachers.values()) {
            DBUtil.insertOrUpdate(sql, item.getId() + "", item.getName());
        }
    }

    public void insertStudents(Map<Integer, Student> students) {
        String sql = "insert into student(id, name) values(?, ?)";
        for (Student item : students.values()) {
            DBUtil.insertOrUpdate(sql, item.getId() + "", item.getName());
        }
    }

    public void insertCourses(Map<Integer, Course> courses) {
        String sql = "insert into course(id, name) values(?, ?)";
        for (Course item : courses.values()) {
            DBUtil.insertOrUpdate(sql, item.getId() + "", item.getName());
        }
    }

    public void insertTechCourses(List<TechCourse> techCourses) {
        String sql = "insert into tech_course(techId, courseId) values(?, ?)";
        for (TechCourse item : techCourses) {
            DBUtil.insertOrUpdate(sql, item.getTeacher().getId() + "", item.getCourse().getId() + "");
        }
    }

    public void insertScores(List<Score> scores) {
        String sql = "insert into score(courseId, studentId, score) values(?, ?, ?)";
        for (Score item : scores) {
            DBUtil.insertOrUpdate(sql, item.getCourse().getId() + "", item.getStudent().getId() + "", item.getScore() + "");
        }
    }

    public Score getMaxScore4CourseId(int i) throws SQLException {
        String sql = "select MAX(sc.score) as maxScore, c.id as courseId, c.name as courseName, s.id as stuId, s.name as stuName\n" +
                        "from student s left join score sc\n" +
                        "on s.id = sc.studentId\n" +
                        "left join course c\n" +
                        "on c.id = sc.courseId\n" +
                        "where c.id = "+i+"\n" +
                        "group by c.id desc";
        Score score = null;
        ResultSet rs = DBUtil.queryReturnRS(sql);
        if (rs.next()) {
            score = new Score();
            score.setCourse(new Course(rs.getInt("courseId"), rs.getString("courseName")));
            score.setStudent(new Student(rs.getInt("stuId"), rs.getString("stuName")));
            score.setScore(rs.getFloat("maxScore"));
        }
        return score;
    }
}
