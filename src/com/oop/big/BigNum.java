package com.oop.big;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNum {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1231354645613131354563");
        BigInteger bigInteger1 = new BigInteger("132");
        System.out.println(bigInteger.add(bigInteger1));

        Integer integer = new Integer("1234567998");
        System.out.println(integer);

        BigDecimal bigDecimal = new BigDecimal("12356.123469846549465");
        BigDecimal bigDecimal1 = new BigDecimal("1.1");
        System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));
    }
}
