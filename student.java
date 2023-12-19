public class student {
    String name;
    int age;
    int rollno;
    String address;

    public static void main(String[] args) {
        student std = new student();
        std.name = "bhagwan lal salvi";
        std.age = 19;
        std.rollno = 102;
        std.address = "surat,gujarat";
        std.bhagwan();
        student st = new student();
        st.name = "shery";
        st.age = 19;
        st.rollno = 20;
        st.address = "bhilwara";
        st.shery();
    }
    
    void bhagwan() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Roll No = " + rollno);
        System.out.println("Address = " + address);
    }

    void shery() {
        System.out.println("\n");
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Roll No = " + rollno);
        System.out.println("Address = " + address);
    }
}
