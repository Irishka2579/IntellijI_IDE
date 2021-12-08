package com.company.HWClass26;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour
 * as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health.
 * Car class has it’s own attribute as carModel and Class Pet has petType attribute.
 * Create 3 objects of the sub classes and store them in ArrayList.
 * Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public abstract class Insurance {
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
        System.out.println("The name of insurance is "+insuranceName);}
    abstract void getQuote();
    abstract void cancelInsurance();
}
  class Car extends Insurance{
    String carModel;
     Car(String insuranceName,String model) {
         super(insuranceName);
         this.carModel=carModel;
         System.out.println("The name of The model is "+model+". and the insurance is "+insuranceName);
     }
     @Override
     void getQuote(){
         System.out.println("this Car get Quote ");
     }
     @Override
     void cancelInsurance(){
         System.out.println("You can cancel insurance but there is a fee");
     }
 }
  class Pet extends Insurance{
    String petType;
     Pet(String insuranceName,String petType) {
         super(insuranceName);
         this.petType=petType;
         System.out.println("This is a "+petType+" and it has insurance name "+insuranceName);
     }
     @Override
     void getQuote(){
         System.out.println("This "+petType+" get quote");
     }
     @Override
     void cancelInsurance(){
         System.out.println("Not necessary to have insurance");
     }
 }
   class Health extends Insurance{

     Health(String insuranceName) {
         super(insuranceName);
         System.out.println("You need "+insuranceName+" insurance for health");
     }
     @Override
     void getQuote(){
         System.out.println("This "+insuranceName+" get quote");
     }
       @Override
       void cancelInsurance(){
           System.out.println(" Better to never cancel insurance in your life");
       }

 }
 class InsuranceTester{
     public static void main(String[] args) {
        Insurance car=new Car("Geiko","Tesla");
        Insurance pet=new Pet("Fidelis","Cat");
        Insurance health=new Health("Liberty");

         ArrayList<Insurance> list=new ArrayList<>();
         list.add(car);
         list.add(pet);
         list.add(health);
         for(Insurance l:list) {
             l.getQuote();
             l.cancelInsurance();
             System.out.println();
     }
         System.out.println("For Loop and iterator:");

         Iterator<Insurance> iterator= list.iterator();
         for(int i=0; i<list.size(); i++){
             Insurance in=iterator.next();
             in.getQuote();
             in.cancelInsurance();
             System.out.println();
         }
 }}