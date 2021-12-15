package com.company.Class28.Maps;

import java.util.LinkedHashMap;

public class Demo3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> students=new LinkedHashMap<>();
        students.put(100,"Alexey");
        students.put(100,"Ahmet"); //keys should be unique //will retrive the last key if duplicate
        students.put(20,"Denis");
        students.put(50,"Henok");
        students.put(100,"Alexey"); // will appear in a map first
        System.out.println(students);
    }
}
