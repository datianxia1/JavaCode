package com.oop.chapter10.homework05;

public class Person {
    private String name;
    private Vehicles vehicles;
    public Person(String name,Vehicles vehicles){
        this.name = name;
        this.vehicles = vehicles;
    }

    public void common() {
        if (!(vehicles instanceof Horse)) {
            System.out.println("来个horse");
            Horse horse = Factory.getHorse();
        }
        System.out.println("马行");
    }

    public void crossRiver() {
        if (!(vehicles instanceof Boat)) {
            System.out.println("来个boat");
            Boat boat = Factory.getBoat();
        }
        System.out.println("过河还的是船");
    }
}
