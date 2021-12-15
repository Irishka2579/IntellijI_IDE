package com.company.Class28.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo5 {
    public static void main(String[] args) {
        HashMap<String,Double> grocery=new LinkedHashMap<>();//one by one
        grocery.put("egg",5.5);
        grocery.put("rice",4.5);
        grocery.put("milk",6.5);
        grocery.put("tomato",6.5);

        Set<String> keys= grocery.keySet();
        System.out.println(keys); //will print only the keys

        Collection<Double> values=grocery.values();
        System.out.println(values);//will print only values
        Collection<String> key= grocery.keySet();//also can b e print by this way
        System.out.println(key);

        //Collection the Parent of all framework.So,you can use it
    }
}
