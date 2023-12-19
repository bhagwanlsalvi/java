import java.util.*;

public class lower {
    public static void main(String[] args) {
        Scanner mot = new Scanner(System.in);
        System.out.print("Enter the Month Number= ");
        int month = mot.nextInt();
        if (month >= 'a' && month <= 'z') {
            System.out.println("Numaber");
        } else {
            System.out.println("not");
        }
    }
}
