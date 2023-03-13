package com.ua.main.hw_lesson_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day of week: ");
        int i = scanner.nextInt();
        System.out.println(getDayOfWeek(i));
    }

    public static String getDayOfWeek(int day) {
        DaysOfWeek[] daysOfWeek = DaysOfWeek.values();

        for (DaysOfWeek dayOfWeek : daysOfWeek) {
            if (dayOfWeek.ordinal() == day - 1) {
                return dayOfWeek.name();
            }
        }

        return "Invalid query";
    }
}