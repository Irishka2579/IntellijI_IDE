package com.company.HWClass26;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Create a Set collection in which you need to add names of the countries.
 * In this set we want all objects to be sorted in alphabetical order.
 * Using 2 different ways retrieve all elements from set.
 */
public class Task8 {
    public static void main(String[] args) {
        TreeSet<String> country=new TreeSet<>();//1st way
        country.add("Paris");
        country.add("Rome");
        country.add("New York");
        System.out.println(country);

        ArrayList<String> arrayList=new ArrayList<>(country);//2nd way
        System.out.println(arrayList);
    }
}
