package com.oop.chapter10.homework02;

public abstract class Animal {
    abstract void shout();
}

class Cat extends Animal {

    @Override
    void shout() {
        System.out.println("猫会喵喵叫");
    }
}

class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.shout();
    }

}