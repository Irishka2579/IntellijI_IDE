package com.company.Class21;

public class Parent {
   static void method(int num){
     System.out.println("From Parent");
       }
}
class Child extends Parent{
   /* @Override
    void method(int num){
        System.out.println(num);//can't decrease the visibility
    */
      // static void method(int num){
         //   System.out.println("From Child");// can't decrease


        void method (String num){
            System.out.println("From Child");
        }
    }
/*class Tester{
    public static void main(String[]args){
        Child child=new Child();
        child.method(10);
       //or cna use Child.method(num:10); for the same result
    }
}

 */