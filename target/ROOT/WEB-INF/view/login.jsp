<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/1 0001
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1><center>登录页面</center></h1>
<form  action="/user/checklogin"  method="post">
    账号：<input type="text" name="username" id="username"><br>
    密码: <input type="password" name="password" id="password"><br>
    <input type="submit" value=登录>
</form>
<a href="/user/zhuce">注册</a>
</body>
</html>
