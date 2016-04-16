package com.test.courseManage.service;

import com.test.courseManage.domain.*;
import com.test.courseManage.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by beigui on 2016/4/9.
 */
public class DataService {
    private String driver;
    private String url;
    private String username;
    private String password;

    public DataService(String driver, String url, String username, String password) {
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
        DBUtil.getConnection(driver, url, username, password);
    }

    public void insertTeachers(Map<Integer, Teacher> teachers) {
        String sql = "insert into teacher(name) values(?)";
        for (Teacher item : teachers.values()) {
            DBUtil.insertOrUpdate(sql, item.getName());
        }
    }

    public void insertStudents(Map<Integer, Student> students) {
        String sql = "insert into student(name) values(?)";
        for (Student item : students.values()) {
            DBUtil.insertOrUpdate(sql, item.getName());
        }
    }

    public void insertCourses(Map<Integer, Course> courses) {
        String sql = "insert into course(name) values(?)";
        for (Course item : courses.values()) {
            DBUtil.insertOrUpdate(sql, item.getName());
        }
    }

    public void insertTechCourses(List<TeacherCourse> teacherCourses) {
        String sql = "insert into tech_course(techId, courseId) values(?, ?)";
        for (TeacherCourse item : teacherCourses) {
            DBUtil.insertOrUpdate(sql, item.getTeacher().getId()+"", item.getCourse().getId()+"");
        }
    }

    public void insertScores(List<Score> scores) {
        String sql = "insert into score(courseId, studentId, score) values(?, ?, ?)";
        for (Score item : scores) {
            DBUtil.insertOrUpdate(sql, item.getCourse().getId() + "", item.getStudent().getId()+"", item.getScore()+"");
        }
    }

    //根据课程id，获取Score对象
    public Score queryMaxScore(Integer item) {
        String sql = "select c.name courseName, c.id courseId, s.id studentId, s.name studentName, max(sc.score) maxScore\n" +
                "from score sc\n" +
                "left join student s\n" +
                "on sc.studentId = s.id\n" +
                "left join course c\n" +
                "on c.id = sc.courseId\n" +
                "where c.id = "+item+"\n" +
                "group by courseId";

        ResultSet rs = null;
        Score result = null;
        try {
            rs = DBUtil.queryReturnRS(sql);
            while (rs.next()) {
                Student s = new Student(rs.getInt("studentId"), rs.getString("studentName"));
                Course c = new Course(rs.getInt("courseId"), rs.getString("courseName"));
                result = new Score();
                result.setStudent(s);
                result.setCourse(c);
                result.setScore(rs.getFloat("maxScore"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (null != rs) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}
