package com.test.basic.chapter5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by beigui on 2016/3/26.
 * 功能：简单介绍HashMap的使用
 * 向一个Map集合中插入元素并根据key的值打印集合中的元素
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("java", "java编程思想");
        dictionary.put("c", "c语言");
        dictionary.put("shell", "Shell编程");

        System.out.println(dictionary.get("java"));

        for (String value : dictionary.values()) {
            System.out.println("书籍为:" + value);
        }

        Set<String> keys = dictionary.keySet();
        for (String key : keys) {
            System.out.println("书籍代号为：" + key + ", 书籍名称为：" + dictionary.get(key));
        }
    }
}
