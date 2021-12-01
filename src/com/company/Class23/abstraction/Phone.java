package com.company.Class23.abstraction;

public abstract class Phone {
    void makePhoneCalls(){
        System.out.println("Making a call");
    }
    void sendText(){
        System.out.println("Sending a text");
    }
    abstract void displayPictures();//we provide requirements
    abstract void unlockPhone();
}
  class Iphone extends Phone{
    @Override
     void displayPictures(){
        System.out.println("Ipone uses Photos app to display pictures");
    }
    @Override
      void unlockPhone(){
        System.out.println("Use face ID to unlock the phone ");
    }
}
