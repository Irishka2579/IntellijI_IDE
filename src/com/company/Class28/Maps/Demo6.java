package com.company.Class28.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Demo6 {
    public static void main(String[] args) {
        HashMap<String,Double> grocery=new LinkedHashMap<>();//one by one
        grocery.put("egg",5.5);
        grocery.put("rice",4.5);
        grocery.put("milk",6.5);
        grocery.put("tomato",6.5);

        System.out.println(grocery);
        Iterator<String> iterator=grocery.keySet().iterator();//map=>set=>Iterator
        while(iterator.hasNext()){
            String key= iterator.next();
            if(key.contains("e")){
                iterator.remove();
            }}
            System.out.println(grocery);
        }
    }

