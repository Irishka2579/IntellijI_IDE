package com.company.Class26;

import com.company.HWClass18.A;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Fruit>fruit=new ArrayList<>();
        fruit.add(new Apple());
        fruit.add(new Orange());
        for(Fruit f:fruit){
            f.printName();
        }
    }
}
class Fruit{
    void printName(){
System.out.println("Iam a fruit");
    }
}
class Apple extends Fruit{
    void printName(){
        System.out.println("Iam an Apple");
    }
}
class Orange extends Fruit{
    void printName(){
        System.out.println("Iam an Orange");
    }
}