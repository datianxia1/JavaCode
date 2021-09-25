package com.oop.homework04;

public class Homework04 {
    public static void main(String[] args) {
        Person[] p = new Person[4];
        p[0] = new Student("Jack", "男", 28, "12345678");
        p[1] = new Student("Alic", "女", 18, "13456789");
        p[2] = new Teacher("Bob", "男", 35, 5);
        p[3] = new Teacher("Eva", "男", 45, 20);

        Person per;
        for (int i = 0; i < p.length - 1 ; i++) {
            for (int j = 0; j < p.length - 1 - i; j++) {
                if (p[j].getAge() < p[j + 1].getAge()) {
                    per = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = per;
                }
            }
        }

        for (int i = 0; i < p.length; i++) {
            if (p[i] instanceof Teacher) {
                System.out.println("老师的信息:");
                System.out.println("姓名:" + p[i].getName());
                System.out.println("性别:" + p[i].getSex());
                System.out.println("年龄:" + p[i].getAge());
                System.out.println(work(p[i]));
                System.out.println(p[i].play());
            } else if (p[i] instanceof Student) {
                System.out.println("学生的信息:");
                System.out.println("姓名:" + p[i].getName());
                System.out.println("性别:" + p[i].getSex());
                System.out.println("年龄:" + p[i].getAge());
                System.out.println(work(p[i]));
                System.out.println(p[i].play());
            }

            System.out.println("----------------------------------");
        }
    }


    public static String work(Person p) {
        if (p instanceof Student) {
            return ((Student) p).study();
        } else if (p instanceof Teacher) {
            return ((Teacher) p).teach();
        } else return "erro";
    }
}
