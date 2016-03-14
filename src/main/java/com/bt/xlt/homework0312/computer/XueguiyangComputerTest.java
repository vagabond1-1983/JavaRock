package homework;

import homework.XueguiyangCheckNum;

/**
 * Created by xueguiyang on 16-3-14.
 */
public class XueguiyangComputerTest {
    public static void main(String[] args) {
        XueguiyangComputer xct = new XueguiyangComputer ("lenovo","red","酷睿i5","128M",6666.66);
        System.out.println("---------------------------");
        xct.shutdown();
        xct.sleep();

    }

}