package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_146_Methods_simple_calculator {


//        create a static method called "plus", its return is void and it gets no arguments.
//
//        It asks the user to input two numbers, then it will add them and print the result.
//        Create a scanner within plus method.
//
//        Example:
//
//        enter first number:
//        1
//        enter second number:
//        2
//        result: 3


        public static void main(String[] args) {


            System.out.println("result: "+plus(1,2));
        }

        public static int plus(int num1, int num2){

            //your code here

//            Scanner scan = new Scanner (System.in);
//            num1 = scan.nextInt();
//             num2 =scan.nextInt();


            return num1+num2;
        }

    }


