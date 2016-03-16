package com.bt.xlt.homework0312.getValues;
import java.util.Arrays;
import java.lang.Math;

/**
 * Created by FangWeiLi on 2016/3/16.
 * Reviewer: beigui
 * Review Date: 2016/3/16
 * Comments: 扩展了需求，给定数组变成了随机数组，可以通过随机值，检验程序的健壮性。测试过程中经常用到此方法
 */
public class FangWeiLiArrayOperation {

    public static void main(String[] args) {
        float[] array = getRandomArray(6, (float) 100);
        for(int i=0;i<array.length;i++){
            System.out.println(i+1 + ":" + array[i]);
        }
        //输出平均值、最大值、最小值、中位数
        Arrays.sort(array);
        System.out.println("数组的最大值是：" + array[array.length-1]);
        System.out.println("数组的最小值是：" + array[0]);
        if (array.length % 2 == 0){
            float mid1 = array[array.length / 2 - 1];
            float mid2 = array[array.length / 2];
            System.out.println("数组长度为偶数，数组的中位数是：" + (mid1+mid2)/2);
        }else{
            float mid = array[(int)Math.ceil(array.length/2)];
            System.out.println("数组长度为奇数，数组的中位数是：" + mid);
        }
        float doSum = 0;
        int j = 0;
        do {
            doSum += array[j];
            j++;
        } while (j < array.length);
        float ave = doSum / array.length;
        System.out.println("数组的平均值是：" + ave);
    }

    //给定数组长度和最大值，随机获取数组
    private static float[] getRandomArray(int arrayLength, float maxNum){
        float[] array = new float[arrayLength];
        for(int i=0;i<array.length;i++){
            array[i] = (float) (Math.random()*maxNum);
        }
        return array;
    }

}
