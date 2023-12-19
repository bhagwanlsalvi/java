public class methodOvering {
    void hy(int a, int b, int c) {
        int sum = a + b - c;
        System.out.println(sum);
    }

    void hy(int a) {
        int b = 1, sub;
        sub = a - b;
        System.out.println(sub);
    }

    public static void main(String[] args) {
        methodOvering obj = new methodOvering();
        obj.hy(5);
        obj.hy(1, 3, 9);
    }
}
