package com.oop.finalkeyword.homework02;

public class Homework02 {
    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println( aa.add(3));
    }
}
class AA {
    public int add(final int a) {
        //a++;
        return a + 1;
    }
}