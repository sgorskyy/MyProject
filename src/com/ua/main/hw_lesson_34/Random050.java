package com.ua.main.hw_lesson_34;

import java.util.Random;
import java.util.concurrent.Callable;

public class Random050 implements Callable<Integer> {

    private     String  threadName;
    private     Integer randomInt;
    @Override
    public Integer call() throws Exception {
        threadName = Thread.currentThread().getName();
        randomInt = new Random().nextInt(1,50);
        return randomInt;
    }

    public String getThreadName() {
        return threadName;
    }

    public Integer getRandomInt() {
        return randomInt;
    }
}
