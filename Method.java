public class Method {
    public static int a = 10;
    public static int b = 5;

    public static void Hello() {
        int sum = a + b;
        System.out.println("Sum = " + sum);
        Hii();
    }

    public static void main(String[] args) {

        Hello();
    }

    public static void Hii() {
        int minus = a - b;
        System.out.println("minus = " + minus);
    }
}
