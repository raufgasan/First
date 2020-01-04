package day24;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {


            double [] num = {10.99,12.99,15.99};
            String priceString = Arrays.toString(num);
        System.out.println(priceString);
        System.out.println(priceString.substring(1,priceString.indexOf(",")-1));
        System.out.println(priceString.substring(1,priceString.indexOf(",")-1));

        for (int x = 0; x <priceString.length() ; x++) {

            System.out.println("Character at index --->"+priceString.charAt(x));



        }





    }
}
