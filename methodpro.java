public class methodpro {
    public int addNumber(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int subNumber(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public static void main(String[] args) {
        int Num1 = 10;
        int Num2 = 20;
        methodpro obj = new methodpro();
        int sub = obj.subNumber(Num1, Num2);
        int result = obj.addNumber(Num1, Num2);
        System.out.println("The sum of " + Num1 + " and " + Num2 + " is: " + result);
        System.out.println("The difference between " + Num1 + " and " + Num2 + " is: " + sub);
    }

}
