package com.ua.main.homework10;


public class Car {
    protected String carType;

    public Car() {
        this.carType = "Some Car";
    }

    public Car(String carType) {
        this.carType = carType;
    }

    public String whichCarType() {
        return "The car type is " + carType;
    }
}
