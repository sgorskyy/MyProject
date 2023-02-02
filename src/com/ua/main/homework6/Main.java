package com.ua.main.homework6;

public class Main {
    public static void main(String[] args) {

        System.out.println("Print numbers from 1 to 10");
        for (int printNumber = 1; printNumber <= 10; printNumber++) {
            System.out.print(printNumber + " ");
        }

        System.out.println("\n\nShow all even numbers in range 1 - 100");
        for (byte isevenNumer = 1; isevenNumer < 101; isevenNumer++) {
            if(isevenNumer%2 == 0) {
                System.out.print(isevenNumer + "\t");
            }
            if(isevenNumer%10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nPrint factorial of numer 7 (by do while)");
        int calcFactorial = 1;
        int i = 1;
        do {
            calcFactorial *= i;
            i++;
        } while (i <= 7);
        System.out.println(calcFactorial);

        System.out.println("\nPrint factorial of numer 7 (recursive method)");
        System.out.println(getFactorial(7));

        System.out.println("\nPrint Fibonacсi numbers less then 100 (by while)");
        int calcFibonacci = 0;
        int prevFibonacci = 1;
        while (calcFibonacci < 100) {
            System.out.print(calcFibonacci + "\t");
            int storeNumber = calcFibonacci;
            calcFibonacci += prevFibonacci;
            prevFibonacci = storeNumber;
        }

        System.out.println("\nPrint Fibonacсi numbers less then 100 (recursive method)");
        nextFibonacci(0, 1, 100);

    }

    private static int getFactorial(int inputNumber) {
        if (inputNumber == 1) {
            return 1;
        }
        return inputNumber * getFactorial(inputNumber - 1);
    }

    private static void nextFibonacci(int firstNumber, int secondNumber, int lessNumber) {//should return first + second as second arg

        // not sure then this recursive method is valid

        if (firstNumber > lessNumber) {
            return;
        }

        System.out.print(firstNumber + "\t");
        firstNumber += secondNumber;
        nextFibonacci(secondNumber, firstNumber, lessNumber);
    }
}
