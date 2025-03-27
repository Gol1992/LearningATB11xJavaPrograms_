package ex_Strings;

public class String_Lab_InterviewQ_01 {
    public static void main(String[] args) {

        String s1 = "Garima";
        String s4 = "Garima";


        String s3 = new String("Garima");
        String s5 = new String("garima");
        String s2 = new String("Garima");

        //comparision operator
        System.out.println(s1 == s3); //false
        System.out.println(s1 == s5); // false
        System.out.println(s3 == s2); //fasle

        // equals content
        System.out.println(s1.equals(s3)); //true
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));
    }
}
