package com.ua.main.hw_lesson_26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in   );
        boolean loop  = true;

        while(loop) {

            System.out.println("Input number");
            int testNumber = input.nextInt();

            try {
                System.out.println("The square of number " + testNumber + " is " + squareOfNumber(testNumber));
                loop = false;
            } catch (NegativeNumberException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static int squareOfNumber(int number) throws NegativeNumberException {

        if(number < 0){
            throw new NegativeNumberException("Exception. Number is negative");
        }

        return number * number;
    }
}
