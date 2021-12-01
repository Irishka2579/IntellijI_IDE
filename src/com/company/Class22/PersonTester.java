package com.company.Class22;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Teacher("Ashgar");
        Teacher teacher = new Teacher("Ashgar");
        teacher.eat();
        Person person1=new Student("Ahmet");
        Person [] persons={new Student("farhad"),new Teacher("Asel"),new Employee("Naya")};

        for (Person person2:persons){
            person2.performDailyTask();
            if(person2 instanceof Teacher){
                ((Teacher)person2).designClasses();
            }
        }
    }
}