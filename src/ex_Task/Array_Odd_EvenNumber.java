package ex_Task;

public class Array_Odd_EvenNumber {
    public static void main (String[] args) {

        int[] Array = {2, 3, 4, 12, 5, 6, 7, 8, 9};

        int n = 0; //even number
        int j = 0; //odd number

        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 == 0) {
                n = n + 1;
                System.out.println(Array[i] + " " + "this is an even number");
            }
            else {
                j= j+1;
                System.out.println(Array[i] + " " + "this is odd number");
            }
        }

        System.out.println("total even numbers = " + n);
        System.out.println("total odd numbers = " + j);

    }
}
