<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 12/17/2021
  Time: 7:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%--The time interval in which two systems(i.e. the client and the server) communicate with each other can be termed as a session.--%>
<%--In simpler terms, a session is a state consisting of several requests and response between the client and the server.--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Boot First App</title>
</head>
<body>
<%@ page errorPage="error.jsp" %>
<%

    String num1=request.getParameter("n1");
    String num2=request.getParameter("n2");

    int a=Integer.parseInt(num1);
    int b=Integer.parseInt(num2);
    int c=a/b;
    out.print("division of numbers is: "+c);

%>
</body>
</html>
