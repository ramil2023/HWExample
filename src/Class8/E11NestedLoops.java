package Class8;

public class E11NestedLoops {
    //
    public static void main(String[] args) {
        for (int i = 2; i < 10; i = i + 2) {
            for (int j = 2; j <= 10; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
