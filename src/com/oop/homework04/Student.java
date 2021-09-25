package com.oop.homework04;

public class Student extends Person{
    private String stu_id;

    public Student(String name, String sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String study() {
       return "我会好好学习";
    }

    @Override
    public String  play() {
        return (this.getName() + "爱玩足球");
    }
}
