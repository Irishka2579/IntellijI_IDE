package com.company.Class28.Maps;

import java.util.*;

public class Demo8 {
    public static void main(String[] args) {
        HashMap<String,Double> grocery=new LinkedHashMap<>();//one by one
        grocery.put("egg",5.5);
        grocery.put("rice",4.5);
        grocery.put("milk",6.5);
        grocery.put("tomato",6.5);

        System.out.println(grocery);

        Set<Map.Entry<String,Double>> entrySet=grocery.entrySet();
        for(Map.Entry<String,Double> entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }
}
