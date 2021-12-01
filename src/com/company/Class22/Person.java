package com.company.Class22;

public class Person {
    String name;
    Person(String name){
        this.name=name;
    }
    void eat(){
        System.out.println(name+"  eating");
    }
    void performDailyTask(){
        System.out.println("Eat sleep repeat");
    }
}
class Employee extends Person{
    Employee(String name){
        super(name);
    }
    void performDailyTask(){
        System.out.println("Working all day in office");
    }
}
class Student extends Person{
    Student(String name){
        super(name);
    }
    void performDailyTask(){
        System.out.println("Attending the classes");
    }
}
class Teacher extends Person{
    Teacher(String name){
    super(name);
}
void performDailyTask(){
    System.out.println("Teaching students");
}
void designClasses(){
        System.out.println("Create repls and design");
}
}