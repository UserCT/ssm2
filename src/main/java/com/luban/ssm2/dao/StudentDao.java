package com.luban.ssm2.dao;

import com.luban.ssm2.daomain.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper//映射mapper

@Repository//spring.xml 参数
public interface StudentDao {
//    添加
//mybatis注解
    @Insert("INSERT INTO student(name) values(#{name})")
    void add(String name);
//    删除
    @Delete("DELETE FROM student WHERE id=#{id}")
    void del(Long id);
//    修改
    @Update("UPDATE student SET name=#{name} WHERE id=#{id}")
    void upd(Student stu);
//    查询
    @Select("SELECT * FROM student WHERE id=#{id}")
    Student get(Long id);
//    查询全部
    @Select("SELECT * FROM student")
    List<Student> list();

}
