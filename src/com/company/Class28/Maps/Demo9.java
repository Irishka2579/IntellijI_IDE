package com.company.Class28.Maps;

import java.util.*;

public class Demo9 {
    public static void main(String[] args) {
        HashMap<String,Double> grocery=new LinkedHashMap<>();//one by one
        grocery.put("egg",5.5);
        grocery.put("rice",4.5);
        grocery.put("milk",6.5);
        grocery.put("tomato",6.5);

        System.out.println(grocery);

        Iterator<Map.Entry<String,Double>> iterator=grocery.entrySet().iterator();
       while(iterator.hasNext()){
           Map.Entry<String,Double> entry=iterator.next();
           if(entry.getKey().equals("milk")&& entry.getValue()==6.5){
               iterator.remove();
           }
       }
        System.out.println(grocery);
    }
}
