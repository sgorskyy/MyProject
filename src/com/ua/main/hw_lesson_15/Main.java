package com.ua.main.hw_lesson_15;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Anna", 30);
        Human d1 = new Driver("Ivan", 25);
        Human p1 = new Pilot("Bohdan", 20);

        h1.drive();
        h1.fly();

        d1.drive();
        d1.fly();

        p1.drive();
        p1.fly();

    }


}
