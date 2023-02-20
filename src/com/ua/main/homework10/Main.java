package com.ua.main.homework10;


public class Main {
    public static void main(String[] args) {
        Car testCar = new Car();
        System.out.println(testCar.whichCarType());

        PassengerCar testAudi = new PassengerCar("Audі");
        System.out.println(testAudi.whichCarType());

        Truck testTruck = new Truck("DAF");
        System.out.println(testTruck.whichCarType());
    }
}
