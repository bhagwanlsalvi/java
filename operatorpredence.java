public class operatorpredence {
    public static void main(String args[]) {
        int a = 7, b = 10, c = 12, result;
        result = (a + b) * (++b - --c) + (a + b) * (++b - --c);
        // (a + b) * (++b - --c)+(a+b)/(++b - --c)=0
        // 17 +17=34
        // (a + b) * (++b - --c)+(a+b)*(++b - --c)
        // ans = 0
        // (7+10) =17 + (11 - 11)=0 =17
        System.out.println(result);

        // int d = 7, e = 10, f = 12, cb;
        // cb = d + ++e - --f;
        // 7 + 11 - 12 = 18-12 = 7
        // System.out.println(cb);

        // int g = 3, h = 2, i = 1, re;

        // re = g * h * (i + h);

        // System.out.println(re);

    }
}
