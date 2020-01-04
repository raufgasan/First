package repl;

import java.util.Scanner;

public class Repl_093_HasAJava {
    public static void main(String[] args) {

//
//        Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
//                such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = .
//
//        Example:
//        input: javapython
//        output: true
//
//        Example:
//        input: cjavac++
//        output: true
//
//
//        Example:
//        input: c#javaruby
//        output: false


//
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        if (word.length()>3) {
            System.out.println(word.substring(0, 5).contains("java"));
        }else {
            System.out.println(exists);
        }

    }


}
