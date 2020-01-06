package repl;

import java.util.ArrayList;

public class Repl_193_MethodsWithArrayList3_CombineArrays {
    public static void main(String[] args) {

//        combine two String arrays into one arraylist and return it as a string.
//
//        for example:
//
//        combineRs(["f","o","o"],[" b","a","r"])
//        returns "foo bar"
//
//
//        combineRs(["1","2","3"],[" 4"])
//        returns "1234"

    }




    public static String combineRs(String[] r1,String[] r2)
    {
        ArrayList<String> list = new ArrayList<>();
        String list1="";

        for (int i = 0; i <r1.length ; i++) {
            list.add(r1[i]);

        }
        for (int i = 0; i <r2.length ; i++) {
            list.add(r2[i]);
        }
        for (int i = 0; i <list.size() ; i++) {
             list1+=list.get(i);
        }

        return list1;

    }
}
