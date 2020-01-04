package repl;

import java.util.Scanner;

public class Repl_080_BuildeARout {
    public static void main(String[] args) {


//
//        Write a program that will print out route instructions.
//                our program should take 2 parameters: start point and endpoint. Use left, right, up and down for navigation.
//                Insert ">" between commands. If start point equals to endpoint - display: "start/end(start or end variable!) found".
//                Note: you may move only clockwise.
//
//                Example:
//        Input: A
////        Input: D
////        Output: right > down > left: D found
////
////        Input: C
////        Input: C
////        Output: C found
//
//        Scanner scan = new Scanner(System.in);
//        String start = scan.next();
//        String end = scan.next();
//
//
//       if (start < end )
//




        Scanner scan =new Scanner(System.in);
        char startPoint=scan.next().charAt(0);
        char endPoint=scan.next().charAt(0);

        if (startPoint==endPoint){
            System.out.println(endPoint+"found");
        }else {
            while(startPoint!=endPoint){
                if (startPoint=='A'){
                    startPoint= 'B';
                    System.out.print("Right: ");
                }
                else if (startPoint=='B'){
                    startPoint= 'C';
                    System.out.print("Down: ");
                }
               else if (startPoint=='C'){
                    startPoint= 'D';
                    System.out.print("Left: ");
                }
               else if (startPoint=='D'){
                    startPoint= 'A';
                    System.out.print("Up: ");
                }
               if (startPoint!=endPoint){
                   System.out.print(">");
               }else{
                   System.out.print(endPoint+" found");
               }
            }
        }










    }
}


