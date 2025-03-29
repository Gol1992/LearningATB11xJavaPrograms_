package ex_Strings;

public class StringBuilder_Functions {

    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World"); //append
        sb.reverse(); //reverse

        sb.delete(5,7); //Delete the substring
        sb.replace(0,4, "dhola");
        System.out.println(sb);

    }
}


