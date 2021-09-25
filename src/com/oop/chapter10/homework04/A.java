package com.oop.chapter10.homework04;

public class A {
    private String name = "Jack";
    public void m1() {
        class B {
            private String name = "Alice";

            public void printName() {
                System.out.println("B:" + name + "A:" + A.this.name);
            }
        }

        B b = new B();
        b.printName();
    }
}

class Test {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }
}
