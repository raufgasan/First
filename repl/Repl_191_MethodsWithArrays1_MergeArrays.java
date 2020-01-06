package repl;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Repl_191_MethodsWithArrays1_MergeArrays {
    public static void main(String[] args) {
//
//        mergR merges two arrays into one.
//        it gets two int arrays and returns an int array
//
//        for example:
//
//        mergR([1,2,3],[4,5,6])
//        returns [1,2,3,4,5,6]
//
//        mergR([1,2],[6,8])
//        returns [1,2,6,8]
//
//        hint:
//        create a length int for the combined length of both arrays.
//        create an array with that length (thats the array we will return).
//        create an iterator for both arrays (int z=0).
//
//        loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
//        then increment the iterator for both arrays (z++).
//
//        do the same for the second array.


//        mergR(mergR())
//    }


//    public static int[] mergR(int[] a,int[] b) {

        int [] a = {1,2,3};
        int [] b = {4,5,6};

       int [] merArr= new int [a.length+b.length];

       int index =0;
        for (int i = 0; i <a.length ; i++) {
            merArr[index]=a[i];
            index++;

        }
        for (int i = 0; i <b.length ; i++) {
            merArr[index]=b[i];
            index++;

        }
//        return merArr;

        System.out.println(Arrays.toString(merArr));
    }



    }//end mergR