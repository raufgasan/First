package repl;

import java.util.ArrayList;

public class Repl_202_MethodsWithArrayList11_timesTwo {
    public static void main(String[] args) {

//        Create a method that:
//        is called timesTwo
//        returns nothing
//        takes in a single parameter - an ArrayList of Integers called nums
//
//        This method should take the ArrayList parameter and multiply every value by two.

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        timesTwo(nums);

    }

  public static void timesTwo(ArrayList<Integer> nums){

      for (int x = 0; x <nums.size() ; x++) {
          nums.set(x,nums.get(x)*2);
      }

          System.out.println(nums);

      }


  }




