package ex_04_Operators;

public class Lab021_InterviewQnA_Concatenation2 {
    public static void main(String[] args) {
        String first_name = "Shraddha";
        String last_name = "Walunj";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b); // throughout concatenation only
        System.out.println(a + b + first_name + last_name); // mathematical operation and than concatenation
        System.out.println(first_name + last_name + (a + b)); // Follows BODMAS RULE - Brackets first

        // BODMAS - Bracket of Div, mul, add, sub

        // First of all, whenever it sees strings,
        // it will do concatenation, and for the next
        // one also it will also do concatenation.
        // But when it sees integers first, it will do mathematical operation.
        // The second time it will see strings,
        // then it will do concatenation as well.


        // 20PramodDutta
    }
}
