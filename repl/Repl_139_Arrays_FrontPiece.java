package repl;

import java.util.Arrays;

public class Repl_139_Arrays_FrontPiece {

    public static void main(String[] args) {


//        Given an int array of any length, print a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
//
//        Example:
//        input 1, 2, 3
//        output: [1, 2]
//
//        Example:
//        input 1,
//                output: [1]

        int size[]={9,8,7};


        if (size.length<2){
            int []newSize=new int [1];
            newSize[0]=size[0];
            System.out.println(Arrays.toString(newSize));
        }else {
            int []newSize=new int [2];
            newSize[0]=size[0];
            newSize[1]=size[1];
            System.out.println(Arrays.toString(newSize));
        }


    }
}

