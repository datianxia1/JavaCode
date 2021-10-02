package com.oop.arrays_;

import java.util.Comparator;

public class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void sort(Book[] b, Comparator c) {
        int temp = 0;
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < b.length - 1 - i; j++) {
                if (c.compare(b[j].price , b[j + 1].price ) > 0){
                    temp = b[j].price;
                    b[j].price = b[j+1].price;
                    b[j + 1].price = temp;
                }
            }
        }
    }
}
