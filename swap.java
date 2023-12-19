import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a, b;
        System.out.print("Enter the Value for A= ");
        Scanner ac = new Scanner(System.in);
        a = ac.nextInt();
        System.out.print("Enter the Value for B= ");
        Scanner bc = new Scanner(System.in);
        b = bc.nextInt();

        System.out.println("A is: " + a);
        System.out.println("B is: " + b);
        // useing three variable
        // int c;
        // c = a;
        // a = b;
        // b = c;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(
            
        );
        System.out.println("A is: " + a);
        System.out.println("B is: " + b);
    }
}
