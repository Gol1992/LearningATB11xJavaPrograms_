package ex_Task;

import javax.management.monitor.StringMonitor;
import java.util.Scanner;

public class Task_Palindrome {
  public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input, I will check Palindrome");
        String userInput = sc.next();
        String newString = reverseStringSB(userInput);
        if (newString.equalsIgnoreCase(userInput)) {
            System.out.println("it is a palindrome");
        } else {
            System.out.println("it is not a palindrome");
        }
    }
  /*
    private static String reverseString(String userInput) {
        String reversed = "";

        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversed = reversed + userInput.charAt(i);
        }
        return reversed;

    } */

    //by using string builder function
    private static String reverseStringSB(String userInput){
        StringBuilder sbb = new StringBuilder(userInput);
        return sbb.reverse().toString();
    }
}

