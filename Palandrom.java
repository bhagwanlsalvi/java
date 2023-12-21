import java.util.Scanner;

public class Palandrom {
    public static void main(String[] args) {
        int num, reversum = 0, remainder;
        System.out.print("Enter any Palindrome numbers :- ");
        Scanner palindromScanner = new Scanner(System.in);
        num = palindromScanner.nextInt();
        int originalnum = num;
        while (num != 0) {
            remainder = num % 10;
            reversum = (reversum * 10) + remainder;
            num /= 10;
        }
        if (originalnum == reversum) {
            System.out.println(originalnum + " is a palindrome");
        } else {
            System.out.println(originalnum + " is not a palindrome");
        }
    }
}
