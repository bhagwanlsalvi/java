public class prefix_postfix {
    public static void main(String[] args) {
        int a = 10, b = 20;
        a = a++; // ++a prefix and a++ postfix
        b = ++b;
        System.out.println("A is Prefix= " + a++);
        System.out.println("B is Postfix= " + ++b);
    }
}
