package com.oop.innerclass.innerclass02;

public class Anonymous {
    public static void main(String[] args) {
        IA tiger = new IA() {
            @Override
            public void get() {
                System.out.println("tager");
            }
        };
        tiger.get();
        System.out.println(tiger.getClass());

        Teacher jack = new Teacher("Jack"){
            @Override
            public void print() {
                System.out.println("我是匿名内部类");
            }
        };
        jack.print();
        jack.out();
        System.out.println(jack.getClass());
    }
}

class Teacher {
    public Teacher(String name) {
        System.out.println("name = " + name);
    }

    public void print() {

    }

    public void out() {
        System.out.println("Teacher");
    }
}

interface IA {
    public void get();
}

