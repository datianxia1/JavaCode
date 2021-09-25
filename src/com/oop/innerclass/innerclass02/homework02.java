package com.oop.innerclass.innerclass02;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class homework02 {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.getBB().print();
    }
}


class AA {
    public class BB {
        public void print() {
            System.out.println("内部类BB");
        }
    }

    public BB getBB() {
        return new BB();
    }
}