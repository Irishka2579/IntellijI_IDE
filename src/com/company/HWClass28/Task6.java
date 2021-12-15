package com.company.HWClass28;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Create a collection of integers in which you can keep duplicates.
 * Write a logic to find sum of all integers
 */
public class Task6 {
    public static void main(String[] args) {
        Integer sum=0;
        Collection<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(5);
        nums.add(89);

        for(Integer n:nums){

            sum+=n;
        }
        System.out.println("The sum of all integers is "+sum);

    }
}
