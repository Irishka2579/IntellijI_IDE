package com.company.HWClass26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* How can you remove all duplicates from ArrayList?*/
public class Task7 {
     public static void main(String[] args) {

          ArrayList<String> aList=new ArrayList<>();
     aList.add("John");
     aList.add("Jane");
     aList.add("James");
     aList.add("Jasmine");
     aList.add("Jane");
     aList.add("James");
          HashSet<String>hashSet=new HashSet<>(aList);
          System.out.println(hashSet);

}}
