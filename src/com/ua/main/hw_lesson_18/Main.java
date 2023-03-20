package com.ua.main.hw_lesson_18;

import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> listForTenValues = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listForTenValues.add(i);
        }

        System.out.println(listForTenValues);

        LinkedList<Integer> listFor2millionValues = new LinkedList<>();

        for (int i = 0; i < 2000000; i++) {
            listFor2millionValues.add(i);
        }

        System.out.println(listFor2millionValues.size());


        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Ivan", 20, "A"));
        students.add(new Student("Petr", 21, "B"));
        students.add(new Student("Vasya", 22, "A"));
        students.addFirst(new Student("Masha", 23, "B"));

        System.out.println(students);

    }
}
