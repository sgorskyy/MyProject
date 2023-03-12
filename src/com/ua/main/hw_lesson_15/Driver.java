package com.ua.main.hw_lesson_15;

public class Driver extends Human {
    public Driver(String name, int age) {
        super(name, age);
    }

    /**
     *
     */
    @Override
    public void drive() {
        System.out.println("Driver can drive");
    }



}
