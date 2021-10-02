package com.oop.string_;

public class Homework01 {
    public static String reverse(String str, int start, int end) {
        char[] ch = str.toCharArray();
        char temp;
        for(int i = start,j = end; i < j; i++,j--) {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "43215678";
        str = reverse(str,0,3);
        System.out.println(str);
    }
}
