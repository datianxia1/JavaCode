package com.oop.enumerate_.enumerate02;
//enum类的实现

public class EnumClass {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
    }
}

enum Season {
    SPRING("春天","温暖"),SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),WINTER("冬天","寒冷");

    private String name;
    private String feel;

    private Season(String name, String feel) {
        this.name = name;
        this.feel = feel;
    }

//    public final static com.oop.enumerate_.enumerate01.Season SPRING = new com.oop.enumerate_.enumerate01.Season("春天","温暖");
//    public final static com.oop.enumerate_.enumerate01.Season SUMMER = new com.oop.enumerate_.enumerate01.Season("夏天","炎热");
//    public final static com.oop.enumerate_.enumerate01.Season AUTUMN = new com.oop.enumerate_.enumerate01.Season("秋天","凉爽");
//    public final static com.oop.enumerate_.enumerate01.Season WINTER = new com.oop.enumerate_.enumerate01.Season("冬天","寒冷");


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