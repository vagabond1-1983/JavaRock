package com.test.basic.courseManagementSystem.main;

import com.test.basic.courseManagementSystem.domain.Course;
import com.test.basic.courseManagementSystem.domain.Student;
import com.test.basic.courseManagementSystem.domain.Teacher;
import com.test.basic.courseManagementSystem.domain.TechCourse;
import com.test.basic.courseManagementSystem.service.XMLHandlerService;
import org.apache.commons.configuration.ConfigurationException;

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
//        List<Score> scores = xmlHandlerService.getScores(courses, students);
//        //3. 对象持久化->DB
//        DataService dataService = new DataService();
//        dataService.insert(teachers);
//        dataService.insert(students);
//        dataService.insert(courses);
//        dataService.insert(techCourses);
//        dataService.insert(scores);

    }
}
