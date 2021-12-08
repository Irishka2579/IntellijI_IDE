package com.company.HWClass26;

import java.util.ArrayList;

/**
 * Create an arrayList of words. Remove every word that ends with “e”.
 */

public class Task2{
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("I");
        words.add("love");
        words.add("Java");

        for(String word:words){
            if(word.endsWith("e")){
                words.remove(word);
                System.out.println(words);
               }
            }

        }
    }
