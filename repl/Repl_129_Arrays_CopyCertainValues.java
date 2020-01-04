package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_129_Arrays_CopyCertainValues {

    public static void main(String[] args) {


//        Given a String array arr with the following elements
//                ["zero", "one", "two","three","four"]
//
//        Create another array fewValues and copy words that have letter "e" in them
//
//        You need to know how many element contain "e" and create array accordingly
//
//        Values in fewValues array need to be["zero", "one","three"]
//
//        Examples:
//        arr -> ["aa", "be", "lol", "lel", "oreo"]
//        fewValues -> ["be",  "lel", "oreo"]
//
//        arr -> ["e", "hey", "bye", "furey", "spoon"]
//        fewValues ->["e", "hey", "bye", "furey"]

        String[] numbers = {"zero", "one", "two","three","four"};

        int count = 0;
        for (String each:numbers) {
            if(each.contains("e")){
                count++;
            }
        }
String [] fewValues = new String [count];
        int index=0;
        for (int x = 0; x <numbers.length ; x++) {
            if (numbers[x].contains("e")){
                fewValues[index]=numbers[x];
                index++;
            }

        }
        System.out.println(Arrays.toString(fewValues));
    }
}