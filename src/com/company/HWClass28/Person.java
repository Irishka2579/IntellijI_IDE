package com.company.HWClass28;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**Create a Person class with following private fields: name, lastName, age, salary.
 Variables should be initialized through constructor.
 Inside the class also create a method to print user details.
 In Test Class create a Map that will store key in ascending order.
 In that map store personId and a Person Object. Print each object details.
 *
 */

public  class Person {

       private String name;
        private String lastname;
        private int age;
        private double salary;
       public  Person(String name,String lastname,int age,double salary ){
            this.name=name;
            this.lastname=lastname;
            this.age=age;
            this.salary=salary;

        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String PrintUserDetails(){
      return name+" "+lastname+" is "+age+" years old. "+"The salary is "+salary;
    }
}
class Tester{
    public static void main(String[] args) {
        TreeMap<Integer,String> obj=new TreeMap<>();
        Person obj1=new Person("Alex","Lee",30,180000.5);
        String person1=obj1.PrintUserDetails();
        obj.put(1001,person1);
         Person obj2=new Person("Tiffany","Co",100,1000000.8);
         String person2=obj2.PrintUserDetails();
         obj.put(1002,person2);

        Set<Map.Entry<Integer,String>>entrySet= obj.entrySet();
        for(Map.Entry<Integer,String>entry:entrySet){
            System.out.println(entry);
        }
    }
}
