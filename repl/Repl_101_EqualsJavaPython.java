package repl;

import java.util.Scanner;

public class Repl_101_EqualsJavaPython {
    public static void main(String[] args) {

//        Given a string, print out true if the number of appearances of "java" anywhere in the string
//        is equal to the number of appearances of "python" anywhere in the string (case sensitive).
//        Example:
//        input: We study java not python
//        output: true
//
//        Example:
//        input: What's the difference between java, javascript and python?
//        output: false

        Scanner scan = new Scanner(System.in);
        String sentence = "python is an interpreted, high-level, general-purpose programming language.";

        int coutJava=0;
        int countPython=0;

        for (int x = 0; x <sentence.length()-4 ; x++) {
           if( sentence.substring(x,x+4).contains("java")){
            ++coutJava;}

        }
        for (int y = 0; y <sentence.length()-6 ; y++) {
                     if( sentence.substring(y,y+6).contains("python")){
                           ++countPython;

           }
        }
        System.out.println(countPython);
        System.out.println(coutJava);
        System.out.println(coutJava==countPython);

    }


}

