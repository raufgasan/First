package repl;

import java.util.Scanner;

public class Repl_099_PrefixAgain {
    public static void main(String[] args) {

//        Given a string, consider the prefix string made of the first n chars of the string. Does that prefix string appear somewhere else in the string?
//                Assume that the string is not empty and that n is in the range from 1 till str.length().
//
//                Example:
//        input: abXYabc
//        input: 1
//        output: true
//        a appears twice
//
//        Example:
//        input: abXYabc
//        input: 2
//        output: true
//        ab appears twice
//
//        Example:
//        input: abXYabc
//        input: 3
//        output: false
//        abX appears once only


        Scanner scan = new Scanner(System.in);
        String str = "abXYabc";
        int n = 3;


        int count=0;

        for (int x = 0; x <str.length()-(n-1) ; x++) {

            System.out.println(str.substring(x,x+n));
            if(str.substring(x,x+n).contains(str.substring(0,n))){
                ++count;
            }
        }


        System.out.println(count==2);









    }


    }