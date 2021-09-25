package com.oop.homework02;

public class Teacher extends Employee{
    private double dollars;
    public Teacher(String name, double salary, int day, double dollars) {
        super(name, salary, day);
        this.dollars = dollars;
    }

    public double getDollars() {
        return dollars;
    }

    public void setDollars(double dollars) {
        this.dollars = dollars;
    }

    @Override
    public double allSalary() {
        return super.allSalary() + this.getDay() * this.getDollars();
    }
}
