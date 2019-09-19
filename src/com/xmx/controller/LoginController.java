package com.xmx.controller;

import com.xmx.entity.Student;
import com.xmx.services.StudentServices;
import com.xmx.services.impl.StudentServicesImpl;
import com.xmx.util.CookiesUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class LoginController extends BaseController {




    StudentServices studentServices = new StudentServicesImpl();
    public void toLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if(request.getSession().getAttribute("student")!=null){
            System.out.println((request.getSession().getAttribute("student"))+"现在已经登录");
            request.getRequestDispatcher("/WEB-INF/views/commodity/commodityTotal.jsp").forward(request,response);
        }else {
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
        }


    }

    public void login(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {

        String path = "toLogin.login";


        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String isCheck = request.getParameter("isRemember");
        if("yes".equals(isCheck)){
            CookiesUtil.setLoginCook(request,"name",name);
            CookiesUtil.setLoginCook(request,"password",password);
        }else{
            CookiesUtil.setLoginCook(request,"name","");
            CookiesUtil.setLoginCook(request,"password","");
        }
        System.out.println(name+","+password);

        Student student = studentServices.findStudent(name);
        if(student==null){
            request.setAttribute("msg","没有该账户");
        }else{
            if(student.getPassword().equals(password)){
                path = "/WEB-INF/views/commodity/commodityTotal.jsp";
                CookiesUtil.setLoginCook(request,"student",student);
            }else{
                request.setAttribute("msg","密码错误");
            }
        }
//        response.sendRedirect(path);
        request.getRequestDispatcher(path).forward(request,response);
    }
}
