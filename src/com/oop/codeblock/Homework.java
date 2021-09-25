package com.oop.codeblock;

public class Homework {
    public static void main(String[] args) {
        System.out.println(AA.total);
        System.out.println(AA.total);
    }
}

class AA {

    static {
    total = 100;
    System.out.println("AA's static CodeBlock");
}
    public static int total = getTotal();



    public static int getTotal() {
        System.out.println("total");
        return 10;
    }
}
