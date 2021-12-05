package com.company.Class25.collectionFrameWork;

import java.util.ArrayList;

public class demo7 {
    public static void main(String[] args) {
        ArrayList<String> subjects1=new ArrayList<>();
        subjects1.add("SDLC");
        subjects1.add("TestNg");
        subjects1.add("Cucumber");
        subjects1.add("Sql");
        subjects1.add("APIs");
        ArrayList<String> subjects2=new ArrayList<>();
        subjects2.add("Docker");
        subjects2.add("AWS");
        subjects2.add("Mobile Testing");
        subjects2.add("Mock Interview");

        ArrayList<String> subjects=new ArrayList<>();
        subjects.addAll(subjects1);
        subjects.addAll(2,subjects2);
        subjects1.clear();
        subjects2.clear();
        System.out.println(subjects);
        System.out.println(subjects1);
        System.out.println(subjects2);

    }
}
