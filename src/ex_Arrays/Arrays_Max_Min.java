package ex_Arrays;

public class Arrays_Max_Min {

    public static void main(String[] args) {

        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int Max_number = GiveMeMax(array);
       int Min_number = GiveMeMin(array);
        System.out.println(Max_number);
       System.out.println(Min_number);
        }

   private static int GiveMeMin(int[] array) {
        int Min = array[0];
        for(int i=0; i< array.length; i++){
            if(array[i] < Min){
                Min = array[i];
            }
        }
        return Min;
    }

    private static int GiveMeMax(int[] array) {
        int max = array[0];
        int i;
        for (i =0; i<array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}