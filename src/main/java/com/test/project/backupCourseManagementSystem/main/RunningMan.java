package com.test.project.backupCourseManagementSystem.main;

import com.test.project.backupCourseManagementSystem.domain.*;
import com.test.project.backupCourseManagementSystem.service.DBService;
import com.test.project.backupCourseManagementSystem.service.XmlParserService;
import org.apache.commons.configuration.ConfigurationException;

import java.util.List;
import java.util.Map;

/**
 * Created by beigui on 2016/4/6.
 */
public class RunningMan {
    public static void main(String[] args) {
        //1. 初始化
        String xmlPath = "CourseManagementSystem.xml";
        XmlParserService xmlParserService = null;
        try {
            xmlParserService = new XmlParserService(xmlPath);
        } catch (ConfigurationException e) {
            e.printStackTrace();
            return;
        }
        //2. 读xml到对象集合
        Map<Integer, Teacher> teachers = xmlParserService.getTeachers("Teachers.Teacher");
        Map<Integer, Student> students = xmlParserService.getStudents("Students.Student");
        Map<Integer, Course> courses = xmlParserService.getCourses("Courses.Course");
//
//        //3. 对象的业务处理
        List<TechCourse> techCourses = xmlParserService.getTechCourses("TechCourses.TechCourse", teachers, courses);
        List<Score> scores = xmlParserService.getScore("Scores.Score", students, courses);
//        //4. 将对象写入数据库中
        String url = "jdbc:mysql://127.0.0.1:3306/course_management_system?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "password";
        DBService dbService = new DBService(url, username, password);
        dbService.insertTeachers(teachers);
        dbService.insertStudents(students);
        dbService.insertCourses(courses);
        dbService.insertTechCourses(techCourses);
        dbService.insertScore(scores);
        //最大值
        for (int i : courses.keySet()) {
            dbService.queryMaxScore(i);
        }
//        //5. 结束工作
        dbService.close();
    }
}
