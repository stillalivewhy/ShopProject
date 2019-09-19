package com.xmx.entity;

public class Student {
    private int id;
    private String name;
    private String sex;
    private String department;
    private String address;
    private String password;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return "{" +"id:"+"\""+this.id+"\""+","+
                "name:"+"\""+this.name+"\""+","+
                "password:"+"\""+this.password+"\""+","+
                "sex:"+"\""+this.sex+"\""+","+
                "department:"+"\""+this.department+"\""+","+
                "address:"+"\""+this.address+"\"}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
