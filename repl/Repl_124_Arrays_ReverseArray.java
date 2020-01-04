package repl;

import java.util.Scanner;

public class Repl_124_Arrays_ReverseArray {
    public static void main(String[] args) {

//        Given an array nums with 7 integers already assigned, write code to reverse it.
//        Do not use any additional arrays or Strings.
//
//        Example:
//
//        nums -> [4, 3, 2, 44, 1, 100, 55]
//        change it to:
//        nums -> [55, 100, 1, 44, 2, 3, 4]
//
//        PseudoCode:
//
//        1. Take values at index 0 and last index and swap them
//        2. Take values at index 0+1 and last index-1 and swap them
//        3. Keep repeating step 1 and 2 using a loop until you reach the middle of the array (nums.length /2)
//
//        How to swap values:
//        Example:
//
//        int temp = nums[0];
//        nums[0] = nums[4];
//        nums[4] = temp;






        Scanner input = new Scanner(System.in);
        int[] nums = {4, 3, 2, 44, 1, 100, 55};

        //TODO: write your code below
        int lastIndex = nums.length-1;
        int temp =0;
        for (int x = 0; x < nums.length/2; x++) {
                           temp=nums[x];
                nums[x]=nums[lastIndex-x];
            nums[lastIndex-x]=temp;



        }






        //Do not change below statement:
  //      System.out.println(Arrays.toString(nums));













    }
}