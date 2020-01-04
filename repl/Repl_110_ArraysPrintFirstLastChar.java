package repl;

import java.util.Scanner;

public class Repl_110_ArraysPrintFirstLastChar {
    public static void main(String[] args) {

//        Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
//words → ["hello", "why", "by", "apple" , "note"]
//print:
//       ho
//       wy
//       by
//       ae
//       ne



        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print firt and last char of each items in one line

        //TODO: Write your code below

        for (int i = 0; i < words.length; i++) {

            System.out.println(""+words[i].charAt(0)+words[i].charAt(words[i].length()-1));

        }


    }
        }


