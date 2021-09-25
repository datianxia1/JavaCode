package com.oop.homework02;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class Homework02 {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Peasant("peasant",100,200);
        employee[1] = new Scientist("scientist",500,300,200000);
        employee[2] = new Teacher("teacher",300,250,100);
        employee[3] = new Waiter("water",200,320);
        employee[4] = new Worker("worker",250,320);

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getName() + " " + employee[i].allSalary());
        }
    }
}
