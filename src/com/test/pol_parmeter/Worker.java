package com.test.pol_parmeter;

public class Worker extends Employee{

    public Worker() {
    }

    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

    public void work() {
        System.out.println(getName() + "work");
    }
}
