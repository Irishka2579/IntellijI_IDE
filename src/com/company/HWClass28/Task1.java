package com.company.HWClass28;

import java.util.*;

/**
 * Create a map of countries with its capital that will store countries in alphabetical order.
 * Print all keys and values from a country map using for each loop and iterator.
 * Print all values from a country map using for each loop and iterator.
 */
public class Task1 {
    public static void main(String[] args) {
        TreeMap<String, String> cc = new TreeMap<>();
        cc.put("France", "Paris");
        cc.put("Italy","Milan");
        cc.put("Russia","Moscow");
        System.out.println(cc);

        Set<Map.Entry<String, String>> entrySet = cc.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        Iterator<Map.Entry<String,String>> iterator1=cc.entrySet().iterator();
        while(iterator1.hasNext()){
            Map.Entry<String,String>c= iterator1.next();
            System.out.println(c.getKey()+" "+c.getValue());
    }

        Collection<String> values= cc.values();
        for(String value:values){
            System.out.println(value);
        }

        System.out.println("- - - - - - - - - - - - - - - - ");

        Iterator<String> iterator2= values.iterator();
        while(iterator2.hasNext()){
            String value= iterator2.next();
            System.out.println(value);
        }

}}