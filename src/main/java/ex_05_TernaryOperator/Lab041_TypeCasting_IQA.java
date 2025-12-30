package ex_05_TernaryOperator;

public class Lab041_TypeCasting_IQA {

    public static void main(String[] args) {
        char ch = 'A';
        int ascii = ch; // Widening

        int num = 66; // Narrow
        char letter = (char) num;

        System.out.println(ascii);
        System.out.println(letter);

    }
}
