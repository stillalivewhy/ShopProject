package com.xmx.dao;

import java.sql.*;

public class DBConnection {
    private static final String driverName = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/demo01?characterEncoding=utf-8";
    private static final String user = "root";
    private static final String password = "mysql";

    public static Connection getConn(){
        Connection conn = null;
        try{
            Class.forName(driverName);
            conn = DriverManager.getConnection(url,user,password);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs){
        try{
            if(rs!=null){
                rs.close();
            }
            if(ps!=null){
                ps.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try{
                if(conn!=null){
                    conn.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
