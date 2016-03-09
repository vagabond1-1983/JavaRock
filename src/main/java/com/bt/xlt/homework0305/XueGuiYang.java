package com.bt.xlt.homework0305;

/**
 * Reviewer: beigui
 * Review Date: 2016/3/6
 * Comments: 用了不同的用户输入方式，能考虑到三角形的边长可以是非整数，很好
 *           TODO 请注意写代码的规范，提交作业的正式版本中去掉todo，因为todo意味着你有未完成的东西，不符合规范
 */

import java.util.Scanner;

public class XueGuiYang {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double a=in.nextDouble();//这是输入a
		double b=in.nextDouble();
		double c=in.nextDouble();
        if (a+b>c&&a+c>b&&b+c>a) {
            System.out.println("这是个三角形");      
        } else {
            System.out.println("这不是个三角形");
        }
	}


	}