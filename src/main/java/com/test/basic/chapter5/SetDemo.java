package com.test.basic.chapter5;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by beigui on 2016/3/15.
 * 功能：Set集合，动态、值不能重复
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("test");
        set.add("test");
        set.add("tset1");
        set.add("aaa");
        //不保证迭代顺序，比方字母排序，数字排序
        for (String item : set) {
            System.out.println(item);
        }
    }
}
