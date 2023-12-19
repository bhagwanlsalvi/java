
//     1 
//    1 1 
//   1 2 1 
//  1 3 3 1 



public class partten7 {
    public static void main(String arsg[]) {
        int i, j, k;
        int n = 4;

        for (i = 1; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            int a = 1;
            for (k = 1; k <= i; k++) {
                System.out.print(a + " ");
                a = a * (i - k) / k;
            }
            System.out.println();
        }
    }
}
