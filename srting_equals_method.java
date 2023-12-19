public class srting_equals_method {

    public static void main(String[] args) {
        String name1 = "B";
        String name2 = "b";
        StringBuffer sc = new StringBuffer("welcome");
        sc.delete(1, 3);
        sc.reverse();
        System.out.println("welcome delete indexing:" + sc);
        System.out.println("welcome Reverse indexing:" + sc);
        System.out.println(name1.equals(name2));
        System.out.println(name1.compareTo(name2));
    }
}
