package com.bt.xlt.homework0312.computer;

/**
 * Created by FangWeiLi on 2016/3/16.
 */
public class FangWeiLiComputerObject {
    public static void main(String[] args) {
        FangWeiLiComputer computer = new FangWeiLiComputer("联想","黑色","因特尔",4,1346,"正常运行");
        //调用打开方法
        computer.Open(computer);
        computer.Close(computer);
        computer.Sleep(computer);
    }
}
