package com.test.courseManage.service;

import com.test.courseManage.domain.*;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by beigui on 2016/4/9.
 * 读取xml转为对象的服务
 */
public class XmlService {
    private XMLConfiguration config;
    public XmlService(String dataFile) throws ConfigurationException {
        config = new XMLConfiguration(dataFile);
    }

    public Map<Integer, Teacher> getTeachers(String prefix) {
        Map<Integer, Teacher> teachers = new HashMap<Integer, Teacher>();
        List ids = config.getList(prefix + "id");
        List names = config.getList(prefix + "name");
        int i = 0;
        for (; i < ids.size(); i++) {
            Teacher t = new Teacher(Integer.parseInt(ids.get(i).toString()), names.get(i).toString());
            teachers.put(t.getId(), t);
        }
        return teachers;
    }

    public Map<Integer, Student> getStudents(String prefix) {
        Map<Integer, Student> students = new HashMap<Integer, Student>();
        List ids = config.getList(prefix + "id");
        List names = config.getList(prefix + "name");
        for(int i = 0; i < ids.size(); i++) {
            Student s = new Student(Integer.parseInt(ids.get(i).toString()), names.get(i).toString());
            students.put(s.getId(), s);
        }
        return students;
    }

    public Map<Integer, Course> getCourses(String prefix) {
        Map<Integer, Course> courses = new HashMap<Integer, Course>();
        List ids = config.getList(prefix + "id");
        List names = config.getList(prefix + "name");
        for(int i = 0; i < ids.size(); i++) {
            Course c = new Course(Integer.parseInt(ids.get(i).toString()), names.get(i).toString());
            courses.put(c.getId(), c);
        }
        return courses;

    }

    public List<TeacherCourse> getTechCourse(String prefix, Map<Integer, Teacher> teachers, Map<Integer, Course> courses) {
        List<TeacherCourse> teacherCourses = new ArrayList<TeacherCourse>();
        List techIds = config.getList(prefix + "TeacherId");
        List courseIds = config.getList(prefix + "CourseId");
        int i = 0;
        for (; i < techIds.size(); i++) {
            TeacherCourse tc = new TeacherCourse();
            tc.setTeacher(teachers.get(Integer.parseInt(techIds.get(i).toString())));
            tc.setCourse(courses.get(Integer.parseInt(courseIds.get(i).toString())));
            teacherCourses.add(tc);
        }
        return teacherCourses;
    }

    public List<Score> getScores(String prefix
            , Map<Integer, Course> courses,
            Map<Integer, Student> students) {
        List<Score> scores = new ArrayList<Score>();
        List studentIds = config.getList(prefix + "StudentId");
        List courseIds = config.getList(prefix + "CourseId");
        List scoreList = config.getList(prefix + "Score");

        int i = 0;
        for (; i < studentIds.size(); i++) {
            Score s = new Score();
            s.setCourse(courses.get(Integer.parseInt(courseIds.get(i).toString())));
            s.setStudent(students.get(Integer.parseInt(studentIds.get(i).toString())));
            s.setScore(Float.parseFloat(scoreList.get(i).toString()));
            scores.add(s);
        }
        return scores;
    }
}
