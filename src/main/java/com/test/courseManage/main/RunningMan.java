package com.test.courseManage.main;

import com.test.courseManage.domain.*;
import com.test.courseManage.service.XmlService;
import org.apache.commons.configuration.ConfigurationException;

import java.util.List;
import java.util.Map;

/**
 * Created by beigui on 2016/4/9.
 */
public class RunningMan {
    public static void main(String[] args) {
        //1. 读xml到对象
        String dataFile = "CourseManagementSystem.xml";
        XmlService xmlService = null;
        try {
            xmlService = new XmlService(dataFile);
        } catch (ConfigurationException e) {
            e.printStackTrace();
            System.out.println("XML文件有问题，请重试");
            return;
        }
        Map<Integer, Teacher> teachers = xmlService.getTeachers("Teachers.Teacher.");
        Map<Integer, Student> students = xmlService.getStudents("Students.Student.");
        Map<Integer, Course> courses = xmlService.getCourses("Courses.Course.");
//
//        //2. 对象关联 - 业务逻辑
        List<TeacherCourse> teacherCourses = xmlService.getTechCourse("TechCourses.TechCourse.", teachers, courses);
        List<Score> scores = xmlService.getScores("Scores.Score.", courses, students);
//        //3. 对象写入DB
//        DataService dataService = new DataService();
//        dataService.insertTeachers(teachers);
//        dataService.insertStudents(students);
//        dataService.insertCourses(courses);
//        dataService.insertTechCourses(teacherCourses);
//        dataService.insertScores(scores);
    }
}
