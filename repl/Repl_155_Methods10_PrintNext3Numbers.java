package repl;

import java.util.Scanner;

public class Repl_155_Methods10_PrintNext3Numbers {


//
//    Create a method called next3 . This method gets an int argument and prints the next 3 numbers after that number. Call the method from main method and pass num to it.
//
//            enter number
//1
//    next 3 are:
//            2 3 4
//
//            (put a space between numbers)




    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

        next3(num);
    }

    public static void next3(int x){
        int y = 0;
        for (int i = 1; i < 4; i++) {
            y =x+i;
            System.out.print(y+" ");
        }



    }


}






