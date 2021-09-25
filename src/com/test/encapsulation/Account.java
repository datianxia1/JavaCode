package com.test.encapsulation;

public class Account {
    private String name;
    private double balance;
    private String password;

    public Account(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字不合法 默认名字为Jack");
            this.name = "Jack";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额不足 默认余额为21.0");
            this.balance = 21.0;
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码不合法 默认密码为123456");
            this.password = "123456";
        }

    }

    public void print() {
        System.out.println("name:" + this.name + " balance:" + balance + " password:" + password);
    }
}
