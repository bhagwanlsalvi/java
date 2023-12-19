
/**
 * Innerinterfaces
 */

import java.util.*;

interface client {
    void input();

    void output();
}

class interfaces implements client {
    String name;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name = ");
        name = sc.nextLine();
    }

    public void output() {
        System.out.println("Name is  = " + name);
    }

    public static void main(String[] args) {
        interfaces obj = new interfaces();
        obj.input();
        obj.output();
    }
}
