package com.test.pol_parmeter;

import com.test.array.Teacher;

public class PloyParameter {
    public static void main(String[] args) {
        Test test = new Test();
        double salary = test.showEmpAnnal(new Worker("worker01",5000));
        System.out.println("salary:" + salary);
        salary = test.showEmpAnnal(new Manager("manager01",10000,10000));
        System.out.println("salary:" + salary);

        test.testWork(new Worker("worker01",5000));
        test.testWork(new Manager("manager",10000,10000));
    }
}
