package com.test.basic.chapter4.multiStatus;

/**
 * Created by beigui on 2016/2/11.
 * 功能：主人类
 */
public class Master {
    //给某种动物喂相应的食物
    public void feed(Animal animal, Food food) {
        System.out.println("主人喂");
        animal.eat();
        food.showName();
    }
}
