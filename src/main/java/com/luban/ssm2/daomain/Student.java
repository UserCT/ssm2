package com.luban.ssm2.daomain;

public class Student {

    private  Long id;



    private  String name;

    public Student(String name) {

        this.name = name;
    }
    public Student(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
