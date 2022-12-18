<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 1/22/2022
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="servletOne" method="POST">
  Username:<input type="text" name="user">
  Password:<input type="password" name="pass">
  <input type="submit" value="Login">
</form>
<form action="sessionM" method="POST">
  Name:<input type="text" name="name">
  Grade:<input type="text" name="grad">
  Teacher:<input type="text" name="teach">
  <input type="submit" value="Save Session">
</form>
<form action="sessionM"method="get">
  <input type="submit" value="Invalidate">
</form>
<form method="post" action="hoo">
  Name: <input type="text" name="user">
  Pass: <input type="password" name="pass">
  <input type="submit" value="Login With Cookie">
</form>
<form method="post" action="jac">
  <input type="submit" value="Delete Cookie">
</form>
<form action="First">
  <input type="submit" value="View">
</body>
</html>
