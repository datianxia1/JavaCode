package com.oop.innerclass.innerclass02.innerclass03;

public class StaticInner {
    public static void main(String[] args) {
        Out.Inner inner = new Out.Inner();
    }
}

class Out {
    static class Inner {
        public void print() {
            System.out.println("Inner");
        }
    }
}
