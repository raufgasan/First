package repl;

import java.util.Scanner;

public class Repl_101_ArrayaCountEvens {
    public static void main(String[] args) {

//
//        Given an array nums, calculate count of even numbers in nums (not their values!) and print out to console.
//
//                nums → [2, 1, 2, 3, 4]) → 3
//        nums → [2, 2, 0, 3, 5]) → 3
//        nums → [1, 3, 5, 7, 9]) → 0
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below
int count=0;
        for (int x = 0; x <nums.length ; x++) {
            if(nums[x]%2!=1){
                ++count;
            }

        }
        System.out.println(count);

    }
        }


