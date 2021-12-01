package com.company.HWClass20;

public class CrCard {
    //Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.

    double balance;
    double interest;

    void calculate(double balance,double interest){

        System.out.println( balance*interest/100);
    }

}
class Visa extends CrCard{

}
class AX extends CrCard {
    @Override
    void calculate(double balance,double interest) {
        System.out.println(balance * interest / 100);
    }

}
class Tester{
    public static void main(String[] args) {
        CrCard creditCard=new CrCard();
        creditCard.calculate(8000,1.61);
        Visa visa=new Visa();
        visa.calculate(5000,2.5);
        AX ax=new AX();
        ax.calculate(10000,3.43);

    }

}
