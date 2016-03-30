package com.bt.xlt.homework0326;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 作业：将下面一段文字写入文件，(并从文件读出)，请用map转存即记录数据
 first=你好
 second=hello
 third=早上好
 fourth=晚上好
 下载安装好mysql数据库 , client - MYSQL-Front
 * Created by 王小佳 on 2016/3/28.
 * Reviewer: beigui
 * Review Date: 2016/3/30
 */
public class WangXiaoJia_FileReaderWriter {
        public static void main(String[] args) {
            File file = new File("D:/","homework1.txt");
            //新建一个文件对象
            FileWriter writer = null;
            String content = "first=你好  second=hello third=早上好 fourth=晚上好";
            // 对内容进行赋值

            //文件不存在则创建
            if(!file.exists()){
                try {
                        file.createNewFile();
                    //调用createNewFile（）方法，创建文件
                  } catch (IOException e) {
                        e.printStackTrace();
                }
            }
            //文件写入逻辑
              try {
                  writer = new FileWriter(file);
                  writer.write(content);
              } catch (FileNotFoundException e){
                  e.printStackTrace();
              } catch (IOException e) {
                  e.printStackTrace();
              }finally {
                  //关闭流的操作在finally代码段中做，为了即使出异常，打开的流也会被关闭
                  if(null != writer){
                      try{
                          writer.close();
                      } catch (IOException e) {
                          e.printStackTrace();
                      }
                  }
              }
            //文件读取操作
            FileReader in =null;
            try {
                char[] contentReader = new char[1024];
                in = new FileReader(file);
                int length = in.read(contentReader);
                System.out.println("");
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                if (null != in){
                    try{
                        in.close();
                    }catch (IOException e){
                       e.printStackTrace();
                    }
                }
            }
            Map<String,String> map = new HashMap<String, String>();
            map.put("first","你好");
            map.put("second","hello");
            map.put("third","早上好");
            map.put("fourth","晚上好");
            for(String item :map.keySet()){
                System.out.println("key=" + item + ",value=" + map.get(item));
            }

        }

}
