import java.util.Scanner;

public class Arraypro {
    public static void main(String[] args) {
        // int arr[] = new int[1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Number is Table = ");
        int arrs = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("12 Table " + (i * arrs + i - arrs));

            // Scanner scanner1 = new Scanner(System.in);
            // arrs = scanner1.nextInt();
        }
        // Printing the array elements using a loop
        System.out.println(" Length of Array " + (arrs - 10));
    }
}
