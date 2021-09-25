package com.oop.finalkeyword.homework01;

public class Homework01 {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.areas());
    }
}

class Circle {
    private final static double PI;
    private int r;

    static {
        PI = 3.14;
    }

    public Circle(int r) {
        this.r = r;
    }

    public double areas() {
        return PI * r * r;
    }
}
