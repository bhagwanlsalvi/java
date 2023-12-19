/**
 * 
 */
class parent {
    int a = 34;

}

class childClass extends parent {
    // int a=4;
    void childClass() {
        System.out.println(a);
    }

}

public class SupperKeyWord {
    public static void main(String[] args) {

        childClass obj = new childClass();
        obj.childClass();
    }

}
