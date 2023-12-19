//1 2 3 4 5 
//2 3 4 5 
//3 4 5 
// 4 5 
//  5 
// 4 5 
//3 4 5 
//2 3 4 5 
//1 2 3 4 5 

public class partten8 {
    public static void main(String arsg[]) {
        int i, j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
