package com.xmx.dao;


import com.xmx.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    public Student findByName(String name){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Student> students = new ArrayList<Student>();
        try{
            conn = DBConnection.getConn();
            String sql = "select * from student where name=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,name);
            rs = ps.executeQuery();
            while(rs.next()){
                String user = rs.getString("name");
                String pass = rs.getString("password");
                Student student = new Student();
                student.setName(user);
                student.setPassword(pass);
                students.add(student);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBConnection.close(conn,ps,rs);
        }

        if(students.isEmpty()){

            return null;
        }

        return students.get(0);
    }
}
