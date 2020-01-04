package repl;

import java.util.Scanner;

public class Repl_092_Factorial {
    public static void main(String[] args) {

//        In mathematics, the factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n.
////        Calculate factorial and output result to the console.
//        Example:
//        input: 5
//        output: 120

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long count=1;

        for (int x = n; x >1 ; x--) {

           count=count*x;

        }

        System.out.println(count);


    }
}


