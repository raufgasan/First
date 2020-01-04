package repl;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Repl_122_Arraysfindnonduplicate {
    public static void main(String[] args) {


//        Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.
//
//        Example:
//
//        nums -> [1, 1, 2, 3, 4, 3, 4]
//        2
        Scanner input = new Scanner(System.in);
        int[] nums = {2,3,4,5,9,2,3,4,5};

        //TODO: write your code below

        for (int x = 0; x <nums.length ; x++) {
            int count = 0;
            for (int i = 0; i <nums.length ; i++) {
                if (nums[x]==nums[i]){
                    count++;

                }

            }
if (count==1){
    System.out.println(nums[x]);
}

        }




        }




    }



