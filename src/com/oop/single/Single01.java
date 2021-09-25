package com.oop.single;

public class Single01 {
    public static void main(String[] args) {
        System.out.println(Teacher.age);
        //System.out.println(Teacher.instance());
    }
}

class Teacher {
    public static int age = 19;
    private String name;
    private static Teacher teacher = new Teacher("Jack");
    public Teacher() {
    }
    private Teacher(String name) {
        System.out.println("structure");
        this.name = name;
    }

    public static Teacher instance() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
