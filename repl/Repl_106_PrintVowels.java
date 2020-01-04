package repl;

import java.util.Scanner;

public class Repl_106_PrintVowels {
    public static void main(String[] args) {


//        Inputs:
//        String word;
//
//        Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
//        In: howdyho
//                oo
//
//        In: huehuehuehue
//                ueueueue
//
//        In: poopoo what idk what im doing
//        ooooaiaioi



        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for (int x = 0; x <word.length() ; x++) {

            if (word.charAt(x)=='a'||word.charAt(x)=='e'||word.charAt(x)=='i'||word.charAt(x)=='o'||word.charAt(x)=='u'){
                System.out.println(word.charAt(x));
            }

        }



    }


}

