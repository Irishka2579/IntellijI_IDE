package com.company.Class23.abstraction;

abstract public class Vehicle {
   // abstract String vin_number; abstract not allowed with fields
    String vinNumber;
    static int  totalVehicles;
  /*  abstract Vehicle(){
        }*/ //not allowed with costructors
    Vehicle(String vinNumber){
        totalVehicles++;
        this.vinNumber=vinNumber;
        System.out.println("Grandpa constructors is Called");
    }
    public void printVehicleCount(){
        System.out.println(totalVehicles+" Vehicle creating");
    }
    public void drive(){
        System.out.println("Vehicle is driving");
    }
    public void stop(){
        System.out.println("Vehicle stopping");
    }
    public abstract void start();

}
 abstract class Car extends Vehicle{
    String carType;
    Car(String carType, String vinNumber){
        super(vinNumber);
        this.carType=carType;
        System.out.println("Parent constructor is called");
        }
        public void drive(){
        System.out.println("Car is driving");
        }
        public abstract void speed();

}

/*public class BMW extends Car {
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
*/

