package com.ua.main.homework9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student[] students;
        Scanner inputStream = new Scanner(System.in);

        System.out.println("Input count of students");
        int countOfStudents = inputStream.nextInt();

        students = new Student[countOfStudents];
        Scanner inputStudentName = new Scanner(System.in);

        for (int i = 0; i < countOfStudents; i++) {
            System.out.print("Input name of student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].setStudentName(inputStudentName.nextLine());
            System.out.print("\nInput age of " + students[i].getStudentName() + ":");
            students[i].setStudentAge(inputStream.nextInt());
            students[i].setStudentGroup("Robots");
        }

        for (int i = 0; i < countOfStudents; i++) {
            System.out.println("Student " +
                    students[i].getStudentName() +
                    " from group " +
                    students[i].getStudentGroup() +
                    " is " +
                    students[i].getStudentAge() +
                    " year old");
        }

        Teacher mathTeacher = new Teacher("Ivan", "Pomidorov", "Mathematician");
        System.out.println(mathTeacher);

        System.out.println("Input size of array for demonstrate sorting pissibility:\n");
        int arraySize = inputStream.nextInt();

        System.out.println("Create array\n");
        ArrayClassSample arraySample = new ArrayClassSample(arraySize);

        System.out.println("Demonstrate sort by ascending values\n");
        arraySample.ascendingOrder();

        System.out.println("Demonstrate sort by descending values\n");
        arraySample.descendingOrder();

    }
}
