# javaDemo

项目为java demos，javase的基础demo
- 第一章：Java语言概述
	- 例1：Hello World -- java开始之旅
	- [java环境准备](https://github.com/vagabond1-1983/javaDemo/issues/2)
- 第二章：基本语法
	- 例1：BasicDataTypes -- 基本数据类型举例(int, boolean, char)
	- 例2：Parameter -- 定义变量、初始化、赋值(初始化)
	- 例3：MathOperators -- 运算符，着重算术运算符和优先级的掌握(++/--，优先级)
	- 例4：RelationOperators -- 运算符，着重关系运算符的掌握(==/>/<)
	- 例5：LogicalOperators -- 运算符，着重逻辑运算符的掌握(&&/||/!，与或非)
	- 作业：Homework_operator
- 第三章：流程控制
    - 例1：IfDemo -- if分支(if/else)
    - 例2：SwitchDemo -- switch分支(switch/case)
    - 例3：ForDemo -- for循环(for)
    - 例4：WhileDemo -- while循环(while/do.while)
- 数组和字符串
    - array/ArrayDemo -- 数组 初始化、遍历、工具类
    - string/StringDemo -- 字符串
    - 随堂：把字符串倒序输出。比方："abcdefg" --> "gfedcba"
    - 自学StringBuffer和StringBuilder
- 第四章：类和对象
    - 例1：ClassDemo -- 类和对象的概念
    - 例2：PropertyDemo -- 成员变量
    - 例3：MethodDemo -- 成员方法
    - 随堂：设计一个计算机类，要求如下：
            属性：品 牌、颜色、cpu、内存容量、价格、工作状态
            方法：打开、关闭、休眠
           创建一个计算机对象，调用打开、关闭方法。
    - 例4：Constructor -- 构造函数
    - 例5：ThisDemo -- this在类中的使用
    - 例6：StaticDemo -- static静态变量、静态方法
    - 三大特性：封装、继承、多态
    - 例7：PackageIdentity -- 封装，访问控制符(public,private)
    - 解释包：包就是package...，作用：区别相同名字的类，当类很多时更好的管理类，控制访问范围
        命令规范：com.company.app
    - 继承 - 目的就是代码复用，更符合人的思维习惯
    - 例8：extendsDemo/PersonsMain -- 小学生继承自人
    - 方法重载和重写
    - 例9：overloadVSoverride/OverloadDemo -- 重载
    - 例10：overloadVSoverride/OverrideDemo -- 重写
    - 多态
    - 例11：multiStatus/MultiStatusDemo -- 多态，处理问题的方式
    - 作业：定义一个图形父类，包含求面积的方法，扩展子类圆、矩形、三角形等类，分别求面积。
    - 抽象类和接口
    - 例12：abstractDemo/AbstractDemo -- 抽象类，关键字 abstract
    - 接口概念：[https://github.com/vagabond1-1983/blog/issues/31](https://github.com/vagabond1-1983/blog/issues/31)
    - 例13：interfaceDemo/InterfaceDemo -- 接口
- 第五章：集合
    - 集合 vs 数组：数组的长度是固定的，集合的长度是可变的；数组用来存放基本类型的数据，集合用来存放对象的引用。
    - 常用的集合有List集合、Set集合、Map集合，其中List与Set实现了Collection接口
    - 继承关系参见[Collection.md](Collection.md)
    - ListDemo --介绍ArrayList的使用方式
    - MapDemo -- 介绍HashMap的使用方式
- 第六章：异常
    - 异常概念说明：[Exception.md](Exception.md)
    - 例1：WhatsException -- 什么是异常
    - 例2：HandleException -- 简单处理异常(try/catch)
- 第七章：文件读写
- 第八章：JDBC连接数据库
