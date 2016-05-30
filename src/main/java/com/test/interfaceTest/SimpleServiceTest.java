package com.test.interfaceTest;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class SimpleServiceTest {
  
    public static void main(String[] args) throws ClientProtocolException, IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httppost = new HttpPost("http://xiangce.baidu.com/");
        CloseableHttpResponse response = httpclient.execute(httppost);
        try {  
            HttpEntity myEntity = response.getEntity();
            System.out.println(myEntity.getContentType());  
            System.out.println(myEntity.getContentLength());  
              
            String resString = EntityUtils.toString(myEntity);
            // 使用返回的字符串直接构造一个JSONObject       
            System.out.println(JSON.toJSONString(resString));
            // 获取返回对象中"resultSize的值"  
//            int resutltSize = jsonobj.getInt("resultSize");
//            System.out.println("Search Results Size is: "+ resutltSize);
//            // 获取"clients"的值,它是一个JSONArray
//            JSONArray jsonarray = jsonobj.getJSONArray("clients");
//            System.out.println(jsonarray.toString());
              
              
        } finally {  
            response.close();  
        }  
          
          
    }  
  
}  