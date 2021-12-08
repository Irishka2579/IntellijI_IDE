package com.company.HWClass26;

import java.util.ArrayList;


/**
 * Create an arraylist of cars and retrieve all the values using 3 different ways.
 */
public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Tesla");
        System.out.println(cars);//1st way to retrieve all elements

        for(int i=0;i<cars.size();i++){
            System.out.print(cars.get(i)+" ");//2nd way
        }
        System.out.println();
        for(String car:cars){
            System.out.print(car+" ");//3rd way
        }
    }}