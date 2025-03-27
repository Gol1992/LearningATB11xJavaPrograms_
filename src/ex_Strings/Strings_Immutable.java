package ex_Strings;

public class Strings_Immutable {
    public static void main(String[] args) {

        // immutable example 1
        String name = "Garima";
        name = "Genius" + " " + name;

        System.out.println(name);

        //immutable example 2
        String s1 = "Hello";
        s1 = s1.concat(" "+ "Java");
        System.out.println(s1);
    }
}
