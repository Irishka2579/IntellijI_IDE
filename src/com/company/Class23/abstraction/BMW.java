package com.company.Class23.abstraction;


public class BMW extends Car {
    String make;
    String model;

    BMW(String vinNumber, String carType, String make, String model) {
        super(carType, vinNumber);
        this.make = make;
        this.model = model;
        System.out.println("BMW constructor");
    }

    @Override
    public void speed() {
        System.out.println("BMW can run 300km/h");
    }

    @Override
    public void start() {
        System.out.println("BMW will start working by using keys");
    }

    void displayInfo() {
        System.out.println("we build " + make + " model " + model + " " + carType + " " + vinNumber);
    }
}

