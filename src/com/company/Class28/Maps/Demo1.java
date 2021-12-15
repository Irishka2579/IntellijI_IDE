package com.company.Class28.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        int[]numbers={10,20,30,50};
        for(int number:numbers){
            if(number==100){
                System.out.println("Found");
            }
        }
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        integerArrayList.add(30);
        integerArrayList.add(50);
        integerArrayList.add(70);
        integerArrayList.add(90);
        System.out.println(integerArrayList.contains(70));

        Map<Integer,String> studentsInfo=new HashMap<>();
        studentsInfo.put(12345,"Alexsey");
        studentsInfo.put(4445,"Jimmy");
        System.out.println(studentsInfo.get(4445));
    }
}
