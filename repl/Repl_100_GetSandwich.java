package repl;

import java.util.Scanner;

public class Repl_100_GetSandwich {
    public static void main(String[] args) {


//        A sandwich is two pieces of bread with something in between.
//                Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.
//
//                Example:
//        input: breadjambread
//        output: jam
//
//        Example:
//        input: xxbreadjambreadyy
//        output: jam
//
//        Example:
//        input: xxbreadapple
//        output: nothing
//
//        Example:
//        input: breadbutterbread
//        output: butter


        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String word = "";
        int count = 0;
        if (str.length()>10&&str.contains("bread")){
            for (int x = 0; x < str.length()-4; x++) {
                str.substring(x, x + 5).equalsIgnoreCase("bread");
                ++count;
                if (count > 1) {

                    word = str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
                }else if (count<1) {
                    System.out.println("nothing");
                }
            }

        }else {
            System.out.println("nothing");
        }

        System.out.println(word);


    }


}

