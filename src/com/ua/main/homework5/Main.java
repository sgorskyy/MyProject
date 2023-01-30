package com.ua.main.homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // програма для знаходження більшого з двох чисел

        System.out.println("Search for larger number from two integer numbers");
        System.out.println("Please enter first integer number");
        Scanner inputStream = new Scanner(System.in);

        int firstValue = inputStream.nextInt();

        System.out.println("Please enter second integer number");
        int secondValue = inputStream.nextInt();

        if (firstValue != secondValue) {
            if (firstValue > secondValue) {
                System.out.println("First number greater then second number");
            } else {
                System.out.println("Second number greater then first number");
            }
        } else {
            System.out.println("First number is equal with second number");
        }

        // програма для знаходження меншого з двох чисел

        System.out.println("\nSearch for number value from two integer numbers");
        System.out.println("Please enter first integer number");
        firstValue = inputStream.nextInt();

        System.out.println("Please enter second integer number");
        secondValue = inputStream.nextInt();

        if (firstValue != secondValue) {
            if (firstValue < secondValue) {
                System.out.println("First number less then second number");
            } else {
                System.out.println("Second number less then first number");
            }
        } else {
            System.out.println("First number is equal with second number");
        }

        // програма для перевірка заданого числа на парність

        System.out.println("\nLet's check if the number is even");
        System.out.println("Please enter some integer number");
        int checkNumberEven = inputStream.nextInt();

        switch (checkNumberEven % 2) {
            case 1:
                System.out.println("The input number is not even");
                break;
            case 0:
                System.out.println("The input number is even");
                break;
        }
    }
}
