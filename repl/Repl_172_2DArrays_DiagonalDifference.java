package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_172_2DArrays_DiagonalDifference {
    public static void main(String[] args) {

//        Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//                For example, the square matrix  is shown below:

//
//        The left-to-right diagonal = 1+5+9 = 15. The right to left diagonal =  3+5+9 = 17. Their absolute difference is |15-17| = 2.



//        Scanner scan = new Scanner(System.in);
//        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
//                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
//                {scan.nextInt(), scan.nextInt(), scan.nextInt()}
//        };                 x y+2    x+1 y+1   x+2 y



        //                    1 2 3
//                            4 5 6
//                            9 8 9
//

//                          [0][2]     [1][1]    [2][0]
//
//                          [0][0]     [1][1]    [2][2]
       int [][] matrix =   {{1, 2, 3},{ 4, 5, 6},{ 9, 8, 9}};

        int result = 0;
        int sum1=0;
        int sum2=0;

        for (int x = 0; x <matrix.length ; x++) {


                sum1+=matrix[x][x];
                sum2+=matrix[x][(matrix.length-1)-x];

             }


       result=sum1-sum2;


        System.out.println("sum2 = " + sum2);


        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}