package com.oop.abstract_.template;

public class Employee extends Person {
    @Override
    public void job() {
        for (int i = 0; i < 10000000; i++) {
            int j = 0;
            j += i;
        }
    }
}
