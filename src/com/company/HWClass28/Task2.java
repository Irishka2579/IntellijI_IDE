package com.company.HWClass28;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Create a map of Best Buy store. Place
 * item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
 * Retrieve all keys and values from a Best Buy map using EntrySet.
 */
public class Task2 {
    public static void main(String[] args) {
        HashMap<Integer,String> items=new LinkedHashMap<>();
        items.put(101,"Coffee Machine");
        items.put(102,"TV");
        items.put(103,"Blender");

        Set<Map.Entry<Integer, String>> entrySet = items.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
