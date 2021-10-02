package com.oop.string_;

public class Different {
    public static void main(String[] args) {
        String str1 = new String("123");
        String str2 = new String("123");
        System.out.println(str1 == str2);
        //
        str1.intern();
        System.out.println(str1.intern() == str2.intern());
        StringBuffer sb1 = new StringBuffer("123");
        StringBuffer sb2 = new StringBuffer("123");
        //System.out.println(sb1.intern() == str2.intern());
    }

}
