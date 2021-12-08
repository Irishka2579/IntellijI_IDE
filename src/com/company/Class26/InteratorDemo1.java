package com.company.Class26;

import java.util.ArrayList;
import java.util.Iterator;

class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String>subjects=new ArrayList<>();
        subjects.add("SDLC");//0
        subjects.add("Manual Testing");//1
        Iterator<String> iterator=subjects.iterator();

        System.out.println(iterator.hasNext());
         System.out.println(iterator.next());
         System.out.println(iterator.next());
         iterator.remove();//has dependency on next();
        System.out.println(subjects);
        //System.out.println(subjects.set(2,"Python"));



    }


}
