package repl;

import java.util.Scanner;

public class Repl_096_RepeatSeparator {
    public static void main(String[] args) {


//        Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
//        Example:
//        input: Word
//        input: X
//        input: 3
//        output: WordXWordXWord
//
//        Example:
//        input: This
//        input: And
//        input: 2
//        output: ThisAndThis
//
//        Example:
//        input: This
//        input: And
//        input: 1
//        output: This


        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
            String out = "";
        for (int x = 1; x <count ; x++) {



                out+=word+separator;

        }

        System.out.println(out+word);

















    }


    }