package com.ua.main.hw_lesson_22;


public class Student {
    private String name;
    private double averageScore;

    public Student(String name, double averageScore) {
        this.name = name;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "<" +
                name +
                ", " + averageScore +
                '>';
    }

}
