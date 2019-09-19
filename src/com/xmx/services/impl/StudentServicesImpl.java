package com.xmx.services.impl;

import com.xmx.dao.StudentDao;
import com.xmx.entity.Student;
import com.xmx.services.StudentServices;

public class StudentServicesImpl implements StudentServices {

    StudentDao studentDao = new StudentDao();

    @Override
    public Student findStudent(String name){
        return studentDao.findByName(name);
    }
}
