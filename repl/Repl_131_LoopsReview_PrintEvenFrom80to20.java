package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_131_LoopsReview_PrintEvenFrom80to20 {

    public static void main(String[] args) {
//        Write a for loop that prints all the even integers from 80 through 20 inclusive, separated by spaces.

        for (int x = 80; x>=20 ; x-=2) {
            System.out.print(x+" ");
        }

    }
}