# javaDemo

# 最近我在写接口测试的内容，感兴趣的可以[移步](https://github.com/vagabond1-1983/API-Testing)

项目为java demos，javase的基础demo
- 第一章：Java语言概述
	- [java环境准备](https://github.com/vagabond1-1983/javaDemo/issues/2)	
	- 例1：[Hello World](src/main/java/com/test/basic/chapter1/HelloWorld.java) -- java开始之旅
	- [Hello World运行过程.md](src/main/java/com/test/basic/chapter1/HelloWorld运行过程.md)
- 第二章：基本语法
	- 例1：[BasicDataTypes](src/main/java/com/test/basic/chapter2/BasicDataTypes.java) -- 基本数据类型举例(int, boolean, char)
	- 例2：[Parameter](src/main/java/com/test/basic/chapter2/Parameter.java) -- 定义变量、初始化、赋值(初始化)
	- 例3：[MathOperators](src/main/java/com/test/basic/chapter2/MathOperators.java) -- 运算符，着重算术运算符和优先级的掌握(++/--，优先级)
	- 例4：[RelationOperators](src/main/java/com/test/basic/chapter2/RelationOperators.java) -- 运算符，着重关系运算符的掌握(==/>/<)
	- 例5：[LogicalOperators](src/main/java/com/test/basic/chapter2/LogicalOperators.java) -- 运算符，着重逻辑运算符的掌握(&&/||/!，与或非)
	- 作业：[Homework_operator](src/main/java/com/test/basic/chapter2/Homework_operator.java)
- 第三章：流程控制
    - 例1：[IfDemo](src/main/java/com/test/basic/chapter3/IfDemo.java) -- if分支(if/else)
    - 例2：[SwitchDemo](src/main/java/com/test/basic/chapter3/SwitchDemo.java) -- switch分支(switch/case)
    - 例3：[ForDemo](src/main/java/com/test/basic/chapter3/ForDemo.java) -- for循环(for)
    - 例4：[WhileDemo](src/main/java/com/test/basic/chapter3/WhileDemo.java) -- while循环(while/do.while)
    - 例5：[SkipDemo](src/main/java/com/test/basic/chapter3/SkipDemo.java) -- break continue return 跳转语句
- 数组和字符串
    - [array/ArrayDemo](src/main/java/com/test/basic/array/ArrayDemo.java) -- 数组 初始化、遍历、工具类
    - [GetSecondMaxNum](src/main/java/com/test/basic/array/GetSecondMaxNum.java) -- 获取数组中的次大数
    - [BubbleSort](src/main/java/com/test/basic/array/BubbleSort.java) -- 冒泡排序(分析，思路，步骤，代码)
    - 作业：
        - 记住两个编程题，再加上选择排序的程序。可参考 http://blog.csdn.net/protommy/article/details/5124490
        - 给定一个数组62,53,41,84,77,55，输出平均值、最大值、最小值、中位数
    - [string/StringDemo](src/main/java/com/test/basic/string/StringDemo.java) -- 字符串
    - 随堂：把字符串倒序输出。比方："abcdefg" --> "gfedcba"
    - 自学StringBuffer和StringBuilder
- 第四章：类和对象
    - 例1：[ClassDemo](src/main/java/com/test/basic/chapter4/classDemo/ClassDemo.java) -- 类和对象的概念
    - 例2：[PropertyDemo](src/main/java/com/test/basic/chapter4/classDemo/PropertyDemo.java) -- 成员变量
    - 例3：[MethodDemo](src/main/java/com/test/basic/chapter4/methodDemo/MethodDemo.java) -- 成员方法
    - 作业：设计一个计算机类，要求如下：
           - 属性：品 牌、颜色、cpu、内存容量、价格、工作状态
           - 方法：打开、关闭、休眠
           - 创建一个计算机对象，调用打开、关闭方法。
           -- 打开时显示品牌、颜色、cpu、内存容量、价格、工作状态为正常；
           -- 关闭时，显示工作状态为停止；
           -- 休眠时，显示工作状态为睡眠。
    - 例4：[Constructor](src/main/java/com/test/basic/chapter4/constructorDemo/ConstructorDemo.java) -- 构造函数
    - 例5：[ThisDemo](src/main/java/com/test/basic/chapter4/thisDemo/ThisDemo.java) -- this在类中的使用
    - 例6：[StaticDemo](src/main/java/com/test/basic/chapter4/staticDemo/StaticDemo.java) -- static静态变量、静态方法
    - 三大特性：封装、继承、多态
    - 解释包：包就是package...，作用：区别相同名字的类，当类很多时更好的管理类，控制访问范围
        命令规范：com.company.app
    - 例7：[PackageIdentity](src/main/java/com/test/basic/chapter4/packageDemo/PackageIdentity.java) -- 封装，访问控制符(public,private)
    - 继承 - 目的就是代码复用，更符合人的思维习惯
    - 例8：[extendsDemo/PersonsMain](src/main/java/com/test/basic/chapter4/extendsDemo/PersonsMain.java) -- 小学生继承自人，构造函数的继承及引用方式
    - 方法重载和重写
    - 例9：[overloadVSoverride/OverloadDemo](src/main/java/com/test/basic/chapter4/overloadVSoverride/OverloadDemo.java) -- 重载
    - 例10：[overloadVSoverride/OverrideDemo](src/main/java/com/test/basic/chapter4/overloadVSoverride/OverrideDemo.java) -- 重写
    - 多态
    - 例11：[multiStatus/MultiStatusDemo](src/main/java/com/test/basic/chapter4/multiStatus/MultiStatusDemo.java) -- 多态，处理问题的方式
    - 抽象类和接口
    - 例12：[abstractDemo/AbstractDemo](src/main/java/com/test/basic/chapter4/abstractDemo/AbstractDemo.java) -- 抽象类，关键字 abstract
    - 作业：
        - 定义一个图形父类abstract Shape，包含求面积的方法getArea()，扩展子类：圆Circle、矩形Square、三角形Triangle，分别重写求面积方法。
        - 用户可以选择输入某一个多边形(圆、矩形、三角形)，输入数据后，求出这个多边形的面积
        - 注意：因为不同的多边形求面积所用的参数不一样，所以当用户选择一个多边形时，用户需要输入的参数个数也不一样
    - 接口概念：[https://github.com/vagabond1-1983/blog/issues/31](https://github.com/vagabond1-1983/blog/issues/31)
    - 例13：[interfaceDemo/InterfaceDemo](src/main/java/com/test/basic/chapter4/interfaceDemo/InterfaceDemo.java) -- 接口
        - 定义一个图形接口ShapeService，包含画图方法draw()，要求圆Circle和三角形Triangle能实现draw()，打印出各自的draw。system.out
        - 讨论：抽象类作业中的getArea()是从属于一个接口好，还是抽象类更好？
- 第五章：集合
    - 集合 vs 数组：数组的长度是固定的，集合的长度是可变的
    - 常用的集合有List集合、Set集合、Map集合，其中List与Set实现了Collection接口
    - 继承关系参见[Collection.md](src/main/java/com/test/basic/chapter5/Collection.md)
    - [SetDemo](src/main/java/com/test/basic/chapter5/SetDemo.java) --介绍HashSet的使用方式，更多内容在API文档
    - [ListDemo](src/main/java/com/test/basic/chapter5/ListDemo.java) --介绍ArrayList的使用方式，更多内容在API文档
    - [MapDemo](src/main/java/com/test/basic/chapter5/MapDemo2.java) -- 介绍HashMap的使用方式，更多内容在API文档
- 第六章：异常
    - 异常概念说明：[Exception.md](src/main/java/com/test/basic/chapter6/Exception.md)
    - 例1：[WhatsException](src/main/java/com/test/basic/chapter6/WhatsException.java) -- 什么是异常
    - 例2：[HandleException](src/main/java/com/test/basic/chapter6/HandleException.java) -- 简单处理异常(try/catch)
- 第七章：文件读写
    - 流的概念[Stream.md](src/main/java/com/test/basic/chapter7/Stream.md)
    - 例1：[FileDemo](src/main/java/com/test/basic/chapter7/FileDemo.java) -- 文件的基本操作
    - 例2：[FileReadWriteStreamDemo](src/main/java/com/test/basic/chapter7/FileReadWriteStreamDemo.java) -- 文件写入和读取
    - 作业：将下面一段文字写入文件，(并从文件读出)，请用map转存即记录数据
            first=你好
            second=hello
            third=早上好
            fourth=晚上好
      下载安装好mysql数据库 , client - MYSQL-Front
    - 例3：[FileReaderWriterDemo](src/main/java/com/test/basic/chapter7/FileReaderWriterDemo.java) -- 文件写入和读取
    - 例4：[BufferedStreamDemo](src/main/java/com/test/basic/chapter7/BufferedStreamDemo.java) -- 文件写入和读取 + 缓冲区
    - 例5：[BufferedReaderWriterDemo](src/main/java/com/test/basic/chapter7/BufferedReaderWriterDemo.java) -- 文件写入和读取 + 缓冲区
    - [字符流和字节流的区别、使用场景](https://github.com/vagabond1-1983/javaDemo/issues/24) -- 转自别人的文章。因为io提供的类很多，在什么场景用哪个合适，需要经验的积累。
        咱们主要关注于文件的读写，用字节流会更方便些。

- 第八章：JDBC连接数据库
    - JDBC制定了统一的访问各类关系数据库的标准接口，为各个数据库厂商提供了标准接口的实现。
    - [JDBC 概念和用法简介](src/main/java/com/test/basic/chapter8/JDBC.md)
    - 例1：[MySQLQueryDemo](src/main/java/com/test/basic/chapter8/MySQLQueryDemo.java) -- 查询数据
    - 例2：[MySQLInsertDemo](src/main/java/com/test/basic/chapter8/MySQLInsertDemo.java) -- 插入数据
    - 例3：[MySQLUpdateDemo](src/main/java/com/test/basic/chapter8/MySQLUpdateDemo.java) -- 更新数据
    - 例4：[DBDemo](src/main/java/com/test/basic/chapter8/DBDemo.java) -- 利用工具类，简化JDBC写法

- 停一停，巩固下：
    - HelloWorld
        控制台打印Hello World!
        Hello.java -> javac Hello.class 编译 -> java Hello 解释
    - Array(String数组初始化+遍历)：aa,bb,cc,dd
        把aa,bb,cc,dd写入到一个String数组中，并打印
    - String(把字符串"I like java"反转，输出结果为"java like I")
    - 多态(主人喂小狗吃骨头)
        主人Master，feed(Animal a, Food f) {a.eat(); f.showName();}
    - HashMap(统计词频“I work at A company. Apply java in test area. I thought test work very good.”，统计出每个词出现次数)
        这样一串话：I work at A company. Apply java in test area. I thought test work very good. 统计每个词出现的次数
    - BufferFileReader
        读出文件 d:\test\work.txt 中的内容
    - MySQLQuery(查询users表所有数据并打印)
        查询表中数据封装成User对象后打印



- [模拟课程管理系统项目中一个功能模块-录入学生成绩](Practice.md)
     - 这个项目代码接受程度会有不同，主要是跨度大了一些。可能先写一个简单的过程式结构，再过渡到面向对象的写法。会
     更容易接受一些。
     - 另外，在面向对象、集合、文件、数据库的作业中，应该把模拟项目中的一些知识点放进去，然后在结合到一起写出这个
     项目代码，这样的循序渐进的过程，接受度会再升高的。
     - 应该采取更好的方式，鼓励做演示练习，可以增加些物质鼓励。


~~- 作业：对[数据](src/main/resources/WarePrice.xml)录入到数据库后，查询出各商品卖出的总金额~~
- 更新作业：对[数据](src/main/resources/WareSalesSystemInfo.xml)录入到数据库后，查询出各商品卖出的总金额

- 附：
    - Intellij IDEA详细使用说明参见另一个工程[intellij-idea-tutorial](https://github.com/vagabond1-1983/IntelliJ-IDEA-Tutorial)
    - [IDEA 常用快捷键](https://github.com/vagabond1-1983/javaDemo/issues/22)
    - [代码规范](https://github.com/vagabond1-1983/javaDemo/issues/15)
    - 如何把项目导入到本地工程中 - download zip -> unzip -> open project folder
    - [Java API在线文档](http://tool.oschina.net/apidocs/apidoc?api=jdk-zh)，学会查文档
    - Java WIKI页，参见工程的WIKI tab页
