package com.oop.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月d日 hh:mm:ss E");
        System.out.println(simpleDateFormat);
        String date1 = simpleDateFormat.format(date);
        System.out.println(date1);


        Date parse = simpleDateFormat.parse(date1);
        System.out.println(simpleDateFormat.format(parse));

    }
}
