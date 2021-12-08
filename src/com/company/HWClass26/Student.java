package com.company.HWClass26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Create a Set collection that will hold Objects of Student Type.
 * In this set we do not care about the insertion order.
 * Each student object should have name and studentID. Display name of each student.
 */
public class Student {
    String name;
    int id;
    Student(String name, int id){
        this.name=name;
        this.id=id;
    }
    String printName(){
        return name;
    }}
    class Tester{
    public static void main(String[] args) {
        Student james = new Student("James", 101);
        Student kevin = new Student("Kevin", 102);
        Student lora = new Student("Lora", 103);

        HashSet<Student> hash = new HashSet<>();
        hash.add(james);
        hash.add(kevin);
        hash.add(lora);

        Iterator<Student> iterator = hash.iterator();
        for (int i = 0; i < hash.size(); i++) {
            System.out.println(iterator.next().printName());
        }
    }}
