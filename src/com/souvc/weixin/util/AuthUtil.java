package com.souvc.weixin.util;


import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import net.sf.json.JSONObject;

public class AuthUtil {
	public static final String APPID="wx104f08c1984d016b";
	public static final String APPSECRET="5513538fe935ba49d190c5e919d87733";
    public static JSONObject doGetJson(String url) throws ClientProtocolException, IOException {
      JSONObject jsonObject=null;
      //初始化http对象
     // DefaultHttpClient client=new DefaultHttpClient();
      CloseableHttpClient client = HttpClientBuilder.create().build();
      HttpGet httpGet=new HttpGet(url);
      HttpResponse response = client.execute(httpGet);
      HttpEntity entity = response.getEntity();
    	if(entity !=null) {
    		String result=EntityUtils.toString(entity,"UTF-8");
    		jsonObject =JSONObject.fromObject(result);
    	}
    	httpGet.releaseConnection();
    	return jsonObject;
    }  
}
