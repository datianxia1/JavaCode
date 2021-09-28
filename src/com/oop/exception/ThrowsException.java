package com.oop.exception;

import jdk.nashorn.internal.runtime.ECMAException;

import java.io.FileNotFoundException;

public class ThrowsException {
    public static void main(String[] args){
        ThrowsException throwsException = new ThrowsException();
        throwsException.f1();

        throwsException.f3();
    }

    void f3() {
        f4();
    }

    void f4() throws NullPointerException{}
    void f1(){
        try{
            f2();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void f2() throws FileNotFoundException {

    }
}
