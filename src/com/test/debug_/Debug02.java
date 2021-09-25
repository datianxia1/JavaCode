package com.test.debug_;

import java.util.Arrays;

public class Debug02 {
    public static void main(String[] args) {
        int[] arr = {-1,-20,3,45,9,-122};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
