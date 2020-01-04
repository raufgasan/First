package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_138_ReverseSentence2 {

    public static void main(String[] args) {

//        Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.
////
////                Example:
////        sentence -> "Java is fun"
////        reversed -> "fun is Java"
        Scanner input = new Scanner(System.in);
        String sentence = "Java is fun";

        String reversed = "";
        //TODO: start your code here


        String [] arr=sentence.split(" ");

        for (int i = arr.length-1; i >0 ; i--) {
            reversed+=(arr[i]+" ");

        }

        reversed += arr[0];

        //End your code here. do not modify below statement
        System.out.println(reversed);




    }
}

