package Class8;

public class E13NestedLoops {
    public static void main(String[] args) {
        for (int i = 2; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }

        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
    }
}
