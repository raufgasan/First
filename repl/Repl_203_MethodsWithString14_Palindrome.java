package repl;

public class Repl_203_MethodsWithString14_Palindrome {
    public static void main(String[] args) {


//        Palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.
//
//                So method isPalindrome checks that and returns true if check is palindrome and false if it is not.
//
//                - make your conditions case insensitive.  ex: Civic and civic are both palindromes
//        - make your conditions space insensitive.  Race car is a palindrome even though there is space in between.
//
//        Examples:
//
//        isPalindrome("Noon") ==> true
//
//        isPalindrome("I am not palindrome") ==> false
//
//        isPalindrome("wooden") ==> false
//
//        isPalindrome("Nurses Run") ==> true


//    }
//
//        public static boolean isPalindrome(String check) {
            String check = "Nurses Run";
          check=  check.replace(" ","");


        String newCheck = "";

            for (int x = check.length()-1; x >=0 ; x--) {
                newCheck+=check.charAt(x);


            }

        System.out.println("newCheck = " + newCheck);
        System.out.println("Check = " + check);
//        return newCheck.equalsIgnoreCase(check);
        System.out.println(newCheck.equalsIgnoreCase(check));
        }
}
