package com.test.basic.chapter2;

/**
 * Created by beigui on 2016/1/28.
 * 功能：主要提示算术运算符：++、--
 * 注意：赋值操作和运算指令的顺序
 */
public class MathOperators {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("a = " + a);
        int b = a++;
        //a++ ==> a = a + 1
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("int b = a++ 可分解为 int b = a; \n\t\t\t\t\t a = a+1;");

        System.out.println("************************************************");
        int c = 10;
        System.out.println("c = " + c);
        int d = ++c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("int d = ++c 可分解为 c = c + 1; \n\t\t\t\t   int d = c;");

        //d-- ==> d = d - 1
        d--;
        System.out.println("d = " + d);


        //变态题
        System.out.println("****************变态题目，考优先级和运算符知识****************");
        int e = 100;
        int f = ++e + --e;
        System.out.println("f = " + f);
    }
}
