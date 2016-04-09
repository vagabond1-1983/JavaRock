package com.test.basic.practice;

/**
 * Created by beigui on 2016/4/9.
 * @author fangweili
 */
public class ArrayDemo {
    public static void main(String[] args) {
        String string = "aa,bb,cc,dd";
        String[] array = string.split(",");

        String[] strings = new String[]{"aa","bb","cc","dd"};
        for (String item:array) {
            System.out.print(item + " ");
        }
    }
}
