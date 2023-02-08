package com.ua.main.homework8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[10];

        System.out.print("Array: \t");
        for (int i = 0; i < myArray.length; i++) {
            Random randNumber = new Random();
            myArray[i] = randNumber.nextInt(20);
            System.out.print(myArray[i] + "\t");
        }

        int minNumber = myArray[0];
        int maxNumber = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            if (minNumber > myArray[i]) {
                minNumber = myArray[i];
            }
            if (maxNumber < myArray[i]) {
                maxNumber = myArray[i];
            }
        }
        System.out.println("\nMin value of item in array is: " + minNumber);
        System.out.println("Max value of item in array is: " + maxNumber);

        int sumOfvalue = 0;
        for (int i = 0; i < myArray.length; i++) {
            sumOfvalue += myArray[i];
        }

        System.out.println("Average value of array values is :" + (double) sumOfvalue/myArray.length);
        System.out.println("Sum of array values is :" + sumOfvalue);
    }
}
