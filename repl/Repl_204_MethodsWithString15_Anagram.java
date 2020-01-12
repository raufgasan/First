package repl;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Repl_204_MethodsWithString15_Anagram {
    public static void main(String[] args) {
//        Anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.
//
//        isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.
//
//                each letter in word1 should appear in word2 exact number of times
//        ignore empty spaces
//        make your code case insensitive
//
//        Examples:
//
//        isAnagram("listen", "Silent") ==> true
//
//        isAnagram("earth", "heart") ==> true
//
//        isAnagram("star", "rats") ==> true
//
//        isAnagram("hi", "bye") ==> false
//
//        isAnagram("java", "cava") ==> false

//    public static boolean isAnagram(String word1, String word2) {
//

        String word1 = "java";
        String word2 = "cava";

        word1=word1.toLowerCase();
        word2=word2.toLowerCase();

    String [] w1 = word1.split("");
        String [] w2 = word2.split("");

        Arrays.sort(w1);
        Arrays.sort(w2);

        Arrays.equals(w1,w2);

        for (int x = 0; x <w1.length ; x++) {
            if (w1[x]!=w2[x]) {
                System.out.println(false);
            }

        }
        System.out.println(true);

    }

}
