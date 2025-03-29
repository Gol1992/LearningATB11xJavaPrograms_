package ex_Task;

import java.util.Scanner;

public class Task_TriangleClassifier {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0 ){

            System.out.println("This is not a triangle");
            return;
        }
        if (side1 +side2 <= side3 || side2+ side3 <= side1 || side3 + side1 <= side2){
            System.out.println("This is not a triangle");
            return;
        }

        //classifying the triangle
        if (side1 == side2 && side2 ==side3 ){
            System.out.println("This is an equlitaeral triangle");
        }
        else if (side1 == side2 || side2 ==side3 || side3 ==side1){
            System.out.println("This is an icoceles Triangle");
        }
        else{
            System.out.println("this is an obtuse triangle");
        }
    }
}
