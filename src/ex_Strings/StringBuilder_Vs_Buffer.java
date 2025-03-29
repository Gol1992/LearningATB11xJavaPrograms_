package ex_Strings;

public class StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        String s0= "Garima";
        String s1 = "Garima";

        StringBuffer stringBuffer = new StringBuffer("Garima");
        StringBuilder stringBuilder = new StringBuilder("Garima");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
