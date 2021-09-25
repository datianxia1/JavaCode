package com.oop.codeblock;

public class CodeBlockDetil {
    public static void main(String[] args) {
        C c = new C();
        //首先是父级静态代码块和静态属性(按顺序初始化)
        //然后是子类静态代码块和静态属性初始化
        //父类普通代码块和普通属性初始化
        //父类构造器
        //子类普通代码块和普通属性
        //子类构造器

        /*
        过程:创建C对象,首先其父类B类,B类的父类C,最开始初始化C类的静态代码块输出(1)A's static CodeBlock
        然后是子类的静态代码块(2)B's static CodeBlock (3)C's static CodeBlock
        之后初始化父类的普通代码块(4)A's CodeBlock 父类的构造方法(5) A's structure
        (6)B's CodeBlock (7)B's structure
        (8)C's CodeBlock (9)C's structure
        */
    }
}

class A {
    static {
        System.out.println("A's static CodeBlock");
    }

    {
        System.out.println("A's CodeBlock");
    }
    public A() {
        System.out.println("A's structure");
    }
}

class B extends A {
    static {
        System.out.println("B's static CodeBlock");
    }

    {
        System.out.println("B's CodeBlock");
    }
    public B() {
        System.out.println("B's structure");
    }
}

class C extends B {
    static {
        System.out.println("C's static CodeBlock");
    }

    {
        System.out.println("C's CodeBlock");
    }
    public C() {
        System.out.println("C's structure");
    }
}