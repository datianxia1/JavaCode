package com.oop.homework01;

public class Person {
    private String name;
    private int age;
    private String job;

    public Person() {
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    public Person[] sort(Person[] p) {
        Person temp;
        for (int i = p.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (p[i].age < p[j].age) {
                    temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
        return p;
    }
}
