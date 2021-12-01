package com.company.Class22.finaldemo;

   class Parent {
  final  double gravity=9.8;

  void printGravityValue(){
   //gravity=10.2;
   System.out.println(gravity);
  }
}

class Child extends Parent {
 void printGravityValue() {
 }
}

//public class FinalDemo{


