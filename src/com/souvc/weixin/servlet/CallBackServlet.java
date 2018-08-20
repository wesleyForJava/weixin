package com.souvc.weixin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.souvc.weixin.util.AuthUtil;

import net.sf.json.JSONObject;
@WebServlet("/callBack")
public class CallBackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String code = req.getParameter("code");
            String url="https://api.weixin.qq.com/sns/oauth2/access_token?appid="+AuthUtil.APPID
            		+ "&secret="+AuthUtil.APPSECRET
            		+ "&code="+code
            		+ "&grant_type=authorization_code";
	  JSONObject jsonObject= AuthUtil.doGetJson(url);
            String openid=jsonObject.getString("openid");
            String token=jsonObject.getString("access_token");
	    String infoUrl="https://api.weixin.qq.com/sns/userinfo?access_token="+token
	    		+ "&openid="+openid
	    		+ "&lang=zh_CN";
	   JSONObject userInfo = AuthUtil.doGetJson(infoUrl);
	     System.out.println(userInfo);
	    // 1.使用微信用户信息直接登录，无需注册和绑定
	     req.setAttribute("info", userInfo);
	     req.getRequestDispatcher("/index1.jsp").forward(req, resp);

	    //2. 将微信与当前系统的账号进行绑定
	     
	     
	     
	}
}
