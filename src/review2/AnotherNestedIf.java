package review2;

public class AnotherNestedIf {
    public static void main(String[] args) {
        /*
        if you have a covid vaccine yes or not
        if dose =1 ->you need 2 to be fully vaccinated
        if dose =2 ->you are fully vaccinated
        if dose =3 ->you are fully vaccinated and have booster
         */
        boolean vaccine = true;
        int dose = 1;

        if (vaccine) {
            System.out.println("You need second dose");
        } else if (dose == 2) {
            System.out.println("You are fully vaccinated");
        } else if (dose == 3) {
            System.out.println("You are fully vaccinated with booster");
        }
    }
}

