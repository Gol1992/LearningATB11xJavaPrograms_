package ex_Strings;

import java.sql.SQLOutput;

public class String_Functions {
    public static void main(String[] args) {

        String S1 = "ABCD";
        System.out.println(S1.length());
        System.out.println(S1.toLowerCase());
        System.out.println(S1.concat("J"));

        //1.charAt
        String name = "HelloWorld";
        System.out.println(name.charAt(4));

        //2.length
        System.out.println(name.length());

        //3. concat
        System.out.println(name.concat("ofJava"));

        //4. equals()
        System.out.println(name.equals("HelloWorld"));

        //5. equalignorecase
        System.out.println(name.equalsIgnoreCase("helloworld"));

        //6.indexof()

        System.out.println(name.indexOf("W"));

        //7. replace
        System.out.println(name.replace('H', 'h'));

        //8.Splitfunctions
        String s7 = "MainHoonNaJava";
        String [] splitS8 = s7.split("a");
        System.out.println(splitS8[0]);
        System.out.println(splitS8[1]);
        System.out.println(splitS8[2]);
        System.out.println(splitS8[3]);

        //9. Substring

        //10. lowercase
        //11.uppercase
        //12. startswith
        //13. endswith
        //14. trim()
        String s8 = "      garimaaa   ";
        System.out.println(s8.trim());
        //15. compareTo()
        System.out.println(s8.compareTo("garimaaa"));

        //16. Substring
        String str = "No no no . hello entry";
        String str2 = str.substring(9, 12);
        System.out.println(str2);

        //indexof

        String n = "GariMaaA";
        System.out.println(n.indexOf("a"));
        System.out.println(n.lastIndexOf("A"));



    }
}
