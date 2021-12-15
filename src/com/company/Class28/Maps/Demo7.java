package com.company.Class28.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Demo7 {
    public static void main(String[] args) {
        HashMap<String,Double> grocery=new LinkedHashMap<>();//one by one
        grocery.put("egg",5.5);
        grocery.put("rice",4.5);
        grocery.put("milk",6.5);
        grocery.put("tomato",6.5);

        System.out.println(grocery);
        Iterator<Double> iterator=grocery.values().iterator();//map=>set=>Iterator
        while(iterator.hasNext()) {
            Double value= iterator.next();
            if(value==6.5){
                iterator.remove();
            }
        }
        System.out.println(grocery);
    }
}
