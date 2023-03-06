package com.ua.main.hw_lesson_14;

public class Main {
    public static void main(String[] args) {
        UnitOfUniversity    u1 = new Student("Anna", "Math", "KM-41", 3);
        UnitOfUniversity    t1 = new Teacher("Boris", "Physics", "Professor");

        System.out.println(u1.getUnitInfo());

        System.out.println(t1.getUnitInfo());

    }
}
