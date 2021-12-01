package com.company.Class22;

public class Father {
    String name;
    Father(String name){
       this.name=name;
    }
    void sleep(){
        System.out.println(name+" like to sleep 8 hours");
    }
    void eat(){
        System.out.println(name+" like to eat veggie");
    }
}
