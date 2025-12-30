package ex_05_TernaryOperator;

public class Lab040_TypeCasting_Combined {

    public static void main(String[] args) {
        int course = 100;
        float NSRT_GST = 18.45f;

   //   int total = course+ NSRT_GST;             // Narrowing - Implicit.
      int total1 = course+ (int)NSRT_GST;        // Narrowing - Explicit.
 //     System.out.println(total);
      System.out.println(total1);

        float total2 = course+ NSRT_GST; // widening  - Implicit
        float total3 = (float) course+ NSRT_GST; // widening  - Explicit
        System.out.println(total2);
        System.out.println(total3);

    }
}
