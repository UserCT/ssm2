package com.luban.ssm2.service;

import com.luban.ssm2.dao.StudentDao;
import com.luban.ssm2.daomain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//@EnableTransactionManagement事务管理器
@Transactional//事务
@Service//声明为service
public class StudentServiceImpl implements IStudentService{

    @Autowired//注入链接Dao
    StudentDao dao;

    @Override
    public void add(String name) {


        dao.add(name);
    }

    @Override
    public void del(Long id) {
        dao.del(id);

    }

    @Override
    public void upd(Student stu) {
        dao.upd(stu);

    }

    @Override
    public Student get(Long id) {

        return dao.get(id);
    }

    @Override
    public List<Student> list() {
        return dao.list();
    }
}
