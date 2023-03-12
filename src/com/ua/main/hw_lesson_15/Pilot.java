package com.ua.main.hw_lesson_15;

public class Pilot extends Human {
    public Pilot(String name, int age) {
        super(name, age);
    }

    /**
     *
     */
    @Override
    public void drive() {
        System.out.println("Pilot can drive");
    }

    /**
     *
     */
    @Override
    public void fly() {
        System.out.println("Pilot can fly");
    }
}
