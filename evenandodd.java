import java.util.Scanner;

public class evenandodd {
    public static void main(String args[]) {
        Scanner even = new Scanner(System.in);
        System.out.print("Enter the Value= ");
        int a = even.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " is Even");
        } else {
            // if (a % 3 == 0) {
            // System.out.println("A");
            // } else {
            // System.out.println(a + " is Odd");
            // }
            System.out.println(a + " is Odd");
        }
    }
}
