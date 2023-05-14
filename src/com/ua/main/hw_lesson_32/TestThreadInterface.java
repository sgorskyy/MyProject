package com.ua.main.hw_lesson_32;

public class TestThreadInterface implements Runnable{
    @Override
    public void run() {
        try{
            for(int i = 0; i < 10; i++){
                Thread.sleep(100);
                System.out.println("Thread name is " + Thread.currentThread().getName() + " and number is " + i);
            }
        }
        catch (InterruptedException e){
            System.out.println("Thread terminated");
        }
    }
}
