package com.test.basic.chapter4.packageDemo;

/**
 * Created by beigui on 2016/2/5.
 * 功能：介绍封装特性
 *  访问控制修饰符
 *  java提供四种访问控制修饰符号控制方法和变量的访问权限
 *  1. 公开级别：public，对外公开，都可以访问
 *  2. 受保护级别：protected，对子类和同一个包中的类公开
 *  3. 默认级别：同一个包中的类公开
 *  4. 私有级别：private，只有类本身可以访问，不对外公开
 *
 */
public class PackageIdentity {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name); //public
        //protected、默认 -- 在其他的包下面，实例化Cat，看能访问几个变量
        //private -- 无法访问，需要封装成方法，才能访问。getter/setter
    }
}
