package com.bt.xlt.homework0319.lidongkun;

/**
 * Created by lidongkun on 2016/3/21.
 * Reviewer: beigui
 * Review Date: 2016/3/22
 */
public class ShapeArea {
    public static void main(String[] args) {
        int select = Integer.parseInt(args[0]);
        Master master = new Master();

      switch(select) {
            case 1:
               master.getAreas(new Circle());
                break;
            case 2:
                master.getAreas(new Triangle());
                break;
            case 3:
                master.getAreas(new Rectang());
                break;
            default:
                System.out.println("选择错误");
        }
    }
}
