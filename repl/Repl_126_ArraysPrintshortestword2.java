package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_126_ArraysPrintshortestword2 {
    public static void main(String[] args) {

//        Write a program that will find out shortest words in the given string str. If there are few words that are evenly short,
//        print them all. Use split method in order to split str string variable and create an array of strings.
//        Print array with Arrays.toString() method. Sort array before printing.
//        Split values by comma: split(", ");
//        input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
//        output: [cat, old, ray]

        Scanner scan = new Scanner(System.in);
        String str = "olive, hot pursuit, warning, python, angle, coffee, beech, boost, trainer";

        String [] newStr = str.split(", ");
        int minLength = newStr[0].length();
        String shartestWord = newStr[0];
        String word ="";


        for (int x = 1; x <newStr.length ; x++) {
            if(newStr[x].length()<minLength){
                minLength=newStr[x].length();
               }

        }
        for (int i = 0; i <newStr.length ; i++) {
            if (newStr[i].length()==minLength){
                word+=(newStr[i]+" ");
            }

        }
        System.out.println("word = " + word);

    String [] splited = word.trim().split(" ");

        System.out.println(Arrays.toString(splited));


        Arrays.sort(splited);


        System.out.println(Arrays.toString(splited));

    }
}