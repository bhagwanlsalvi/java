import java.util.Scanner;

public class student {
    String name;
    int age;
    int rollno;
    String address;
    String city;

    public static void main(String[] args) {
        student std = new student();
        Scanner namScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("There are some details of students :- ");
        System.out.print("Enter the Student Name : ");
        std.name = stringScanner.nextLine();
        System.out.print("Enter the Roll No :");
        std.rollno = namScanner.nextInt();
        System.out.print("Enter the Age :");
        std.age = namScanner.nextInt();
        System.out.print("Enter the Address :");
        std.address = stringScanner.nextLine();
        System.out.print("Enter the City :");
        std.city = stringScanner.nextLine();
        System.out.println("\nStudent Details are as Follows:\nName : " + std.name + "\nRoll Number : " + std.rollno
                + "\nAge :" + std.age + "\nAddress :" + std.address + "\nCity=" + std.city);
    }
}
