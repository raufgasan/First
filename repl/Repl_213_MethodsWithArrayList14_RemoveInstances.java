package repl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Repl_213_MethodsWithArrayList14_RemoveInstances {
    public static void main(String[] args) {

//        This method gets an arraylist of Integers and a number(Integer).it returns an arraylist.
//
//                It removes any instance of the number it gets from the arraylist.
//
//        for example:
//
//        romoveInst([1,1,2,3,1,4],1)
//        returns: [2,3,4]
//
//        romoveInst([3,4,3,3],4)
//        returns: [3,3,3]
    }



    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n)  {

        r.removeAll(Collections.singleton(n));

        return r;

    }


}

