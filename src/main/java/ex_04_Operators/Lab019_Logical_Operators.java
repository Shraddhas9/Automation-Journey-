package ex_04_Operators;

public class Lab019_Logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(a);
        System.out.println(!a);     // NOT operator

        boolean b = true;
        System.out.println(!!b);        // Double NOT

        boolean c= true || false;           // OR operator
        System.out.println(c);

        boolean c1= false && true;          // AND operator
        System.out.println(c1);


    }
}