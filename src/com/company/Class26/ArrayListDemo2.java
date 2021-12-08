package com.company.Class26;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String>subjects=new ArrayList<>();
        subjects.add("SDLC");//0
        subjects.add("Manual Testing");//1
        subjects.add("Java");//2
        subjects.add("Git");//3
        subjects.add("Selenium");//4
        subjects.add("TestNg");//5

       // for(String str:subjects){
        //    if(str.length()>4){

        //    }
      //  }
        for(int i=0;i< subjects.size();i++){
            if(subjects.get(i).length()>4){
                subjects.remove(i);
            }
        }
        System.out.println(subjects);

    }
}
