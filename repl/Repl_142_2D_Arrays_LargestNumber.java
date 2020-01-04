package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_142_2D_Arrays_LargestNumber {

    public static void main(String[] args) {

//  Given a 2d array of ints, find the biggest number(int) in the array and print it.
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows


        //TODO write your code below
        int maxNum = 0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if(maxNum<arr[i][j]){
                    maxNum=arr[i][j];
                }

            }

        }




    }
}