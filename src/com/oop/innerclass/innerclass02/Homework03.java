package com.oop.innerclass.innerclass02;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Homework03 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.print();

        Outer.Inner inner2 = outer.getInner();
    }
}

class Outer {
    public void print() {
        System.out.println("Outer print");
    }

    public Inner getInner() {
        return new Inner();
    }
    class Inner {
        public void print() {
            System.out.println("Inner print");
        }
    }
}
