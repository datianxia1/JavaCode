package com.oop.homework02;

public class Scientist extends Employee{
    private double annualBonus;

    public Scientist(String name, double salary, int day, double annualBonus) {
        super(name, salary, day);
        this.annualBonus = annualBonus;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    @Override
    public double allSalary() {
        return super.allSalary() + this.getAnnualBonus();
    }
}
