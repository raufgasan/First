package repl;

public class Repl_209_MethodsWithString12_ExtractNumberFromString {
    public static void main(String[] args) {





//        description:
//        a method that cleans any non number string from a string it gets
//        and returns the clean string
//        input:
//        -s (string)- a string the method gets
//        return: string: a string of numbers only
//
//        example use:
//
//        extractNum("aa2aa3") ==> 23
//
//        extractNum("aa2") ==> 2
//
//        extractNum("aa10aa") ==> 10
//
//        extractNum("aa!!%$#.10aa") ==> 10
//
//
//        hint:
//        you can use:
//        Character.isDigit(ch)
//        or conditions


        String s = "asd43246fadv";
       char [] chr= s.toCharArray();
       String str = "";
        for (int i = 0; i <chr.length ; i++) {
            if(Character.isDigit(chr[i])){
                str+=chr[i];
            }

        }



    }
}
