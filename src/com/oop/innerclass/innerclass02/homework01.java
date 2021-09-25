package com.oop.innerclass.innerclass02;

public class homework01 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell(){

            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课啦");
            }
        });
    }
}

interface Bell {
    void ring();//public abstract
}

class CellPhone {
    public void alarmclock(Bell bell) {
        bell.ring();
    }
}