package repl;

import java.util.Scanner;

public class Repl_161_Methods16_CheckNumberPalindrome {


//    Complete a method isPalindrome() that will check if number is a palindrome. Print your result as a boolean (true or false).
//    Do not convert int into a string!
//    Example:
//    input: 1001
//    output: true
//
//    Example:
//    input: 1234
//    output: false


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE



        int palindrome = 0;
        int num1 = num;
        while(num > 0) {
            palindrome = palindrome * 10 + num % 10;
            num /= 10;
        }

        System.out.println(num1==palindrome);


    }
}