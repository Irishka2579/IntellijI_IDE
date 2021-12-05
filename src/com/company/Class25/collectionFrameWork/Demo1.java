package com.company.Class25.collectionFrameWork;

import javax.xml.soap.SOAPPart;
import java.util.ArrayList;

//Limitation of arrays
//1)Arrays are fixed in size
public class Demo1 {
    public static void main(String[] args) {
        String name="Hasim";
        String name2="Ahmet";
        String[]names={"Maryum","Amran"};
        //name[2]="Mohammad";//can't add more than 2 element

        ArrayList<String> listOfNames=new ArrayList<>();
        System.out.println("Size of listOfNames "+listOfNames.size());
        listOfNames.add("Mustafa");
        System.out.println("Size of listOfNames "+listOfNames.size());
        listOfNames.remove("Tamanna");
        System.out.println("Size of listOfNames "+listOfNames.size());
    }
}
