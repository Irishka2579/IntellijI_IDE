package com.company.Class24.interfaceDemo4;

public interface I1 {
    void method();
    int age=10;
static void method2(){
    System.out.println("Iam a method 2 from Interface 1");
}
}
interface I2{
    int age=20;
    void method();
    static void method2(){
        System.out.println("Iam a method 2 from Interface 2");
    }
}
class Test  implements I1,I2{

    @Override
    public void method() {
        System.out.println("I will be called for both the methods from both Interfaces");
    }
}
class Main{
    public static void main(String[]args){
        System.out.println(I1.age);
        System.out.println(I2.age);
        I1 i1=new Test();
        i1.method();
        I2 i2=new Test();
        i2.method();
        I1.method2(); //calling straight for static
        I2.method2();//calling straight for static
    }
}
//multiple inheritance for developers