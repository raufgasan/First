package repl;

import java.util.Scanner;

public class Repl_097_CountJava {
    public static void main(String[] args) {

//
//        Return the number of times that the string "java" appears anywhere in the given string word.
//                Example:
//        input: javaxjava
//        output: 2
//
//        Example:
//        input: javaxjavaapplepearjavaegg
//        output: 3

        Scanner scan= new Scanner(System.in);
        String word = scan.next();
            int count=0;

        for (int x = 0; x <word.length()-3 ; x++) {
            word.substring(x,x+4);
            if(word.substring(x,x+4).contains("java")){
                ++count;
            }
        }


        System.out.println(count);

    }


    }