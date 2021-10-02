package com.oop.string_;

import java.util.Scanner;

public class StringBufferExercise {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String name;
//        String price;
//        System.out.println("输入品牌名");
//        name = scanner.next();
//        System.out.println("输入价格");
//        price = scanner.next();
//
//        String[] temp = price.split("\\.");//必须加转义字符
//        System.out.println(temp[0]);
//        StringBuffer sb1 = new StringBuffer(temp[0]);
//        for (int i = sb1.length() - 1 -2; i >0; i = i - 3) {
//            sb1.insert(i,",");
//        }
//
//        //StringBuffer sb = new StringBuffer(temp[0]);
//        sb1.append(".");
//        sb1.append(temp[1]);
//
//        System.out.println("name\tprice");
//        System.out.println(name + "\t" + sb1);

     String str = "123456789.0987";
        StringBuffer price = new StringBuffer(str);
        for (int i = price.lastIndexOf(".") - 3; i > 0; i -= 3) {
            price.insert(i,",");
        }

        System.out.println(price);
    }
}
