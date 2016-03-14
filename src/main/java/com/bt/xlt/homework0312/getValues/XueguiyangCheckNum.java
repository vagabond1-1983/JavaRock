package homework;

import java.util.Arrays;

/**
 * Created by xueguiyang on 16-3-14.
 */
public class XueguiyangCheckNum {
    public static double average(double arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (sum / arr.length);
    }

    public static double Max(double arr[]) {
        double Max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
            }
        }
        return Max;
    }

    public static double Min(double arr[]) {
        double Min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Min > arr[i]) {
                Min = arr[i];
            }
        }
        return Min;
    }

    public static double Median(double arr[]) {
        if (arr.length % 2 == 0) {
            return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2;
        } else
            return arr[arr.length / 2];
    }

    public static void main(String[] args) {
        double arr[] = new double[]{62, 53, 41, 84, 77, 55};
        //必须使用Double,有的时候除不尽
        System.out.println("平均数为: " + (average(arr)));
        System.out.println("最大数为: " + Max(arr));
        System.out.println("最小数为: " + Min(arr));
        //System.out.println("中位数为: " + Median(arr));
        Arrays.sort(arr);//对数组从小到大进行排序
//        for (double item : arr) {
//            System.out.println(item);
//        }
        System.out.println("中位数为: " + Median(arr));
    }
}
