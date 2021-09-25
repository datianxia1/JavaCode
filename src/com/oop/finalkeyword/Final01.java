package com.oop.finalkeyword;

public class Final01 {
    public static void main(String[] args) {
        AA aa = new AA(12);
        aa.print();
    }
}

class AA {
    private final int I;

    public AA(int i) {
        this.I = i;
        //System.out.println("");
    }

    public void print() {
        System.out.println(this.I);
    }
}
