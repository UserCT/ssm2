package com.luban.ssm2.service;

import com.luban.ssm2.daomain.Student;

import java.util.List;

public interface IStudentService {
    void add(String name);
    void del(Long id);
    void upd(Student stu);
    Student get(Long id);
    List<Student> list();
}
