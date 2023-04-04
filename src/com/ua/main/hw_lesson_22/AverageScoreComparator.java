package com.ua.main.hw_lesson_22;

import java.util.Comparator;
public class AverageScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAverageScore() < o2.getAverageScore()) {
            return 1;
        } else if(o1.getAverageScore() > o2.getAverageScore()) {
            return -1;
        } else {
            return 0;
        }
    }
}
