package ex_Arrays;

public class Arrays_SumOfArrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 8};
        int sum = 0;

        System.out.println("------");
        for(int i= 0; i< array.length; i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
