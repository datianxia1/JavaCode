package com.oop.chapter10.homework05;

public class Factory {
    //中有一匹马
    private static Horse horse = new Horse();//恶汉式
    public static Horse getHorse() {
        //return new Horse();
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }
}
