package com.test.basic.chapter4.overloadVSoverride;

/**
 * Created by beigui on 2016/2/9.
 * 功能：方法重载。编写方法，接收两个整数，返回较大的数。
 *                      接收两个浮点数，返回较大的数
 * 重载其实就是同一种功能的多种实现方式
 * 注意：
 *      1.方法名需要相同才是重载
 *      2.方法的参数类型、个数、顺序至少有一项不同
 *      3.只有方法的返回类型不同不能算是重载
 *      4.只有方法的修饰符不同不能算是重载
 */
public class OverloadDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        getMax(a, b);

        float c = 5f;
        float d = 10f;
        getMax(c, d);
    }

    private static void getMax(int firstNum, int lastNum) {
        if (firstNum > lastNum) {
            System.out.println("较大的数是" + firstNum);
        } else if (firstNum < lastNum) {
            System.out.println("较大的数是" + lastNum);
        } else {
            System.out.println("两个数相等");
        }
    }

    //只有方法的返回类型不同不能算是重载
//    private static int getMax(int firstNum, int lastNum) {return 1;}

    private static void getMax(float firstNum, float lastNum) {
        if (firstNum > lastNum) {
            System.out.println("较大的数是" + firstNum);
        } else if (firstNum < lastNum) {
            System.out.println("较大的数是" + lastNum);
        } else {
            System.out.println("两个数相等");
        }
    }

    //只有方法的修饰符不同不能算是重载
//    public static void getMax(float firstNum, float lastNum) {}
}
