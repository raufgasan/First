package repl;

public class Repl_210_MethodsWithString16_ReverseLetters {
    public static void main(String[] args) {




//
//        Reverse a string without affecting special characters
//        Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.
//
//
//        Input:   str = "a,b$c"
//        Output:  str = "c,b$a"
//        Note that $ and , are not moved anywhere.
//                Only subsequence "abc" is reversed.
//
//        Input:   str = "Ab,c,de!$"
//        Output:  str = "ed,c,bA!$"
//
//        Input:   str = "----qwe--r--tyf...gd.---"
//        Output:  str = "----dgf--y--tre...wq.---"


//        String result = Utils.reverseLetters("..zxcv..d");
//        System.out.println(result.equals("..dvcx..z")); //true
//
//        String result2 = Utils.reverseLetters("---abmkl.o-");
//        System.out.println(result2.equals("---olkmb.a-")); //true
//
//        String result3 = Utils.reverseLetters("---abmkl.o-");
//        System.out.println(result3.equals("-o.lkmba---")); //false
//






            }

    public static boolean alphaNumericCheck(char ch) {
        if ((ch >= 48 && ch <= 57) // Numeric 0 to 9
                || (ch >= 65 && ch <= 90) // Alphabet A to Z (caps)
                || (ch >= 97 && ch <= 122)) // Alphabet a to z
            return true;
        else
            return false;

    }
    public static String reverseLetters(String word){
        //TODO

        char[] arr = word.toCharArray();

        for (int i = 0, j = word.length() - 1; i < j;) {

            if (alphaNumericCheck(arr[i]) && alphaNumericCheck(arr[j])) {
                char tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            } else if (!alphaNumericCheck(arr[i])) {
                i++;
            } else if (!alphaNumericCheck(arr[j])) {
                j--;
            }

        }
        return String.valueOf(arr);
    }


    }





      

