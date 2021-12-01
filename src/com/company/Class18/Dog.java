package com.company.Class18;

public class Dog extends Animal {

    void printAllInfo(){
        System.out.println(name+breed+color+age+weight);
    }

    void bark() {
        System.out.println(name + "barking");
    }
}