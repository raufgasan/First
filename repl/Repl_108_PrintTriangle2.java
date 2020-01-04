package repl;

import java.util.Scanner;

public class Repl_108_PrintTriangle2 {
    public static void main(String[] args) {

/*        Assume that the int variables i and j have been declared, and that n has been declared and initialized.
                Using for loops (you may need more than one), write code that will cause a triangle of asterisks of size n to be output to the screen.

                Example:
        input: 5
        output: *
        output: **
        output: ***
        output: ****
        output: *****
        */


        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


       String star = "";

        for (int k = 0; k < n; k++) {
            star+="*";
            System.out.println(star);

        }









    }
        }


