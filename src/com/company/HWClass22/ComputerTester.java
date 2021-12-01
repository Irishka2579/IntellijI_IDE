package com.company.HWClass22;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers = {new Apple("Apple"), new Lenovo("Lenovo"), new HP("HP"), new Dell("Dell")};
        for (Computer c : computers) {
            c.brand();
            c.product();
            c.popularity();

            if (c instanceof Apple) {
                ((Apple) c).love();
            }
            if (c instanceof Lenovo) {
                ((Lenovo) c).think();
            }
            if (c instanceof HP){
                ((HP)c).heard();
            }
            if(c instanceof Dell){
                ((Dell)c).rec();
            }
            System.out.println("-------------------------------------------- ");
        }
    }
}

