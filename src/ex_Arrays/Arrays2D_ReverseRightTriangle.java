package ex_Arrays;

import java.util.Scanner;

public class Arrays2D_ReverseRightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number eg n");

        int n = scanner.nextInt();

        for (int i = n-1; i >= 0 ; i--) {
            for (int j = 0 ; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}