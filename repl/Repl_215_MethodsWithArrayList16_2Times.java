package repl;

import java.util.ArrayList;

public class Repl_215_MethodsWithArrayList16_2Times {
    public static void main(String[] args) {

//        Create a method that:
//
//        is called twoTimes
//        returns a new ArrayList of Integers
//        takes in a single parameter - an ArrayList of Integers
//
//        This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.
//
//        For example, if the parameter is
//                (1,5,3,7)
//        The method should return a new ArrayList of Integers with
//                (1,1,5,5,3,3,7,7)


ArrayList<Integer> r = new ArrayList<>();
r.add(1);
        r.add(2);
        r.add(3);
        r.add(4);


        System.out.println(twoTimes(r));
    }


    public static ArrayList<Integer> twoTimes(ArrayList<Integer> r)
    {

        ArrayList<Integer> list = (ArrayList<Integer>)r.clone();

        int size = list.size()*2;
        for (int i = 0; i <size ; i+=2) {
            list.add(i,list.get(i));

        }

return list;

    }

}

