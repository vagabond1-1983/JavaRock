- 3月19日作业
    - [求多边形面积]
    定义一个图形父类abstract Shape，包含求面积的方法getArea()，扩展子类：圆Circle、矩形Square、三角形Triangle，分别重写求面积方法。
    用户可以选择输入某一个多边形，输入数据后，求出这个多边形的面积
    - [1 mijuan](src/main/java/com/bt/xlt/homework0319/mijuan/MiJuanArea.java)
    - [2 xueguiyang](src/main/java/com/bt/xlt/homework0319/xueguiyang/XueguiyangTestShape.java) -- 构造函数的访问范围
    - [3 xiaoma](src/main/java/com/bt/xlt/homework0319/xiaoma/XiaomaTestDemo.java)
    - [4 lichangxing](src/main/java/com/bt/xlt/homework0319/lichangxing/LiChangxingTestShapeDemo.java) -- 用构造函数初始化属性值，会比可变长度的参数要好
    - [5 jiabin](src/main/java/com/bt/xlt/homework0319/jiabin/JiaBinShapeTest.java) -- 契合题意，更好使用构造函数初始化属性值
    - [6 lidongkun](src/main/java/com/bt/xlt/homework0319/lidongkun/ShapeArea.java) -- 不错
    - [7 weiyuxin](src/main/java/com/bt/xlt/homework0319/weiyuxin/WeiYuXinArea.java) -- 深入理解抽象类
    - [8 chencaiyu](src/main/java/com/bt/xlt/homework0319/chencaiyu/ChenCaiYu_Area.java)
    - [9 maxiaoyu](src/main/java/com/bt/xlt/homework0319/maxiaoyu/ClassDemo.java) -- 不错
    - [10 liwen](src/main/java/com/bt/xlt/homework0319/liwen/LiWenGetArea.java) -- 不错，题意理解正确，多态理解正确


    - 感悟：
        - 构造函数没有特殊情况，一般用public修饰
        - 永远不要相信用户输入，用语言规定好。
            比方说：不想别人访问的私有属性，一定要定义成私有的；
                  参数是整数的，不要定义为String
                  想要大于0的数或者对象访问，一定要判断之后再用
        - 我实现一遍这个作业

