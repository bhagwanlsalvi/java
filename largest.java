public class largest {
    public static void main(String args[]) {
        int a=50,b,c;
        // a = 50;
        b = 90;
        c = 130;
        System.out.println("A is:" + a);
        System.out.println("B is:" + b);
        System.out.println("C is:" + c);
        if (a > b && a > c) {
            System.out.println("A is largest");
        }

        else if (b > a && b > c) {
            System.out.println("B is largest");
        } else {
            System.out.println("C is largest");
        }

    }
}