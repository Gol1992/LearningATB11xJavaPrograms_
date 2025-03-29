package ex_Task;

import java.util.Locale;

public class Task_CountVowels {
    public static void main(String args[]) {
        int Vowels = 0;
        int Consonant = 0;

        String Input = "Lets Check The Count Of Vowel And Consonant";
        Input = Input.toLowerCase();

        for(int i = 0; i < Input.length(); i++){
            char ch = Input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u') {

                Vowels = Vowels+1;
            }
            else {

                Consonant = Consonant+1;

            }

        }

        System.out.println("Total Vowels present is " + Vowels);
        System.out.println("Total Consonant present is " + Consonant);

    }
}
