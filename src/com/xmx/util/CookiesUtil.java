package com.xmx.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class CookiesUtil {
    public static void setLoginCook(HttpServletRequest request,String key,Object obj){
        HttpSession session = request.getSession();
        session.setAttribute(key,obj);
    }
}
