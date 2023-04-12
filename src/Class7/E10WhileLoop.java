package Class7;

public class E10WhileLoop {
    // Print 1 2 4 5 7 8 10 11 13 14 16 17 19 20 hint modulus operator %
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 20) {


            if (counter % 3 != 0) {

                System.out.print(counter + " ");
            }
            counter++;
        }
    }

}