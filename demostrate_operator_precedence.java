import java.util.Scanner;

class demostrate_operator_precedence {
    public static void main(String[] args) {
        int x, y;
        Scanner demScanner = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        x = demScanner.nextInt(); // reading integer from user
        for (int i = 1; i <= x; i++) {
            System.out.println("Enter the value:");
            y = demScanner.nextInt(); // reading another integer from user

        }

        // int res;
        // res=((y+y)*(++y - --y)) + ((y+y)*(++y - --y));
        // System.out.println(res);

    }
}
