package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_160_Methods15_PrintUniqueWords {


//    Complete a void method printUniqueWords() that will print only unique words from an array of strings. Every single unique word should be printed from the new line.
//
//            Example:
//    input:[java, code, python, code, rust, code, rust]
//    output:
//    java
//            python


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        String[] words = new String[size];
//        for(int i=0; i < size; i++){
//            words[i] = scan.next();}

        String [] words = {"java", "code", "python", "code", "rust", "code", "rust"};

        printUniqueWords(words);

    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE



        for (int x = 0; x <words.length ; x++) {
          int count =0;
            for (int i = 0; i <words.length ; i++) {
                if (words[x].equals(words[i])){
                count++;
                }
            }
            if (count==1){
                System.out.println(words[x]);
            }
            }

            }

    }
