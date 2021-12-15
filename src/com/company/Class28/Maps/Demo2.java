package com.company.Class28.Maps;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<String,Integer> fruit=new HashMap<>();
        fruit.put("Apple",10);//instead of add method we use put method
        fruit.put("Mango",15);//insert the data in a map
        fruit.put("Orange",20);
        fruit.put("Kiwi",18);
        fruit.put("Apricot",50);
        System.out.println(fruit.get("Kiwi"));
        System.out.println(fruit.remove("Orange"));
        System.out.println(fruit);
        System.out.println(fruit.containsKey("cow"));
        System.out.println(fruit.containsKey("Mango"));
        System.out.println(fruit.containsKey("100"));
        System.out.println(fruit.isEmpty());
        System.out.println(fruit.replace("Mango",35));
        System.out.println(fruit);

    }
}
