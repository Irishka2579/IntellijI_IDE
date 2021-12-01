package com.company.Class22;

public class FatherTester {
    public static void main(String[]args){
        Father son=new Son("Sharif");
        //happens from parent class to the child
        Son sharifObj=(Son)son;
        Father son2=new Son2("Ahmet");
    }
}
