package com.oop.abstract_;

public class Abstract01 {
    public static void main(String[] args) {
        B b = new B();
        b.print();
    }
}

abstract class A {
    private int age ;
    private String name;
    public abstract void print();
}

class B extends A {
    @Override
    public void print() {
        System.out.println("aaa");
    }
}
