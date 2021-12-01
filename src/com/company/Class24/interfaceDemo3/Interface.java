package com.company.Class24.interfaceDemo3;

public interface Interface {
    default void method1(){
        System.out.println("Iam a default method in Interface");
    }
    static  void method2(){
        System.out.println("Iam a static method in Interface");
    }
}
class Test implements Interface {
}

class Main{
    public static void main(String[]args){
        Interface.method2();//calling static strigth
       // Interface.method1(); not allowed for default methods

        Interface I1=new Test();//creating an object for default
        I1.method1();
        new Test().method1();
    }
}