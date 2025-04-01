package ex_Arrays;

import java.util.Scanner;

public class Arrays_User_Inputs {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the array(int) only");
        int size = sc.nextInt();

        int[] number_marks = new int[size];

        for (int i = 0; i <number_marks.length; i++){
            System.out.println("Please enter the Marks");
            number_marks[i] = sc.nextInt();
        }

        for (int i= 0; i <number_marks.length; i++){
            System.out.println("array =" + number_marks[i]);
        }

    }
}
