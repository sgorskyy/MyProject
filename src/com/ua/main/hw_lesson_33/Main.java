package com.ua.main.hw_lesson_33;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread testThread = new Thread(()->{
            Random random = new Random();
            while(!Thread.currentThread().isInterrupted()){
                int randomInt = random.nextInt(1,10);
                System.out.println("New value is: "+ randomInt);
                if(randomInt == 5){
                    Thread.currentThread().interrupt();
                    System.out.println("Value is 5, interrupt thread!");
                }
            }
        });

        testThread.start();
        testThread.join();

        System.out.println("That all!");

    }
}
