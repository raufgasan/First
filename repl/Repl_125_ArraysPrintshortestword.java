package repl;

import java.util.Scanner;

public class Repl_125_ArraysPrintshortestword {
    public static void main(String[] args) {

//        Write a program that will print the shortest word in the given array str.
//
//        input: java, cable, red, vivid, remedy, grace
//        output: red

        Scanner scan = new Scanner(System.in);
        String[] str = {"java", "cable", "red", "vivid", "remedy", "grace"};

            int minLength =str[0].length();
            int min =0;
            String minWor ="";
        for (int x = 0; x <str.length ; x++) {

                if (str[x].length()<minLength){
                    min=x;
                    minLength = str[x].length();
                }


            }

        System.out.println(str[min]);
    }
}