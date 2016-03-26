package com.test.basic.chapter5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by beigui on 2016/2/15.
 * 功能：简单介绍HashMap的使用
 * 向一个Map集合中插入元素并根据key的值打印集合中的元素
 */
@Deprecated
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        //key 是1,2,3，给人一个错觉，好像key是下标一样。不恰当的例子。请看MapDemo2
        map.put("1", "apple");
        map.put("2", "pear");
        map.put("3", "orange");
        System.out.println("for cycle:");
        for (int i = 1; i < map.size() + 1; i++) {
            System.out.println("第" + i + "个元素是：" + map.get(i + ""));
        }

        System.out.println("============keySet======================");
        Set<String> set = map.keySet();
        for (String item : set) {
            System.out.println("key=" + item + ", value=" + map.get(item));
        }

        System.out.println("===============values====================");
        for (String value : map.values()) {
            System.out.println("value=" + value);
        }

        System.out.println("===============entrySet=====================");
        for (Map.Entry<String, String> item : map.entrySet()) {
            System.out.println("key=" + item.getKey() + ", value=" + item.getValue());
        }
    }
}
