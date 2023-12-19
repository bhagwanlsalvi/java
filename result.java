public class result {
    public static void main(String arsg[]) {
        System.out.println("Program for Result  Calculate");
        int cyber_security = 50;
        System.out.println("Enter the  Cyber Security:- " + cyber_security);
        int computer_fandanatal = 50;
        System.out.println("Enter the Computer Fandanatal:- " + computer_fandanatal);
        int c_langvage = 50;
        System.out.println("Enter the C Langvage:- " + c_langvage);
        int multimedia = 50;
        System.out.println("Enter the MultiMedia:- " + multimedia);
        int data_structure = 50;
        System.out.println("Enter the Data Structure:- " + data_structure);
        float per, total;
        total = cyber_security + computer_fandanatal + c_langvage + multimedia + data_structure;
        System.out.println("Total= " + total);
        per = (total / 350) * 100;
        System.out.println("Total Percetage is= " + per);
        if (per <= 100 && per >= 90) {
            System.out.println("Grade is A+");
        } else if (per <= 89 && per >= 80) {
            System.out.println("Grade is A");
        } else if (per <= 79 && per >= 60) {
            System.out.println("Grade is B");
        } else if (per <= 59 && per >= 36) {
            System.out.println("Grade is C");
        } else {
            System.out.println("Fill");
        }
    }
}
