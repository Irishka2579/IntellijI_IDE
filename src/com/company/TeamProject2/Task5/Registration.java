package com.company.TeamProject2.Task5;

import java.util.Locale;

/**
 * Create Registration Class in which you would have variables as email,
 * userName and password that have an access scope only within its own class.
 * After creating an object of the class user should be able to call methods
 * and in each method separately pass values to set users email, username and password.
 * Requirements:
 * Valid email consider to be only yahoo
 * Valid userName and password cannot be empty and should be of length larger than 6 characters.
 * Also valid password cannot contain userName.
 */
public class Registration { //we use getter and setter when the info is private
    private String email;
    private String userName;
    private String password;


    public String getEmail() {
        if (email.contains("yahoo")) {
            return email;
        }else {
        return "wrong address";
    }}

        public void setEmail (String email){
            this.email = email;
        }

        public String getUserName () {
            return userName;
        }

        public void setUserName (String userName){
            this.userName = userName;
        }

        public String getPassword () {
        if(password!=userName && password.length()>6){
            return password;
        }else{
            return "wrong password";
        }}

        public void setPassword (String password){
            this.password = password;
        }
    }

    class  Tester {
        public static void main(String[] args) {
            Registration obj = new Registration();
            obj.setUserName("George");
            System.out.println(obj.getUserName());
            obj.setEmail("geo@yahoo.com");
            System.out.println(obj.getEmail());
            obj.setPassword("letMein");
            System.out.println(obj.getPassword());


            
            
        }
    }




