package com.oop.packaging;

public class IntegerToString {
    public static void main(String[] args) {
        Integer i1 = 100;
        String s1 = i1 + "";
        String s2 = i1.toString();
        String s3 = String.valueOf(i1);

        String s4 = "1234";
        Integer i2 = new Integer(s4);
        Integer i3 = Integer.getInteger(s4);

    }
}
