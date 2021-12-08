package com.company.Class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new LinkedHashSet<>();
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Apple");
        hashSet.add("Apple");
        System.out.println(hashSet);

        ArrayList<String> arryList=new ArrayList<>(hashSet);
        System.out.println(arryList);

     //   LinkedHashSet<String> hashSet2=new LinkedHashSet<>(arryList);
    }
}
