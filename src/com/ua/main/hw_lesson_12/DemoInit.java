package com.ua.main.hw_lesson_12;

public class DemoInit {
    protected static int initNumber = 1;

    static{
        System.out.println("Block #" + initNumber + "\t - Parent class static initialization");
        initNumber ++;
    }

    {
        System.out.println("Block #" + initNumber + "\t - Parent class initialization");
        initNumber++;
    }

    public DemoInit() {
        System.out.println("Block #" + initNumber + "\t - Parent class constructor");
        initNumber++;
    }
}
