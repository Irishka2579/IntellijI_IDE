package com.company.Class24.InterfaceDemo;

public interface Person{ //abstract and public by default
    //private void eat(); not possible
    //protected void eat(); not possible
    void eat();
    void sleep();
}
interface Employee {
    void work();
}
interface SyntaxEmployees extends Employee,Person{
    void teach();

}
class SDETinstructor implements SyntaxEmployees{
    @Override
  public  void eat(){
    System.out.println("Syntax Employee eating");
}
@Override
public void work(){
    System.out.println("Working");
}
@Override
    public void sleep(){
    System.out.println("Syntax Employee sleeping");

}
@Override
    public void teach(){
    System.out.println("Can teach");
}
}