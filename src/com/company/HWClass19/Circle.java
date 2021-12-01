package com.company.HWClass19;

 class Circle extends Shape {
  double area;
  public Circle(int radius) {
   super(radius);
  } void calculate(){
   double area=3.14*radius*radius;
   System.out.println(area);
  }
 }