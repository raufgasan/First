package repl;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl_201_MethodsWithArrayList10_ {
    public static void main(String[] args) {

//        Create a static method that:
//
//        is called appendPosSum
//        returns an ArrayList of Integers
//        takes one parameter: an ArrayList of Integers
//
//        This method should:
//        Create a new ArrayList of Integers
//        Add only the positive Integers to the new ArrayList
//        Sum the positive Integers in the new ArrayList and add the Sum as the last element
//
//        For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), the ArrayList that gets returned should
//        be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).  The original ArrayList should remain unchanged.

        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(10);
        sum.add(-10);
        sum.add(20);
        sum.add(50);

        System.out.println( appendPosSum(sum));

    }

  public static ArrayList<Integer> appendPosSum(ArrayList<Integer> incoming ){

        ArrayList<Integer> sum = new ArrayList<>();
        int sum1 = 0;


      for (int i = 0; i <incoming.size() ; i++) {
          if(incoming.get(i)>0){
              sum.add(incoming.get(i));
             sum1=sum1+incoming.get(i);

          }

      }
sum.add(sum1);
      return sum;

  }


    }

