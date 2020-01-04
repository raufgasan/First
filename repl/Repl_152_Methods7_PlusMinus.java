package repl;

import java.util.Scanner;

public class Repl_152_Methods7_PlusMinus {
//
//    Create a method called plus_minus that gets an array of ints (int[]), it outputs how many negative , positive and zero numbers are in the array.
//
//            for example:
//
//    plus_minus (new int[]{1,2,55,-9,-2,0});
//
//    will output:
//    positives:3, negatives:2, zeros:1



    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

      plus_minus(arr);
    }//end main
    public static void plus_minus(int arr[]){

    int countNegative = 0;
        int countPositive = 0;
        int countZero = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0){
                countZero++;
            }else if(arr[i]>0){
                countPositive++;
            }else if(arr[i]<0){
                countNegative++;
            }

        }

        System.out.println("positives:"+countPositive+", negatives:"+countNegative+", zeros: "+countZero);

    }


}








