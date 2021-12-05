package com.company.Class25.collectionFrameWork;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("TestNg");
        subjects.add("Cucumber");
        subjects.add("Sql");
        subjects.add("APIs");
        subjects.add("Docker");
        subjects.add("AWS");
        subjects.add("Mobile Testing");
        subjects.add("Mock Interview");
        System.out.println(subjects);//set the array list one by one
        subjects.add(4,"Selenium");//will appear on index 4
        System.out.println(subjects);

    }
    }

