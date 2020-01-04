package repl;

import java.util.Scanner;

public class Repl_088_CatsAndDogs {
    public static void main(String[] args) {


//       Print true if the string "cat" and "dog" appear the same number of times in the given string word.
//        Example:
//        input: catdog
//        output: true
//
//        Example:
//        input: catcat
//        output: false
//
//        Example:
//        input: cat-cheetah-dog-cat
//        output: false



        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word =scan.next();

            for (int x = 0; x <=10 ; x++) {

            if (word.substring(x,x+3).equalsIgnoreCase("dog")){
                ++countOfDogs;
            }if (word.substring(x,x+3).equalsIgnoreCase("cat")) {
                ++countOfCats;
            }


        }


        System.out.println(countOfCats==countOfDogs);
    }
}



