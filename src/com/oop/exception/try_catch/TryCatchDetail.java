package com.oop.exception.try_catch;

import com.oop.chapter10.homework05.Boat;

import java.util.Scanner;

public class TryCatchDetail {
    public static void main(String[] args) {
        a();
    }

    public static void a() {
        //Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int i;
        System.out.println("请输入数字:");
        while(flag) {
            try {
                Scanner scanner = new Scanner(System.in);
                i = scanner.nextInt();
                System.out.println("输入正确");
                flag = false;
            } catch (Exception e) {
                System.out.println("输入错误，重新出入数字：");
            }
        }

    }
}
