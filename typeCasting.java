public class typeCasting {
    public static void main(String[] args) {
        // Widening Casting program in Java
        System.out.println(" Widening Casting");
        int a = 10;
        double b = a; // Automatic casting int to double
        float c = a;
        // short f = a;
        System.out.println("A is: " + a);
        System.out.println("B is: " + b);
        System.out.println("C is: " + c);
        // System.out.println(f);

        // Narrowing Casting program in Java
        System.out.println("Narrowing Casting");
        double d = 10.98;
        int e = (int) d; // Manual Casting double to int
        System.out.println("D is: " + d);
        System.out.println("E is: " + e);

    }
}
