package com.company.HWClass22;
/*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class
and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array.
 Loop through each object and execute available methods*/

class Computer {
    String name;
    Computer(String name){
        this.name=name;
    }
    void brand(){
        System.out.println("This computer brand name is "+name);
    }
    void product (){
        System.out.println("This brand  "+name+" can present other product besides computers");
    }
    void popularity(){
        System.out.println(name+" is popular about");
    }

}
class Apple extends Computer{
    Apple (String name){
        super(name);
    }
    @Override
    void popularity(){
        System.out.println(name+" is popular about Quality");
    }

void love(){
    System.out.println("This is my favorite brand to use");
}}
class Lenovo extends Computer{
    Lenovo(String name){
        super(name);
    }
@Override
void popularity(){
    System.out.println(name+" popular about modern design");
}
void think(){
    System.out.println("Once i think to buy this brand but i didn't");
}
}
class HP extends Computer{
    HP(String name){
        super(name);
    }
    @Override
    void popularity(){
        System.out.println(name+" popular about long life use");
    }
    void heard(){
        System.out.println("i herad it's a good brand");
    }
}
class Dell extends Computer{
    Dell(String name){
        super(name);
    }
    @Override
    void popularity(){
        System.out.println(name+" popular about bad clarity");
    }
    void rec(){
        System.out.println("i wouldn't recommend to buy this brand");
    }
}