package com.oop.abstract_.template;

public abstract class Person {

    public abstract void job ();

    public long getTime() {
        long last = System.currentTimeMillis();
        job();
        long now = System.currentTimeMillis();
        return now - last;
    }
}
