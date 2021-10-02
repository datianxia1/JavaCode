package com.oop.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class CustomSort {
    public static void main(String[] args) {
        int[] a = {3,2,1,6,5,7,-5};
        sort(a, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int a1 = (Integer)o1;
                int a2 = (Integer)o2;
                return a2 - a1;
            }
        });
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a, Comparator c) {
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if(c.compare(a[j],a[j+1]) > 0) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

}
