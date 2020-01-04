package repl;

import java.util.Scanner;

public class Repl_103_PrintTriangle {
    public static void main(String[] args) {

//        Assume that the int variables i and j have been declared, and that n has been declared and initialized.
//                Using for loops (you may need more than one), write code that will cause a triangle of asterisks of size n to be output to the screen.
//
//                Example:
//        input: 5
//        output: *
//        output: **
//        output: ***
//        output: ****
//        output: *****




        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        for (int k = 0; k < n; k++) {

            System.out.println("*");

            for (int l = 0; l <n ; l++) {

                System.out.print("*");
            }
        }







    }
        }


