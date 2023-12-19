import java.io.*;
public class methodcontructor {
    void methodcontructor(int a,int b) {
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        methodcontructor obj = new methodcontructor();
        obj.methodcontructor(1,2);
    }

}
