package repl;

import java.util.Scanner;

public class Repl_105_PrintLettersCombinations {
    public static void main(String[] args) {



//        Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'. The combinations should be displayed in descending alphabetical order:


        for (char x = 'z'; x >='v'; x--) {
            for (char i = 'z'; i >= 'v'; i--) {
                System.out.println(""+x+i);

            }

        }


    }


}

