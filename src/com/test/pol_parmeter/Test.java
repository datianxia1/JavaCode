package com.test.pol_parmeter;

public class Test {
    public double showEmpAnnal(Employee e) {
        return  e.getAnnual();
    }

    public void testWork(Employee e){
        if (e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        } else {
            System.out.println("类型错误");
        }
    }
}
