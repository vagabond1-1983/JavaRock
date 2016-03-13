package com.test.basic.string;

/**
 * Created by beigui on 2016/3/12.
 * 功能：把字符串倒序输出。比方："abcdefg" --> "gfedcba"
 */
public class ReverseString {
    public static void main(String[] args) {
        String testString = "abcdefg";

        System.out.println("倒序输出结果为：");
        for (int i = testString.length() - 1; i >= 0; i--) {
            System.out.print(testString.charAt(i));
        }


        //第二种方法：不用charAt方法
        char[] charArray = testString.toCharArray();
        System.out.println();
        System.out.println("倒序输出结果为：");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
