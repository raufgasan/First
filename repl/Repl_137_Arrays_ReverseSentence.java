package repl;

import java.util.Scanner;

public class Repl_137_Arrays_ReverseSentence {

    public static void main(String[] args) {

//        Given a String variable sentence, write code to type each word in separate lines in a reverse order.
//        Example:
//        sentence -> "Java is fun"
//        Print
//                fun
//        is
//                Java

        Scanner input = new Scanner(System.in);
        String sentence = "Java is fun";

        //type your code below

        String []sentenceSplit=sentence.split(" ");

        for (int x = sentenceSplit.length-1; x >=0 ; x--) {
            System.out.println(sentenceSplit[x]);
        }
    }
}