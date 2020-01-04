package repl;

import java.util.Scanner;

public class Repl_089_PrintFirstAndLastLetters {
    public static void main(String[] args) {


//      Write a program that will print out first and last letters together.



        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE


        System.out.println(""+word.charAt(0)+word.charAt(word.length()-1));









    }
}