package ex_05_TernaryOperator;

public class Lab036_TypeCasting_Widening01 {
public static void main(String[] args){
    byte a = 10;
     int b = a;          //  Valid syntax - Implicit - Casting Widening - JVM/ JAVA
     int c = (int)a;         //  Valid syntax - Explicit - Widening
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

}

}



