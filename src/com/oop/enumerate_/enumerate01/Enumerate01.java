package com.oop.enumerate_.enumerate01;

public class Enumerate01 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN.getFeel());
    }
}

class Season {
    private String name;
    private String feel;

    private Season(String name, String feel) {
        this.name = name;
        this.feel = feel;
    }

    public final static Season SPRING = new Season("春天","温暖");
    public final static Season SUMMER = new Season("夏天","炎热");
    public final static Season AUTUMN = new Season("秋天","凉爽");
    public final static Season WINTER = new Season("冬天","寒冷");


    public String getName() {
        return name;
    }

    public String getFeel() {
        return feel;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", feel='" + feel + '\'' +
                '}';
    }
}