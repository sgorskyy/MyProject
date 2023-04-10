package com.ua.main.hw_lesson_23;

public class Summator{
    private Integer sumValue = 0;

    public Integer getSumValue() {
        return sumValue;
    }

    public void addToSummator(Integer toSum){
        sumValue += toSum;
    }
}
