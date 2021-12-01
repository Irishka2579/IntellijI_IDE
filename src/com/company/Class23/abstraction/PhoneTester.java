package com.company.Class23.abstraction;

public class PhoneTester {
    public static void main (String[]args){
        Iphone iphone=new Iphone();

        iphone.displayPictures();
        iphone.unlockPhone();
        iphone.makePhoneCalls();
        iphone.sendText();
}
}
