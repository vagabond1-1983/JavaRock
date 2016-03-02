在程序开发过程中，可能存在各种错误，有些错误是可以避免的，而有些错误却是意想不到的，在Java中把这些可能发生的错误称为异常。
                                    Throwable
                                    |     |
                                    |     |
              ______________________|     |___________________
              |                                               |
              |                                               |
              |                                               |
            Error                                         Exception
            | | |                                         | |   | | |___________________
      ______| | |________                       __________| |   | |____________         |
      |       |         |                       |           |   |             |         |
      |       |         |                       |           |   |             |         |
  AWTError    |     IOError             IOException         |   |     RuntimeException NullPointerException
        other subclass                              SQLException|
                                                                |
                                                            other subclass
                    图：异常类的继承关系图
说明：Throwable类是所有异常类的超类，该类的两个直接子类是Error和Exception
      Error及其子类用于指示合理的应用程序不应该视图捕获的严重问题
      Exception及其子类给出了合理的应用程序需要捕获的异常
      
面试可能会问熟悉的异常类型，下面列举几个常见的异常类型
IOException：读写异常，常出现在文件读写等
SQLException：数据库异常，常出现在数据库操作中
RuntimeException：运行时异常，许多异常的父类，任何地方都可能出现
NullPointerException：空指针异常，常出现在对象为空却想访问对象内部
