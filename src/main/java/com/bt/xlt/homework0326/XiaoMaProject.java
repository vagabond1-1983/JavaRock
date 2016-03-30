package com.bt.xlt.homework0326;
/**
 * Created by xiaoma on 2016/3/29.
 * Reviewer: beigui
 * Review Date: 2016/3/30
 * Comments: 提前实现了Buffer Reader, Buffer Writer
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class XiaoMaProject {

    public static void main(String[] args) {
        //调用方法
        method_File();
    }


    //封装成一个写、读、存的方法
    private static void method_File(){
        //在指定的目录建立文件夹
        File f = new File("C:/", "xiaoma.txt");
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException("未能创建或找不到指定盘符");
            }
        }

        //创建缓冲区指向，把数据写入缓存中
        BufferedWriter bw =null;
        try {
            bw = new BufferedWriter( new FileWriter(f));
            bw.write("first=你好");
            bw.newLine();

            bw.write("second=hello");
            bw.newLine();

            bw.write("third=早上好");
            bw.newLine();

            bw.write("fourth=晚上好");

        } catch (IOException e) {
            throw new RuntimeException("写入失败！");

        }finally{

            try {
                if(bw!=null){
                    bw.close();

                }

            } catch (IOException e) {
                throw new RuntimeException("关闭失败");
            }
        }

        //创建缓冲指向，读取文件中的数据
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(f));

            String line = null;
            //创建一个MAP集合来保存数据
            Map<String, String> m =new HashMap<String, String>();
            try {
                while((line = br.readLine()) != null)    {

                    String[] arr = line.split("=");//使用=进行截取，把前面当前key，后面当作values
                    m.put(arr[0], arr[1]);
                    //	System.out.println(arr[0]+"...."+arr[1]);
                }
            } catch (IOException e) {

                throw new RuntimeException("无法获取");
            }
            System.out.println(m);//把这个集合打印出来到控制台

        } catch (FileNotFoundException e) {

            throw new RuntimeException("读取失败！");
        }finally{
            try {
                if(br!=null){
                    br.close();
                }
            } catch (IOException e) {
                throw new RuntimeException("关闭流失败");
            }
        }

    }

}