- 3月12日作业
    - [一：求值](https://github.com/vagabond1-1983/javaDemo/tree/dev/src/main/java/com/bt/xlt/homework0312/getValues)
    给定一个数组62,53,41,84,77,55，输出平均值、最大值、最小值、中位数
        - [1 jiabin](src/main/java/com/bt/xlt/homework0312/getValues/JiaBinCheckNum.java) -- 可参考
        - [2 xiaoma](src/main/java/com/bt/xlt/homework0312/getValues/XiaoMa.java) -- 规范、注意点
        - [3 xueguiyang](src/main/java/com/bt/xlt/homework0312/getValues/XueGuiYangCheckNum.java)
        - [4 weiyuxin](src/main/java/com/bt/xlt/homework0312/getValues/WeiYuXinGetValueTest.java) -- 变量声明问题
        - [5 lidongkun](src/main/java/com/bt/xlt/homework0312/getValues/LiDongKunArraysValues.java)
        - [6 maxYiaoyu](src/main/java/com/bt/xlt/homework0312/getValues/MaXiaoYuArrayFind.java) -- 代码规范好，简单化问题
        - [7 lichangxing](src/main/java/com/bt/xlt/homework0312/getValues/LiChangxingArraryCompare.java) -- 中位数的理解问题，也是对需求的理解
        - [8 liwen](src/main/java/com/bt/xlt/homework0312/getValues/LiWenArrayOperate.java)
        - [9 fangweili](src/main/java/com/bt/xlt/homework0312/getValues/FangWeiLiArrayOperation.java) -- 给定数组为随机数组，好的测试方法
        - [10 chencaiyu](src/main/java/com/bt/xlt/homework0312/getValues/ChenCaiYu_Evaluate.java)
        - [11 qizhi](src/main/java/com/bt/xlt/homework0312/getValues/QiZhiArrayOperate.java) -- 能考虑到数据个数为1的特殊情况，增加了程序的健壮性
        - [12 wangxiaojia](src/main/java/com/bt/xlt/homework0312/getValues/WangXiaoJiaGetValues.java)
        - [13 zhaojie](src/main/java/com/bt/xlt/homework0312/getValues/ZhaoJieArray.java)
        - [14 fangxu](src/main/java/com/bt/xlt/homework0312/getValues/Fangxu_array.java)


    - [二：计算机类](https://github.com/vagabond1-1983/javaDemo/tree/dev/src/main/java/com/bt/xlt/homework0312/computer)
    设计一个计算机类，要求如下：
        -- 属性：品 牌、颜色、cpu、内存容量、价格、工作状态
        -- 方法：打开、关闭、休眠
        -- 创建一个计算机对象，调用打开、关闭方法。
        -- 打开时显示品牌、颜色、cpu、内存容量、价格、工作状态为正常；
        -- 关闭时，显示工作状态为停止；
        -- 休眠时，显示工作状态为睡眠。
        - [1 jiabin](src/main/java/com/bt/xlt/homework0312/computer/JiaBinComputerTest.java)
        - [2 xiaoma](src/main/java/com/bt/xlt/homework0312/computer/XiaoMaComputerTest.java) -- 规范、注意点
        - [3 xueguiyang](src/main/java/com/bt/xlt/homework0312/computer/XueGuiYangComputerTest.java) -- 变量第一个字母小写
        - [4 weiyuxin](src/main/java/com/bt/xlt/homework0312/computer/WeiYuXinComputerDemo.java) -- 对this的使用不错
        - [5 lidongkun](src/main/java/com/bt/xlt/homework0312/computer/LiDongKunComputerState.java) -- 带参数的构造函数
        - [6 maxiaoyu](src/main/java/com/bt/xlt/homework0312/computer/MaXiaoYuClassDemo.java) -- 方法名第一个字母小写
        - [7 lichangxing](src/main/java/com/bt/xlt/homework0312/computer/LichangxingComputerDemo.java)
        - [8 liwen](src/main/java/com/bt/xlt/homework0312/computer/LiWenComputerTest.java)
        - [9 fangweili](src/main/java/com/bt/xlt/homework0312/computer/FangWeiLiComputerObject.java) -- 编程技巧之封装
        - [10 chencaiyu](src/main/java/com/bt/xlt/homework0312/computer/ChenCaiYuComputer.java) -- 让构造函数发挥更大作用
        - [11 qizhi](src/main/java/com/bt/xlt/homework0312/computer/QiZhiComputerTest.java) -- super的作用，无参数构造函数需不需要写，StringBuffer的作用及使用场景
        - [12 wangxiaojia](src/main/java/com/bt/xlt/homework0312/computer/WangXiaoJiaComputer.java)
        - [13 zhaojie](src/main/java/com/bt/xlt/homework0312/computer/ZhaoJieComputer.java)
        - [14 fangxu](src/main/java/com/bt/xlt/homework0312/computer/Fangxu_MyComputer.java) -- 能想到与用户互动，不错

    - 感悟：
        - 代码规范，还是要注意，包括文件名、变量名、方法名、语义等简单规范。
        - 理解题意最重要，既然是一个程序，做一次排序就好。不要自己想的太复杂，化繁为简是能力
        - 在定义变量类型时，要推敲。好的类型会让你程序更轻松，坏的类型会让你抓狂。不要把变量都定义为String，它不是万能的。
        - 作业涉及多个java文件，打包给我即可


- [3月5日作业](https://github.com/vagabond1-1983/javaDemo/tree/dev/src/main/java/com/bt/xlt/homework0305)
    请编写一个程序，接收用户输入的三个数，判断是否可以组成三角形（两条边相加大于第三条边）。
    - [1 mijuan](src/main/java/com/bt/xlt/homework0305/MiJuanHomeworkOperator.java) -- 代码规范
    - [2 jiabin](src/main/java/com/bt/xlt/homework0305/JiaBinPanDuanSanJiaoXing.java) -- System.in
    - [3 xiaoma](src/main/java/com/bt/xlt/homework0305/XiaoMa.java)
    - [4 lichangxin](src/main/java/com/bt/xlt/homework0305/LiChangXin.java)
    - [5 xueguiyang](src/main/java/com/bt/xlt/homework0305/XueGuiYang.java) -- 能考虑到三角形的边长可以是非整数，很好
    - [6 jiyaping](src/main/java/com/bt/xlt/homework0305/JiYaPingHomework_operator.java) -- [逻辑与和按位与](https://github.com/vagabond1-1983/javaDemo/issues/9)
    - [7 qizhi](src/main/java/com/bt/xlt/homework0305/QiZhiTriangle.java)
    - [8 maxiaoyu](src/main/java/com/bt/xlt/homework0305/MaXiaoYu.java) -- 不同的思路，分享下
    - [9 lidongkun](src/main/java/com/bt/xlt/homework0305/LiDongKunHomework_operator.java)
    - [10 liwen](src/main/java/com/bt/xlt/homework0305/LiWenHomework_operator.java)
    - [11 weiyuxin](src/main/java/com/bt/xlt/homework0305/WeiYuXinHomeWorkTest.java) -- else if
    - [12 wangxiaojia](src/main/java/com/bt/xlt/homework0305/WangXiaoJia.java)
    - [13 chencaiyu](src/main/java/com/bt/xlt/homework0305/ChenCaiYu.java)
    - [14 fangweili](src/main/java/com/bt/xlt/homework0305/FangWeiLi.java)
    - [15 jichenguang](src/main/java/com/bt/xlt/homework0305/JiChenGuang.java)
    - [16 fangxu](src/main/java/com/bt/xlt/homework0305/FangXu.java)
    - [17 zhaojie](src/main/java/com/bt/xlt/homework0305/ZhaoJieCheckTriangle.java) -- 不错
    - [18 guoleiming](src/main/java/com/bt/xlt/homework0305/GuoLeiMing.java)

    - 注意点
        - 代码规范
            - 文件名使用姓名做文件名前缀，这样容易区分。比方MaXiaoYu_Homework_Operator
                在自己写某一个java文件时，用功能起名。比方Triangle.java，不要用汉语拼音SanJiaoXing。
            - 类开头有一段注释以/**开始，里面必须有作者信息和创建时间
            - 大括号用法
            - 赋值语句写法 int a = b; 中间空格不可少，这样别人在看的时候更清晰
            - 判断语句写法 if (true) {}   if后面加一个空格
            - 代码缩进是一个tab
         - 编码格式
            - 会有同学发过来后是乱码的情况，请确认下项目的编码格式为UTF-8
         - 作业存放位置
            - 地址在 [https://github.com/vagabond1-1983/javaDemo/tree/dev/src/main/java/com/bt/xlt/](https://github.com/vagabond1-1983/javaDemo/tree/dev/src/main/java/com/bt/xlt/)下面会有每期的作业文件夹
            - 作业邮件发我邮箱
         - TODO待办项
            - 作业我都会看，有的会有TODO这个待办项。大家可以自行练习。
         - Issue
            - 有任何问题可以在群里说，更好的话可以记录在issue中。大家都能看到并且随时回顾。
            - 有些课上没解决的，或者是比较重要的概念。我都记录在[issue](https://github.com/vagabond1-1983/javaDemo/issues)里面了。大家可以在下面评论，确认下是否理解了。
