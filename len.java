public class len {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuffer sc = new StringBuffer(str);
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        sc.append("wo");
        System.out.println(sc);

    }

}
