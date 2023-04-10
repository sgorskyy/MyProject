package com.ua.main.hw_lesson_23;

import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {


        List<String> listOfFirstNames = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            String firstName = FamousFirstNames.values()[random.nextInt(FamousFirstNames.values().length)].toString();
            listOfFirstNames.add(firstName);
        }

        System.out.println(listOfFirstNames);

        Map<String, Long> resultMap = listOfFirstNames
                .stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(resultMap);


        List<Integer> listOfNumbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            listOfNumbers.add(random.nextInt(10));
        }

        System.out.println(listOfNumbers);

        // #1 method of Sum

        Integer sumOfNubmers1 = listOfNumbers
                .stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(sumOfNubmers1);

        // #2 method of Sum

        Integer sumOfNumbers2 = listOfNumbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sumOfNumbers2);

        // #3 method of Sum

        Integer sumOfNumbers3 = listOfNumbers.stream()
                .collect(Collectors.summingInt(Integer::intValue));

        System.out.println(sumOfNumbers3);

        // #4 method of Sum

        Summator summator = new Summator();

        listOfNumbers.stream()
                .forEach(summator::addToSummator);

        System.out.println(summator.getSumValue());

    }


}
