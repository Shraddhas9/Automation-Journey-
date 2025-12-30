package Task_Assigned;

public class dec26_2025_incre_decre {

    public static void main(String[] args) {
        int a = 10;
        a = a++ + a++ + a++;   // 10+11+12 = 33
        System.out.println(a);

        int a1 = 3;
        int b = a1++ * ++a1;   // 3 * 5
        System.out.println(b);

        int a2 = 5;             // 6 +6=12-1
        System.out.println(a2++ + a2--);



    }

}
