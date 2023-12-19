public class sawp {
    public static void main(String arsg[]) {
        int a = 10, b = 20, c;
        c = a;
        a = b;
        b = c;
        
        // sawping
        System.out.println("A is:" + a);
        System.out.println("B is: " + b);

        // arthmetiksh oparetars program
        int sum = a + b;
        int minus = a - b;
        int divide = a / b;
        int multiply = a * b;
        int module = a % b;

        System.out.println("Sum = " + sum);
        System.out.println("minus = " + minus);
        System.out.println("divide = " + divide);
        System.out.println("multiply = " + multiply);
        System.out.println("module = " + module);

    }
}
