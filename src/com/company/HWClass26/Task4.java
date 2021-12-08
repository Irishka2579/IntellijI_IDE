package com.company.HWClass26;

import java.util.ArrayList;

/**
 * Create an arrayList of even numbers from 1 to 50.
 * Remove any number that is divisible by 5 from that arrayList.
 */
public class Task4 {
    public static void main(String[] args) {

        ArrayList<Integer> evens = new ArrayList<Integer>();
       for (int i = 1; i <= 50; i ++) {

            if (i%2==0 && i%5!=0 ) {
                evens.add(i);

            }}
                System.out.print(evens);
            }
        }




