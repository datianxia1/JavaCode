package com.oop.single;

public class Single02 {
    public static void main(String[] args) {
        System.out.println(Q.age);
        System.out.println(Q.getInstance());
    }
}

//懒汉式
class Q {
    public static int age = 10;
    private String name;
    private static Q q;
    private Q(String name) {
        System.out.println("structure");
        this.name = name;
    }

    public static Q getInstance(){
        if (q == null) {
            return new Q("qqq");
        }
        return q;
    }

    @Override
    public String toString() {
        return "Q{" +
                "name='" + name + '\'' +
                '}';
    }
}
