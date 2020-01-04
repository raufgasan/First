package repl;

import java.util.Scanner;

public class Repl_117_ArraysPrinting2 {
    public static void main(String[] args) {

/*

        The code provided in your main method will take in eight Strings and save them into an array called arr.
        Print out the 4 lines using for loop:
        each line should contain a pair of array element as displayed below
        user for loop

        The code provided in your main method will take in eight Strings and save them into an array called arr.
Print out the 4 lines using for loop:
each line should contain a pair of array element as displayed below
user for loop

*/
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 8 items
        //and print two items at a time in 4 line
        //write your code below

        for (int x = 0; x <arr.length ; x+=2) {
            System.out.println(arr[x]+" , "+arr[x+1] );
        }



    }
        }


