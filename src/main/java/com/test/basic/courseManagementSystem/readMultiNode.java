package com.test.basic.courseManagementSystem;


import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

import java.util.List;

/**
 * Created by beigui on 2016/3/17.
 */
public class readMultiNode {
    public static void main(String[] args) throws ConfigurationException {
        XMLConfiguration config = new XMLConfiguration("CourseManagementSystem.xml");
        List techIdList = config.getList("Teachers.Teacher.id");
        for (Object id : techIdList) {
            System.out.println(id);
        }
    }
}
