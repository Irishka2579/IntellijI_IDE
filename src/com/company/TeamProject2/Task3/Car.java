package com.company.TeamProject2.Task3;

/**
 * Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice()
 * which should be returning a price of the car.
 * Create 2 sub classes: Sedan and Truck.
 * The Truck class has field as weight and has its own implementation of  calculateSalePrice() method
 * in which returned price calculated as following: if weight>2000 then returned price car should include 10% discount,
 * otherwise 20% discount.
 * The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
 * if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
 */
public class Car {

    void calculateSalePrice(double carPrice,String color) {
        System.out.println("The price of the car after sale is " + 0.97 * carPrice + " and the color is " + color);
    }}

class Sedan extends Car{
int length;
void  calculateSalePrice(int length,double carPrice,String color){
    if(length>20){
        System.out.println("Return price with 5% discount and its will be "+0.95*carPrice +". The color is "+color);
    }else {
        System.out.println("Return price with 10% discount and its will be "+0.9*carPrice+". The color is "+color);
    }}}

class Truck extends Car{
     void calculateSalePrice(int weight,double carPrice,String color){
    if (weight>2000){
    System.out.println("Return price include 10% discount and its will be "+0.9*carPrice+". The color is "+color);
} else {
        System.out.println("Return price include 20% discount and its will be  "+0.8*carPrice+". The color is "+color);
    }}}

class Tester{
    public static void main(String[]args){
 Sedan sedan=new Sedan();
 sedan.calculateSalePrice(30,15000,"Silver");
 Truck truck=new Truck();
 truck.calculateSalePrice(3000,17000,"Golden");
    }
}