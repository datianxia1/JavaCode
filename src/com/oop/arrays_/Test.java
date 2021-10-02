package com.oop.arrays_;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("三国演义",120);
        books[2] = new Book("水浒传",80);
        books[3] = new Book("西游记",200);

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }


        Book.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int a1 = (Integer)o1;
                int a2 = (Integer)o2;
                return a2 - a1;
            }
        });
        System.out.println("=========================================");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }

    }
}
