//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 

public class partten4 {
    public static void main(String arsg[]) {
        int i, j;
        int a = 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
