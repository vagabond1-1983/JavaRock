package com.bt.xlt.homework0326;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * Created by FangWeiLi on 2016/3/30.
 *作业：将下面一段文字写入文件，(并从文件读出)，请用map转存即记录数据
 first=你好
 second=hello
 third=早上好
 fourth=晚上好

 * Reviewer: beigui
 * Review Date: 2016/3/31
 */
public class FangweiliFileStream {
    private static final String PROPERTY_FILE = "D:/zdhstudy/HomeWork.txt";

    public static void main(String[] args) {
        File file = new File("D:/zdhstudy","HomeWork.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        FileOutputStream outputStream = null;
        byte[] content = "first=你好\r\nsecond=hello\r\nthird=早上好\r\nfourth=晚上好".getBytes();
        try {
            outputStream = new FileOutputStream(file);
            outputStream.write(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null != outputStream){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //将读出的数据写入map
        Map map = new HashMap<String,String>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(PROPERTY_FILE)));
            String data = null;
            while((data = br.readLine())!=null)
            {
                if(data!=null&&!"".equals(data))
                {
                    String[] arr = data.split("=");
                    if(arr.length>0)
                    {
                        map.put(arr[0],arr[1]);
                    }
                }
            }
            Set<String> arr1 = map.keySet();
            System.out.println("文件中的内容是：");
            for (String key : arr1) {
                System.out.println( key + "=" + map.get(key));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
