import java.util.Scanner;

public class Fabonice_Series {
    public static void main(String[] args) {
        int num, num1 = 0, num2 = 1;
        System.out.print("Enter any fabonic numbers :- ");
        Scanner fabScanner = new Scanner(System.in);
        num = fabScanner.nextInt();
        // System.out.print(n + " ");
        for (int i = 1; i <= num; ++i) {
            System.out.print(num1 + ", ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

    }
}
