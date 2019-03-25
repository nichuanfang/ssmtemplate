<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/25
  Time: 0:29
  To change this template use File | Settings | File Templates.
--%>
<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post" style="height: 500px;width: 300px;background-color: beige" >
    <input type="text" name="username"> &nbsp;
    <input type="text" name="password">
    <input type="text" name="remeberMe">
    <input type="submit" value="提交"/>
</form>
</body>
</html>
