package com.company.HWClass26;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * Create a Card class that will have implemented  and unimplemented methods
 * and a constructor that will initializes credit card type.
 * Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
 * Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public abstract class Card {
    abstract void bankName();
    public void credit(){
        System.out.println("This is credit card");
    }
    String type;
     Card(String type){
        this.type=type;
        System.out.println("This "+type+" card need pin code in ATM");
    }
}
 class Visa extends Card{
     Visa(String type) {
         super(type);
     }

     @Override
    public  void bankName(){
        System.out.println("This card provides by Chase bank");
    }

}
class Mastercard extends Card{
    Mastercard(String type) {
        super(type);
    }

    @Override
    public void bankName(){
        System.out.println("This card provides by CitiBank");
    }
}
class AmericanExpress extends Card{
    AmericanExpress(String type) {
        super(type);
    }

    @Override
  public void bankName(){
        System.out.println("This card provides by Online bank");
    }

}
class CardTester{
    public static void main(String[] args) {
        Card visa=new Visa("Visa");
        Card mc=new Mastercard("Mastercard");
        Card ax=new AmericanExpress("AX");

        LinkedList<Card> cards=new LinkedList<>();
        cards.add(visa);
        cards.add(mc);
        cards.add(ax);

        System.out.println("Advanced Loop:");

        for(Card c:cards){
            c.bankName();
            c.credit();
            System.out.println();
}
        System.out.println("For Loop and iterator:");

        Iterator<Card> iterator= cards.iterator();
        for(int i=0; i<cards.size(); i++){
            Card c=iterator.next();
            c.bankName();
            c.credit();
            System.out.println();
        }
    }}