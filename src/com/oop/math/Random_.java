package com.oop.math;

public class Random_ {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 6 + 2);
            System.out.println(num);
        }
    }
}
