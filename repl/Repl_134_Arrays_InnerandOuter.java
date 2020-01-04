package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_134_Arrays_InnerandOuter {

    public static void main(String[] args) {

//        Given two arrays of ints sorted in increasing order, outer and inner, print out true if all of the numbers in inner appear in outer. Take advantage of the fact that both arrays are already in sorted order.
//                Example:
//        input (outer): 1, 2, 4, 6
//        input (inner): 2, 4
//        output: true
//
//        Example:
//        input (outer): 1, 2, 4
//        input (inner): 6, 5
//        output: false

//        Scanner input = new Scanner(System.in);
//        String sentence = input.nextLine();

        //type your code below

   int inner[]=   { 1,2,3};
   int outer[]=   {1,2,2,3,4,5,6 };

        Arrays.sort(inner);
        Arrays.sort(outer);

     int count=0;

        for (int eacinn:inner) {
            for (int eacout:outer) {
            if (eacinn==eacout){
                count++;
                break;
            }
            }

        }
        System.out.println(count==inner.length);
    }
}


//4 7 -1 0 3 12 -1 0 3 3 3 10 12