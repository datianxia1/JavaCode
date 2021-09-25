package com.test.array;

public class Student extends Person {
    private int score;

    public Student(int score) {
        this.score = score;
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void say() {
        super.say();
        System.out.println( "score:" + score);
    }

    public void study() {
        System.out.println(this.getName() + "study");
    }
}
