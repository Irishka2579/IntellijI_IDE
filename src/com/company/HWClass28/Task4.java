package com.company.HWClass28;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Create a Map that will store Employee name and salary.
 * Write a logic to retrieve an employee who gets the highest salary.
 * Output should be in the below format
 * John Smith=$100000
 */
public class Task4 {
    public static void main(String[] args){
        Map<String,Integer> employee=new HashMap<>();
        employee.put("Alex Lee",120000);
        employee.put("John Smith",100000);
        employee.put("Piter Pan",150000);

        Set<Map.Entry<String,Integer>> entrySet= employee.entrySet();
        Map.Entry<String,Integer> max=null;
        for(Map.Entry<String,Integer>entry:entrySet){
            if(max==null||entry.getValue().compareTo(max.getValue())>0){
                max=entry;
            }
        }
        System.out.println(max.getKey()+"=$"+max.getValue());
    }
}
