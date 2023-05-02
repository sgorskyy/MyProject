package com.ua.main.hw_lesson_32;

public class Main {
    public static void main(String[] args) {

        TestThread t1 = new TestThread();
        TestThreadInterface tti = new TestThreadInterface();
        Thread t2 = new Thread(tti);
        t1.start();
        t2.start();

    }
}
