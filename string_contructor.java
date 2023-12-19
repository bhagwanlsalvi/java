public class string_contructor {
    public static void main(String[] args) {
        String name = "Bhagwan";
        String str = new String(name + " " + "Welcome");
        System.out.println("The value of the variable 'str' is : " + str);
        char[] a = { 'A', 'b', 'c' };
        String cha = new String(a);
        System.out.print("Character Value: " + cha);
        // int[] b = { 4 };
        // String in = new String(b);
        // System.out.println("\nInteger Value: " + in);
    }

}
