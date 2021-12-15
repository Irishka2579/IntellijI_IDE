package com.company.HWClass28;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Create the collection that will store single uniques Objects of a String type
 * in which order is preserved.
 * Write a logic to concatenate all string from the collection.
 */
public class Task5 {
    public static void main(String[] args) {
        Collection<String> objects=new LinkedList<>();
        objects.add("Lemonade");
        objects.add("Water");
        objects.add("Vodka");

        for(String obj:objects){
            System.out.println(obj);
        }

    }
}

