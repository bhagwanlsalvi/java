class abc {
    void hy() {
        System.out.println("Hello");
    }
}

class ab extends abc {
    void by() {
        System.out.println("Bye");
    }
}

public class methodOverwrite {
    public static void main(String[] args) {
        ab obj = new ab();
        obj.hy();
    }
}
