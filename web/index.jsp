<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/19 0019
  Time: 8:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setAttribute("ctx",request.getContextPath());
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <jsp:forward page="toLogin.login"/>
  </body>
</html>
