package com.oop.homework01;

public class Homework01 {
    public static void main(String[] args) {
        Person tim = new Person("tim", 22,"ph");
        Person alice= new Person("alice", 18, "pr");
        Person jack = new Person("jack", 24, "ar");

        Person[] people = new Person[]{tim,alice,jack};
        Person person = new Person();
        person.sort(people);

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].toString());

        }
    }
}
