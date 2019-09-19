package com.xmx.dao;

import com.xmx.entity.Commodity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommodityDao {


    public int add(Commodity commodity){
        int a = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = DBConnection.getConn();
            String sql = "insert into commodity(commodity_name,commodity_price) value(?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1,commodity.getCommodityName());
            ps.setDouble(2,commodity.getCommodityPrice());
            a = ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBConnection.close(conn,ps,null);
        }
        return a;
    }

    public int delete(int commodityNo){
        Connection conn = null;
        PreparedStatement ps = null;
        int a = 0;
        try{
            conn = DBConnection.getConn();
            String sql = "delete from commodity where commodity_no = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,commodityNo);
            a = ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBConnection.close(conn,ps,null);
        }
        return a;
    }

    public int update(Commodity commodity){
        int a = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = DBConnection.getConn();
            String sql = "update commodity set commodity_name=?,commodity_price= ? where commodity_no=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,commodity.getCommodityName());
            ps.setDouble(2,commodity.getCommodityPrice());
            ps.setInt(3,commodity.getCommodityNo());
            a = ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBConnection.close(conn,ps,null);
        }
        return a;
    }

    public List<Commodity> findAll(){
        List<Commodity> commodities = new ArrayList<Commodity>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = DBConnection.getConn();
            String sql = "select * from commodity";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                int com_no = rs.getInt("commodity_no");
                String com_name = rs.getString("commodity_name");
                double com_price = rs.getDouble("commodity_price");
                Commodity commodity = new Commodity();
                commodity.setCommodityPrice(com_price);
                commodity.setCommodityNo(com_no);
                commodity.setCommodityName(com_name);
                commodities.add(commodity);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBConnection.close(conn,ps,rs);
        }
        return commodities;
    }

    public Commodity findByNo(int commodityNo){
        List<Commodity> commodities = new ArrayList<Commodity>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = DBConnection.getConn();
            String sql = "select * from commodity where commodity_no = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,commodityNo);
            rs = ps.executeQuery();
            while(rs.next()){
                int com_no = rs.getInt("commodity_no");
                String com_name = rs.getString("commodity_name");
                double com_price = rs.getDouble("commodity_price");
                Commodity commodity = new Commodity();
                commodity.setCommodityPrice(com_price);
                commodity.setCommodityNo(com_no);
                commodity.setCommodityName(com_name);
                commodities.add(commodity);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBConnection.close(conn,ps,rs);
        }
        return commodities.get(0);
    }

//    public static void main(String[] args) {
//
//        /**
//         * 增
//         */
//        CommodityDao dao = new CommodityDao();
//        Commodity commodity = new Commodity();
//        commodity.setCommodityName("1");
//        commodity.setCommodityNo(1);
//        commodity.setCommodityPrice(12);
//        System.out.println(dao.add(commodity));
//
//        /**
//         * 查
//         */
//        int a = 1;
//        Commodity commodity = new CommodityDao().findByNo(a);
//        System.out.println(commodity.getCommodityName());
//    }


}
