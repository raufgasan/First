package day35;

import java.util.Scanner;

public class Kamran {





        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            fib(num);
        }

        public static void fib(int num){
            int[] arrNum = new int[num+1];
            arrNum[0]=0;
            arrNum[1]=1;
            for ( int x = 2 ; x < arrNum.length ; x++ ) {
                arrNum[x]=arrNum[x-1]+arrNum[x-2];
            }
            System.out.println(arrNum[num]);
        }
    }

    /*
            The Fibonacci Sequence is the series of numbers:
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
            The next number is found by adding up the two numbers before it.
             */
    // for 1st solution
//    int n = 0;
//        System.out.println(fib2(n));
//                // for 2nd solution
//                // System.out.println(fib(5));
//                }
//// Solution 1 :
//public static int fib2(int n) {
//        /* Declare an array to store Fibonacci numbers. */
//        int[] arrFib = new int[n+2]; // n+1 gives error out of bounds, n+2 1 extra to handle case, n = 0
//        int i;
//        /* 0th and 1st number of the series are 0 and 1*/
//        arrFib[0] = 0;
//        arrFib[1] = 1;
//        for (i = 2; i <= n; i++) {
//       /* Add the previous 2 numbers in the series
//         and store it */
//        arrFib[i] = arrFib[i-1] + arrFib[i-2];
//        }
//        return arrFib[n];
//        }
