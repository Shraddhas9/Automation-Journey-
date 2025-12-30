package Task_Assigned;

public class dec24_2025_Maxoutof3 {
    public static void main(String[] args) {


    int  n1= 2;
    int n2 = 9;
    int n3= -11;
    //                      F            n1: n2
    int MaximumOfThree = (n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3);
        System.out.println(MaximumOfThree);
    }
}
