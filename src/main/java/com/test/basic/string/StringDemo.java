package com.test.basic.string;

/**
 * Created by beigui on 2016/2/13.
 * 功能：介绍字符串
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = new String("abc"); //初始化
        String str1 = "abc"; //初始化
        System.out.println("str == str1? 是否同一个对象：" + (str == str1));
        System.out.println("纯字符串比较：" + ("abc" == "abc"));
        System.out.println("对象str1和字符串比较：" + (str1 == "abc"));
        System.out.println("对象str和字符串比较：" + (str == "abc"));

        System.out.println("字符串长度：" + str.length());
        System.out.println("字符c在字符串str中的位置(下标)：" + str.indexOf("c"));
        System.out.println("字符串str第2个位置是什么字符：" + str.charAt(1));

        str = "   |" + str + "|   ";
        System.out.println("加上空格后的str：" + str);
        System.out.println("去除str两头的空格后：" + str.trim());
        System.out.println("把|都去除：" + str.replace("|", ""));
        System.out.println("str的内容与str1的内容是否相同：" + str1.equals(str.trim().replace("|", "")));

        String s = "abcd,efgh,dddj";
        String[] sArray = s.split(",");
        System.out.println(s + " 分割后结果：");
        for (String item : sArray) {
            System.out.println(item);
        }
    }
}
