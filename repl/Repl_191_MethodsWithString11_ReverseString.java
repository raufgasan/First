package repl;

import java.util.ArrayList;

public class Repl_191_MethodsWithString11_ReverseString {
    public static void main(String[] args) {

//        reverse method reverse a string.
//                it gets a string and returns it in reverse.
//
//        for example:
//
//        reverse("foo") ==> "oof"
//
//        reverse("student") ==> "tnedust"


//    }
//
//
//
//
//    public static String reverse(String input)
//    {

        String input= "student";
        String inputeRev = "";
        for (int i = input.length()-1; i >=0 ; i--) {

            inputeRev+=input.charAt(i);
        }

//        return inputeRev;

        System.out.println("inputeRev = " + inputeRev);
    }
}