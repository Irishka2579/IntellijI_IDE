package com.company.HWClass26;

import java.util.ArrayList;

public class Task3 {

    /**
     * Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
     */
        public static void main(String[] args) {
            ArrayList<String> drinks = new ArrayList<>();
            drinks.add("7up");
            drinks.add("Mojito");
            drinks.add("Evian");

            for(int i=0;i< drinks.size();i++){
                if (drinks.get(i).contains("a") || drinks.get(i).contains("e")){
                    System.out.print(drinks.get(i).replaceAll(drinks.get(i),"Water")+" ");

                }else{

                    System.out.print(drinks.get(i)+", ");
                }
            }
            System.out.println();
            System.out.println("Right way to retrieve  it like an ArrayList");
            for (String drink:drinks){
                if(drink.contains("a")||drink.contains("e")){
                    System.out.println(drinks);
                }
            }
        }}

