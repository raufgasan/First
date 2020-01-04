package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_130_Arrays_ShiftLeft {

    public static void main(String[] args) {


//        Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}. You may modify and print the given array, or print a new array.
//                Example:
//        input: 6, 2, 5, 3
//        output: [2, 5, 3, 6]

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int temp= nums[0];
        for (int i = 0; i <size-1 ; i++) {


            nums[i]=nums[i+1];
        }
        nums[size-1]=temp;
        System.out.println(Arrays.toString(nums));
    }
}