package repl;

import java.util.Scanner;

public class Repl_120_ArraysFindingMaxLengthinString {
    public static void main(String[] args) {

//        Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length
//
//        Example:
//        words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
//        prints jaaaaavvaaaaaaaaaa

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below
        String longs = "";
        int lon = 0;
        for (int x = 0; x <words.length ; x++) {
            if (words[x].length()>lon){
                lon = words[x].length();
                longs = words[x];
            }
        }
        System.out.println(longs);
    }
        }


