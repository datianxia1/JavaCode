package com.oop.homework03;

public class Homework03 {
    public static void main(String[] args) {
        Person p = new Student();
        p.eat();
        p.run();

        Student s = (Student) p;
        s.run();
        s.eat();
        s.study();
    }
}
