package repl;

public class Repl_178_MethodsWithString1_MergeThem {
    public static void main(String[] args) {

//        When gears merge and work together, one teeth from each one goes in order.
//                Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.   Please note one and two can be of different lengths. Please look at below examples:
//
//        s1 ==> "12345"
//        s2 ==> "abcde"
//        mergeStrings(s1,s2) ==> "1a2b3c4d5e"
//
       mergeStrings("wooden", "spoon");// ==> "wsopoodoenn"
//
//        mergeStrings("java", "selenium") ==> "jsaevlaenium"

        System.out.println(mergeStrings("java", "hi"));



    }

    public static String mergeStrings(String one, String two) {

        String newStr="";

        if (one.length()>two.length()){
            for (int i = 0; i <two.length() ; i++) {
                newStr+=""+one.charAt(i)+two.charAt(i);

            }
            newStr+=one.substring(two.length());
        }
        if (one.length()<two.length()){
            for (int i = 0; i <one.length() ; i++) {
                newStr+=""+one.charAt(i)+two.charAt(i);

            }
            newStr+=two.substring(one.length());
        }
        if (one.length()==two.length()){
            for (int i = 0; i <one.length() ; i++) {
                newStr+=""+one.charAt(i)+two.charAt(i);

            }
        }

        return newStr;

    }
}