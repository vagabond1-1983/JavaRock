package com.bt.xlt.homework0326;

import java.util.Map;

/**
 * 方法二：面向对象
 * 内容：将下面一段文字写入文件，(并从文件读出)，请用map转存即记录数据 first=你好 second=hello third=早上好 fourth=晚上好
 * Created by QZ on 2016/3/30.
 * Reviewer: beigui
 * Review Date: 2016/3/30
 * Comments: 能够用基本的面向对象的思想考虑问题。文件操作类提供了写数据和读数据的方法
 */
public class FileOperateTest {
    public static void main(String[] args) {
        String con = "first=你好 second=hello third=早上好 fourth=晚上好";
        FileOperate fileOperate = new FileOperate();

        fileOperate.writeDataToFile("D:/fileOPerate.txt",con);      //创建文件，并将内容写入文件

        String filecontext = fileOperate.readDataFromFile("D:/fileOPerate.txt");         //读文件内容

        Map<String,String> map = fileOperate.putDataToMap(filecontext);  //map转存文件内容
        System.out.println("2、map转存信息：");
        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }







    }
}
