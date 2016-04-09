package com.test.basic.practice.multiStatus;

/**
 * Created by beigui on 2016/4/9.
 */
public class M {
    public void feed (Animal animal ,Food food) {
    System.out.println("主人喂");
    animal.eat();
    food.showname();
}
}