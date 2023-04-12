package Class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {
       //Below code helps us get any type of data from the console
        Scanner input =new Scanner(System.in);
        //print the text inside "" in the console
        System.out.println("Is it time for break true/false");
        /* boolean isBreak => we are creating */
        boolean isBreak=input.nextBoolean();
        if(isBreak){ //true/false
            System.out.println("Let's have a break");
        }else {
            System.out.println("Lets continue the class");}
    }
}
