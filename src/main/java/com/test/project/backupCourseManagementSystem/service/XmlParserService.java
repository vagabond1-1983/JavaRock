package com.test.project.backupCourseManagementSystem.service;

import com.test.project.backupCourseManagementSystem.domain.*;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by beigui on 2016/4/6.
 */
public class XmlParserService {
    private String xmlPath;
    private XMLConfiguration config = null;

    public XmlParserService(String xmlPath) throws ConfigurationException {
        this.xmlPath = xmlPath;
        config = new XMLConfiguration(xmlPath);
    }

    public Map<Integer, Teacher> getTeachers(String keyPrefix) {
        Map<Integer, Teacher> teachers = new HashMap<Integer, Teacher>();
        List<Object> ids = config.getList(keyPrefix + ".id");
        List<Object> names = config.getList(keyPrefix + ".name");
        int i = 0;
        for (; i < ids.size(); i++) {
            Teacher t = new Teacher();
            t.setId(Integer.parseInt(ids.get(i).toString()));
            t.setName(names.get(i).toString());
            teachers.put(t.getId(), t);
        }
        return teachers;
    }

    public Map<Integer, Student> getStudents(String keyPrefix) {
        Map<Integer, Student> students = new HashMap<Integer, Student>();
        List<Object> ids = config.getList(keyPrefix + ".id");
        List<Object> names = config.getList(keyPrefix + ".name");
        int i = 0;
        for (; i < ids.size(); i++) {
            Student s = new Student();
            s.setId(Integer.parseInt(ids.get(i).toString()));
            s.setName(names.get(i).toString());
            students.put(s.getId(), s);
        }
        return students;
    }

    public Map<Integer, Course> getCourses(String keyPrefix) {
        Map<Integer, Course> courses = new HashMap<Integer, Course>();
        List<Object> ids = config.getList(keyPrefix + ".id");
        List<Object> names = config.getList(keyPrefix + ".name");
        int i = 0;
        for (; i < ids.size(); i++) {
            Course c = new Course();
            c.setId(Integer.parseInt(ids.get(i).toString()));
            c.setName(names.get(i).toString());
            courses.put(c.getId(), c);
        }
        return courses;
    }

    public List<TechCourse> getTechCourses(String keyPrefix, Map<Integer, Teacher> teachers, Map<Integer, Course> courses) {
        List<TechCourse> techCourses = new ArrayList<TechCourse>();
        List<Object> techIds = config.getList(keyPrefix + ".TeacherId");
        List<Object> courseIds = config.getList(keyPrefix + ".CourseId");
        int i = 0;
        for (; i < techIds.size(); i++) {
            TechCourse techCourse = new TechCourse();
            techCourse.setTeacher(teachers.get(Integer.parseInt(techIds.get(i).toString())));
            techCourse.setCourse(courses.get(Integer.parseInt(courseIds.get(i).toString())));
            techCourses.add(techCourse);
        }
        return techCourses;
    }

    public List<Score> getScore(String keyPrefix, Map<Integer, Student> students, Map<Integer, Course> courses) {
        List<Score> scoreList = new ArrayList<Score>();
        List<Object> stuIds = config.getList(keyPrefix + ".StudentId");
        List<Object> courseIds = config.getList(keyPrefix + ".CourseId");
        List<Object> scores = config.getList(keyPrefix + ".Score");
        int i = 0;
        for (; i < stuIds.size(); i++) {
            Score score = new Score();
            score.setStudent(students.get(Integer.parseInt(stuIds.get(i).toString())));
            score.setCourse(courses.get(Integer.parseInt(courseIds.get(i).toString())));
            score.setScore(Float.parseFloat(scores.get(i).toString()));
            scoreList.add(score);
        }
        return scoreList;
    }

}
