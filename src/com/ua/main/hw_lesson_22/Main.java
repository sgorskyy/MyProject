package com.ua.main.hw_lesson_22;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Serge",5));
        students.add(new Student("Taras",4.5));
        students.add(new Student("Andrey",4.5));
        students.add(new Student("Katya",4.7));
        students.add(new Student("Boris",3.5));

        System.out.println(students);

        var sortedByAverageScore = students.stream()
                .sorted((s1, s2) -> new
                        AverageScoreComparator().compare(s1, s2))
                .collect(Collectors.toList());

        System.out.println(sortedByAverageScore);

        var sortedByName = students.stream()
                .sorted(Main::compare2)
                .collect(Collectors.toList());

        System.out.println(sortedByName);

    }


    private static int compare2(Student s1, Student s2) {
        return new NameComparator().compare(s1, s2);
    }
}
