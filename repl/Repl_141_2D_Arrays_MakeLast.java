package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_141_2D_Arrays_MakeLast {

    public static void main(String[] args) {
//        Given an int array, print a new array with double the length where its last element is the same as the original array, and all the other elements are 0.
//        The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
//        Example:
//        input: 4 5 6
//        output: [0, 0, 0, 0, 0, 6]
//
//        Example:
//        input: 0
//        output: [0, 0]
//
//        Example:
//        input: 1 2 3 4
//        output: [0, 0, 0, 0, 0, 0, 0, 4]

//        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        int[] nums = new int[size];
//        for(int i =0; i < size; i++) {
//            nums[i] = scan.nextInt();
//        }
        //WRITE YOUR CODE HERE

        int nums[]={3,4,5,6};
        int doubleSize=nums.length*2;
        int newNums[]= new int[doubleSize];
        int lastnum=nums[nums.length-1];
        newNums[newNums.length-1]=lastnum;


        System.out.println(Arrays.toString(newNums));




    }
}