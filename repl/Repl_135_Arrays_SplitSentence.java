package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_135_Arrays_SplitSentence {

    public static void main(String[] args) {

//        Given a String variable sentence, write code to type each word in separate lines.
//
//        Example:
//        sentence -> "Java is fun"
//        Print
//                Java
//        is
//                fun

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below

        String []sentenceSplit=sentence.split(" ");

        for (int x = 0; x <sentenceSplit.length ; x++) {
            System.out.println(sentenceSplit[x]);
        }
    }
}