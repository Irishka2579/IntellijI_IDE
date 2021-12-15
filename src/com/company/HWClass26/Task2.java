package com.company.HWClass26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/**
 * Create an arrayList of words. Remove every word that ends with “e”.
 */

public class Task2{
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("I");
        words.add("love");
        words.add("Java");

        for(int i=0;i<words.size();i++){
            String str=words.get(i);
            if(str.toLowerCase().endsWith("e")){
                int sizeOfWord=str.length();
                int lastIndex=sizeOfWord-1;
                String newStr=str.substring(0,lastIndex);
                words.set(i,newStr);
                words.set(i,str.substring(0,str.length()-1));
            }
        }
        System.out.println(words);

 Iterator<String> iterator = words.iterator();
 while(iterator.hasNext()){
     String word=iterator.next();
     if(word.toLowerCase().endsWith("e")){
         iterator.remove();
     }
 }
        System.out.println(words);

        for(String word:words){
            if(word.endsWith("e")){
                words.remove(word);}}
                System.out.println(words);
               }
            }



