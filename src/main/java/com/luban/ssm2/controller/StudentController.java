package com.luban.ssm2.controller;

import com.luban.ssm2.daomain.Student;
import com.luban.ssm2.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//rest风格，可以返回jnsn
public class StudentController {

    @Autowired//注入连接IStudentService
    private IStudentService service;

    //添加
    @RequestMapping("/add")
    public String add(String name) {
        System.out.println(name);

        service.add(name);
        return "add success";
    }
    //删除
    @RequestMapping("/del")
    public String del(Long id) {
        service.del(id);
        return "del success";
    }
    //修改
    @RequestMapping("upd")
    public String upd() {
        Student stu=new Student();
        stu.setId((long) 11);
        stu.setName("liulang");
        service.upd(stu);
        return "upd success";
    }
    //查询
    @RequestMapping("/get")
    public Student get(Long id){
        Student stu=service.get(id);
        return stu;
    }
    //全部
    @RequestMapping("/list")
    public List<Student> list(){
        List<Student> list=service.list();
        return list;
    };



}
