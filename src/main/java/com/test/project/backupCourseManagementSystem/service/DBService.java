package com.test.project.backupCourseManagementSystem.service;

import com.test.project.courseManagementSystem.util.DBUtil;
import com.test.project.backupCourseManagementSystem.domain.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by beigui on 2016/4/6.
 */
public class DBService {
    private String url;
    private String username;
    private String password;
    private String driver = "com.mysql.jdbc.Driver";
    private Connection connection;

    public DBService(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
        init();
    }

    private void init() {
        connection = DBUtil.getConnection(driver, this.url, this.username, this.password);
    }

    public void insertTeachers(Map<Integer, Teacher> teachers) {
        String sql = "insert into teacher values(?, ?)";
        for (Teacher item : teachers.values()) {
            DBUtil.insertOrUpdate(sql, item.getId()+"", item.getName());
        }
    }

    public void insertStudents(Map<Integer, Student> students) {
        String sql = "insert into student values(?, ?)";
        for (Student item : students.values()) {
            DBUtil.insertOrUpdate(sql, item.getId() + "", item.getName());
        }
    }

    public void insertCourses(Map<Integer, Course> courses) {
        String sql = "insert into course values(?, ?)";
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

    public void insertScore(List<Score> scores) {
        String sql = "insert into score(courseId, studentId, score) values(?, ?, ?)";
        for (Score item : scores) {
            DBUtil.insertOrUpdate(sql,
                    item.getCourse().getId() + "",
                    item.getStudent().getId() + "",
                    item.getScore() + "");
        }
    }

    public void queryMaxScore(int courseId) {
        String sql = "select Max(s.score) maxScore, c.id courseId, c.name courseName, st.id studentId, st.name studentName\n" +
                "from score s\n" +
                "left join course c\n" +
                "on c.id = s.courseId\n" +
                "left join student st\n" +
                "on st.id = s.studentId\n" +
                "where c.id = "+courseId+"\n" +
                "group by s.courseId";
        ResultSet rs = null;
        Score score = null;
        try {
            rs = DBUtil.queryReturnRS(sql);
            while (rs.next()) {
                score = orgScore(rs);
                break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(score.toString());
    }

    private Score orgScore(ResultSet rs) throws SQLException {
        Score score = new Score();
        Course course = new Course();
        Student student = new Student();
        student.setId(rs.getInt("studentId"));
        student.setName(rs.getString("studentName"));
        course.setId(rs.getInt("courseId"));
        course.setName(rs.getString("courseName"));
        score.setCourse(course);
        score.setStudent(student);
        score.setScore(rs.getFloat("maxScore"));
        return score;
    }

    public void close() {
        DBUtil.close();
    }
}
