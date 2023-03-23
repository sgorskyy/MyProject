package com.ua.main.hw_lesson_19;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> setTestHashSet = new HashSet<>();
        getRandomSet(setTestHashSet);
        System.out.println(setTestHashSet);

        Set<Integer> setTestLinkedHashSet = new LinkedHashSet<>();
        getRandomSet(setTestLinkedHashSet);
        System.out.println(setTestLinkedHashSet);

        Set<Integer> setTestTreeSet = new TreeSet<>();
        getRandomSet(setTestTreeSet);
        System.out.println(setTestTreeSet);

    }

    public static void getRandomSet(Set set) {
        Random value = new Random();
        for (int i = 0; i < 1000; i++) {
            set.add(value.nextInt(50));
        }
    }
}
