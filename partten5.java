//1 
//0 1 
//1 0 1 
//0 1 0 1 
//1 0 1 0 1 
//0 1 0 1 0 1 

public class partten5 {
    public static void main(String arsg[]) {
        int i, j, n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
