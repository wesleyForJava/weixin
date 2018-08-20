<%@ page language="java" pageEncoding="utf-8"%>
<%@ page import="com.souvc.weixin.pojo.SNSUserInfo,java.lang.*"%>
<html>
<head>
    <title>OAuth2.0网页授权</title>
    <meta name="viewport" content="width=device-width,user-scalable=0">
</head>
<body>
    <div>登录成功!</div>
    <div>用户昵称：${info.nickName})</div>
    <div>用户头像：<img style="vertical-align: top;" width: "100px" height:""  src="${info.headimgurl}" alt=""></div>
</body>
</html>