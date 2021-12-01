package com.company.Class24.InterfaceDemo;

public class PersonTester {
    public static void main(String[]args){
        Person person=new SDETinstructor();
        person.eat();
        person.sleep();
  //person.work(); not possible
  //person.teach(); not possible
Employee emp=new SDETinstructor();
emp.work();
//emp.eat(); impossible
        SyntaxEmployees syn=new SDETinstructor();
        syn.eat();
        syn.sleep();
        syn.work();
        syn.teach();

        SDETinstructor sd=new SDETinstructor();
        sd.eat();
        sd.sleep();
        sd.teach();
        sd.work();
    }
}
