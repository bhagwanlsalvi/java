import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner mot = new Scanner(System.in);
        System.out.print("Enter the Month Number= ");
        int month = mot.nextInt();
        if (month == 1) {
            System.out.println("January is the Month ");
        } else if (month == 2) {
            System.out.println("February is the Month ");
        } else if (month == 3) {
            System.out.println("March is the Month ");
        } else if (month == 4) {
            System.out.println("April is the Month ");
        } else if (month == 5) {
            System.out.println("May is the Month ");
        } else if (month == 6) {
            System.out.println("June is the Month ");
        } else if (month == 7) {
            System.out.println("July is the Month ");
        } else if (month == 8) {
            System.out.println("August is the Month ");
        } else if (month == 9) {
            System.out.println("September is the Month ");
        } else if (month == 10) {
            System.out.println("October is the Month ");
        } else if (month == 11) {
            System.out.println("Noveber is the Month ");
        } else {
            System.out.println("December is the Month");
        }
    }
}
