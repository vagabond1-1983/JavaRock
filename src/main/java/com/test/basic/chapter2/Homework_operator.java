package com.test.basic.chapter2;

import java.util.Scanner;

/**
 * Created by beigui on 2016/1/28.
 * 作业：
 * 请编写一个程序，接收用户输入的三个数，判断是否可以组成三角形（两条边相加大于第三条边）。
 */
public class Homework_operator {
    public static void main(String[] args) {
        //从控制台接受数据
        System.out.println("请输入任意组成三角形的值（以逗号隔开）：");
        Scanner input = new Scanner(System.in);
        String instr = input.nextLine();
        System.out.println("输入字符结束.");
        //比较数据
        String[] result = instr.split(",");
        Float[] strtoint = parse(result);

        if (strtoint.length > 3) {
            System.out.println("输入错误请重新输入：");
        } else {
            //输出是否可以组成三角形
            //a+b>c
            if ((strtoint[0] + strtoint[1] > strtoint[2]) |
                    //a+c>b
                    (strtoint[0] + strtoint[2] > strtoint[1]) |
                    //c+b>a
                    (strtoint[1] + strtoint[2] > strtoint[0])
                    ) {
                System.out.println("可以组成三角形！！");

            }else{
                System.out.println("不能可以组成三角形！！");
            }
        }
    }

    public static Float[] parse(String[] str) {
        int length = str.length;
        Float[] result = new Float[length];
        // 依次取得字符串中的每一个字符，并将其转化为数字，放进int数组中
        for (int i = 0; i < length; i++) {
            String c = str[i];
            result[i] = Float.parseFloat(c);
        }
        return result;
    }

}
