package repl;

import java.util.Scanner;

public class Repl_115_ArraySplitEmail {
    public static void main(String[] args) {

//        Given a String variable email, write code using split method to print email id and domain in separate lines.
//
//                Example:
//        email -> info@cybertekschool.com
//        Print:
//        Email id: info
//        Email domain: cybertekschool.com
//
//
//        If email contains no @ character or multiple @ characters then print invalid email:
//
//        email -> hello-gmail.com
//        print:
//        invalid email
//
//        email -> my@fancy@email.com
//        print:
//        invalid email


        Scanner input = new Scanner(System.in);
        String email = "info@cybertekschool.com";

        //Write your code below
        int count = 0;
       char em ='@';
        for (int i = 0; i < email.length()-1; i++) {
            email.charAt(i);
            if (email.charAt(i)==em) {
                ++count;
            }

        }

        System.out.println(count);
        if (count != 1) {
            System.out.println("invalid email");
        }else {
       String []email1 = email.split("@");
            System.out.println("Email id: "+ email1[0]);
            System.out.println("Email domain: "+ email1[1]);
        }





    }

}
