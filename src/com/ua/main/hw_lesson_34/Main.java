package com.ua.main.hw_lesson_34;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(10);

        List<Random050> rlist = new ArrayList<>();

        for (int i=0; i<20; i++) {
            rlist.add(new Random050());
        }

        List<Future<Integer>> list = es.invokeAll(rlist);

        System.out.println("Start");
        for (Future<Integer> value:list
        ) {
            System.out.println(value.get());
        }
        System.out.println("Finish");

        System.out.println("Start pool of thread check");
        for (Random050 rVal:rlist
        ) {
            System.out.println(rVal.getThreadName() + " " + rVal.getRandomInt());
        }
        System.out.println("Finish");

        es.shutdown();
    }
}
