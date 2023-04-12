package Class9;

public class E8Arrays {
    public static void main(String[] args) {

        //print all the numbers from 6 to 0 in reverse order
        // {'F', 'E', 'D', 'C', 'B', 'A'}
        // 6 5 4 3 2 1 0

      int [] numbers={0,1,2,3,4,5,6};
      char [] chars={'A','B','C','D','E','F'};
      for (int i=chars.length-1; i>=0; i--) {
          System.out.print(numbers[i]+" ");
      }
    }
}
