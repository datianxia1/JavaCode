package com.oop.advanced;

public class CodeBlock {
    public static void main(String[] args) {
        int age = AA.age;

        System.out.println("age" + "=" + age);
        //AA aa = new AA();
    }
}

class BB {
    public static int id;
    {
        System.out.println("BB's CodeBlock");
    }
}
class AA extends BB {
    static int age;
    //CodeBlock
    static {
        System.out.println("AA's CodeBlock");
    }
    public AA() {
        System.out.println("AA structure");
    }
}
