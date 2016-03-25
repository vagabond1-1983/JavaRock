package com.test.basic.chapter6;

/**
 * Created by beigui on 2016/2/17.
 * 功能：简单处理异常
 */
public class HandleException {
    public static void main(String[] args) {
        int x = 100;
        int y = 0;
        int z = 0;
        try {
            z = x / y;
            System.out.println(x + "除以" + y + "的商是：" + z);
        } catch (Exception e) {
            e.printStackTrace();//输出异常到标准错误流
            //使用getMessage()方法输出异常信息
            System.out.println("getMessage方法：" + e.getMessage());
        }
//        File f = new File("sss");
//        f.createNewFile();
    }
}
