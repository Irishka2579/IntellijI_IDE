package com.company.Class28.Maps;

import java.util.TreeMap;

public class Demo4 {
    public static void main(String[] args) {
        TreeMap<String,Double> grocerielist1=new TreeMap<>();
        grocerielist1.put("Eggs",3.99);
        grocerielist1.put("Tomato",3.2);
       // grocerielist1.put("Potato",10); auto conversion doesn't work in wrapper class
        grocerielist1.put("Potato",10.0);
        grocerielist1.put("Milk",5.0);
        grocerielist1.put("Fish",15.0);

        TreeMap<String,Double> grocerielist2=new TreeMap<>();
        grocerielist2.put("Beer",2.0);
        grocerielist2.put("Shampoo",13.0);
        grocerielist2.put("Soap",20.0);

        TreeMap<String,Double> grocerieList=new TreeMap<>();
        grocerieList.putAll(grocerielist1);
        grocerieList.putAll(grocerielist2);
        System.out.println(grocerieList);//will print alphabetical

    }
}
