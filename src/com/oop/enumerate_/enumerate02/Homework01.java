package com.oop.enumerate_.enumerate02;

public class Homework01 {
    public static void main(String[] args) {
        Week[] values = Week.values();
        System.out.println("===所用星期的信息如下===");
        for(Week week : values) {
            System.out.println(week.getName());
        }
    }
}

@SuppressWarnings({"all"})
enum Week {

    ONE("星期一"),TWO("星期二"),THREE("星期三"),FOUR("星期四"),
    FIVE("星期五"),SIX("星期六"),SEVEN("星期日");
    private String name;
    private Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

