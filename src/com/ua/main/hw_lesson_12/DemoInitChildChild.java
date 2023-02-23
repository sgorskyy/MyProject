package com.ua.main.hw_lesson_12;

public class DemoInitChildChild extends DemoInitChild{

    static {
        System.out.println("Block #" + initNumber + "\t - Child Child class static initialization");
        initNumber ++;
    }

    {
        System.out.println("Block #" + initNumber + "\t - Child Child class initialization");
        initNumber ++;
    }

    public DemoInitChildChild() {
        System.out.println("Block #" + initNumber + "\t - Child Child constructor");
        initNumber ++;
    }
}
