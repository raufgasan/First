package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_091_PrintLettersCombinations {
    public static void main(String[] args) {


        for (char x = 'z'; x >= 'v'; x--) {

            for (char y = 'z'; y >= 'v'; y--) {
                System.out.println("" + x + y);

            }

        }


    }
}


