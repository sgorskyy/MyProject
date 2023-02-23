package com.ua.main.hw_lesson_12;

public class DemoInitChild extends DemoInit{
    static {
        System.out.println("Block #" + initNumber + "\t - Child class static initialization");
        initNumber ++;
    }

    {
        System.out.println("Block #" + initNumber + "\t - Child class initialization");
        initNumber ++;
    }

    public DemoInitChild() {
        System.out.println("Block #" + initNumber + "\t - Child constructor");
        initNumber ++;
    }
}
