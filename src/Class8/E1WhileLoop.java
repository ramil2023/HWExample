package Class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        //print all whole numbers from 15 to 30
        //to print all the numbers from a starting point to an ending point

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the starting and the ending point");
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        int counter=start;

        while(counter<=end) {
            System.out.print(counter+" ");
            counter++;
        }
    }
}
