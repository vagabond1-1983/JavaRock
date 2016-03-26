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
        set.add("set1");
        set.add("aaa");
        set.add("bbb");
        //不保证迭代顺序，比方字母排序，数字排序
        for (String item : set) {
            System.out.println(item);
        }
//        Set<Person> pSet =  new HashSet<Person>();
//        Person p1 = new Person(1111111);
//        Person p2 = new Person(1111111);
//        pSet.add(p1);
//        pSet.add(p2);
//
//        for (Person item : pSet) {
//            System.out.println(item);
//        }
    }
}
