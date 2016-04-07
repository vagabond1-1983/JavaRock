package com.test.project.courseManagementSystem.service;

import com.test.project.courseManagementSystem.domain.*;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by beigui on 2016/3/24.
 */
public class XMLHandlerService {
    private XMLConfiguration xmlConf;
    public XMLHandlerService(String xmlpath) throws ConfigurationException {
        xmlConf = new XMLConfiguration(xmlpath);
    }

    public Map<Integer, Teacher> getTeachers() {
        Map<Integer, Teacher> teachers = new HashMap<Integer, Teacher>();
        List ids = xmlConf.getList("Teachers.Teacher.id");
        List names = xmlConf.getList("Teachers.Teacher.name");
        for(int i = 0; i < ids.size(); i++) {
            Teacher t = new Teacher();
            t.setId(Integer.parseInt(ids.get(i).toString()));
            t.setName(names.get(i).toString());
            teachers.put(t.getId(), t);
        }
        return teachers;
    }

    public Map<Integer, Student> getStudents() {
        Map<Integer, Student> students = new HashMap<Integer, Student>();
        List ids = xmlConf.getList("Students.Student.id");
        List names = xmlConf.getList("Students.Student.name");
        for(int i = 0; i < ids.size(); i++) {
            Student s = new Student();
            s.setId(Integer.parseInt(ids.get(i).toString()));
            s.setName(names.get(i).toString());
            students.put(s.getId(), s);
        }
        return students;
    }

    public Map<Integer, Course> getCourses() {
        Map<Integer, Course> courses = new HashMap<Integer, Course>();
        List ids = xmlConf.getList("Courses.Course.id");
        List names = xmlConf.getList("Courses.Course.name");
        for(int i = 0; i < ids.size(); i++) {
            Course c = new Course();
            c.setId(Integer.parseInt(ids.get(i).toString()));
            c.setName(names.get(i).toString());
            courses.put(c.getId(), c);
        }
        return courses;

    }

    public List<TechCourse> getTechCourses(Map<Integer, Teacher> teachers, Map<Integer, Course> courses) {
        List<TechCourse> techCourses = new ArrayList<TechCourse>();
        List tIds = xmlConf.getList("TechCourses.TechCourse.TeacherId");
        List cIds = xmlConf.getList("TechCourses.TechCourse.CourseId");
        for (int i = 0; i < tIds.size(); i++) {
            TechCourse techCourse = new TechCourse();
            techCourse.setTeacher(teachers.get(Integer.parseInt(tIds.get(i).toString())));
            techCourse.setCourse(courses.get(Integer.parseInt(cIds.get(i).toString())));
            techCourses.add(techCourse);
        }
        return techCourses;
    }

    public List<Score> getScores(Map<Integer, Course> courses, Map<Integer, Student> students) {
        List<Score> scores = new ArrayList<Score>();
        List cIds = xmlConf.getList("Scores.Score.CourseId");
        List sIds = xmlConf.getList("Scores.Score.StudentId");
        List scoreNumbers = xmlConf.getList("Scores.Score.Score");
        for (int i = 0; i < cIds.size(); i++) {
            Score score = new Score();
            score.setCourse(courses.get(Integer.parseInt(cIds.get(i).toString())));
            score.setStudent(students.get(Integer.parseInt(sIds.get(i).toString())));
            score.setScore(Float.parseFloat(scoreNumbers.get(i).toString()));
            scores.add(score);
        }
        return scores;
    }
}
