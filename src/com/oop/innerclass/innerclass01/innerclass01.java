package com.oop.innerclass.innerclass01;

public class innerclass01 {
    public static void main(String[] args) {
        Other other = new Other();
        other.m1();
    }
}


class Outer {
    private int a = 0;
    private void out() {
        System.out.println("out");

    }
    public void m1() {
        class Inner{
            private int a = 100;
            public void n1() {
                System.out.println("Inner's a:" + a + "  Outer's a:" + Outer.this.a);
                out();
            }
        }
        Inner inner = new Inner();
        inner.n1();
    }
}

class Other extends Outer {
    private int a = 100000;
}