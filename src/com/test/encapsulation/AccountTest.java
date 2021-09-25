package com.test.encapsulation;

public class AccountTest {
    public static void main(String[] args) {
        Account alice = new Account("Alice", 25, "123467");
        alice.print();

        Account xiaogang = new Account("xiaogang", 100, "1234");
        xiaogang.print();

    }
}
