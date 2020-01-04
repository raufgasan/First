package repl;

import java.util.Scanner;

public class Repl_148_Methods3_FindCube {

//    Given method called cube. Write all required code inside this method in order
//    to asks the user for a number and then prints the cubed value of that number:
//
//    Example:
//
//    input: 5
//    output: 125
//
//    hint: cube of a number n = n*n*n



    public static void cube()
    {
        //your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       int cubeTot= n*n*n;
        System.out.println(cubeTot);

    }//end cube

    public static void main(String[] args) {

        cube();

    }



}


