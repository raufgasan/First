package repl;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl_206_MethodsWithArrayList12_RepeatAll {
    public static void main(String[] args) {

//        Create a static method that:
//        is called repeatAL
//        returns nothing
//        takes in a single parameter - an ArrayList of Booleans
//
//        This method should modify its ArrayList parameter by repeating its ArrayList values.
//
//        For example, if the parameter is
//                (true, false, false)
//        The modified ArrayList should be
//                (true, false, false, true, false, false)

        int[] ints1={1,2,3};
        int[] ints2 ={3,2,1};


    }



    public static void repeatAL(ArrayList<Boolean> yep){

    ArrayList<Boolean> yep1 = yep;

    yep.addAll(yep1);
    }






}

