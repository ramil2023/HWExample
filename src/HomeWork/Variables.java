package HomeWork;

import java.sql.SQLOutput;

public class Variables {

    public static void main(String[] args) {
        String name="Ramil";
        String lastName="Smith";
        char grade='A';
        String city="Panama City";
        String state="Florida";
        String phoneNumber="1-222-333-4444";



        System.out.println("My name is"+" "+name+" "+"and my last name is"+" "+lastName+'.');
        System.out.println("I am an"+" "+grade+ " "+"student"+'.');
        System.out.println("I live in"+" "+city+" "+"and state"+" "+state+'.');
        System.out.println("And my phone number is"+" "+phoneNumber+'.');

        city="Atlanta";
        state="Georgia";
        phoneNumber="1-333-4444-22";
        grade='B';

        System.out.println("My name is"+" "+name+" "+"and I moved to new city"+" "+city+" "+"and the state"+" "+state+'.');
        System.out.println("My new phone number is"+" "+phoneNumber+'.');





    }
}
