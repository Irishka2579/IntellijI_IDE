package com.company.HWClass19;

  class subClass extends userClass  {
    String address;
     public subClass (String name,int mobile,String address){
         super(name,mobile);
         this.address=address;
     }
     public void userDetails(){
         System.out.println(name+" "+mobile+" "+address);
     }
}
