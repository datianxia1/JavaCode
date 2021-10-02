package com.oop.string_;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        System.out.println(str);
        String str = "Han Shun Ping";
        System.out.println(str);
        System.out.println("=======================");
        System.out.println(print(str));

    }

    public static String print(String str) {
        String[] strings = str.split(" ");
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(strings[2]).append(",").append(strings[0]).append(".")
//                .append(strings[1].charAt(0));
//        str = stringBuilder.toString();

        str = String.format("%s,%s.%c",strings[2],strings[0],strings[1].charAt(0));
        return str;
    }
}
