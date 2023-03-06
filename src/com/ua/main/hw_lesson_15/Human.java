package com.ua.main.hw_lesson_15;

public class Human implements Flyable, Driveable {


    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void drive() {
        System.out.println("Drive ability is undefined");
    }

    @Override
    public void fly() {
        System.out.println("Fly ability is undefined");
    }


}
