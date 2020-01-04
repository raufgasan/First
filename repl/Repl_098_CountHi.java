package repl;

import java.util.Scanner;

public class Repl_098_CountHi {
    public static void main(String[] args) {

//        Print out the number of times that the string "hi" appears anywhere in the given string.+
//                Example:
//        input: abc hi how hi
//        output: 2
//
//        Example:
//        input: hi code java please
//        output: 1



        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count=0;

        for (int x = 0; x <str.length()-1 ; x++) {
            str.substring(x,x+1);
            System.out.println(str.substring(x,x+2));
            if(str.substring(x,x+2).contains("hi")){
                ++count;
            }
        }


        System.out.println(count);




    }


    }