package com.test.project.courseManagementSystem;


import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

import java.util.List;

/**
 * Created by beigui on 2016/3/17.
 * 选择了apache的一个都配置文件的工具，通过官网的例子，写出一个实例
 * https://commons.apache.org/proper/commons-configuration/userguide_v1.10/howto_xml.html#Accessing_properties_in_hierarchical_configurations
 * try
 * {
 *  XMLConfiguration config = new XMLConfiguration("tables.xml");
 *  // do something with config
 *  }
 *  catch(ConfigurationException cex)
 *  {
 *  // something went wrong, e.g. the file was not found
 *  }
 *
 *  String backColor = config.getString("colors.background");
 *  String textColor = config.getString("colors.text");
 *  String linkNormal = config.getString("colors.link[@normal]");
 *  String defColor = config.getString("colors.default");
 *  int rowsPerPage = config.getInt("rowsPerPage");
 *  List<Object> buttons = config.getList("buttons.name");
 *
 *  实验时，不加载common collection包，会报错。看异常信息解决
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
