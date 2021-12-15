package com.company.Class28.Maps;

import com.sun.javafx.collections.MappingChange;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> building = new TreeMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "Amazon");
        building.replace(3, "Meta");
        building.remove(2);
        System.out.println(building);

    }
}
