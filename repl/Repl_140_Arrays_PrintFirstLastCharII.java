package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_140_Arrays_PrintFirstLastCharII {

    public static void main(String[] args) {

//        Given a String array words, iterate through each word and print first and last letter of each element in the format below.
//
//        Example:
//
//        words → ["hello", "why", "by", "apple" , "note"]
//        print → [ho, wy, by, ae, ne]

        Scanner input = new Scanner(System.in);
        String[] words = {"hello", "why", "by", "apple" , "note"};


        for (int i = 0; i <words.length ; i++) {
       words[i]=""+ words[i].charAt(0)+words[i].charAt(words[i].length()-1);

        }
        System.out.println(Arrays.toString(words));


    }
}


