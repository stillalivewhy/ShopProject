<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/18 0018
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setAttribute("ctx",request.getContextPath());
%>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="${ctx}/resources/static/bootstrap/css/bootstrap.min.css"/>
    <script src="${ctx}/resources/static/js/jquery-3.2.1.js"></script>
    <script src="${ctx}/resources/static/bootstrap/js/bootstrap.min.js"></script>
    <style>
        /*body{*/
        /*margin: 0;*/
        /*padding: 0;*/
        /*background-color: #b9def0;*/
        /*}*/
        .login-form-div{
            text-align: center;
            border: 1px solid gray;
            margin-left: 300px;
            margin-top: 150px;
            width: 500px;

        }
        /*.login-form{*/
        /*margin-left: 50%;*/
        /*}*/
    </style>
</head>
<body>
<div class="container">
    <div class="login-form-div">
        <div class="form-top"><h1>登录页面</h1></div>
        <form class="login-form" id="login" role="form" action="login.login" method="post">
            <div class="form-group" style="margin-left: 80px;margin-top: 20px;">
                <div class="input-group" style="width: 350px;">
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-user"></span>
                </span >

                    <input type="text" class="form-control" id="name" placeholder="用户名" name="name" required value="${name}"/>
                </div>
            </div>

            <div class="form-group" style="margin-left: 80px;margin-top: 20px;">
                <div class="input-group" style="width: 350px;">
                    <span class="input-group-addon ">
                        <span class="glyphicon glyphicon-lock"></span>
                    </span>
                    <input type="password" class="form-control" id="password" placeholder="密码" name="password" required value="${password}"/>
                </div>
            </div>
            <div class="form-group">
                <div class="form-inline">
                    <span>记住</span><input type="radio" class="form-control radio" name="isRemember" value="yes" checked>
                    <span>不记住</span><input type="radio" class="form-control radio" name="isRemember" value="no">
                </div>
            </div>
            <div>
                <button type="submit" class="btn btn-info" id="loginButton" style="margin-bottom: 20px">登录</button>
                <br>
                <a href="#">还没有账户？快来注册吧！</a>
            </div>
            <input type="hidden" value="${msg}" id="msg"/>
        </form>
    </div>


</div>
<script>
   $(function(){
       var msg = $("#msg").val();
       if(msg!=null&&msg!=""){
           alert(msg)
       }
   })

</script>
</body>
</html>
