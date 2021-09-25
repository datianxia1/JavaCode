package com.oop.chapter10.homework03;

import javafx.scene.control.Cell;

public class Test {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.test(new Calculate() {
            @Override
            public double work(double a, double b) {
                return a + b;
            }
        },10,20);
    }
}
