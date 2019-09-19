<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/19 0019
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setAttribute("ctx",request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${ctx}/resources/static/bootstrap/css/bootstrap.min.css"/>
</head>
<body>
    <button class="btn btn-primary btn-group-lg" id="look" style="margin-top: 20px;margin-left: 20px;">查看所有商品</button>
    <button class="btn btn-info btn-group-lg" style="margin-top: 20px;margin-left: 20px;" id="quit">退出</button>
</body>
<script src="${ctx}/resources/static/js/jquery-3.2.1.js"></script>
<script src="${ctx}/resources/static/bootstrap/js/bootstrap.min.js"></script>
<script>
    <%--$("#quit").on("click",function () {--%>
        <%--<%--%>
            <%--session.removeAttribute("student");--%>
        <%--%>--%>
    <%--});--%>
    $("#look").on("click",function () {
        alert(1)
        window.location = "findAll.do";
    });
</script>
</html>
