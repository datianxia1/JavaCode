package com.oop.exception.homework;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int dividend = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);
            System.out.println(cal(dividend, divisor));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("参数个数不对");
        } catch (NumberFormatException e) {
            System.out.println("参数不是int型");
        } catch (ArithmeticException e) {
            System.out.println("除数为0");
        }


    }

    public static int cal(int dividend, int divisor) throws ArithmeticException {
        return dividend / divisor;
    }
}
