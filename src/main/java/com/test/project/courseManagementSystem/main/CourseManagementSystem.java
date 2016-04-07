package com.test.project.courseManagementSystem.main;

import com.test.project.courseManagementSystem.domain.*;
import com.test.project.courseManagementSystem.service.DataService;
import com.test.project.courseManagementSystem.service.XMLHandlerService;
import com.test.project.courseManagementSystem.util.DBUtil;
import org.apache.commons.configuration.ConfigurationException;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by beigui on 2016/3/24.
 */
public class CourseManagementSystem {
    public static void main(String[] args) {
        //1. 解析xml，转换为对象集
        XMLHandlerService xmlHandlerService = null;
        try {
            xmlHandlerService = new XMLHandlerService("CourseManagementSystem.xml");
        } catch (ConfigurationException e) {
            e.printStackTrace();
            System.out.println("XML 无法解析，请检查");
            return;
        }
        Map<Integer, Teacher> teachers = xmlHandlerService.getTeachers();
        Map<Integer, Student> students = xmlHandlerService.getStudents();
        Map<Integer, Course> courses = xmlHandlerService.getCourses();
        //2. 对象的业务处理，关联
        List<TechCourse> techCourses = xmlHandlerService.getTechCourses(teachers, courses);
        List<Score> scores = xmlHandlerService.getScores(courses, students);
        //3. 对象持久化->DB
        DataService dataService = new DataService("jdbc:mysql://localhost:3306/course_management_system?useUnicode=true&characterEncoding=UTF-8");
//        dataService.insertTeachers(teachers);
//        dataService.insertStudents(students);
//        dataService.insertCourses(courses);
//        dataService.insertTechCourses(techCourses);
//        dataService.insertScores(scores);
        Score maxScore = null;
        try {
            for (int item : courses.keySet()) {
                maxScore = dataService.getMaxScore4CourseId(item);
                System.out.println(maxScore);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close();
        }
    }
}
