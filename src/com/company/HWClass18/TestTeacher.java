package com.company.HWClass18;

public class TestTeacher {
    public static void main(String[]args){
        MathTeacher m1=new MathTeacher();
        m1.whoIs();
        m1.teach();
        m1.Math();
        ChemistryTeacher m2=new ChemistryTeacher();
        m2.whoIs();
        m2.teach();
        m2.Chemistry();
    }
}
