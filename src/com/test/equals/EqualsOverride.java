package com.test.equals;

public class EqualsOverride {
    public static void main(String[] args) {
        Person person = new Person("person", 18);
        Person person1 = new Person("person1", 22);
        Person person2 = new Person("person", 18);

        String str1 = "name";
        String str2 = "name";

        String  str3 = new String("name");
        String  str4 = new String("name");

        System.out.println(person.equals(person2));
        System.out.println(person.equals(person1));

        System.out.println(person.getName() == person2.getName());
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str3 == str4);

    }
}
