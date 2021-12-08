package com.company.Class26;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.Iterator;

 public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<java.lang.String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNg");

        Iterator<java.lang.String> iterator=subjects.iterator();
       // subjects.removeIf(element.length()>4);
        while (iterator.hasNext()){
            java.lang.String element= iterator.next();
            if(element.length()>4){
                iterator.remove();
            }
        }
        System.out.println(subjects);
    }
}
