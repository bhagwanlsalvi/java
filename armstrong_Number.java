import java.util.Scanner;

public class armstrong_Number {
    public static void main(String[] args) {
        int n,arm=0,rem,c;
        System.out.println("Enter any Number: ");
        Scanner r = new Scanner(System.in);
        n=r.nextInt();
        c=n;
        while (n>0) {
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm){
            System.out.print(c+" is an Armstrong number");
        }
        else{
            System.out.print(c+" is not an Armstrong number");
        }
    }
}
