package ex_Arrays;

import java.util.Arrays;

public class Arrays_HighAndSecondHigh_SortFn {

    public static void main( String[] args){
        int[] arr = {1, 4, 7, 9, 3, 5};


        Arrays.sort(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("HighestNumber" + "=" + arr[arr.length-1]);
        System.out.println("SecondHighestNumber" + "=" + arr[arr.length-2]);
    }
}
