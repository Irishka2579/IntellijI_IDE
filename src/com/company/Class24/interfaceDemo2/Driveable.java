package com.company.Class24.interfaceDemo2;

public interface Driveable {
    void drive();

}
class Bike implements Driveable{
    @Override
    public void drive(){
        System.out.println("Driving a Bike");
    }
}
class Car implements  Driveable{

    @Override
    public void drive() {
        System.out.println("Driving a Car");
    }
}