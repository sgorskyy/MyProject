package com.ua.main.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // return cube of given number
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Input some integer number");
        int givenNumber = inputStream.nextInt();

        if (givenNumber != 0) {
            int cubeOfNumber = getCube(givenNumber);
            if (cubeOfNumber != 0) {
                System.out.println("The cube of input number is: " + cubeOfNumber);
            }
        } else System.out.println("The cube of input number is: 0");

        // print given number of "*"
        System.out.println("Input How many * you want to print");
        int numOfChar = inputStream.nextInt();
        printChar(numOfChar);


        // print given number if input char
        System.out.println("\nInput char");
        Scanner forInputChar = new Scanner(System.in);

        String inputString = forInputChar.nextLine();
        while (inputString.length() == 0) {
            System.out.println("Input char");
            inputString = forInputChar.nextLine();
        }

        char charForPrint = inputString.charAt(0);
        System.out.println("Input How many \"" + charForPrint + "\" you want to print");
        numOfChar = inputStream.nextInt();
        printChar(numOfChar, charForPrint);

    }

    static int getCube(int inputNumber) {
        if (inputNumber > 1290) {
            System.out.println("The input number to big for calculate it cube as integer type. Please input lesser number");
            return 0;
        } else {
            if (inputNumber < -1290) {
                System.out.println("The input number to small for calculate it cube as integer type. Please input bigger number");
                return 0;
            }
        }
        return inputNumber * inputNumber * inputNumber;
    }

    static void printChar(int numberOfchar) {
        for (int i = 0; i < numberOfchar; i++) {
            System.out.print("*");
        }
    }

    static void printChar(int numberOfchar, char charForPrint) {
        for (int i = 0; i < numberOfchar; i++) {
            System.out.print(charForPrint);
        }
    }

}
