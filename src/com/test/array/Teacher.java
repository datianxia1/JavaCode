package com.test.array;

public class Teacher extends Person {
    private double salary;

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void say() {
        super.say();
        System.out.println("salary:" + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void teach() {
        System.out.println(getName() + "teach !!!!");
    }
}
