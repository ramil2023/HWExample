package review2;

public class Casting {

    //widening/implicit/automatic
    // byte ->short ->int ->long ->float ->double
    public static void main(String[] args) {
        double d=19;
        System.out.println(d); //19.0
        //narrowing/explicit/manual
        //double ->float ->long ->int ->short ->byte
        int i=(int)19.9;
        System.out.println(i); //19
    }
}
