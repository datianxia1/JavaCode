package com.oop.abstract_.template;

/*
* Teacher类和Employee类继承自Person类,其都有job方法,并需要计算运行job的时间
* 将Person设置为抽象类,属性为name,方法包括抽象方法job以及普通方法getTime,
* 子类需要重写job方法而不需要重写getTime方法,父类的getTime方法中计算运行job的时间
* 因为动态绑定机制,哪一个对象调用次getTime方法,则调用此对象的job方法,完成时间的计算.
* 使用抽象模板模式,可以提高代码的复用率,使代码更简洁易懂
* */
public class AbstractTemplate {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Teacher teacher = new Teacher();
        System.out.println(employee.getTime());
        System.out.println(teacher.getTime());

    }
}
