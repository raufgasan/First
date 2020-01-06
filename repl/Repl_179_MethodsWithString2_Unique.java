package repl;

public class Repl_179_MethodsWithString2_Unique {
    public static void main(String[] args) {

//        uniqueChars is a method that you will code now, should be able to accept any string in the world and return unique characters from the parameter.
//
//        Examples:
//
//        uniqueChars("java") ==> "jav"
//
//        uniqueChars("mama") ==> "ma"
//
//        uniqueChars("spoon") ==> "spon"

        System.out.println( uniqueChars("wooden-spoon") ) ;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
            String newlst="";
        for (int i = 0; i <str.length() ; i++) {
            int count = 0;
            if (str.contains(str.substring(i, i + 1))) {
                count++;

           }
            if (count==1)
                newlst+=str.substring(i,i+1);
        }
        return newlst;

            }
        }