package com.ua.main.hw_lesson_25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input some number");

        Boolean loop = true;

        while(loop){
            try{
                String strValue = input.nextLine();
                Integer intValue = Integer.parseInt(strValue);
                System.out.println("You input - " + intValue);
                loop = false;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Number incorrect. Input some number");
            }
         }
    }
}
