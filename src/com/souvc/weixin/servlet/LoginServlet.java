package com.souvc.weixin.servlet;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.souvc.weixin.util.AuthUtil;
@WebServlet("/wxLogin")
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   String backUrl="http://aaacdd/natappfree.cc/wxAuth/callBack";
		String url="https://open.weixin.qq.com/connect/oauth2/authorize?appid="+AuthUtil.APPID
	  		+ "&redirect_uri="+URLEncoder.encode(backUrl, "gbk")
	  		+ "&response_type=code"
	  		+ "&scope=snsapi_userinfo"
	  		+ "&state=STATE#wechat_redirect";
	   resp.sendRedirect(url);
	}
	
	
}
