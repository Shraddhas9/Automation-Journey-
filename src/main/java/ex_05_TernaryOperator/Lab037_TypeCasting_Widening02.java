package ex_05_TernaryOperator;

public class Lab037_TypeCasting_Widening02 {
    public static void main(String[] args) {

        float b = 12.5f;
       // int a = b;              // widening ->  implicit
        int a1 = (int)b;        // widening ->  explicit
      //  System.out.println(a);
        System.out.println(a1);


    }
}
