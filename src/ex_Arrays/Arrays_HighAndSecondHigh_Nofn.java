package ex_Arrays;

public class Arrays_HighAndSecondHigh_Nofn {
    public static void main(String[] args){

        int[] number = {20, 30,50, 88, 2, 7, 100, 400};

        int Maxnumber;
        int Secondmaxnumber;



        if(number[0] > number[1]){
            Maxnumber = number[0];
            Secondmaxnumber = number[1];
        }
        else{
            Maxnumber = number[1];
            Secondmaxnumber = number[0];
        }

        //loop through rest of the elements
        for(int i= 2; i< number.length; i++){
            if (number[i] > Maxnumber){
                Secondmaxnumber = Maxnumber;
                Maxnumber = number[i];
            }
            else if(number [i] > Secondmaxnumber && number[i] != Maxnumber){

                Secondmaxnumber = number[i];
            }
        }

        System.out.println("HighestNumber" + Maxnumber);
        System.out.println("SecondHighestnumber" + Secondmaxnumber);


    }
}
