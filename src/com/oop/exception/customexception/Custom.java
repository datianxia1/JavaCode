package com.oop.exception.customexception;

public class Custom {
    public static void main(String[] args) {
       int age = 10;

        try {
            if (age < 11) {
                throw new AgeException();
            }
        } catch (AgeException e) {
            e.printStackTrace();
        }
    }
}

class AgeException extends RuntimeException {
    public AgeException() {
        super();
    }
}
