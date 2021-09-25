package com.test.array;

public class PolymorphicArray {
    public static void main(String[] args) {
        Person xiaoming = new Person("xiaoming", 18);
        Student student1 = new Student("student1", 17, 99);
        Student student2 = new Student("student2", 18, 88);
        Teacher teacher1 = new Teacher("teacher1", 34, 5000);
        Teacher teacher2 = new Teacher("teacher2", 45, 6000);

        Person[] person = {xiaoming, student1, student2, teacher2, teacher1};
        for (int i = 0; i < person.length; i++) {
            //person[i] 编译类型为person 运行类型根据实际情况根据jvm机分配
            person[i].say();
            if (person[i] instanceof Student) {//判断person[i]运行烈性是否为Student类型
//                Student student = (Student) person[i];
//                student.study();
                ((Student)person[i]).study();//向下转型
            } else if (person[i] instanceof Teacher) {
                ((Teacher)person[i]).teach();
            } else if (person[i] instanceof  Person){

            } else {
                System.out.println("类型错误");
            }
        }


    }
}
