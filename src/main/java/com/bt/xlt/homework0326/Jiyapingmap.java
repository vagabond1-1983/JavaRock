package com.bt.xlt.homework0326; /**
 * Created by jiyaping on 2016/3/31.
 * Reviewer: beigui
 * Review Date: 2016/3/31
 */
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Jiyapingmap {
    public static void main(String[] args)throws IOException {

                String txt="first=你好:"+"second=holle:"+"third=早上好:"+"fourth=晚上好";
                File file = new File("D:\\hello.txt");
               if(!file.exists()){
                    file.createNewFile();
                }

                FileWriter  writer = new FileWriter (file);
                writer.write(txt);
                writer.flush();// 清空缓冲区，立即将输出流里的内容写到文件里

                Map<String, String> map = new HashMap<String, String>();
                File file1 = new File("D:\\hello.txt");
                BufferedReader reader = null;
                try {
                    reader = new BufferedReader(new FileReader(file1));
                    String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                System.out.println("line " + line + ": " + tempString);
                String[] ss = tempString.split(":");
                for(int i = 0 ;i < ss.length ;i ++){
                    String[] s = ss[i].split("=");
                    map.put(s[0], s[1]);
                }
                line++;
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }

            }
        }
        Set<String> set = map.keySet();
        for (String keySet : set) {
            System.out.println("map:"+keySet+" value:"+map.get(keySet));

       }

    }
}
