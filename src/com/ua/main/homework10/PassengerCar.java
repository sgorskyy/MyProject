package com.ua.main.homework10;


public class PassengerCar extends Car {

    private String carModel;

    public PassengerCar() {
        super("Passenger Car");
        this.carModel = "Some model";
    }

    public PassengerCar(String carModel) {
        super("Passenger Car");
        this.carModel = carModel;
    }

    @Override
    public String whichCarType() {
        return "The car type is " + super.carType + " and model is " + carModel;
    }
}
