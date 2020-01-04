package repl;

import java.util.Scanner;

public class Repl_113_ArraysCountOfEvenNumber {
    public static void main(String[] args) {


//        Given an array num, calculate the count of even numbers in nums and print out to console.
//        nums → [2, 1, 2, 2, 1, 2,  3,  4, 3, 4]) → 6
//        nums → [2, 2, 5, 7, 9, 0,  3,  5, 2, 2]) → 5
//        nums → [1, 1,21,21,25,13, 17, 29, 11,3])  → 0



        Scanner input = new Scanner(System.in);
        int[] nums = new int[11];
        for(int i = 1 ; i<=10 ; i ++){
            nums[i] = input.nextInt();
        }
        // above code will ask user 10 numbers while creating an array
        // just assume that you have int array with 10 numbers and start working on requirement
        // loop through the array and get the sum of the even numbers
        //TODO: Write your code below
            int count = 0;
        for (int x = 1; x <= nums.length-1; x++) {
           if(nums[x]%2==0){
                ++count;
            }

        }
        System.out.println(count);
    }
}


