package com.company.TeamProject2.Task2;

/**
 * We have to calculate the average of marks obtained in three subjects
 * by student A and by student B. Create class 'Marks' with an abstract method
 * 'getPercentage' that will be returning the average percentage of marks.
 * Provide implementation of abstract method in classes 'A' and 'B'.
 * The constructor of student A takes the marks in three subjects as its parameters
 * and the marks in four subjects as its parameters for student B. Test your code
 */

public abstract class Marks {
     abstract void getPercentage();

}
class studentA extends Marks{
    int par1;int par2;int par3;
    studentA(int par1,int par2,int par3){
        this.par1=par1;
        this.par2=par2;
        this.par3=par3;
        System.out.println("Student A:");
    }
    @Override
    void getPercentage(){
        System.out.println("The average percentage of parameters is "+(par1+par2+par3)/3);
    }
}
class studentB extends Marks{
    int p1;int p2;int p3;int p4;
   studentB(int p1,int  p2,int p3,int p4){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        this.p4=p4;
        System.out.println("Student B:");
    }
    @Override
    void getPercentage(){
        System.out.println("The average percentage of parameters is "+(p1+p2+p3+p4)/4);
    }
}
class Tester{
public static void main(String[]args){
    studentA a=new studentA(78,67,38);
    a.getPercentage();
    studentB b=new studentB(56,89,45,90);
    b.getPercentage();
}}