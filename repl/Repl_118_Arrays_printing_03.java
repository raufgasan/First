package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_118_Arrays_printing_03 {
    public static void main(String[] args) {

/*        The code provided in your main method will take in six Strings and save them into an array called arr.
        Print out the 43 neighboring items of array in one line until the last line
        each line should contain 3 neighboring items of array element as displayed below
        user for loop*/

        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 6 items
        //and print three neibouring items at a time till last item
        //write your code below


        for (int x = 0; x <4 ; x++) {
            System.out.println(arr[x]+" , "+arr[x+1]+" , "+arr[x+2]);

        }




    }
        }


