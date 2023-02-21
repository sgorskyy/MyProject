package com.ua.main.homework10;


public class Truck extends Car {
    private String truckModel;

    public Truck() {
        super("Truck");
        this.truckModel = "Some model";
    }

    public Truck(String carModel) {
        super("Truck");
        this.truckModel = carModel;
    }

    @Override
    public String whichCarType() {
        return "The car type is " + super.carType + " and model is " + truckModel;
    }
}
