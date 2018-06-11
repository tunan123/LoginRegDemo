<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/2 0002
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<h1><center>图书馆里系统注册页面</center></h1>
<form  action="/user/reg"  method="post">
    账号：<input type="text" name="username" id="username"><br>
    密码: <input type="password" name="password" id="password"><br>
    确认密码: <input type="password" name="password1" id="password1"><br>
    <input type="submit" value="注册"> &nbsp;
    <input type="reset" value="取消">
</form>

</body>
</html>
