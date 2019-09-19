package com.xmx.controller;

import com.xmx.entity.Commodity;
import com.xmx.services.CommodityServices;
import com.xmx.services.impl.CommodityServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class CommodityController extends BaseController {

    CommodityServices commodityServices = new CommodityServiceImpl();

    public void findAll(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        List<Commodity> commodities = commodityServices.findAll();

        request.setAttribute("commodities",commodities);
        request.getRequestDispatcher("/WEB-INF/views/commodity/commodityLook.jsp").forward(request,response);
    }

    public void findByNo(HttpServletRequest request,HttpServletResponse response){
        System.out.println("跳转至findByNo");

//        Commodity commodity = commodityServices.findByNo();
    }


    public void updateCommodity(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException{
        String no = request.getParameter("commodityNo");
        String name = request.getParameter("commodityName");
        String price = request.getParameter("commodityPrice");
        Commodity commodity = new Commodity();
        commodity.setCommodityName(name);
        commodity.setCommodityPrice(price!=null?Double.parseDouble(price):0);
        commodity.setCommodityNo(no!=null?Integer.parseInt(no):0);
        commodityServices.updateCommodity(commodity);
        findAll(request,response);
    }

    public void deleteCom(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException{

        String id = request.getParameter("id");
        int result =  commodityServices.deleteCommodity(id!=null?Integer.parseInt(id):0);
        response.getWriter().println(result);
        response.sendRedirect("findAll.do");
    }

    public void addCommodity(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException{
        System.out.println("跳转至addCommodity");
        String name = request.getParameter("commodityNameAdd");
        String price = request.getParameter("commodityPriceAdd");

        System.out.println(price);
        Commodity commodity = new Commodity();
        commodity.setCommodityName(name);
        commodity.setCommodityPrice(price!=null?Double.parseDouble(price):0);
        commodityServices.addCommodity(commodity);
        response.sendRedirect("findAll.do");
    }
}
