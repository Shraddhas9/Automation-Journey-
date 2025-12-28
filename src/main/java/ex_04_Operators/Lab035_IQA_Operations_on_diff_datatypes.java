package ex_04_Operators;

public class Lab035_IQA_Operations_on_diff_datatypes {

    public static void main(String[] args) {
        short s = 10;
        char c = 'A'; //65
        System.out.println(c + s); // 65+10
    }
}


//It prints 75 because Java promotes char and short to int during arithmetic, so 65 + 10 is calculated as an integer.